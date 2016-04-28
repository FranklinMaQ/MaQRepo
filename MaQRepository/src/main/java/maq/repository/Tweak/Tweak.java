
package maq.repository.Tweak;

import java.io.Serializable;

public class Tweak implements Serializable{
    
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWindowsVersion() {
        return windowsVersion;
    }

    public void setWindowsVersion(String windowsVersion) {
        this.windowsVersion = windowsVersion;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    private String windowsVersion;
    private String type;
    private String path;

    public Tweak(String description, String windowsVersion, String type, String path) {
        this.description = description;
        this.windowsVersion = windowsVersion;
        this.type = type;
        this.path = path;
    }
    
    
    
}
