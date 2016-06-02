
package maq.repository.view.CarouselViews;


import java.io.Serializable;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import maq.repository.App.App;
import maq.repository.Interfaces.IAppsLoader;
import maq.repository.Interfaces.ICarouselView;
import maq.repository.InterfacesImpl.BezpieczenstwoAppsLoader;



@ManagedBean
@ViewScoped
public class BezpieczenstwoCarouselView implements ICarouselView,Serializable {
     
    private ArrayList<App> apps;
    private IAppsLoader apps_loader;
    private ArrayList<App> apps_extended;
    private App selectedApp;
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
   
    public BezpieczenstwoCarouselView()
    {
        apps_loader = new BezpieczenstwoAppsLoader();
        apps = apps_loader.LoadApps();
          apps_extended = apps_loader.LoadExtendedApps();
    }
     
    
    
    @PostConstruct      // do wywalenia?
    public void init() {
        apps_loader = new BezpieczenstwoAppsLoader();
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