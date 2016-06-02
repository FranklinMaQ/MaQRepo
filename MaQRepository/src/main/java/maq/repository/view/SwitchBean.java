
package maq.repository.view;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="switchBean")
@ApplicationScoped
public class SwitchBean {  
  
    private String value = "case1";  
      
    public String getValue() {  
        return value;  
    }  
  
    public void setValue(final String value) {  
        this.value = value;  
    }  
    
    public void listener(String case_)
    {
       
    }
} 