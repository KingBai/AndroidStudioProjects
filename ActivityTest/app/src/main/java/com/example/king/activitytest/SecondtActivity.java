package com.example.king.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondtActivity extends AppCompatActivity {

    private static final String TAG = "SecondtActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "Task id is "+getTaskId());
        setContentView(R.layout.second_layout);
        final Intent intent = getIntent();
        String data = intent.getStringExtra("extra_data");
        Button button2 = (Button) findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                /**
                 * 测试回调返回值
                 */
/*                Intent intent1 = new Intent();
                intent1.putExtra("data_return","Hi First");
                setResult(RESULT_OK,intent1);
                finish();*/
                //测试Activity SingleTask模式启动
                // Intent intent1 = new Intent(SecondtActivity.this, FirstActivity.class);
                Intent intent1 = new Intent(SecondtActivity.this, ThirdActivity.class);
                startActivity(intent1);
            }
        });
    }


    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("data_return","Hello FirstActivity");
        setResult(RESULT_OK,intent);
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }
}

