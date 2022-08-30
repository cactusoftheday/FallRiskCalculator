package com.example.fallriskcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class questionaire extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questionaire);
        RadioButton recent_fall = findViewById(R.id.recent_fall_yes);
        RadioButton need_cane = findViewById(R.id.need_cane_yes);
        RadioButton unsteady = findViewById(R.id.unsteady_yes);
        RadioButton poor_balance = findViewById(R.id.poor_balance_yes);
        RadioButton worried = findViewById(R.id.worried_yes);
        RadioButton push_from_chair = findViewById(R.id.push_from_chair_yes);
        RadioButton curb = findViewById(R.id.curb_yes);
        RadioButton toilet = findViewById(R.id.toilet_yes);
        RadioButton numbness = findViewById(R.id.numbness_yes);
        RadioButton light_headed_medicine = findViewById(R.id.light_headed_medicine_yes);
        RadioButton sleep_medicine = findViewById(R.id.sleep_medicine_yes);
        RadioButton depressed = findViewById(R.id.depressed_yes);
        Button submit = findViewById(R.id.submit);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int risk = 0;
                if (recent_fall.isChecked()) {
                    risk+=2;
                    recent_fall.setChecked(false);
                }
                if (need_cane.isChecked()) {
                    risk+=2;
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


                AlertDialog.Builder builder = new AlertDialog.Builder(questionaire.this);
                if (risk < 4) {
                    builder.setMessage("The patient is not at risk of falling." + risk);
                } else {
                    builder.setMessage("The patient is at risk of falling." + risk);
                }
                builder.setIcon(getResources().getDrawable(R.drawable.icons8_checkmark_192___));
                builder.setCancelable(true);
                builder.setTitle("Results:");
                AlertDialog alertDialog = builder.create();
                alertDialog.show();




            }
        });
    }


}