package com.example.ravikiran.workoutdiary;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

class new_display extends ArrayAdapter<String> {

    new_display(Context context, String[] s) {
        super(context, R.layout.day_list, s);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inf = LayoutInflater.from(getContext());

        View new_view = inf.inflate(R.layout.day_list, parent, false);

        TextView day = (TextView) new_view.findViewById(R.id.Day);
        TextView excise = (TextView) new_view.findViewById(R.id.exercise);
        TextView status = (TextView) new_view.findViewById(R.id.status);

        String DAY = "Day " + (position + 1);
        String EXR = getItem(position);
        String STA = "DONE";

        day.setText(DAY);
        excise.setText(EXR);
        status.setText(STA);

        return new_view;
    }
}
