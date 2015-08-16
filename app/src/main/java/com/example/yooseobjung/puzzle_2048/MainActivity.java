package com.example.yooseobjung.puzzle_2048;

import android.app.ActionBar;
import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends Activity {


    Button scoreButton, bestButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Display display = this.getWindowManager().getDefaultDisplay();
        int width = display.getWidth();
        LinearLayout background = (LinearLayout) findViewById(R.id.board);
        ViewGroup.LayoutParams params = background.getLayoutParams();
        params.height = width;
        params.width = width;
        background.setLayoutParams(params);

        scoreButton = (Button)findViewById(R.id.scoreboard);
        bestButton = (Button)findViewById(R.id.bestboard);

        String score = "939";
        String scoreButtonText;
        scoreButtonText = "<small> <font color='#FFAFA89E'> SCORE </font> </small>" + "<br/> <big> <font color='white'>" + score + "</font> </big>";
        scoreButton.setText(Html.fromHtml(scoreButtonText));

        String bestScore = "1939";
        String bestButtonText = String.format("<small> <font color='#FFAFA89E'> BEST </font> </small><br/> <big> <font color='white'>%s</font> </big>", bestScore);
        bestButton.setText(Html.fromHtml(bestButtonText));


    }

}
