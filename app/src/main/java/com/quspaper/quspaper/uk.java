package com.quspaper.quspaper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class uk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uk);
    }
    public void uk_class12th(View view){
        Intent intent=new Intent(uk.this,uk_sub.class);
        startActivity(intent);
    }
    public void uk_class10th(View view){
        Intent intent=new Intent(this,uk_sub2.class);
        startActivity(intent);
    }
}
