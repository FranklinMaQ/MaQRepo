/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maq.repository.InterfacesImpl;

import java.io.Serializable;
import java.util.ArrayList;
import maq.repository.App.App;
import maq.repository.Interfaces.IAppsLoader;
import maq.repository.Utilities.XMLParser;

/**
 *
 * @author MaQ
 */
public class BiuroweAppsLoader implements IAppsLoader, Serializable {

    private String apps_file = "C:\\xml\\biurowe.xml";

    @Override
    public ArrayList<App> LoadApps() {      
        
    
      
        return XMLParser.ParseFile(apps_file);
        
    }

    @Override
    public ArrayList<App> LoadExtendedApps() {
        return XMLParser.ParseFile("C:\\xml\\biurowe_extended.xml");
    }
}
    

