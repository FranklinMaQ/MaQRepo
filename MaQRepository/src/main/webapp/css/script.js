function BackgroundBlur()
{
    
    document.getElementById("uzytkoweDivKaruzela").className = "myblurrybackground";
    document.getElementById("multimediaDivKaruzela").className = "myblurrybackground";
    document.getElementById("header").className = "myblurrybackground";
    document.getElementById("layek").className = "myblurrybackground";
    document.getElementById("div_koszyk").className = "myblurrybackground";
}

function closeDialogs(){
   PF("dlg2").hide();
   PF("action_dialog").hide();
}

function BackgroundUnBlur()
{
    document.getElementById("uzytkoweDivKaruzela").className = "unblurrybackground";
    document.getElementById("multimediaDivKaruzela").className = "unblurrybackground";
    document.getElementById("header").className = "unblurrybackground";
    document.getElementById("layek").className = "unblurrybackground";
    document.getElementById("div_koszyk").className = "unblurrybackground";
}

function ShowTutorial() {

    //var show = $('#tutek').val();

    //  if(show == "true")
    //  {
    BackgroundBlur();
    PF("dlg2").show();
    //}
}

function HideTutorial()
{
    void(0);
    PF('dlg2').hide();
    BackgroundUnBlur();
    void(0);
}

function ShowSuccessNotification()
{

    PF('bar').show();
    document.getElementById("header").className = "myblurrybackground";

    setTimeout(function () {
        PF('bar').hide();
        document.getElementById("header").className = "";

    }, 2000);
    //

}

function Resize() {
  document.getElementById("uzytkoweDivKaruzela").style.width="900px";
}