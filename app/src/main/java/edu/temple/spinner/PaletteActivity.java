package edu.temple.spinner;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;


public class PaletteActivity extends AppCompatActivity {

    Spinner mySpinner;
    public static final String[] colors = new String[] {"Colors", "Blue", "Gray", "Green", "Magenta", "Red", "White", "Black"};
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);

        mySpinner = (Spinner) findViewById(R.id.colorSpinner);              //connect spinner
        mySpinner.setAdapter(new SpinnerAdapter(PaletteActivity.this,colors));
        constraintLayout = (ConstraintLayout) findViewById(R.id.mainActivity);

        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    constraintLayout.setBackgroundColor(Color.WHITE);
                }else if(position == 1){
                    constraintLayout.setBackgroundColor(Color.BLUE);
                }else if(position == 2){
                    constraintLayout.setBackgroundColor(Color.GRAY);
                }else if(position == 3){
                    constraintLayout.setBackgroundColor(Color.GREEN);
                }else if(position == 4){
                    constraintLayout.setBackgroundColor(Color.MAGENTA);
                }else if(position == 5){
                    constraintLayout.setBackgroundColor(Color.RED);
                }else if(position == 6){
                    constraintLayout.setBackgroundColor(Color.WHITE);
                }else if(position == 7){
                    constraintLayout.setBackgroundColor(Color.BLACK);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

                // sometimes you need nothing here
            }
        });
    }
}
