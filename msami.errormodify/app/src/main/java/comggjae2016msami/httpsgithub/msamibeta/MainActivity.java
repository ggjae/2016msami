package comggjae2016msami.httpsgithub.msamibeta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.net.URL;

public class MainActivity extends AppCompatActivity {
    Button bt1,bt2,bt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent(this, SplashActivity.class));
        bt1 = (Button)findViewById(R.id.button);
        bt1.setOnClickListener(listener);
        bt2 = (Button)findViewById(R.id.button2);
        bt2.setOnClickListener(listener);
        bt3 = (Button)findViewById(R.id.button3);
        bt3.setOnClickListener(listener);

    }
    Button.OnClickListener listener = new Button.OnClickListener()

    {

        public void onClick(View v)

        {

            switch(v.getId()){
                case R.id.button:
                    Intent myintent1 = new Intent(MainActivity.this, ButtonActivity.class);
                    startActivity(myintent1);
                    break;
                case R.id.button2:
                    Intent myintent2 = new Intent(MainActivity.this, Button2Activity.class);
                    startActivity(myintent2);
                    break;
                case R.id.button3:
                    Intent myintent3 = new Intent(MainActivity.this, Button3Activity.class);
                    startActivity(myintent3);
                    break;

//case문이 들어갑니다




            }

        }

    };

}
