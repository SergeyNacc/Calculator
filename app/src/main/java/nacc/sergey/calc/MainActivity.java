package nacc.sergey.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText Num1;
    private EditText Num2;
    private TextView Res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Присваиваем переменные

        Res = findViewById(R.id.Result);
        Num1 = findViewById(R.id.editText1);
        Num2 = findViewById(R.id.editText2);
    }

    // Слушатель нажатий на кнопку +
    public void onClickPlus (View view) {
        int num1 = Integer.parseInt(Num1.getText().toString());
        int num2 = Integer.parseInt(Num2.getText().toString());
        int result = num1 + num2;
        Res.setText(String.valueOf(result));
    }

    // Слушатель нажатий на кнопку -
    public void onClickMinus (View view) {
        int num1 = Integer.parseInt(Num1.getText().toString());
        int num2 = Integer.parseInt(Num2.getText().toString());
        int result = num1 - num2;
        Res.setText(String.valueOf(result));
    }

    // Слушатель нажатий на кнопку *
    public void onClickMultip (View view) {
        int num1 = Integer.parseInt(Num1.getText().toString());
        int num2 = Integer.parseInt(Num2.getText().toString());
        int result = num1 * num2;
        Res.setText(String.valueOf(result));
    }

    // Слушатель нажатий на кнопку /
    public void onClickDivis (View view) {
        int num1 = Integer.parseInt(Num1.getText().toString());
        int num2 = Integer.parseInt(Num2.getText().toString());
        int result = num1 / num2;
        Res.setText(String.valueOf(result));
    }

}
