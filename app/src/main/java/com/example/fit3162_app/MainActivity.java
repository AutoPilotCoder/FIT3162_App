package com.example.fit3162_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String query_input;

    EditText input_multiline_view;

    Button input_query_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //input query search textview setup
        input_query_search();

        //button click to view heart disease stage
        open_heart_disease_stage_screen();

    }

    public void input_query_search(){
        input_multiline_view=(EditText) findViewById(R.id.Input_query_text);
        input_multiline_view.setMovementMethod(new ScrollingMovementMethod());
    }

    public void open_heart_disease_stage_screen(){
        input_query_button=(Button) findViewById(R.id.Input_query_button);
        input_query_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //save input value
                query_input=input_multiline_view.getText().toString();

                //display toast of content
                showToast(query_input);

                //open heart disease stage page
                Intent intent=new Intent(MainActivity.this, HeartDiseaseDisplayActivity.class);
                startActivity(intent);

            }
        });
    }

    public void showToast(String toast_text){
        Toast.makeText(MainActivity.this, toast_text, Toast.LENGTH_SHORT).show();
    }
}