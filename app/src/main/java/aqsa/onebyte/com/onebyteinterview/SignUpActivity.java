package aqsa.onebyte.com.onebyteinterview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import aqsa.onebyte.com.onebyteinterview.login.Presenter.IPresenter;
import aqsa.onebyte.com.onebyteinterview.login.Presenter.PresenterCompl;

public class SignUpActivity extends AppCompatActivity {

    EditText etEmail,etPassword;
    Button btnRegister;
    IPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        etEmail = (EditText) findViewById(R.id.etEmailS);
        etPassword = (EditText)  findViewById(R.id.etPasswordS);
        btnRegister = (Button) findViewById(R.id.btnRegister);
        presenter = new PresenterCompl(this);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             //   presenter = new PresenterCompl(getApplicationContext()).doSignUp(etEmail.getText().toString(),etPassword.getText().toString());
              presenter.doSignUp(etEmail.getText().toString(),etPassword.getText().toString());


            }
        });

    }
}
