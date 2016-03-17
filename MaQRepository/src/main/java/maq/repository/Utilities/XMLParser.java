/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maq.repository.Utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import maq.repository.App.App;
import maq.repository.App.AppVersion;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author MaQ
 */
public class XMLParser {
 
    public static String getValueOfElement(Element e, String tag_name) {
        return e.getElementsByTagName(tag_name).item(0).getTextContent();

    }
    
   
    public static ArrayList<App> ParseFile(String apps_file) {
        XPathLinksParser xpp = new XPathLinksParser();
        Map<String, AppVersion> linki = new HashMap<>();
        
        ArrayList<App> app_list = new ArrayList<>();
        try {

            App app;

            File parsed_file = new File(apps_file);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(parsed_file);
            doc.getDocumentElement().normalize();   // opcjonalne

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("App");   // lista Appek
            System.err.println(nList.getLength());

            for (int temp = 0; temp < nList.getLength(); temp++) {

                
                
                Node nNode = nList.item(temp);      // pojedyncza Appka

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) nNode;
                    
                    linki = xpp.Parse(apps_file, getValueOfElement(e, "Name"));
                    
                    System.out.println("TERAZ: " + linki.size());
                    app = new App(getValueOfElement(e, "Name"),
                            getValueOfElement(e, "Short_Name"),
                            getValueOfElement(e, "Publisher"),
                            getValueOfElement(e, "Homepage"),
                            getValueOfElement(e, "Description"),
                            getValueOfElement(e, "Icon"),
                            linki,
                            getValueOfElement(e, "Category"));

                    app_list.add(app);

                }

            }

        } catch (Exception x) {
            x.printStackTrace();
        }

        return app_list;
  }
    
}
