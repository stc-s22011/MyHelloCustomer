package jp.suntech.s22011.myhellocustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private class HelloListener implements View.OnClickListener{
       @Override
        public void onClick(View view) {
            EditText input1 = findViewById(R.id.etAd);
            EditText input2 = findViewById(R.id.etName);

            int id = view.getId();

            if(id==R.id.btConfirm) {
                String inputStr1 = input1.getText().toString();
                String inputStr2 = input2.getText().toString();
                String show = inputStr2 + "にお住いの" + inputStr1 + "さん、こんにちは！";
                Toast.makeText(MainActivity.this, show, Toast.LENGTH_LONG).show();
            }
            //クリア
            else if(id==R.id.btAdClear) {
                input1.setText("");
            }
            //クリア
            else {
                input2.setText("");

            }
        }
    }
}
