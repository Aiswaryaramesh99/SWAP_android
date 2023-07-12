package id.codetr.swap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void SWAP(View v)
    {
        EditText e1,e2;
        Button b1;
        e1=(EditText) findViewById(R.id.et1);
        e2=(EditText) findViewById(R.id.et2);
        b1=(Button) findViewById(R.id.bswap);
        String str1=e1.getText().toString();
        String str2=e2.getText().toString();
        e1.setText(str2);
        e2.setText(str1);
    }
}