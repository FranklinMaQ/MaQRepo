
package maq.repository.view.CarouselViews;


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
import maq.repository.Interfaces.ICarouselView;
import maq.repository.InterfacesImpl.UzytkoweAppsLoader;


@ManagedBean
@ViewScoped
public class UzytkoweCarouselView implements ICarouselView,Serializable {
     
    private ArrayList<App> apps;
    private ArrayList<App> apps_extended;
     private IAppsLoader apps_loader;
     private App selectedExtendedApp;

    public App getSelectedExtendedApp() {
        return selectedExtendedApp;
    }

    public void setSelectedExtendedApp(App selectedExtendedApp) {
        this.selectedExtendedApp = selectedExtendedApp;
    }

    public ArrayList<App> getApps_extended() {
        return apps_extended;
    }

    public void setApps_extended(ArrayList<App> apps_extended) {
        this.apps_extended = apps_extended;
    }
   
    @Override
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
        apps_extended = apps_loader.LoadExtendedApps();
    }
     
    private App selectedApp;
    
    @PostConstruct      // do wywalenia?
    public void init() {
        apps_loader = new UzytkoweAppsLoader();
        apps = apps_loader.LoadApps();
     
    }
@Override
    public App getSelectedApp() {
        return selectedApp;
    }

    public void setSelectedApp(App selectedApp) {
        this.selectedApp = selectedApp;
    }

   
 
 
}