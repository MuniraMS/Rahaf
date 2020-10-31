package com.example.rahafheartsemojis;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    RadioButton frog, cat;
    ImageView catimg, frogimg;
    Button view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frog = (RadioButton) findViewById(R.id.RBfrog);
        cat = (RadioButton) findViewById(R.id.RBcat);
        catimg = (ImageView) findViewById(R.id.catimg);
        frogimg = (ImageView) findViewById(R.id.frogimg);
        view = (Button) findViewById(R.id.button);
        view.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (cat.isChecked()) {
            frogimg.setVisibility(View.INVISIBLE);
            catimg.setVisibility(View.VISIBLE);
        } else if (frog.isChecked()) {
            catimg.setVisibility(View.INVISIBLE);
            frogimg.setVisibility(View.VISIBLE);
        }
    }
}
