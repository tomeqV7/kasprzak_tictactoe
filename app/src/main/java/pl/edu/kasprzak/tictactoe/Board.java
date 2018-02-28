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
    public void CheckWinner() {
        counter++;
            if (buttons[0][0].getText().equals("X") && buttons[1][1].getText().equals("X") && buttons[2][2].getText().equals("X"))
                WhoWins("X", 0,0,1,1,2,2);
        
            if (buttons[0][2].getText().equals("X") && buttons[1][1].getText().equals("X") && buttons[2][0].getText().equals("X"))
                WhoWins("X",0,2,1,1,2,0);
        
            if (buttons[0][0].getText().equals("O") && buttons[1][1].getText().equals("O") && buttons[2][2].getText().equals("O"))
                WhoWins("O",0,0,1,1,2,2);
        
            if (buttons[0][2].getText().equals("O") && buttons[1][1].getText().equals("O") && buttons[2][0].getText().equals("O"))
                WhoWins("O",0,2,1,1,2,0);
    }
}
for ( int i = 0; i < buttons.length; i++) {
    if (buttons[0] [i].getText().equals("O") && buttons[1] [i].getText().equals("O") && buttons[2] [i].getText().equals("O")
       {
            WhoWins("O",i,0,i,1,i,2);
          
       }  else if  (buttons[0] [i].getText().equals("X") && buttons[1] [i].getText().equals("X") && buttons[2] [i].getText().equals("X"))
           {
               WhoWins("X",i,0,i,1,i,2);
           }
        if (counter ==9) {
            WhoWins();
        }
            }
      public void resetBoard(){
        ButtonOnClick.isOMove = true;
        counter = 0;
        for (int i =0;i<buttons.length;i++){
            for (int j = 0; j <buttons.length;j++){
                buttons[i][j].setText("");
                buttons[i][j].setTextColor(Color.BLACK);
            }
        }
    }
        


