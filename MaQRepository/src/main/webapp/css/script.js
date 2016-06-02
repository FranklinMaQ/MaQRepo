function BackgroundBlur()
{
    
    document.getElementById("uzytkoweDivKaruzela").className = "myblurrybackground";
    document.getElementById("multimediaDivKaruzela").className = "myblurrybackground";
    document.getElementById("bezpieczenstwoDivKaruzela").className = "myblurrybackground";
    document.getElementById("biuroweDivKaruzela").className = "myblurrybackground";
    document.getElementById("internetDivKaruzela").className = "myblurrybackground";
    document.getElementById("gryDivKaruzela").className = "myblurrybackground";
    
     document.getElementById("uzytkoweDivFieldset").className = "myblurrybackground";
    document.getElementById("multimediaDivFieldset").className = "myblurrybackground";
    document.getElementById("bezpieczenstwoDivFieldset").className = "myblurrybackground";
    document.getElementById("biuroweDivFieldset").className = "myblurrybackground";
    document.getElementById("internetDivFieldset").className = "myblurrybackground";
    document.getElementById("gryDivFieldset").className = "myblurrybackground";
    
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
    document.getElementById("bezpieczenstwoDivKaruzela").className = "unblurrybackground";
    document.getElementById("biuroweDivKaruzela").className = "unblurrybackground";
    document.getElementById("internetDivKaruzela").className = "unblurrybackground";
    document.getElementById("gryDivKaruzela").className = "unblurrybackground";
    
     document.getElementById("uzytkoweDivFieldset").className = "unblurrybackground";
    document.getElementById("multimediaDivFieldset").className = "unblurrybackground";
    document.getElementById("bezpieczenstwoDivFieldset").className = "unblurrybackground";
    document.getElementById("biuroweDivFieldset").className = "unblurrybackground";
    document.getElementById("internetDivFieldset").className = "unblurrybackground";
    document.getElementById("gryDivFieldset").className = "unblurrybackground";
    
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