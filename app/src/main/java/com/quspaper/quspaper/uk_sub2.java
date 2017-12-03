package com.quspaper.quspaper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class uk_sub2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uk_sub2);
    }
    public void uk_class10th_hindi(View view){
        Intent intent=new Intent(this,paper.class);
        intent.putExtra("url","http://gourl.gq/download_10th_hindi.html");
        startActivity(intent);
    }
    public void uk_class10th_english(View view){
        Intent intent=new Intent(this,paper.class);
        intent.putExtra("url","http://gourl.gq/download_10th_english.html");
        startActivity(intent);
    }
    public void uk_class10th_math(View view){
        Intent intent=new Intent(this,paper.class);
        intent.putExtra("url","http://gourl.gq/download_10th_math.html");
        startActivity(intent);
    }
    public void uk_class10th_science(View view){
        Intent intent=new Intent(this,paper.class);
        intent.putExtra("url","http://gourl.gq/download_10th_sci.html");
        startActivity(intent);
    }
    public void uk_class10th_sst(View view){
        Intent intent=new Intent(this,paper.class);
        intent.putExtra("url","http://gourl.gq/download_10th_sst.html");
        startActivity(intent);
    }
}
