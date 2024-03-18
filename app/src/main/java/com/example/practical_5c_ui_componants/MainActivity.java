package com.example.practical_5c_ui_componants;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button bsave;
    ImageButton imgb;
    CheckBox cb1, cbst;
    RadioButton rb1, rb2;
    EditText etext;
    RadioGroup rgroup;
    ToggleButton tbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bsave = findViewById(R.id.btnSave);
        imgb = findViewById(R.id.ib);
        etext = findViewById(R.id.et);
        cb1 = findViewById(R.id.cb1);
        cbst = findViewById(R.id.cbst);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        tbutton = findViewById(R.id.tb);
        rgroup = findViewById(R.id.rg);

        bsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Save Button clicked");
            }
        });

        imgb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("ImageButton clicked");
            }
        });

        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    showToast("Checkbox Option1 is checked");
                else
                    showToast("Checkbox unchecked");
            }
        });

        cbst.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    showToast("Checkbox Option2 is checked");
                else
                    showToast("Checkbox unchecked");
            }
        });

        rb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    showToast("RadioButton 1 is checked");
                else
                    showToast("RadioButton 1 is unchecked");
            }
        });

        rb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    showToast("RadioButton 2 is checked");
                else
                    showToast("RadioButton 2 is unchecked");
            }
        });

        tbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tbutton.isChecked())
                    showToast("ToggleButton is ON");
                else
                    showToast("ToggleButton is OFF");
            }
        });

        rgroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                RadioButton checkedRadioButton = findViewById(checkedId);
                showToast("Selected Radio Button: " + checkedRadioButton.getText());
            }
        });
    }

    public void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
