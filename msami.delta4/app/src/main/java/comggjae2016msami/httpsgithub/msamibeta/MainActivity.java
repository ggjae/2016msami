package comggjae2016msami.httpsgithub.msamibeta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent(this, SplashActivity.class));

        Button b = (Button)findViewById(R.id.학식);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(
                        getApplicationContext(),
                        FoodActivity.class);
                startActivity(intent);
            }
        });
    }
    public void onClick(View view)//앱정보버튼
    {
        Intent intent = new Intent(MainActivity.this, InfoActivity.class);
        startActivity(intent);
    }
    public void onClick02(View view)//시간표 버튼
    {
        Intent intent = new Intent(MainActivity.this, TimetableActivity.class);
        startActivity(intent);
    }
    public void onClick03(View view){//셔틀(평일)버튼
        Intent intent = new Intent(MainActivity.this, ShuttleActivity1.class);
        startActivity(intent);
    }
    public void onClick04(View view){//셔틀(주말)버튼
        Intent intent = new Intent(MainActivity.this, ShuttleActivity2.class);
        startActivity(intent);
    }
}

