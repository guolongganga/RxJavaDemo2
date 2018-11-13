package com.example.hp.rxjavademo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.tencent.bugly.beta.Beta;
import com.tencent.bugly.crashreport.CrashReport;


public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"被点击了",Toast.LENGTH_SHORT).show();

                Beta.checkUpgrade();
               // CrashReport.testJavaCrash();
            }
        });






    }
}
