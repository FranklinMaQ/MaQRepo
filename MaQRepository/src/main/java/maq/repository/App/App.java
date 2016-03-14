package maq.repository.App;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App implements Serializable{

     private String name;
    private String short_name;
     private String publisher;
    private String description;
    private String icon;
    private Map<String, String> linki = new HashMap<>();
    private List<String> versions;
    private String homepage;
   private String selectedVersion;

   

 
    private String category;
// color:#{carouselView.selectedCar.color}"/>
    
    public App(String name, String short_name, String publisher, String homepage, String description, String icon, Map<String, String> linki, String category) {
         this.name = name;
         this.short_name = short_name;
        this.publisher = publisher;       
        this.homepage = homepage;
        this.description = description;
        this.icon = icon;
        this.linki = linki;
        this.category = category;
        this.versions = new ArrayList<>();
    }

   

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

   

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
   
      public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }
    
     public List<String> getVersions() {
      
         for(Object o : linki.keySet())
         {
             versions.add(o.toString());
         }
         
         return versions;
    }


    public String getSelectedVersion() {
        return selectedVersion;
    }

    public void setSelectedVersion(String selectedVersion) {
        this.selectedVersion = selectedVersion;
    }
}

