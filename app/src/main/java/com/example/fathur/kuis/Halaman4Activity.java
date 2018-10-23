package com.example.fathur.kuis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Halaman4Activity extends AppCompatActivity {

    ViewPager viewPager;
    customSwip  customSwip;
    @Override



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman4);
        viewPager=(ViewPager)findViewById(R.id.viewPager);
        customSwip=new customSwip(this);
        viewPager.setAdapter(customSwip);

//        Button btn = (Button) findViewById(R.id.btn_back);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i1 = new Intent(getApplicationContext(),ActivityHome.class);
//                startActivity(i1);
//            }
//        });
    }

}
