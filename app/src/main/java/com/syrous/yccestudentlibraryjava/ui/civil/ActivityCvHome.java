package com.syrous.yccestudentlibraryjava.ui.civil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.syrous.yccestudentlibraryjava.R;
import com.syrous.yccestudentlibraryjava.ui.GenAdapter;

public class ActivityCvHome extends AppCompatActivity {

    private RecyclerView recyclerView;
    private String[] semName;
    private boolean isAdded = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cv_activity_home);
        recyclerView= findViewById(R.id.civil_home_recycler);
        semName = getResources().getStringArray(R.array.semesters);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        setupAdapter();
    }

    private void setupAdapter(){
        if(isAdded){
            GenAdapter genAdapter = new GenAdapter(getApplicationContext(), semName,
                    R.layout.cv_sem_card, R.id.civil_sem_num);
            recyclerView.setAdapter(genAdapter);
            isAdded = false;
        }
    }


}
