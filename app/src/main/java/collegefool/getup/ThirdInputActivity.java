package collegefool.getup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.widget.TextView;

public class ThirdInputActivity extends Activity implements OnClickListener{

    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_input);
        b1=(Button) findViewById(R.id.button1);
        b1.setOnClickListener(this);


    }
    @Override
    public void onClick(View v){
        Intent i = new Intent(getApplicationContext(),HomeActivity.class);
        startActivity(i);
        setContentView(R.layout.activity_home);
    }
}