package aqsa.onebyte.com.onebyteinterview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import aqsa.onebyte.com.onebyteinterview.Presenter.IPresenter;

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





    }
}
