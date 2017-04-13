package cn.edu.wx.swfu.test4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class loginActivity extends AppCompatActivity {
    private EditText username;
    private  EditText password;
    private CheckBox  remember;
    private Button login;
    private  String usernameValue,passwordValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username=(EditText)findViewById(R.id.username);
    }
}
