package com.example.VREPORT;


import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class Themmoi extends AppCompatActivity {
    Button btn;
    int a=1; // bien nay de luu id cua spn

    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themmoi);
        btn =(Button) findViewById(R.id.button);
        linearLayout = (LinearLayout) findViewById(R.id.linear);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addcbb(a);
                a++;

            }
        });
    }
    private void addcbb(int a){
        for (int i = 1; i <= 1; i++) {
            // 3 dong nay set vi tri cho spinner
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);
            // tao moi spinner
            Spinner spn = new Spinner(this);
            Integer arr[]= {1,2,3,4,5,6}; // dropdown cho spn
            //3 don nay gan gia tri cho spn
            ArrayAdapter< Integer > arrayAdapter= new ArrayAdapter< Integer >(this, android.R.layout.simple_spinner_dropdown_item,arr);
            arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spn.setAdapter(arrayAdapter);
            //lay id de thao tao
            spn.setId(a);
            final int id_ = spn.getId();
            // ien thi spn len man hinh
            linearLayout.addView(spn, params);
        }
    }
}