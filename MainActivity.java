package com.example.showing_list_in_recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView=findViewById(R.id.programming_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        String []languages={"Java","Python","R","Scala","Kotlin","Ruby","Perl","Java","Python","R","Scala","Kotlin","Ruby","Perl",
                "Java","Python","R","Scala","Kotlin","Ruby","Perl","Java","Python","R","Scala","Kotlin","Ruby","Perl"};
        recyclerView.setAdapter(new MyAdapter(languages));
    }
}
