package kr.teamcadi.dh.toastintenthandler_exercise;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends Activity
{
    Button btn_home;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn_home=(Button) findViewById(R.id.btn_home);
        btn_home.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Handler hand = new Handler();
                hand.postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        Toast.makeText(Main2Activity.this,"계명대학교",Toast.LENGTH_SHORT).show();

                    }
                },3000);
            }
        });
    }
}
