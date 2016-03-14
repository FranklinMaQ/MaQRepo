/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maq.repository.InterfacesImpl;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import maq.repository.App.App;
import maq.repository.Interfaces.IAppsLoader;
import maq.repository.Utilities.XMLParser;
import maq.repository.Utilities.XPathLinksParser;
import org.xml.sax.SAXException;

/**
 *
 * @author MaQ
 */
public class MultimediaAppsLoader implements IAppsLoader {

    private String apps_file = "C:\\xml\\multimedia.xml";

    @Override
    public ArrayList<App> LoadApps() {      
        
      //  return uzytkowe;
     
      
        return XMLParser.ParseFile(apps_file);
        
    }
}
    

