/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maq.repository.view;

import java.io.InputStream;
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

    public void setFile(StreamedContent file) {
        this.file = file;
    }
     
    public FileDownloadView() {    
      
         
    }
    
    public void instantiateFile(){
    InputStream stream = this.getClass().getResourceAsStream("/images/kodi.png");
   file = new DefaultStreamedContent(stream, "image/png", "kodi.png");   
}
 
    public StreamedContent getFile() {
        if(file == null) {
            System.out.println("jest null");
     instantiateFile();
     
   }
   return file;
    }
    
  
}