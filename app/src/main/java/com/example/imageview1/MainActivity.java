package com.example.imageview1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int num;
    ImageView imageView1;
    Random rnd = new Random();
    int x = 0;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = findViewById(R.id.imageView1);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[] imageResources = {R.drawable.image01, R.drawable.img, R.drawable.img_1};
                int randomIndex = rnd.nextInt(imageResources.length);
                imageView1.setImageResource(imageResources[randomIndex]);
                btn.setText(randomIndex);
            }
        });
    }
}
