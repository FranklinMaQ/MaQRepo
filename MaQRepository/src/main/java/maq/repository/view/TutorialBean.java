
package maq.repository.view;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="tutorialBean")
@SessionScoped
public class TutorialBean {
    
    private boolean showTutorial;

    public boolean isShowTutorial() {
        return showTutorial;
    }

    public void setShowTutorial(boolean showTutorial) {
        this.showTutorial = showTutorial;
    }

    public TutorialBean() {
        this.showTutorial = false;
    }
    
    
    
}
