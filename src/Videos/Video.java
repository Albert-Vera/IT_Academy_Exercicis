package Videos;

import java.util.ArrayList;
import java.util.List;

public class Video {
    String url, titol;
    List<String> tags = new ArrayList<>();

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags.add( tags) ;
    }
}
