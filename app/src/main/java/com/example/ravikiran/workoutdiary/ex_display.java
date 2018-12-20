package com.example.ravikiran.workoutdiary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

class ex_display extends ArrayAdapter<String> {

    ex_display(Context context, String[] s) {
        super(context, R.layout.ex_list, s);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inf = LayoutInflater.from(getContext());

        View new_view = inf.inflate(R.layout.ex_list, parent, false);

        TextView exName = (TextView) new_view.findViewById(R.id.ex_name);
        /*TextView excise = (TextView) new_view.findViewById(R.id.exercise);
        TextView status = (TextView) new_view.findViewById(R.id.status);*/

        //String DAY = "Day " + (position + 1);
        String exerName = getItem(position);
        //String STA = "DONE";

        exName.setText(exerName);
        //excise.setText(EXR);
        //status.setText(STA);

        return new_view;
    }
}
