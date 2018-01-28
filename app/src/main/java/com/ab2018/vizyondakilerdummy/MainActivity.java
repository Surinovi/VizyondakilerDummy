package com.ab2018.vizyondakilerdummy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Movie> movies ;
    ListView listim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            Log.d("Oncreate","list initialization");
            listim = findViewById(R.id.movie_listView);


            MovieAdapter adapter = new MovieAdapter(this,R.layout.movie_item,createDummyData());
            listim.setAdapter(adapter);



        }

        ArrayList<Movie> createDummyData()
        {
            movies = new ArrayList<Movie>();
            movies.add(0,new Movie(1,"Dunkirk","abc","en",R.drawable.dunkirk_px,8.8));
            movies.add(1,new Movie(2,"IT","abc","en",R.drawable.it,7.0));

            return movies;
        }

}
