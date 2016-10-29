$(document).ready(function() {
	// get welcome message to confirm an established conneciton
	updateBoard();

	$.ajax({
		type: 'GET',
		url: '/welcome',
		data: null,
		success: function (msg) {
			$('#welcome').html(msg);
		}
	});
	// update board
	function updateBoard() {
		$.ajax({
			type: 'GET',
			url: '/getBoard',
			dataType: 'json',
			data: null,
			success: function(test) {
				size = test.size;
				$.each(test.board, function(i, v) {
					$.each(v, function(tile, val) {
						console.log(i);
						console.log(tile);
						$('#board_' +i+""+tile).html(val.sign);
						console.log(val.sign);
					});
				}); 
			}
		});
	}

	$('body').delegate('#game td', 'click', function() {
		var self = $(this);
		var arr = self.attr('id').split('_');
		var x = arr[1].substring(0,1);
		var y = arr[1].substring(1,2);
		console.log("x: " + x);
		console.log("y: " + y);
		$.ajax({
			type: 'POST',
			url: '/humanMove',
			dataType: 'json',
			data: {x: x, y: y, move: 'X'},
		});		

		updateBoard();
		return false;
	});

});