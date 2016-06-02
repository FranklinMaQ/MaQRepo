package maq.repository.Utilities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import maq.repository.App.App;
import org.primefaces.context.RequestContext;
import org.primefaces.event.ReorderEvent;
import org.primefaces.event.SelectEvent;

@ManagedBean(name="orderListBean")
@ApplicationScoped
public class OrderListBean implements Serializable {

    private ArrayList<App> apps;
    private App selectedApp;

    public App getSelectedApp() {
        return selectedApp;
    }

    public void setSelectedApp(App selectedApp) {
        this.selectedApp = selectedApp;
    }

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
    
    public void removeAll()
    {
        apps.clear();
        
      
        
        RequestContext.getCurrentInstance().update(":form_koszyk");

        
    }

   public void insert(App app)
   {
     
       
       if(!this.apps.contains(app))
       this.apps.add(app);
    
   }
   
   public void removeByName(String name)
   {
       System.err.println(name + " ssdsa");
       
       for(App x : apps)
       {
           if(x.getName().equals(name))
           {
               apps.remove(x);
           }
       }
         RequestContext context = RequestContext.getCurrentInstance();
         context.update(":form_koszyk");
   }
   
   public void remove()
   {
       
         apps.remove(selectedApp);
        selectedApp = null;
  

   }
    
     @PostConstruct
    public void init() {
      
    //   apps.add(new App("Winamp", "winamp", "nullsoft", "homepage", "opis", "/images/ccleaner.png", null, "kategoria"));
    //   apps.add(new App("Test", "winamp", "nullsoft", "homepage", "opis", "/images/ps7.png", null, "kategoria"));
    //    apps.add(new App("Test", "winamp", "nullsoft", "homepage", "opis", "/images/Notepad_plus_plus.png", null, "kategoria"));
        
        
        String context = FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath();
       
           
        
    }
    
   
    
     public void RemoveInformation(String appName) {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Sukces", "Aplikacja " + appName + " została usunięta.");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
     public void onRowReorder(ReorderEvent event) {
       
      
    
         
         FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
      public void onRowSelect(SelectEvent event) {
      
    }

}
