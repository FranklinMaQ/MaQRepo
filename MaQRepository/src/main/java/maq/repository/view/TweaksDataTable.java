/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maq.repository.view;

import java.io.Serializable;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import maq.repository.Tweak.Tweak;
import org.primefaces.event.DragDropEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

@ManagedBean(name = "tweaksDataTable")
@SessionScoped
public class TweaksDataTable implements Serializable {

    private ArrayList<Tweak> tweaks;
    private ArrayList<Tweak> droppedTweaks;
    
    
  
    public ArrayList<Tweak> getDroppedTweaks() {
        return droppedTweaks;
    }

    public void setDroppedTweaks(ArrayList<Tweak> droppedTweaks) {
        this.droppedTweaks = droppedTweaks;
    }

    public ArrayList<Tweak> getTweaks() {
        return tweaks;
    }

    public void setTweaks(ArrayList<Tweak> tweaks) {
        this.tweaks = tweaks;
    }

    public Tweak getSelectedTweak() {
        return selectedTweak;
    }

    public void setSelectedTweak(Tweak selectedTweak) {
        this.selectedTweak = selectedTweak;
    }

    public ArrayList<Tweak> getSelectedTweaks() {
        return selectedTweaks;
    }

    public void setSelectedTweaks(ArrayList<Tweak> selectedTweaks) {
        this.selectedTweaks = selectedTweaks;
    }
    private Tweak selectedTweak;
    private ArrayList<Tweak> selectedTweaks;

    @PostConstruct
    public void init() {
        Tweak x1 = new Tweak("Ukrywa pasek zadan", "windows7", "bat", "/tweaki/1.bat");
        Tweak x3 = new Tweak("Udaszadan", "windows7", "bat", "/tweaki/3.bat");
        Tweak x2 = new Tweak("Pokazuje pasek zadan", "windows10", "bat", "/tweaki/2.bat");
        tweaks = new ArrayList<>();
        tweaks.add(x1);
        tweaks.add(x2);
        tweaks.add(x3);
        
        selectedTweaks = new ArrayList<>();
        
    }

    public void onCarDrop(DragDropEvent ddEvent) {
        Tweak tweak = ((Tweak) ddEvent.getData());

        droppedTweaks.add(tweak);
        tweaks.remove(tweak);
    }
    
     public void remove()
   {
       
         selectedTweaks.remove(selectedTweak);
        selectedTweak = null;
     

   }
     
      public void onRowSelect(SelectEvent event) {
       Tweak x = ((Tweak) event.getObject());
       
       if(!selectedTweaks.contains(x))
       {
           selectedTweaks.add(x);
       }
       else
       {
           selectedTweaks.remove(x);
       }
       
    }
 
  
}
