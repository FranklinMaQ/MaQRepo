/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maq.repository.view;

import java.util.HashMap;
import javax.el.ELContext;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import maq.repository.Interfaces.ICarouselView;

/**
 *
 * @author MaQ
 */
@ManagedBean
@RequestScoped

public class GenreBean{
  private HashMap<String, ICarouselView> beanMap;
  
 
  //setter + getters
  
  public static Object getBean(String beanName){
    Object bean = null;
    FacesContext fc = FacesContext.getCurrentInstance();
    if(fc!=null){
         ELContext elContext = fc.getELContext();
         bean = elContext.getELResolver().getValue(elContext, null, beanName);
    }

    return bean;
}

    public HashMap<String, ICarouselView> getbeanMap() {
        return beanMap;
    }

    public void setbeanMap(HashMap<String, ICarouselView> beanMap) {
        this.beanMap = beanMap;
    }

    public GenreBean() {
        beanMap = new HashMap<String, ICarouselView>();
        beanMap.put("uzytkowe", (UzytkoweCarouselView)getBean("uzytkoweCarouselView"));
        beanMap.put("multimedia", (MultimediaCarouselView)getBean("multimediaCarouselView"));
      //   beanMap.put("multimedia", "#{multimediaCarouselView.apps}");
        
    }
    
    
    // uzytkoweCarouselView.selectedApp
}