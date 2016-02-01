
package maq.repository.view;


import java.io.File;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import maq.repository.App.App;
import maq.repository.Service.AppService;
import maq.repository.Utils.XMLParser;



@ManagedBean
@ViewScoped
public class CarouselView implements Serializable {
     
    private ArrayList<App> apps;

    public ArrayList<App> getApps() {
        return apps;
    }

    public void setApps(ArrayList<App> apps) {
        this.apps = apps;
    }
    private HashMap<String, ArrayList<App>> mapa_apek;
       
     
    private App selectedApp;
    
    @PostConstruct
    public void init() {
          apps = XMLParser.ParseAppsFile("C:\\Users\\MaQ\\Desktop\\MaQDownloader\\repo_apps.xml");
       
       
        
     // System.out.println(AppService.GetSortedApps().size() + "SUZE");
       // mapa_apek = AppService.GetSortedApps();
        
        
   
       // Map<String, String> linki = new HashMap<String, String>();
        
     //   linki.put("3.05", "http://nullsoft.com");
        
      
     //   apps.add(new App("MPC", "mpc", "klite", "http://gdziestam", "Odtwarzacz multimedialny", "Ikona", linki, "multimedia"));
    }

    public App getSelectedApp() {
        return selectedApp;
    }

    public void setSelectedApp(App selectedApp) {
        this.selectedApp = selectedApp;
    }

    public ArrayList<App> getUzytkowe() {
        return mapa_apek.get("Uzytkowe");
    }
    
      public ArrayList<App> getMultimedialne() {
        return mapa_apek.get("Multimedia");
    }
        public ArrayList<App> getBezpieczenstwo() {
        return mapa_apek.get("Bezpieczenstwo");
    }
          public ArrayList<App> getInternetowe() {
        return mapa_apek.get("Internet");
    }
          
            public ArrayList<App> getBiurowe() {
        return mapa_apek.get("Biurowe");
    }
          
  public ArrayList<App> getGry() {
        return mapa_apek.get("Gry");
    }
  
    
 
 
}