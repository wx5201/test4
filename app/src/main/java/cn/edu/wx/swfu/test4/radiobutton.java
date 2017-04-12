package cn.edu.wx.swfu.test4;

import android.provider.MediaStore;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Radiobutton 是单选按钮
 * compoundBUtton是Radiobutton的父类，也是checkbox的父类
 * onclickChangelistener是定义在comoundButton当中的监听，所以Radiobutton和checkbox可以直接使用
 *
 * 针对单选按钮而言，可以为单一的RadioButton设置选中状态发生变化的监听，也可以给存放这些单选按钮的RadioGroup设置监听
*设置个单选按钮之间产生互斥的效果，那么需要将这些按钮定义在一个RadioGroup中
 * 名字都叫OnCheckedChangeListener，但是属性不同
 */

public class radiobutton extends AppCompatActivity {
    private RadioButton man, woman;
    private RadioGroup group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiobutton);
        //初始化控件
        man = (RadioButton) findViewById(R.id.man);
        woman = (RadioButton) findViewById(R.id.woman);
        group = (RadioGroup) findViewById(R.id.group);
        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId) {
                    case R.id.man:
                        Toast.makeText(radiobutton.this, "选中了：" + man.getText(), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.woman:
                        Toast.makeText(radiobutton.this, "选中了：" + woman.getText(), Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        });
    }
}

        //给按钮添加监听
//        man.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if (isChecked) {
//                    Toast.makeText(radiobutton.this, "选中的是" + man.getText(), Toast.LENGTH_SHORT).show();
//
//                }
//            }
//        });
//        woman.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if (isChecked) {
//                    Toast.makeText(radiobutton.this, "选中的是" + woman.getText(), Toast.LENGTH_SHORT).show();
//
//                }
//            }
//        });
//    }
//}

