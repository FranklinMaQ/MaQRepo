/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maq.repository.view;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import static org.primefaces.behavior.confirm.ConfirmBehavior.PropertyKeys.message;
import org.primefaces.context.RequestContext;

/**
 *
 * @author MaQ
 */
@ManagedBean(name = "komunikat")
public class Komunikat {
         
    public void Dialog(String komunikat_text) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Komunikat", komunikat_text);
         
        RequestContext.getCurrentInstance().showMessageInDialog(message);
    }
    
    public void Dymek(String komunikat_text)
    {
          FacesContext context = FacesContext.getCurrentInstance();
         
        context.addMessage(null, new FacesMessage("Successful",  "Your message: " + message) );
        context.addMessage(null, new FacesMessage("Second Message", "Additional Message Detail"));
    }
}