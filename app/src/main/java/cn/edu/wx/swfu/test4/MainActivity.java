package cn.edu.wx.swfu.test4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import static android.view.View.*;

/**
 * 如果需要给button按钮添加监听，需要在java中找到这个按钮
 * 1.使用匿名内部类的形式，直接将需要设置的onClickListener接口初始化。内部的onclick（）方法 会在这个按钮被点击的
 * 时候执行
 *2.在xml文件中定义onclick属性，属性中对应的值 需要在java代码中编写对应的方法名
 * 注意：参数中的View必须，方法类似于：public void xxx（view v）
 * 3.在给Button按钮设置监听的时候直接让当前Activity实现onClickListener接口。这样传入的监听对象就可以直接使用当前Activity.this
 *4.让另外一个类实现Onclicklistener接口，这样这样如果控件需要设置点击监听对象时，直接传入该类对象即可
 */

//public class MainActivity extends AppCompatActivity {
//
   // @Override
    //protected void onCreate(Bundle savedInstanceState) {
       // super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        //通过id找到关联的布局中的view控件
        //Button btn= (Button)findViewById(R.id.btn);
        //给Button按钮添加点击监听
        //btn.setOnClickListener(new View.OnClickListener() {
            //只要当前设置的监听器被触发，这个方法就会被执行
          //  @Override
           // public void onClick(View v) {
             // Log.i("TAG","点击了button按钮");

          //  }
       // });



    //}
//}
    //第二种实现方式
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//    public void skip(View v){
//
//        Log.i("TAG","点击了button按钮");
//    }
//}
    //第三种实现
//public class MainActivity extends AppCompatActivity implements OnClickListener{
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        //找到控件id，也叫控件的初始化
//        Button btn=(Button)findViewById(R.id.btn);
//        //给Button按钮设置点击监听
//        btn.setOnClickListener(this);
//    }
////点击 实现方法
//    @Override
//    public void onClick(View v) {
//        Log.i("TAG","点击了当前按钮");
//
//    }
//}
//第四种形式
//public class MainActivity extends AppCompatActivity implements OnClickListener{
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //找到控件id，也叫控件的初始化
        Button btn = (Button) findViewById(R.id.btn);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Mylistener listener=new Mylistener();
        //给Button按钮设置点击监听
        btn.setOnClickListener(new Mylistener());
    }

    //定义一个类来实现onclistener接口
    class Mylistener implements OnClickListener {
        //参数v：就是出发点击的View控件在这里就是被点击的Button按钮
        @Override
        public void onClick(View v) {
            switch (v.getId()) {

                case R.id.btn://点击button
                    Log.i("TAG", "点击了当前按钮");
                    break;
                case R.id.btn2://点击button2
                    Log.i("TAG", "点击了当前按钮");
                    break;
                default:
                    break;
            }
            Log.i("TAG", "点击了当前按钮");

            }
        }
    }


