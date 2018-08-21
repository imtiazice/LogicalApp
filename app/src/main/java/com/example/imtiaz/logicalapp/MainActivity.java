package com.example.imtiaz.logicalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox maleBox, femaleBox;
    private EditText hightEditText;
    private Button showButton;
    private TextView highestTextView, lowestTextView, idealTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        maleBox = (CheckBox)findViewById(R.id.male_checkbox);
        femaleBox = (CheckBox)findViewById(R.id.female_checkbox);

        hightEditText = (EditText)findViewById(R.id.hightText);

        showButton = (Button)findViewById(R.id.button_show);

        highestTextView = (TextView) findViewById(R.id.highest_weight);
        lowestTextView = (TextView)findViewById(R.id.lowest_weight);
        idealTextView  = (TextView) findViewById(R.id.ideal_weight);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();

                if(maleBox.isChecked()){
                    calculateMaleWeight();
                }
                if(femaleBox.isChecked()){
                    calculateFemaleWeight();

                }

            }
        });
    }

    ///Male
    private void calculateMaleWeight(){
        String hightStr = hightEditText.getText().toString();

        if(hightStr !=null && !"".equals(hightStr)){

            int heightValue = Integer.parseInt(hightStr);

            if(heightValue%2==0 && heightValue<=190){
                if(heightValue == 136){
                    highestTextView.setText("৪৬");
                    lowestTextView.setText("৩৭");
                    idealTextView.setText("৪১.৫");
                }
                else if(heightValue == 138){
                    highestTextView.setText("৪৭");
                    lowestTextView.setText("৩৮");
                    idealTextView.setText("৪২.৫");
                }
                else if(heightValue == 140){
                    highestTextView.setText("৪৮");
                    lowestTextView.setText("৩৯");
                    idealTextView.setText("৪৩.৫");
                }
                else if(heightValue == 142){
                    highestTextView.setText("৪৯");
                    lowestTextView.setText("৪০");
                    idealTextView.setText("৪৪.৫");
                }
                else if(heightValue == 144){
                    highestTextView.setText("৫১");
                    lowestTextView.setText("৪১");
                    idealTextView.setText("৪৬");
                }
                else if(heightValue == 146){
                    highestTextView.setText("৫৩");
                    lowestTextView.setText("৪৩");
                    idealTextView.setText("৪৮");
                }
                else if(heightValue == 148){
                    highestTextView.setText("৫৫");
                    lowestTextView.setText("৪৪");
                    idealTextView.setText("৪৯.৫");
                }
                else if(heightValue == 150){
                    highestTextView.setText("৫৬");
                    lowestTextView.setText("৪৫");
                    idealTextView.setText("৫০.৫");
                }
                else if(heightValue == 152){
                    highestTextView.setText("৫৮");
                    lowestTextView.setText("৪৬");
                    idealTextView.setText("৫২");
                }
                else if(heightValue == 154){
                    highestTextView.setText("৫৯");
                    lowestTextView.setText("৪৭");
                    idealTextView.setText("৫৩");
                }
                else if(heightValue == 156){
                    highestTextView.setText("৬১");
                    lowestTextView.setText("৪৯");
                    idealTextView.setText("৫৫");
                }
                else if(heightValue == 158){
                    highestTextView.setText("৬২");
                    lowestTextView.setText("৫০");
                    idealTextView.setText("৫৬");
                }
                else if(heightValue == 160){
                    highestTextView.setText("৬৪");
                    lowestTextView.setText("৫১");
                    idealTextView.setText("৫৭.৫");
                }
                else if(heightValue == 162){
                    highestTextView.setText("৬৬");
                    lowestTextView.setText("৫২");
                    idealTextView.setText("৫৯");
                }
                else if(heightValue == 164){
                    highestTextView.setText("৬৭");
                    lowestTextView.setText("৫৪");
                    idealTextView.setText("৬০.৫");
                }
                else if(heightValue == 166){
                    highestTextView.setText("৬৯");
                    lowestTextView.setText("৫৫");
                    idealTextView.setText("৬২");
                }
                else if(heightValue == 168){
                    highestTextView.setText("৭১");
                    lowestTextView.setText("৫৬");
                    idealTextView.setText("৬৩.৫");
                }
                else if(heightValue == 170){
                    highestTextView.setText("৭২");
                    lowestTextView.setText("৫৮");
                    idealTextView.setText("৬৫");
                }
                else if(heightValue == 172){
                    highestTextView.setText("৭৪");
                    lowestTextView.setText("৫৯");
                    idealTextView.setText("৬৫.৫");
                }
                else if(heightValue == 174){
                    highestTextView.setText("৭৬");
                    lowestTextView.setText("৬১");
                    idealTextView.setText("৬৮.৫");
                }
                else if(heightValue == 176){
                    highestTextView.setText("৭৭");
                    lowestTextView.setText("৬২");
                    idealTextView.setText("৬৯.৫");
                }
                else if(heightValue == 178){
                    highestTextView.setText("৭৯");
                    lowestTextView.setText("৬৩");
                    idealTextView.setText("৭১");
                }
                else if(heightValue == 180){
                    highestTextView.setText("৮১");
                    lowestTextView.setText("৬৫");
                    idealTextView.setText("৭৩");
                }
                else if(heightValue == 182){
                    highestTextView.setText("৮৩");
                    lowestTextView.setText("৬৬");
                    idealTextView.setText("৭৪.৫");
                }
                else if(heightValue == 184){
                    highestTextView.setText("৮৫");
                    lowestTextView.setText("৬৮");
                    idealTextView.setText("৭৬.৫");
                }
                else if(heightValue == 186){
                    highestTextView.setText("৮৬");
                    lowestTextView.setText("৬৯");
                    idealTextView.setText("৭৭.৫");
                }
                else if(heightValue == 188){
                    highestTextView.setText("৮৮");
                    lowestTextView.setText("৭১");
                    idealTextView.setText("৭৯.৫");
                }
                else if(heightValue == 190){
                    highestTextView.setText("৯০");
                    lowestTextView.setText("৭২");
                    idealTextView.setText("৮১");
                }
            }

            else{
                highestTextView.setText("০০");
                lowestTextView.setText("০০");
                idealTextView.setText("০০");
                Toast.makeText(MainActivity.this, "আপনি ভুল ইনপুট দিয়েছেন। দয়া করে জোড় সংখ্যা এবং ১৯০ এর মধ্যে ইনপুট দিন।",Toast.LENGTH_SHORT).show();
            }

        }
    }

    //Female

    private void calculateFemaleWeight(){
        String hightStr = hightEditText.getText().toString();

        if(hightStr !=null && !"".equals(hightStr)){

            int heightValue = Integer.parseInt(hightStr);

            if(heightValue%2==0 && heightValue<=180){
                if(heightValue == 136){
                    highestTextView.setText("৪৪");
                    lowestTextView.setText("৩৫");
                    idealTextView.setText("৩৯.৫");
                }
                else if(heightValue == 138){
                    highestTextView.setText("৪৬");
                    lowestTextView.setText("৩৬");
                    idealTextView.setText("৪১.৫");
                }
                else if(heightValue == 140){
                    highestTextView.setText("৪৭");
                    lowestTextView.setText("৩৭");
                    idealTextView.setText("৪২");
                }
                else if(heightValue == 142){
                    highestTextView.setText("৪৮");
                    lowestTextView.setText("৩৮");
                    idealTextView.setText("৪৩");
                }
                else if(heightValue == 144){
                    highestTextView.setText("৫০");
                    lowestTextView.setText("৩৯");
                    idealTextView.setText("৪৪.৫");
                }
                else if(heightValue == 146){
                    highestTextView.setText("৫১");
                    lowestTextView.setText(".৪১");
                    idealTextView.setText("৪৬");
                }
                else if(heightValue == 148){
                    highestTextView.setText("৫৩");
                    lowestTextView.setText("৪২");
                    idealTextView.setText("৪৭.৫");
                }
                else if(heightValue == 150){
                    highestTextView.setText("৫৪");
                    lowestTextView.setText("৪৩");
                    idealTextView.setText("৪৮.৫");
                }
                else if(heightValue == 152){
                    highestTextView.setText("৫৫");
                    lowestTextView.setText("৪৪");
                    idealTextView.setText("৪৯.৫");
                }
                else if(heightValue == 154){
                    highestTextView.setText("৫৭");
                    lowestTextView.setText("৪৫");
                    idealTextView.setText("৫০.৫");
                }
                else if(heightValue == 156){
                    highestTextView.setText("৫৮");
                    lowestTextView.setText("৪৬");
                    idealTextView.setText("৫২");
                }
                else if(heightValue == 158){
                    highestTextView.setText("৬০");
                    lowestTextView.setText("৪৭");
                    idealTextView.setText("৫৩.৫");
                }
                else if(heightValue == 160){
                    highestTextView.setText("৬১");
                    lowestTextView.setText("৪৯");
                    idealTextView.setText("৫৫");
                }
                else if(heightValue == 162){
                    highestTextView.setText("৬৩");
                    lowestTextView.setText("৫০");
                    idealTextView.setText("৫৬.৫");
                }
                else if(heightValue == 164){
                    highestTextView.setText("৬৫");
                    lowestTextView.setText("৫১");
                    idealTextView.setText("৫৮");
                }
                else if(heightValue == 166){
                    highestTextView.setText("৬৬");
                    lowestTextView.setText("৫২");
                    idealTextView.setText("৫৯");
                }
                else if(heightValue == 168){
                    highestTextView.setText("৬৮");
                    lowestTextView.setText("৫৪");
                    idealTextView.setText("৬১");
                }
                else if(heightValue == 170){
                    highestTextView.setText("৬৯");
                    lowestTextView.setText("৫৫");
                    idealTextView.setText("৬২");
                }
                else if(heightValue == 172){
                    highestTextView.setText("৭১");
                    lowestTextView.setText("৫৬");
                    idealTextView.setText("৬৩.৫");
                }
                else if(heightValue == 174){
                    highestTextView.setText("৭৩");
                    lowestTextView.setText("৫৮");
                    idealTextView.setText("৬৫.৫");
                }
                else if(heightValue == 176){
                    highestTextView.setText("৭৪");
                    lowestTextView.setText("৫৯");
                    idealTextView.setText("৬৬.৫");
                }
                else if(heightValue == 178){
                    highestTextView.setText("৭৬");
                    lowestTextView.setText("৬০");
                    idealTextView.setText("৬৮");
                }
                else if(heightValue == 180){
                    highestTextView.setText("৭৮");
                    lowestTextView.setText("৬২");
                    idealTextView.setText("৭০");
                }
            }

            else{
                highestTextView.setText("০০");
                lowestTextView.setText("০০");
                idealTextView.setText("০০");
                Toast.makeText(MainActivity.this, "আপনি ভুল ইনপুট দিয়েছেন। দয়া করে জোড় সংখ্যা এবং ১৮০ এর মধ্যে ইনপুট দিন।",Toast.LENGTH_SHORT).show();
            }

        }
    }

}
