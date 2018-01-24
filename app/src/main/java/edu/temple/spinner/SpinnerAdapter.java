package edu.temple.spinner;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by krati on 9/21/17.
 */

public class SpinnerAdapter extends BaseAdapter {

    Context context;
    String[] colors;

    public SpinnerAdapter(Context context, String[] colors) {
        this.context = context;
        this.colors = colors;
    }

    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int i) {
        return colors[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.spinner, null);
        }

        TextView name = (TextView) view.findViewById(R.id.SpinnertextView);

        //setData
        name.setText(colors[i]);
        if(i == 0){
            name.setTextColor(Color.BLACK);
            name.setBackgroundColor(Color.WHITE);
        }else if(i == 1){
            name.setTextColor(Color.WHITE);
            name.setBackgroundColor(Color.BLUE);
        }else if(i ==2){
            name.setTextColor(Color.WHITE);
            name.setBackgroundColor(Color.GRAY);
        }else if(i == 3){
            name.setTextColor(Color.WHITE);
            name.setBackgroundColor(Color.GREEN);
        }else if(i == 4){
            name.setTextColor(Color.WHITE);
            name.setBackgroundColor(Color.MAGENTA);
        }else if(i == 5){
            name.setTextColor(Color.WHITE);
            name.setBackgroundColor(Color.RED);
        }else if(i == 6){
            name.setTextColor(Color.BLACK);
            name.setBackgroundColor(Color.WHITE);
        }else if(i == 7){
            name.setTextColor(Color.WHITE);
            name.setBackgroundColor(Color.BLACK);
        }

        return view;
    }
}
