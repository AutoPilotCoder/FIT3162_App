package com.example.fit3162_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HeartDiseaseDisplayActivity extends AppCompatActivity {

    Button back_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_disease_display);

        //close current activity
        closeActivity();
    }

    public void closeActivity(){
        back_button=findViewById(R.id.previous_Page_Button);

        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}