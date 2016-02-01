/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maq.repository.Service;

import java.util.ArrayList;
import java.util.HashMap;
import maq.repository.App.App;
import maq.repository.Utils.XMLParser;

/**
 *
 * @author MaQ
 */
public class AppService {
    
 //   private HashMap<String, ArrayList<App>> mapa_appek;
    
   
    
    public HashMap<String, ArrayList<App>> GetSortedApps()
    {
        
        ArrayList<App> all_apps = XMLParser.ParseAppsFile("C:\\Users\\MaQ\\Desktop\\MaQDownloader\\repo_apps.xml");
        HashMap<String, ArrayList<App>> mapa_appek = new HashMap<String, ArrayList<App>>();
        
        ArrayList<App> lista_uzytkowe = new ArrayList<>();
        ArrayList<App> lista_multimedialne = new ArrayList<>();
        ArrayList<App> lista_bezpieczenstwo = new ArrayList<>();
        ArrayList<App> lista_biurowe = new ArrayList<>();
        ArrayList<App> lista_internet = new ArrayList<>();
        ArrayList<App> lista_gry = new ArrayList<>();
        
        for(App x : all_apps)
        {
            if("Multimedia".equals(x.getCategory()))
            {
                lista_multimedialne.add(x);
            }
            else if("Uzytkowe".equals(x.getCategory()))
            {
                lista_uzytkowe.add(x);
            }
            else if("Bezpieczenstwo".equals(x.getCategory()))
            {
                lista_bezpieczenstwo.add(x);
            }
            else if("Biurowe".equals(x.getCategory()))
            {
                lista_biurowe.add(x);
            }
            else if("Internet".equals(x.getCategory()))
            {
                lista_internet.add(x);
            }
            else if("Gry".equals(x.getCategory()))
            {
                lista_gry.add(x);
            }
        }
        
        mapa_appek.put("Uzytkowe", lista_uzytkowe);
         mapa_appek.put("Multimedia", lista_multimedialne);
          mapa_appek.put("Bezpieczenstwo", lista_bezpieczenstwo);
           mapa_appek.put("Biurowe", lista_biurowe);
            mapa_appek.put("Internet", lista_internet);
             mapa_appek.put("Gry", lista_gry);
        
        return mapa_appek;
    }
    
}
