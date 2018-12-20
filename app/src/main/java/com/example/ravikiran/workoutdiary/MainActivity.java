package com.example.ravikiran.workoutdiary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n = 5;
        String s[] = {"Triceps + Legs", "Shoulders", "Chest", "Back", "Biceps + Abs"};

        ListAdapter dayList = new new_display(this, s);
        ListView cycle_select = (ListView) findViewById(R.id.cycle_select);
        cycle_select.setAdapter(dayList);

        cycle_select.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String b = String.valueOf(adapterView.getItemAtPosition(i));
                        Intent gotoexlist = new Intent(MainActivity.this, ex_list.class);
                        startActivity(gotoexlist);
                    }
                }
        );
    }
}
