package cn.edu.wx.swfu.test4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

/**
 * 监听当前的输入，如果是11位就判断输入的手机是哪一个运营商
 * 给EditText的输入内容添加监听
 * addTextChangedListener
 *
 */

public class Editetext2Actiity extends AppCompatActivity {
    private EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editetext2_actiity);
        //初始化
        input=(EditText)findViewById(R.id.myinput);
        //针对Edittext的输入进行监听
        input.addTextChangedListener(new TextWatcher() {
            //文本变化之前的方法
           //start:开始的位置
            //count：被改变的原有内容的个数
            //after：改变之后内容的数量
            //s：表示改变之前的内容，通常start和count组合，可以在s中读取本次改变字段中被改变的内容，而
            //            after表示改变后的新内容的数量

          @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
              Log.i("TAG","beforeTextChanged方法被调用"+s+"-----"+start+"---"+"----"+count);
              if(s.length()==11){
                  Toast.makeText(Editetext2Actiity.this,"中国联通",Toast.LENGTH_SHORT).show();
              }
            }
             //文本变化时执行的方法
             //count：表示新增加的数量
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.i("TAG","onTextChanged方法被调用"+s+"-----"+start+"---"+before+"----"+count);

            }
            //文本变化之后执行的方法
            //s:表示最终的内容
            @Override
            public void afterTextChanged(Editable s) {
                Log.i("TAG","afterTextChanged方法被调用"+s);
            }
        });
    }
}
