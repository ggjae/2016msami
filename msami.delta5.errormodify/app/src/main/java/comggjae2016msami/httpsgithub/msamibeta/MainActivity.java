package comggjae2016msami.httpsgithub.msamibeta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.net.URL;
// 메인액티비티로써, 버튼 1,2,3,4를 만들고, 이미지버튼은 따른 타입으로 또 btinfo라고 하나 만든다. findViewById를 통해 id로 button을 인식하고, Button이 실행 될때마다
// 밑에 onClick switch 문에 의해 버튼에 따라 다른 activity를 하게된다. 이떄 이 activity는 버튼에 상황에 맞는 역할을 하고, 나머지 activity들은 
// onClick의 Intent 객체를 선언할때 필요한 인수이여서 activity를 제작했다.
public class MainActivity extends AppCompatActivity {
    Button bt1,bt2,bt3,bt4;
    ImageButton btinfo;
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
        bt4 = (Button)findViewById(R.id.button4);
        bt4.setOnClickListener(listener);
        btinfo = (ImageButton)findViewById(R.id.�뼱�뵆�젙蹂�);
        btinfo.setOnClickListener(listener);
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
                case R.id.button4:
                    Intent myintent4 = new Intent(MainActivity.this, Button4Activity.class);
                    startActivity(myintent4);
                    break;
                case R.id.�뼱�뵆�젙蹂�:
                    Intent myintent5 = new Intent(MainActivity.this, InfoActivity.class);
                    startActivity(myintent5);
                    break;

//case臾몄씠 �뱾�뼱媛묐땲�떎




            }

        }

    };

}
