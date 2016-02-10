
package maq.repository.view;


import java.io.Serializable;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import maq.repository.App.App;
import maq.repository.Interfaces.IAppsLoader;
import maq.repository.Interfaces.ICarouselView;
import maq.repository.InterfacesImpl.MultimediaAppsLoader;
import maq.repository.InterfacesImpl.UzytkoweAppsLoader;


@ManagedBean
@ViewScoped
public class MultimediaCarouselView implements ICarouselView,Serializable {
     
    private ArrayList<App> apps;
    private IAppsLoader apps_loader;
    @Override
    public ArrayList<App> getApps() {
        return apps;
    }

    public void setApps(ArrayList<App> apps) {
        this.apps = apps;
    }
   
    public MultimediaCarouselView()
    {
        apps_loader = new MultimediaAppsLoader();
        apps = apps_loader.LoadApps();
    }
     
    private App selectedApp;
    
    @PostConstruct      // do wywalenia?
    public void init() {
        apps_loader = new MultimediaAppsLoader();
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