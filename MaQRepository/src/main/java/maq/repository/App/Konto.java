
package maq.repository.App;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.faces.validator.ValidatorException;

@ManagedBean(name="konto")
@ApplicationScoped
public class Konto {
    
    private String login;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
   public void isLoginValid(FacesContext ctx, UIComponent component, Object value) throws ValidatorException {
      //  System.out.println(" przed Test1 login:" + login + " haslo:" + haslo + " rehaslo:" + rehaslo);
        String newlogin = value.toString();
       System.out.println(newlogin);
        if (newlogin.contains(" ")) {
            throw new ValidatorException(new FacesMessage("Nie wolno wpisywac spacji!", ""));
        }
        if (newlogin.length() < 4) {
            throw new ValidatorException(new FacesMessage("Login musi byc conajmniej 4 znakowy!", ""));
        }
        //System.out.println(" po Test1 login:" + login + " haslo:" + haslo + " rehaslo:" + rehaslo);
    }
   
   public void valid() {
        
       
        if (login.length() > 1) {
            
            FacesContext context = FacesContext.getCurrentInstance();
            Flash flash = context.getExternalContext().getFlash();
            flash.setKeepMessages(true);
            flash.setRedirect(true);
            System.out.println("udalo sie");
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Rejestracja udana", ""));
           
        }
        else
        {
             System.out.println("nie udalo sie");
        }
     
    }
}
