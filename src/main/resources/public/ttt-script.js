$(document).ready(function() {

$.ajax({
		type: 'GET',
		url: '/welcome',
		data: null,
		success: function (msg) {
			$('#welcome').html(msg);
		}
});

});