/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maq.repository.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import maq.repository.App.App;

/**
 *
 * @author MaQ
 */
@ManagedBean
@RequestScoped
public class GenreBean{
  private HashMap<String, ArrayList<App>> beanMap;
  //setter + getters

    public HashMap<String, ArrayList<App>> getbeanMap() {
        return beanMap;
    }

    public void setbeanMap(HashMap<String, ArrayList<App>> beanMap) {
        this.beanMap = beanMap;
    }

    public GenreBean() {
        this.beanMap = new HashMap<String, ArrayList<App>>();
        beanMap.put("uzytkowe", new UzytkoweCarouselView().getApps());
      //   beanMap.put("multimedia", "#{multimediaCarouselView.apps}");
        
    }
    
    
    // uzytkoweCarouselView.selectedApp
}