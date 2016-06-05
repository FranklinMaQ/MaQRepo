package maq.repository.App;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import maq.repository.Interfaces.ICarouselView;
import maq.repository.InterfacesImpl.BezpieczenstwoAppsLoader;
import maq.repository.InterfacesImpl.BiuroweAppsLoader;
import maq.repository.InterfacesImpl.GryAppsLoader;
import maq.repository.InterfacesImpl.InternetAppsLoader;
import maq.repository.InterfacesImpl.MultimediaAppsLoader;
import maq.repository.InterfacesImpl.UzytkoweAppsLoader;

public class AppsHashMap {

    private HashMap<String, List<App>> appsHashMap;

    public HashMap<String, List<App>> getAppsHashMap() {
        return appsHashMap;
    }

    public void setAppsHashMap(HashMap<String, List<App>> appsHashMap) {
        this.appsHashMap = appsHashMap;
    }

    public AppsHashMap() {
        this.appsHashMap = new HashMap<>();

        appsHashMap.put("multimedia", new MultimediaAppsLoader().LoadApps());
        appsHashMap.put("uzytkowe", new UzytkoweAppsLoader().LoadApps());
        appsHashMap.put("bezpieczenstwo", new BezpieczenstwoAppsLoader().LoadApps());
        appsHashMap.put("biurowe", new BiuroweAppsLoader().LoadApps());
        appsHashMap.put("gry", new GryAppsLoader().LoadApps());
        appsHashMap.put("internet", new InternetAppsLoader().LoadApps());

        appsHashMap.put("multimediaExtended", new MultimediaAppsLoader().LoadExtendedApps());
        appsHashMap.put("uzytkoweExtended", new UzytkoweAppsLoader().LoadExtendedApps());
        appsHashMap.put("bezpieczenstwoExtended", new BezpieczenstwoAppsLoader().LoadExtendedApps());
        appsHashMap.put("biuroweExtended", new BiuroweAppsLoader().LoadExtendedApps());
        appsHashMap.put("gryExtended", new GryAppsLoader().LoadExtendedApps());
        appsHashMap.put("internetExtended", new InternetAppsLoader().LoadExtendedApps());
    }

}
