package com.example.fragement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button frag1,frag2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frag1=findViewById(R.id.frag1);
        frag2=findViewById(R.id.frag2);

        frag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager manager=getSupportFragmentManager();
                FragmentTransaction trans=manager.beginTransaction();
                Fragment fragment1 = new fragment1();

                trans.replace(R.id.fragment,fragment1);
                trans.commit();
            }



        });
        frag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction trans = manager.beginTransaction();
                Fragment fragment1 = new fragment1();

                trans.replace(R.id.fragment, fragment1);
                trans.commit();
            }
        });



    }
}