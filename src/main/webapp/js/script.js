/**
 * Created by annezhao on 11/20/16.
 */

$(document).ready(function() {
    var screenHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);
    var screenWidth = Math.max(document.documentElement.clientWidth, window.innerWidth || 0);

    $("#index_bottom_anchor").css("margin-left", (screenWidth / 2 - 29).toString() + "px");

    $(window).scroll(function() {
        var index_Nav = $("#index_Nav");
        var highlight = $("#navbar-collapse-01 :first-child :first-child");

        if ($(window).scrollTop() >= screenHeight / 2) {
            index_Nav.removeClass("transparent");
            highlight.addClass("active");
        } else {
            index_Nav.addClass("transparent");
            highlight.removeClass("active");
        }
    });
});

