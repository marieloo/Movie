package sg.edu.rp.c346.movieslist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvMovie;
    ArrayList<Movie> movieList;
    CustomAdapter caMovie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvMovie=(ListView)findViewById(R.id.listViewMovie);
        movieList=new ArrayList<Movie>();

        caMovie=new CustomAdapter(this,R.layout.movie_row,movieList);
        lvMovie.setAdapter(caMovie);

        Movie item1= new Movie("War for the Planet of the Apes","A 2017 sequel of the Planet of the Apes,a science fiction franchise","By French author,Pierre Boulelle");
        movieList.add(item1);

        Movie item2=new Movie("King Kong","Movie about a giant ape that first appeared in the 1930s","Created by American flimaker Merian C.Cooper");
        movieList.add(item2);
    }
}
