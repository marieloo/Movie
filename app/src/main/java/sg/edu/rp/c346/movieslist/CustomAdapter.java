package sg.edu.rp.c346.movieslist;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Movie> movieList;

    public CustomAdapter(Context context,int resource,ArrayList<Movie> objects){
        super(context,resource,objects);
        parent_context=context;
        layout_id=resource;
        movieList=objects;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInfalter object
        LayoutInflater inflater = (LayoutInflater) parent_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // Inflate a new view hierarchy from the specified xml resource (layout_id)
        // and return the root View of the inflated hierarchy.
        View rowView = inflater.inflate(layout_id, parent, false);
        // Obtain the UI Elements and assign to variables
        TextView tvTitle=(TextView)rowView.findViewById(R.id.textView6);
        TextView tvDesc=(TextView)rowView.findViewById(R.id.textView7);
        TextView tvMaker=(TextView)rowView.findViewById(R.id.textView8);

        // Obtain the employee item based on the 'position'.
        Movie currentItem = movieList.get(position);

        // Set the TextView to display corresponding information
        tvTitle.setText(currentItem.getTitle());
        tvDesc.setText(currentItem.getTitle());
        tvMaker.setText(currentItem.getTitle());





        return rowView;
    }
}
