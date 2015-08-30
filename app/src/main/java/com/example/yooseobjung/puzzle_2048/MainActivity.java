package com.example.yooseobjung.puzzle_2048;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends Activity implements View.OnClickListener {

    TextView scoreTextView, bestTextView;
    Button restartButton;

    int[][] board = new int[4][4];
    int[][] boardId = new int[4][4];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreTextView = (TextView) findViewById(R.id.score);
        bestTextView = (TextView) findViewById(R.id.best);
        restartButton = (Button) findViewById(R.id.btn_restart);
        restartButton.setOnClickListener(this);
        initializeBoardId();
        initialize();
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_restart:
                initialize();
                break;
            default:
                break;
        }
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

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        if (event.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP) {

        }
        if (event.getKeyCode() == KeyEvent.KEYCODE_DPAD_DOWN) {

        }
        if (event.getKeyCode() == KeyEvent.KEYCODE_DPAD_LEFT) {

        }
        if (event.getKeyCode() == KeyEvent.KEYCODE_DPAD_RIGHT) {
            
        }
        showBoard();
        return super.dispatchKeyEvent(event);
    }

    protected void initializeBoardId() {
        boardId[0][0] = R.id.tile_11;
        boardId[0][1] = R.id.tile_12;
        boardId[0][2] = R.id.tile_13;
        boardId[0][3] = R.id.tile_14;

        boardId[1][0] = R.id.tile_21;
        boardId[1][1] = R.id.tile_22;
        boardId[1][2] = R.id.tile_23;
        boardId[1][3] = R.id.tile_24;

        boardId[2][0] = R.id.tile_31;
        boardId[2][1] = R.id.tile_32;
        boardId[2][2] = R.id.tile_33;
        boardId[2][3] = R.id.tile_34;

        boardId[3][0] = R.id.tile_41;
        boardId[3][1] = R.id.tile_42;
        boardId[3][2] = R.id.tile_43;
        boardId[3][3] = R.id.tile_44;
    }

    protected void initialize () {
        for (int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                board[i][j] = 0;
            }
        }
        Random rand = new Random();
        board[rand.nextInt(4)][rand.nextInt(4)] = 2;
        while (true){
            int randomColumn = rand.nextInt(4);
            int randomRow = rand.nextInt(4);
            if (board[randomColumn][randomRow] == 0){
                board[randomColumn][randomRow] = 2;
                break;
            }
        }
        showBoard();
    }

    public void showBoard(){
        for (int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                int number = board[i][j];
                TextView tile = (TextView) findViewById(boardId[i][j]);
                if (number == 0) {
                    tile.setText("");
                } else {
                    tile.setText(String.valueOf(number));
                }
                switch (number) {
                    case 0:
                        break;
                    case 2:
                        break;
                    case 4:
                        break;
                    case 8:
                        break;
                    case 16:
                        break;
                    case 32:
                        break;
                    case 64:
                        break;
                    default:
                        break;
                }
            }
        }
    }

}
