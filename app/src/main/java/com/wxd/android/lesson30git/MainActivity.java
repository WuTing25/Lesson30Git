package com.wxd.android.lesson30git;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText_userName;
    private EditText editText_userPwd;
    private Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.editText_userName= (EditText) this.findViewById(R.id.editText_userName);
        this.editText_userPwd= (EditText) this.findViewById(R.id.editText_userPwd);
        this.resources=this.getResources();

    }
    public void login(View view){
        String userName= this.editText_userName.getText().toString().trim();
        String userPwd= this.editText_userPwd.getText().toString().trim();
        if (TextUtils.isEmpty(userName)){
            this.editText_userName.setError(this.resources.getString(R.string.login_userName_emptyHint));
            this.editText_userName.requestFocus();
            return;
        }else if (TextUtils.isEmpty(userPwd)){
            this.editText_userPwd.setError(this.resources.getString(R.string.login_userPwd_emptyHint));
            this.editText_userPwd.requestFocus();
            return;
        }else if ("admin".equals(userName)&&"123".equals(userPwd)){
            Toast.makeText(this,this.resources.getText(R.string.login_success), Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, resources.getText(R.string.login_fail), Toast.LENGTH_SHORT).show();
            this.editText_userName.requestFocus();
        }

    }
    public void reset(View view){
        this.editText_userPwd.setText(null);
        this.editText_userName.setText(null);
        this.editText_userName.requestFocus();
    }
}
