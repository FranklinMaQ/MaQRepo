/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maq.repository.InterfacesImpl;

import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import maq.repository.App.App;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import maq.repository.Interfaces.IAppsLoader;
import maq.repository.Utilities.XMLParser;

/**
 *
 * @author MaQ
 */
public class UzytkoweAppsLoader implements IAppsLoader {

    private String apps_file = "C:\\xml\\uzytkowe.xml";

    @Override
    public ArrayList<App> LoadApps() {      
        
      //  return uzytkowe;
        return XMLParser.ParseFile(apps_file);
        
    }
    
    

}
