package comggjae2016msami.httpsgithub.msamibeta;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class InfoActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
    }
    public void onClick(View view)
    {
        finish();
    }
}
