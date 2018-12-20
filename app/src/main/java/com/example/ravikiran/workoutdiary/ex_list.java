package com.example.ravikiran.workoutdiary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ex_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex_list);

        String s[] = {"Warm up",
                      "Cardio - Cycle",
                      "Abs",
                      "Cardio - Treadmill",
                      "Abs",
                      "Cardio - Ellipse",
                      "Abs",
                      "Cardio - Ellipse",
                      "Cardio - Treadmill",
                      "Cardio - Cycle",
                      "Abs"};

        ListAdapter exList = new ex_display(this, s);
        ListView ex_select = (ListView) findViewById(R.id.ex_list);
        ex_select.setAdapter(exList);

        ex_select.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String b = String.valueOf(adapterView.getItemAtPosition(i));
                        Toast.makeText(ex_list.this, b, Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}
