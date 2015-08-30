package com.example.yooseobjung.puzzle_2048;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onWindowFocusChanged (boolean hasFocus){
        super.onWindowFocusChanged(hasFocus);
        if(hasFocus == true){
            LinearLayout background = (LinearLayout) findViewById(R.id.board);
            int width = background.getMeasuredWidth();
            ViewGroup.LayoutParams params = background.getLayoutParams();
            params.height = width;
            params.width = width;
            background.setLayoutParams(params);
        }

    }

}
