package com.example.fit3162_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HeartDiseaseDisplayActivity extends AppCompatActivity {

    Button back_button;
    Button testing_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_disease_display);

        //testing button to open symptoms recyclerview
        openSymptomsRecyclerView();
        //close current activity
        closeActivity();
    }

    public void openSymptomsRecyclerView(){
        testing_button=findViewById(R.id.button);
        testing_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HeartDiseaseDisplayActivity.this, SymptomsDisplayActivity.class);
                startActivity(intent);
            }
        });

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