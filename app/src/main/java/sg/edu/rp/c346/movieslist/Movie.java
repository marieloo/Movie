package sg.edu.rp.c346.movieslist;


import android.widget.ImageView;

public class Movie {

    private String title;
    private String desc;
    private String maker;

    public Movie(String title,String desc,String maker){

        this.title=title;
        this.desc=desc;
        this.maker=maker;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }



}
