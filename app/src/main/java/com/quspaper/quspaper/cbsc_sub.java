package com.quspaper.quspaper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class cbsc_sub extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbsc_sub);
    }
    public void cbsc_class12th_hindi(View view){
        Intent intent=new Intent(this,cbsc_paper.class);
        intent.putExtra("url","http://ncerthelp.com/text.php?ques=Hindi+Last+Year+Question+Papers+of+CBSE+Board+For+Class+12+Download+in+PDF");
        startActivity(intent);
    }
    public void cbsc_class12th_english(View view){
        Intent intent=new Intent(this,cbsc_paper.class);
        intent.putExtra("url","http://ncerthelp.com/text.php?ques=English+Previous+Year+Question+Papers+of+CBSE+Board+For+Class+12+Download+in+PDF");
        startActivity(intent);
    }
    public void cbsc_class12th_math(View view){
        Intent intent=new Intent(this,cbsc_paper.class);
        intent.putExtra("url","http://ncerthelp.com/text.php?ques=last+Year+Question+Papers+CBSE+Board+For+Class+12+Mathematics+Download+in+PDF");
        startActivity(intent);
    }
    public void cbsc_class12th_phy(View view){
        Intent intent=new Intent(this,cbsc_paper.class);
        intent.putExtra("url","http://ncerthelp.com/text.php?ques=Physics+Previous+Year+Question+Papers+of+CBSE+Board+Year+Wish+For+Class+12+Download+in+PDF");
        startActivity(intent);
    }
    public void cbsc_class12th_che(View view){
        Intent intent=new Intent(this,cbsc_paper.class);
        intent.putExtra("url","http://ncerthelp.com/text.php?ques=Previous+Year+Question+Papers+of+CBSE+Board+For+Class+12+Download+in+PDF+");
        startActivity(intent);
    }
    public void cbsc_class12th_bio(View view){
        Intent intent=new Intent(this,cbsc_paper.class);
        intent.putExtra("url","http://ncerthelp.com/text.php?ques=Previous+Year+Question+Papers+of+CBSE+Board+Biology+For+Class+12+Download+in+PDF%0D%0A");
        startActivity(intent);
    }
    //Arts

    public void cbsc_class12th_his(View view){
        Intent intent=new Intent(this,cbsc_paper.class);
        intent.putExtra("url","http://ncerthelp.com/text.php?ques=last+Year+Question+Papers+of+CBSE+Board+With+Year+Wish+History+Class+12+Download+in+PDF");
        startActivity(intent);
    }
    public void cbsc_class12th_eco(View view){
        Intent intent=new Intent(this,cbsc_paper.class);
        intent.putExtra("url","http://ncerthelp.com/text.php?ques=Economics+Last+Year+Question+Papers+For+Class+12+Download+in+PDF");
        startActivity(intent);
    }

    public void cbsc_class12th_geog(View view){
        Intent intent=new Intent(this,cbsc_paper.class);
        intent.putExtra("url","http://ncerthelp.com/text.php?ques=Geography+Previous+Year+Question+Papers+of+CBSE+Board+With+Year+Wish+For+Class+12++download+in+pdf");
        startActivity(intent);
    }
    public void cbsc_class12th_poli(View view){
        Intent intent=new Intent(this,cbsc_paper.class);
        intent.putExtra("url","http://ncerthelp.com/text.php?ques=Political+Science+Previous+Year+Question+Papers+of+CBSE+Board+For+Class+12+Download+in+PDF%0D%0A");
        startActivity(intent);
    }
    //Accounts

    public void cbsc_class12th_acc(View view){
        Intent intent=new Intent(this,cbsc_paper.class);
        intent.putExtra("url","http://ncerthelp.com/text.php?ques=Account+Previous+Year+Question+Papers+of+CBSE+Board+For+Class+12+Download+in+PDF%0D%0A");
        startActivity(intent);
    }
    public void cbsc_class12th_busi(View view){
        Intent intent=new Intent(this,cbsc_paper.class);
        intent.putExtra("url","http://ncerthelp.com/text.php?ques=Previous+Year+Question+Papers+of+CBSE+Board+Business+Studies+For+Class+12+Download+in+PDF");
        startActivity(intent);
    }
}
