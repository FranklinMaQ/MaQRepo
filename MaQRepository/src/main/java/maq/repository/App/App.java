package maq.repository.App;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class App implements Serializable{

     private String name;
    private String short_name;
     private String publisher;
    private String description;
    private String icon;
    private Map<String, String> linki = new HashMap<String, String>();
    private String homepage;

 
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

    public Map<String, String> getLinki() {
        return linki;
    }

    public void setLinki(Map<String, String> linki) {
        this.linki = linki;
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
}

