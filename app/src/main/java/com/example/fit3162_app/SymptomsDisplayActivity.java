package com.example.fit3162_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SymptomsDisplayActivity extends AppCompatActivity implements SymptomRecyclerviewItemOnClickListener{

    RecyclerView symptomsrecyclerView;

    Button back_button;
    LayoutInflater layoutInflater;
    PopupWindow popupWindow;
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms_display);

        //back button
        closeActivity();

        List<SymptomsRecyclerviewItem> items=new ArrayList<>();
        items.add(new SymptomsRecyclerviewItem("name1","desc1"));
        items.add(new SymptomsRecyclerviewItem("name2","desc2asdfgfhgjhkhgdfsaDAFGFGFHGHJJHKJGHFDGSFDASdsdfghjkj"));
        items.add(new SymptomsRecyclerviewItem("name3KLJKHJGFGDFSDASDSFGHJJKKHJGHFGDFSDA","desc3"));


        symptomsrecyclerView=findViewById(R.id.Symptoms_recyclerview);
        symptomsrecyclerView.setLayoutManager(new LinearLayoutManager(this));
        symptomsrecyclerView.setAdapter(new SymptomRecyclerviewAdapter(getApplicationContext(),items,this));
    }

    @Override
    public void onItemClicked(SymptomsRecyclerviewItem symptomsRecyclerviewItem) {

        relativeLayout=findViewById(R.id.symptoms_recyclerview_relative_layout);

        layoutInflater=(LayoutInflater) getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        ViewGroup container=(ViewGroup) layoutInflater.inflate(R.layout.symptoms_recyclerview_popup,null);

        int width=this.getResources().getDisplayMetrics().widthPixels;
        int height=this.getResources().getDisplayMetrics().heightPixels;

        popupWindow=new PopupWindow(container,1000,1500,true);
        popupWindow.showAtLocation(relativeLayout, Gravity.CENTER,0,0);

        TextView popup_name= container.findViewById(R.id.pop_up_symptom_name);
        TextView popup_description= container.findViewById(R.id.pop_up_symptom_description);

        popup_name.setText(symptomsRecyclerviewItem.getSymptom_name());
        popup_description.setText(symptomsRecyclerviewItem.getShort_description());
        container.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                popupWindow.dismiss();
                return true;
            }
        });


        Toast.makeText(this,symptomsRecyclerviewItem.getSymptom_name(),Toast.LENGTH_SHORT).show();
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