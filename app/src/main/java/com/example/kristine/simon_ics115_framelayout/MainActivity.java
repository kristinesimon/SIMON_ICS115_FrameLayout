package com.example.kristine.simon_ics115_framelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btnChange;
    ImageView image1;
    ImageView image2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnChange = (Button) findViewById(R.id.btnChange);
        image1 = (ImageView) findViewById(R.id.firstImage);
        image2 = (ImageView) findViewById(R.id.secondImage);

        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (image1.getVisibility() == View.VISIBLE) {
                    image1.setVisibility(View.GONE);
                    image2.setVisibility(View.VISIBLE);
                } else {
                    image2.setVisibility(View.GONE);
                    image1.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
