package com.bw.nierunzhang20200325.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.bw.nierunzhang20200325.R;

public class Main2Activity extends AppCompatActivity {

    private TextView main2Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();

        Intent intent = getIntent();
        String id = intent.getStringExtra("id");

        main2Text.setText(id);
    }

    private void initView() {
        main2Text = findViewById(R.id.main2_text);
    }
}
