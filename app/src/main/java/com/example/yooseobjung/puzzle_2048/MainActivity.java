package com.example.yooseobjung.puzzle_2048;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;


public class MainActivity extends Activity {


    Button scoreButton, bestButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreButton = (Button)findViewById(R.id.scoreboard);
        bestButton = (Button)findViewById(R.id.bestboard);

        String score = "939";
        String scoreButtonText;
        scoreButtonText = "<small><small><small>SCORE</small></small></small>" + "<br/><big><font color='white'>" + score + "</font></big>";
        scoreButton.setText(Html.fromHtml(scoreButtonText));

        String bestScore = "1939";
        String bestButtonText = String.format("<small><font color='#AFA89E'>BEST</font></small><br/><big><font color='red'>%s</font></big>", bestScore);
        bestButton.setText(Html.fromHtml(bestButtonText));

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
