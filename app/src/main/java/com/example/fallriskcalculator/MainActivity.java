package com.example.fallriskcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CheckBox recent_fall = findViewById(R.id.recent_fall);
        CheckBox need_cane = findViewById(R.id.need_cane);
        CheckBox unsteady = findViewById(R.id.unsteady);
        CheckBox poor_balance = findViewById(R.id.poor_balance);
        CheckBox worried = findViewById(R.id.worried);
        CheckBox push_from_chair = findViewById(R.id.push_from_chair);
        CheckBox curb = findViewById(R.id.curb);
        CheckBox toilet = findViewById(R.id.toilet);
        CheckBox numbness = findViewById(R.id.numbness);
        CheckBox light_headed_medicine = findViewById(R.id.light_headed_medicine);
        CheckBox sleep_medicine = findViewById(R.id.sleep_medicine);
        CheckBox depressed = findViewById(R.id.depressed);
        Button submit = findViewById(R.id.submit);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                int risk = 0;
                if (recent_fall.isChecked()) {
                    risk++;
                    recent_fall.setChecked(false);
                }
                if (need_cane.isChecked()) {
                    risk++;
                    need_cane.setChecked(false);
                }
                if (unsteady.isChecked()) {
                    risk++;
                    unsteady.setChecked(false);
                }
                if (poor_balance.isChecked()) {
                    risk++;
                    poor_balance.setChecked(false);
                }
                if (worried.isChecked()) {
                    risk++;
                    worried.setChecked(false);
                }
                if (push_from_chair.isChecked()) {
                    risk++;
                    push_from_chair.setChecked(false);
                }
                if (curb.isChecked()) {
                    risk++;
                    curb.setChecked(false);
                }
                if (toilet.isChecked()) {
                    risk++;
                    toilet.setChecked(false);
                }
                if (numbness.isChecked()) {
                    risk++;
                    numbness.setChecked(false);
                }
                if (light_headed_medicine.isChecked()) {
                    risk++;
                    light_headed_medicine.setChecked(false);
                }
                if (sleep_medicine.isChecked()) {
                    risk++;
                    sleep_medicine.setChecked(false);
                }
                if (depressed.isChecked()) {
                    risk++;
                    depressed.setChecked(false);
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                if (risk == 1) {
                    builder.setMessage("The patient has a total of " + Integer.toString(risk) + " risk");
                } else {
                    builder.setMessage("The patient has a total of " + Integer.toString(risk) + " risks");
                }
                builder.setCancelable(true);
                builder.setTitle("Results:");
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });
    }


}