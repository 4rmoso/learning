jQuery(document).ready(function($) {
    $(".table").click(function() {
        window.location = $(this).data("href");
    });
});