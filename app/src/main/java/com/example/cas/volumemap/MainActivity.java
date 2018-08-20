package com.example.cas.volumemap;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private static int counter = 0;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv=(TextView) findViewById(R.id.count);
        tv.setText("Counter:"+String.valueOf(counter));
    }


    //override onKeyDown() method to remap volume keys
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode==KeyEvent.KEYCODE_VOLUME_DOWN){
            tv.setText("Counter : " + String.valueOf(--counter));
            Toast.makeText(this, "Pressed Volume Down", Toast.LENGTH_SHORT).show();
            return true;
        }
        if(keyCode==KeyEvent.KEYCODE_VOLUME_UP){
            tv.setText("Counter : " + String.valueOf(++counter));
            Toast.makeText(this, "Pressed Volume Up", Toast.LENGTH_SHORT).show();
            return true;
        } else{
            return super.onKeyDown(keyCode,event);
        }


    }


}
