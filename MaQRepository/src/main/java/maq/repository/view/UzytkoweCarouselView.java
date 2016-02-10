
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
import maq.repository.Interfaces.IAppsLoader;
import maq.repository.InterfacesImpl.UzytkoweAppsLoader;


@ManagedBean
@ViewScoped
public class UzytkoweCarouselView implements Serializable {
     
    private ArrayList<App> apps;
    private IAppsLoader apps_loader;

    public ArrayList<App> getApps() {
        return apps;
    }

    public void setApps(ArrayList<App> apps) {
        this.apps = apps;
    }
   
    public UzytkoweCarouselView()
    {
        apps_loader = new UzytkoweAppsLoader();
        apps = apps_loader.LoadApps();
    }
     
    private App selectedApp;
    
    @PostConstruct      // do wywalenia?
    public void init() {
        apps_loader = new UzytkoweAppsLoader();
        apps = apps_loader.LoadApps();
     
    }

    public App getSelectedApp() {
        return selectedApp;
    }

    public void setSelectedApp(App selectedApp) {
        this.selectedApp = selectedApp;
    }

   
 
 
}