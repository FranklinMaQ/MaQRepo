
package maq.repository.view;

import java.awt.event.ActionEvent;
import java.io.Serializable;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="tabViewBean")
@ApplicationScoped
public class TabViewBean implements Serializable {
    
    private int activeIndex = 0;

    public int getActiveIndex() {
        return activeIndex;
    }

    public void setActiveIndex(int activeIndex) {
        this.activeIndex = activeIndex;
        System.out.println("ACTIVE: " + activeIndex);
    }
    
    public void ustaw() {
     
        System.out.println("ACTIVE: " + activeIndex);
    }

   
    
    
    
    
    
}
