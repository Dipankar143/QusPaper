package com.quspaper.quspaper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class cbsc_sub2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbsc_sub2);
    }
    public void cbsc_class10th_hindi(View view){
        Intent intent=new Intent(this,cbsc_paper.class);
        intent.putExtra("url","http://ncerthelp.com/text.php?ques=Previous+Year+Question+Papers+of+Hindi+For+Class+10+Download+in+pdf");
        startActivity(intent);
    }
    public void cbsc_class10th_english(View view){
        Intent intent=new Intent(this,cbsc_paper.class);
        intent.putExtra("url","http://ncerthelp.com/text.php?ques=Previous+Year+Question+Papers+In+Delhi+And+Outside+of+Delhi+English+for+Class+12+Download+in+PDf");
        startActivity(intent);
    }
    public void cbsc_class10th_math(View view){
        Intent intent=new Intent(this,cbsc_paper.class);
        intent.putExtra("url","http://ncerthelp.com/text.php?ques=Previous+Year+Question+Papers+of+CBSE+Board+Delhi+and+Outside+of+delhi+Mathematics+Class+10+Download+in+PDF");
        startActivity(intent);
    }
    public void cbsc_class10th_science(View view){
        Intent intent=new Intent(this,cbsc_paper.class);
        intent.putExtra("url","http://ncerthelp.com/text.php?ques=Previous+Year+Question+Papers+Science+For+Class+10+Download+in+Pdf");
        startActivity(intent);
    }
    public void cbsc_class10th_sst(View view){
        Intent intent=new Intent(this,cbsc_paper.class);
        intent.putExtra("url","http://ncerthelp.com/text.php?ques=Previous+Year+Question+Papers+of+CBSE+Board+Social+Science+For+Class+10+Download+in+pdf");
        startActivity(intent);
    }
}
