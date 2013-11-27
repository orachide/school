jQuery(function($) {

	$('input[name=calendar-date-range-input]').daterangepicker().prev().on(
			ace.click_event, function() {
				$(this).next().focus();
			});

	$('.date-picker').datepicker({
		autoclose : true
	}).next().on(ace.click_event, function() {
		$(this).prev().focus();
	});

	$("#event-type").chosen();
	// chosen plugin inside a modal will have a zero width because the select
	// element is originally hidden
	// and its width cannot be determined.
	// so we set the width after modal is show
	$('#add-event-modal-form').on('shown.bs.modal', function() {
		$(this).find('.chosen-container').each(function() {
			$(this).find('a:first-child').css('width', '210px');
			$(this).find('.chosen-select').css('width', '210px');
			$(this).find('.chosen-drop').css('width', '210px');
			$(this).find('.chosen-search input').css('width', '200px');
		});
	});

	$('#add-event-modal-form').on('shown.bs.modal', function() {
		$(this).find('.datetimepicker-input').each(function() {
			$(this).datetimepicker({
			     	language: 'pt-BR',
			 		pickSeconds: false
		    });
		});
	});
	
	 $('#add-event-form').on('submit', function() {
		 alert($(this).serialize());
	            // appel Ajax
	            $.ajax({
	                url: $(this).attr('action'), // le nom du fichier indiqué dans le formulaire
	                type: 'Post', // la méthode indiquée dans le formulaire (get ou post)
	                contentType: 'application/json',
	                data: JSON.stringify($(this).serialize()), // je sérialise les données (voir plus loin), ici les $_POST
	                success: function(html) { // je récupère la réponse du fichier PHP
	                    alert(html); // j'affiche cette réponse
	                }
	            });
	        return false; // j'empêche le navigateur de soumettre lui-même le formulaire
	    });
});
