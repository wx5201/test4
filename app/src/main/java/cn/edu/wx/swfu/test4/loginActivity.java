package cn.edu.wx.swfu.test4;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.attr.button;

public class loginActivity extends AppCompatActivity implements onClickListener {
    private EditText username=null;
    private  EditText password=null;
    private CheckBox  remember=null;
    private Button login=null;
    SharedPreferences sp=null;
//    private  String usernameValue,passwordValue;
//    private FileService fileService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        sp=this.getSharedPreferences("userinfo", Context.MODE_PRIVATE);
        init();
        public void init()
    {   username=(EditText)findViewById(R.id.name);
        password=(EditText)findViewById(R.id.pwd);
        remember=(CheckBox)findViewById(R.id.repwd);
        login=(Button)findViewById(R.id.login);
        if(sp.getBoolean("checkboxBoolean",false))
        {
            username.setText(sp.getString("username",null));
            password.setText(sp.getString("password",null));
           remember.setChecked(true);
        }
        login.setOnClickListener(this);
    }
//        button.setOnclickListner(this);
//        username.setOnClickListener(new OnFocusChangeListener(){
//            @Override
//            public void onFocusChange(View v, boolean hasFocus) {
//                if(!hasFocus) {
//                    String username = username.getText().toString().trim();
//                    if (username.length() < 4) {
//                        Toast.makeText(loginActivity.this, "用户名不能小于四个字符", Toast.LENGTH_LONG);
//                    }
//                }
//
//            }
//        });
//        password.setOnFocusChangeListener(new OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View v, boolean hasFocus) {
//               if(!hasFocus){
//                   String password=password.getText().toString.trim();
//                   if (password.length()<4){
//                       Toast.makeText(loginActivity.this,"密码不能小于四个字符",Toast.LENGTH_SHORT);
//                   }
//               }
//            }
//        });
//    }
    @Override
    public void onClick(View v){
        switch (v.getId())
        {
            case R.id.button:
                String username=username.getText().ToString().trim();
                String password=password.getText().ToString().trim();
                if(username.trim().equals("")){
                    Toast.makeText(this."请输入用户名",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (password.trim().equals("")){
                    Toast.makeText(this."请输入密码",Toast.LENGTH_SHORT).show();
                    return;
                }
                boolean remember=remember.isChecked();
                if(remember) {
                    SharedPreferences.Editor editor = sp.edit();
                    editor.putString("usename", username);
                    editor.putString("password", password);
                    editor.putBoolean("remember", true);
                }
                else
                {
                    SharedPreferences.Editor editor = sp.edit();
                    editor.putString("username",null);
                    editor.putString("password",null);
                    editor.putBoolean("rember",false);
                    editor.commit();
                }
                Intent intent=new Intent(loginActivity.this,Content.class);
                finish();
        }
        }
    }

