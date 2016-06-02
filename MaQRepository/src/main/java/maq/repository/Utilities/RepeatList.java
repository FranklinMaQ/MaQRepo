package maq.repository.Utilities;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "repeatList")
@ApplicationScoped
public class RepeatList {

    private List<String> genreList;

    public RepeatList() {
        this.genreList = new ArrayList<>();
        
        genreList.add("uzytkowe");
        genreList.add("multimedia");
        genreList.add("internet");
        genreList.add("bezpieczenstwo");
    }

    public List<String> getGenreList() {
        return genreList;
    }

    public void setGenreList(List<String> genreList) {
        this.genreList = genreList;
    }
}
