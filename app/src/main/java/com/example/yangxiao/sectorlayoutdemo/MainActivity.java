package com.example.yangxiao.sectorlayoutdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private ColorArcProgressBar bar1;
    private Button button2;
    private ColorArcProgressBar bar2;
    private Button button3;
    private ColorArcProgressBar bar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ColorArcProgressBar bar = (ColorArcProgressBar) findViewById(R.id.bar);
        bar.setCurrentValues(70);
        bar.setLayerType(View.LAYER_TYPE_SOFTWARE, null);

        bar1 = (ColorArcProgressBar) findViewById(R.id.bar1);
        button1 = (Button) findViewById(R.id.button1);
        bar2 = (ColorArcProgressBar) findViewById(R.id.bar2);
        button2 = (Button) findViewById(R.id.button2);
        bar3 = (ColorArcProgressBar) findViewById(R.id.bar3);
        button3 = (Button) findViewById(R.id.button3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bar1.setCurrentValues(100);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bar2.setCurrentValues(100);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bar3.setCurrentValues(77);
            }
        });
    }
}
