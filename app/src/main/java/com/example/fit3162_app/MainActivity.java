package com.example.fit3162_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //input query search textview setup
        Input_query_search();

    }

    public void Input_query_search(){
        TextView input_multiline_view=findViewById(R.id.Input_query_text);
        input_multiline_view.setMovementMethod(new ScrollingMovementMethod());
    }
}