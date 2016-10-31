$(document).ready(function() {
	// get welcome message to confirm an established conneciton
	updateBoard();

	/*$.ajax({
		type: 'GET',
		url: '/welcome',
		data: null,
		success: function (msg) {
			$('#welcome').html(msg);
		}
	});*/

	function restartGame() {
		$('#game').css("color", "white");
		$.ajax({
			type: 'POST',
			url: '/initBoard',
			success: function() {
				updateBoard();	
			}
		});	
	}
	function checkWinner() {
		$.ajax({
			type: 'GET',
			url: '/gameIsOver',
			data: null,
			success: function (res) {
				console.log(res);
				if (res == 'true') {
					$.get("/getWinner", function(winner) {
						if (winner == 'N') {
							$("#results").html("AND THE WINNER IS.... NOBODY!!!");
						}
						else {
							$("#results").html("AND THE WINNER IS.... " + winner + "!!!");
						}
						$('#game').css("color", "red");
						setTimeout(function(){ restartGame(); }, 2000);
					});
				}
			}
		});
	}

	// update board
	function updateBoard() {
		checkWinner();
		$.ajax({
			type: 'GET',
			url: '/getBoard',
			dataType: 'json',
			data: null,
			success: function(test) {
				size = test.size;
				$.each(test.board, function(i, v) {
					$.each(v, function(tile, val) {
						//console.log(i);
						//console.log(tile);
						$('#board_' +i+""+tile).html(val.sign);
						//console.log(val.sign);
					});
				});
				checkWinner();
			}
		});
	}
	function computerMove() {
		$.get("/getWinner", function(winner) {
			console.log("winner: " + winner);
			if (winner == 'N') {
				$.ajax({
					type: 'GET',
					url: '/computerMove',
					dataType: 'json',
					data: null,
					success: function (msg) {
						console.log(msg);
					}
				});
			}
		});
		setTimeout(function(){ updateBoard(); }, 1000);
	}
	// When player makes a move
	$('body').delegate('#game td', 'click', function() {
		var self = $(this);
		var arr = self.attr('id').split('_');
		var x = arr[1].substring(0,1);
		var y = arr[1].substring(1,2);
		//console.log("x: " + x);
		//console.log("y: " + y);
		$.ajax({
			type: 'POST',
			url: '/humanMove',
			dataType: 'json',
			data: {x: x, y: y, move: 'X'},
			success: function(data) {
				console.log("data: " + data);
				if (data) {
					computerMove();
					updateBoard();
					console.log("made move: " + data);
				}
			}
		});	
		updateBoard();
		
	});
	$('body').delegate('#restart', 'click', function() {
		restartGame();
	});


});