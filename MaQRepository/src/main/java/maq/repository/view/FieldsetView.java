
package maq.repository.view;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;
import org.primefaces.event.ToggleEvent;

@ManagedBean
@ApplicationScoped
public class FieldsetView {
    private boolean uzytkoweCollapsed;
    private String whereAmI;

    public String getWhereAmI() {
        return whereAmI;
    }

    public void setWhereAmI(String whereAmI) {
        this.whereAmI = whereAmI;
    }
    
   public FieldsetView()
   {
       uzytkoweCollapsed = true;
   }

    public boolean getUzytkoweCollapsed() {
        return uzytkoweCollapsed;
    }

    public void setUzytkoweCollapsed(boolean uzytkoweCollapsed) {
        this.uzytkoweCollapsed = uzytkoweCollapsed;
    }
    
     public void handleToggle(ToggleEvent event) {
         System.err.println("XXX");
        RequestContext context = RequestContext.getCurrentInstance();
       
         

       // context.update("fluid");
         context.scrollTo("sss");
      
       
  
    }
}
