/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maq.repository.view;

import java.io.InputStream;
import javax.el.ELContext;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

/**
 *
 * @author MaQ
 */
@ManagedBean
@RequestScoped
public class FileDownloadView {

    private StreamedContent file;

    public FileDownloadView() {
        
        EditorView ev = (EditorView)getBean("editorView");
        
        System.out.println(ev.getText() + " sdsadsa");
      //  InputStream stream = this.getClass().getResourceAsStream("/images/kodi.png");
      //  file = new DefaultStreamedContent(stream, "image/png", "kodi.png");

    }
    
     public static Object getBean(String beanName) {
        Object bean = null;
        FacesContext fc = FacesContext.getCurrentInstance();
        if (fc != null) {
            ELContext elContext = fc.getELContext();
            bean = elContext.getELResolver().getValue(elContext, null, beanName);
        }

        return bean;
    }


    public void setFile(StreamedContent file) {
        this.file = file;
    }

    public StreamedContent getFile() {
        return file;
    }

}
