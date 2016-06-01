package maq.repository.Interfaces;

import java.util.ArrayList;
import maq.repository.App.App;


public interface IAppsLoader {
  
  
    public ArrayList<App> LoadApps();  
    public ArrayList<App> LoadExtendedApps();
}
