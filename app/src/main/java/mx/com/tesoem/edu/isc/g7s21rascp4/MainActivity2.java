package mx.com.tesoem.edu.isc.g7s21rascp4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {


    EditText txtcontra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtcontra = findViewById(R.id.txtcontra);
    }
    public void Clic(View v){
        String pass = "Android2021";
        if(pass.equals(txtcontra.getText().toString())){
            Intent intent = new Intent(this, MainActivity3.class);
            startActivity(intent);
            finish();
        }
    }
}
