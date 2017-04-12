package cn.edu.wx.swfu.test4;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

/**Src:Imageview 中内容填充的资源
 * backgroud：表示Imageview的背景显示
 * Imageview也可以添加对应的点击事件
 *
 *ImageButton 用来响应
 */


public class imageActivity extends AppCompatActivity {
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        image=(ImageView)findViewById(R.id.imageview);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(imageActivity.this,"点击了ImageView",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
