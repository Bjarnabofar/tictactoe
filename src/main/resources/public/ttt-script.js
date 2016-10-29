$(document).ready(function() {
	// get welcome message to confirm an established conneciton
	$.ajax({
		type: 'GET',
		url: '/welcome',
		data: null,
		success: function (msg) {
			$('#welcome').html(msg);
		}
	});
	// initialize tictactoe game
	$.ajax({
		type: 'GET',
		url: '/getBoard',
		data: null,
		success: function(test) {
			console.log(test);
		}
	});


});