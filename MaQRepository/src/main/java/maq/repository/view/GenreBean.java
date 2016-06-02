/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maq.repository.view;

import maq.repository.view.CarouselViews.BezpieczenstwoCarouselView;
import maq.repository.view.CarouselViews.UzytkoweCarouselView;
import maq.repository.view.CarouselViews.MultimediaCarouselView;
import java.util.HashMap;
import javax.el.ELContext;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import maq.repository.Interfaces.ICarouselView;
import maq.repository.view.CarouselViews.BiuroweCarouselView;
import maq.repository.view.CarouselViews.GryCarouselView;
import maq.repository.view.CarouselViews.InternetCarouselView;

/**
 *
 * @author MaQ
 */
@ManagedBean
@RequestScoped

public class GenreBean {

    private HashMap<String, ICarouselView> beanMap;

    //setter + getters
    public static Object getBean(String beanName) {
        Object bean = null;
        FacesContext fc = FacesContext.getCurrentInstance();
        if (fc != null) {
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
        beanMap.put("uzytkowe", (UzytkoweCarouselView) getBean("uzytkoweCarouselView"));
        beanMap.put("multimedia", (MultimediaCarouselView) getBean("multimediaCarouselView"));
        beanMap.put("bezpieczenstwo", (BezpieczenstwoCarouselView) getBean("bezpieczenstwoCarouselView"));
        beanMap.put("internet", (InternetCarouselView) getBean("internetCarouselView"));
        beanMap.put("biurowe", (BiuroweCarouselView) getBean("biuroweCarouselView"));
        beanMap.put("gry", (GryCarouselView) getBean("gryCarouselView"));

    }

    // uzytkoweCarouselView.selectedApp
}
