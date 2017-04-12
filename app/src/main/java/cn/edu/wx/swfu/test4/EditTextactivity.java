package cn.edu.wx.swfu.test4;
/**
 * Edittext
 * 概念
 * 用于输入文本的控件，被称为文本输入框
 * 常用属性
 *editText实现明密文切换
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

import static android.R.id.input;

public class EditTextactivity extends AppCompatActivity {
    private EditText pwd;
    private CheckBox box;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        pwd=(EditText)findViewById(R.id.pwd);
        box=(CheckBox)findViewById(R.id.box);
        pwd.setCursorVisible(false);//设置光标不可见

        box.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    //显示明文----设置转换方式的实例对象
                   pwd.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }else{
                    //显示密文
                    pwd.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                //将光标移动到文字的末尾
                pwd.setSelection(pwd.getText().length());
            }
        });
    }
}
