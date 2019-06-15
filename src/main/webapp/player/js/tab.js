$(function(){
    var $li = $('ul.tab-title li');
    $($li. eq(0) .addClass('active').find('a').attr('href')).siblings('.tab-inner').hide();
    
    $li.click(function(){
    	$($(this).find('a'). attr ('href')).show().siblings ('.tab-inner').hide();
        $(this).addClass('active'). siblings ('.active').removeClass('active');
    });
});

$(document).ready(function() {
    $("select").on('change',function() {
        var x = this.selectedIndex;

        if (x == "") {
           $("#goRec").hide();
        } else {
           $("#goRec").show();
        }
    });
    $("#goRec").css("display","none");
}); 