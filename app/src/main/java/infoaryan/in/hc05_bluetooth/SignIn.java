package infoaryan.in.hc05_bluetooth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class SignIn extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        final TextView Username = (TextView) findViewById(R.id.Username);
        final TextView Password = (TextView) findViewById(R.id.Password);

        Button LogIn = (Button) findViewById(R.id.btnlogin);

        LogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Username.getText().toString().equals("admin") && Password.getText().toString().equals("admin")){
                    Toast.makeText(SignIn.this,"LOGIN WAS SUCCESSFUL",Toast.LENGTH_SHORT).show();
                    OpenActivityMain();
                }else {
                    Toast.makeText(SignIn.this,"USER NOT FOUND",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void OpenActivityMain() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
