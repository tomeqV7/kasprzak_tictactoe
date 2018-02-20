package pl.edu.kasprzak.tictactoe;

import android.view.View;
import android.widget.Button;

public class ButtonOnClick implements View.OnClickListener {
    private static boolean isOMove = true;
    private Button button;
    public ButtonOnClick(Button button) {
        this.button = button;
    }
    @Override
    public void onClick(View view) {
        if (button.getText().length() == 0) {
            if (isOMove) {
                button.setText("O");
            } else {
                button.setText("X");
            }
            isOMove = !isOMove;
        }
    }
}


