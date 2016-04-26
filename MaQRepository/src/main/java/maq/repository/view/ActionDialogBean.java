
package maq.repository.view;

import java.io.Serializable;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="actionDialogBean")
@SessionScoped
public class ActionDialogBean implements Serializable {
    
    private String text = "something";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
       System.out.println("USTAWIONO");
    }
    
    
    
    
    
}
