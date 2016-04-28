
package maq.repository.view;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="checkboxViewBean")
@ApplicationScoped
public class CheckboxViewBean {  
  
        private String[] selectedTweaks;

    public String[] getSelectedTweaks() {
        return selectedTweaks;
    }

    public void setSelectedTweaks(String[] selectedTweaks) {
        this.selectedTweaks = selectedTweaks;
        
        for(String x : selectedTweaks)
        {
            System.out.println(x + " tweak");
        }
    }
    private ArrayList<String> tweaks;  

    public ArrayList<String> getTweaks() {
        return tweaks;
    }

    public void setTweaks(ArrayList<String> tweaks) {
        this.tweaks = tweaks;
    }

    @PostConstruct
    public void init() {
        tweaks = new ArrayList<>();
        
        tweaks.add("Tweak 1");
        tweaks.add("Tweak 2");
        tweaks.add("Tweak 3");
    }
      
   
} 