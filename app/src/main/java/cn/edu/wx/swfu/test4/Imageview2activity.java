package cn.edu.wx.swfu.test4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**在java代码中如果需要对ImageView设置不同的显示，通过API setImageResource
 *
 *
 */

public class Imageview2activity extends AppCompatActivity {
    private Button pre,next;
    private ImageView image;
   //图片在R文件中呈现的id组成的int类型的数组
    private  int []images={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e};
    private  int postion=0;//选中图片的位置

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imageview2activity);
        //初始化
        image=(ImageView)findViewById(R.id.showimage);
        pre=(Button)findViewById(R.id.pre);
        next=(Button)findViewById(R.id.next);
        //设置监听
        pre.setOnClickListener(this);
        next.setOnClickListener(this);
    }
    public void onClick(View v){
        switch (v.getId()){
            case R.id.pre://点击了上一张
            postion --;
                if (postion<0){
                    postion=images.length-1;
                }
                image.setImageResource(images[postion]);
                break;
            case R.id.next://点击了下一张
                postion ++;
                if(postion>=images.length){
                    postion=0
                }
                image.setImageResource(images[postion]);

                break;


        }

    }
}
