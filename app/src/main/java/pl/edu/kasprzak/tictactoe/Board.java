package pl.edu.kasprzak.tictactoe;

import android.widget.Button;

public class Board {
    private Button buttons[][];
    private MainActivity activity;
    public Board(MainActivity activity) {
        this.activity = activity;
        buttons = new Button[3][3];
    }
    public void setButton(Button button, int x, int y) {
        buttons[x][y] = button;
        button.setOnClickListener(new ButtonOnClick(button,this));
    }
}


