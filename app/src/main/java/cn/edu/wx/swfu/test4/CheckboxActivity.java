package cn.edu.wx.swfu.test4;

import android.opengl.Matrix;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

/**使用CheckBox一般会使用在多选或复选，表示有多个选项提供选择
 *
 * Toast:提示机制
 * 提示用户一些简单的信息，不能和用户进行交互
 * 显示的时长有限
 * 使用案例:
 *  Toast.makeText(this,"请选择你的爱好",Toast.LENGTH_SHORT).show();
 *  步骤：
 *  1.调用静态方法maketext.传入需要提示的信息以及需要显示的时间；
 *2.在maketext方法中定义需要呈现的上下文；需要显示的提示内容及显示的时长；
 * 3.调用show方法进行显示
 *
 */
public class CheckboxActivity extends AppCompatActivity {
    private Button check;
    private CheckBox swim,playball,run,travel,sleep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
        //控件初始化
        check=(Button)findViewById(R.id.check);
        swim=(CheckBox)findViewById(R.id.swim);
        playball=(CheckBox)findViewById(R.id.playball);
        run=(CheckBox)findViewById(R.id.run);
        travel=(CheckBox)findViewById(R.id.travel);
        sleep=(CheckBox)findViewById(R.id.sleep);
        //使用匿名内部类的方法进行按钮的监听
        check.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                showCheck();
            }
        });
    }
    protected void showCheck(){
        StringBuffer sbf=new StringBuffer();

        if(swim.isChecked()){
            sbf.append(swim.getText().toString()+",");
        }
        if(playball.isChecked()){
            sbf.append(playball.getText().toString()+",");
        }
        if(sleep.isChecked()){
            sbf.append(sleep.getText().toString()+",");
        }
        if(travel.isChecked()){
            sbf.append(travel.getText().toString()+",");
        }
        if(run.isChecked()){
            sbf.append(run.getText().toString()+",");
        }
        if(sbf.length()>0) {
            String str1 = sbf.substring(0, sbf.length() - 1);
            Log.i("TAG", "选中的内容有," + str1);
            Toast.makeText(this,"选中的内容有," + str1,Toast.LENGTH_SHORT).show();
        }else {
            Log.i("TAG", "请选择你的爱好");
            Toast.makeText(this,"请选择你的爱好",Toast.LENGTH_SHORT).show();
        }
    }
}
