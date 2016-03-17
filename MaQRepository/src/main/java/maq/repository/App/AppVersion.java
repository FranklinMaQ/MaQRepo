package maq.repository.App;

public class AppVersion {

    private String link;
    private String changelog;
  

    public AppVersion(String link, String changelog) {
        this.link = link;
        this.changelog = changelog;
      
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getChangelog() {
        return changelog;
    }

    public void setChangelog(String changelog) {
        this.changelog = changelog;
    }

  

}
