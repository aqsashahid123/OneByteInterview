package aqsa.onebyte.com.onebyteinterview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import aqsa.onebyte.com.onebyteinterview.login.Presenter.IPresenter;
import aqsa.onebyte.com.onebyteinterview.login.Presenter.PresenterCompl;

public class MainActivity extends AppCompatActivity {

    EditText etEmail,etPassword;
    Button btnLogin;
    IPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword = (EditText) findViewById(R.id.etPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        presenter = new PresenterCompl(MainActivity.this) ;

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.doLogin(etEmail.getText().toString(),etPassword.getText().toString());
            }
        });


    }
}
