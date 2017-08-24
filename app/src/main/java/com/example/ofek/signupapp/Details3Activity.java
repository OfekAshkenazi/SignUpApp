package com.example.ofek.signupapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class Details3Activity extends AppCompatActivity {
    SeekBar bar;
    TextView salaryTV;
    Button nextBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details3);
        bar= (SeekBar) findViewById(R.id.seekBar);
        nextBtn= (Button) findViewById(R.id.next3Btn);
        salaryTV= (TextView) findViewById(R.id.salaryTV);
        salaryTV.setText(0);
        bar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                salaryTV.setText(i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
