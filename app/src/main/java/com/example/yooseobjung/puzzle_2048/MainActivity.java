package com.example.yooseobjung.puzzle_2048;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends Activity {


    TextView scoreTextView, bestTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreTextView = (TextView)findViewById(R.id.score);
        bestTextView = (TextView)findViewById(R.id.best);
    }

    @Override
    public void onWindowFocusChanged (boolean hasFocus){
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus == true) {
            LinearLayout background = (LinearLayout) findViewById(R.id.board);
            int width = background.getMeasuredWidth();
            ViewGroup.LayoutParams params = background.getLayoutParams();
            params.height = width;
            params.width = width;
            background.setLayoutParams(params);
        }

    }

}
