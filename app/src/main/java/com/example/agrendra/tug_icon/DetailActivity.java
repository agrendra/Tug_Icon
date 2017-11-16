package com.example.agrendra.tug_icon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    int gbr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView pht = (ImageView)findViewById(R.id.foto);
        TextView teks = (TextView)findViewById(R.id.teks);
        TextView teks2 = (TextView)findViewById(R.id.teks2);

        Intent intent = getIntent();
        gbr = intent.getIntExtra("gambar", gbr);
        pht.setImageResource(gbr);
        teks.setText(intent.getStringExtra("text1"));
        teks2.setText(intent.getStringExtra("text2"));
    }
}
