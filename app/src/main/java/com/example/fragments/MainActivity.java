package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView aqib1=findViewById(R.id.aqib1);
        ImageView aqib2=findViewById(R.id.aqib2);
        ImageView aqib3=findViewById(R.id.aqib3);
        ImageView aqib4=findViewById(R.id.aqib4);
        ImageView aqib5=findViewById(R.id.aqib5);
        ImageView aqib6=findViewById(R.id.aqib6);
        ImageView aqib7=findViewById(R.id.aqib7);
        ImageView aqib8=findViewById(R.id.aqib8);
        ImageView aqib9=findViewById(R.id.aqib9);
        ImageView aqib10=findViewById(R.id.aqib10);
        ImageView aqib11=findViewById(R.id.aqib11);
        ImageView aqib12=findViewById(R.id.aqib12);
        ImageView aqib13=findViewById(R.id.aqib13);
        ImageView aqib14=findViewById(R.id.aqib14);
        ImageView aqib15=findViewById(R.id.aqib15);


        LinearLayout layout=findViewById(R.id.lastl);

        aqib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AqibF f1=new AqibF();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.lastl,f1);
                transaction.commit();
            }
        });

        aqib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YahyaF f2=new YahyaF();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.lastl,f2);
                transaction.commit();
            }
        });

        aqib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AdilF f3=new AdilF();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.lastl,f3);
                transaction.commit();
            }
        });
////////////////////////////////////////////////////////////////
        aqib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AqibF f1=new AqibF();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.lastl,f1);
                transaction.commit();
            }
        });
        aqib5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YahyaF f3=new YahyaF();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.lastl,f3);
                transaction.commit();
            }
        });
        aqib6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AdilF f3=new AdilF();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.lastl,f3);
                transaction.commit();
            }
        });
        aqib7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AqibF f1=new AqibF();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.lastl,f1);
                transaction.commit();
            }
        });
        aqib8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YahyaF f3=new YahyaF();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.lastl,f3);
                transaction.commit();
            }
        });
        aqib9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AdilF f3=new AdilF();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.lastl,f3);
                transaction.commit();
            }
        });
        aqib10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AqibF f1=new AqibF();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.lastl,f1);
                transaction.commit();
            }
        });
        aqib11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YahyaF f3=new YahyaF();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.lastl,f3);
                transaction.commit();
            }
        });
        aqib12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AdilF f3=new AdilF();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.lastl,f3);
                transaction.commit();
            }
        });
        aqib13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AqibF f1=new AqibF();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.lastl,f1);
                transaction.commit();
            }
        });
        aqib14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YahyaF f3=new YahyaF();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.lastl,f3);
                transaction.commit();
            }
        });
        aqib15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AqibF f3=new AqibF();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.lastl,f3);
                transaction.commit();
            }
        });

    }
}