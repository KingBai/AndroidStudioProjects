package com.example.king.activitytest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    private static final String TAG = "FirstActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Log.d(TAG, "Task id is "+getTaskId());
        Button button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                //Toast.makeText(FirstActivity.this,"hi Toast",Toast.LENGTH_SHORT).show();//Toast 上下文 显示内容 时长
                //finish();//关闭Activity
                //Intent intent = new Intent(FirstActivity.this, SecondtActivity.class);//显示intent
                /**
                 * 隐藏式Intent，可支持多个category
                 */
/*                Intent intent = new Intent("com.example.activitytest.ACTION_START");
                intent.addCategory("com.example.activitytest.MY_CATEGORY");
                */

                //打开一个网页
/*
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.baidu.com"));*/
                //拨打电话
/*                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:10086"));*/
                /**
                 * activity之间传值
                 */
/*                String data = "Hi sencond";
                Intent intent = new Intent(FirstActivity.this, SecondtActivity.class);
                intent.putExtra("extra_data",data);
                startActivityForResult(intent,1);*/
                //测试singleTop//Intent intent = new Intent(FirstActivity.this, FirstActivity.class);
                Intent intent = new Intent(FirstActivity.this, SecondtActivity.class);
                startActivity(intent);

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this,"add click1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"remove click",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode){
            case 1:
                if(resultCode==RESULT_OK){
                    String returnData = data.getStringExtra("data_return");
                    Log.d(TAG, "onActivityResult: "+returnData);
                }
                break;
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }
}
