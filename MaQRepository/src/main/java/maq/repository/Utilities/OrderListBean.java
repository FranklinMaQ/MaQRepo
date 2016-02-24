package maq.repository.Utilities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import maq.repository.App.App;
import org.primefaces.event.ReorderEvent;

@ManagedBean(name="orderListBean")
@SessionScoped
public class OrderListBean implements Serializable {

    private ArrayList<App> apps;

    public ArrayList<App> getApps() {
        return apps;
    }

    public void setApps(ArrayList<App> apps) {
        this.apps = apps;
    }
    
    public OrderListBean()
    {
        apps = new ArrayList<>();
    }

   public void insert(App app)
   {
       System.out.println("Dodano apke : " + apps.size());
       this.apps.add(app);
       System.out.println("Dodano apke : " + apps.size());
   }
   
   public void remove(App app)
   {
       this.apps.remove(app);
       
       System.out.println("Ilosc aplikacji : " + apps.size());

   }
    
     @PostConstruct
    public void init() {
      
       apps.add(new App("Winamp", "winamp", "nullsoft", "homepage", "opis", "/images/ccleaner.png", null, "kategoria"));
       apps.add(new App("Test", "winamp", "nullsoft", "homepage", "opis", "/images/ps7.png", null, "kategoria"));
        apps.add(new App("Test", "winamp", "nullsoft", "homepage", "opis", "/images/Notepad_plus_plus.png", null, "kategoria"));
        
        
        String context = FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath();
         System.out.println("TUTAJ" + context);
           
        
    }
    
     public void onRowReorder(ReorderEvent event) {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Row Moved", "From: " + event.getFromIndex() + ", To:" + event.getToIndex());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

}
