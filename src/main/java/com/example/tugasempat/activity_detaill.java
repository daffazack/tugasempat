package com.example.tugasempat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_detaill extends AppCompatActivity {
    TextView tvName, tvOverview;
    ImageView ivSepatu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detaill);

        tvName = findViewById(R.id.tv_judul);
        tvOverview = findViewById(R.id.tv_overview);
        ivSepatu = findViewById(R.id.iv_shoes);

        String name = getIntent().getStringExtra("name");
        String overview = getIntent().getStringExtra("overview");
        int gambar = getIntent().getIntExtra("gambar",0);

        tvName.setText(name);
        tvOverview.setText(overview);
        ivSepatu.setImageResource(gambar);
    }
}
