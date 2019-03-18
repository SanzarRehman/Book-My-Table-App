package com.mastert.bookmyseat;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {
    private static final int CHOOSE_IMAGE = 101 ;
    ImageView imageView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editText=(EditText) findViewById(R.id.dname);
        imageView=(ImageView) findViewById(R.id.cam);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImageChooser();
            }
        });
        findViewById(R.id.setpic).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==CHOOSE_IMAGE && requestCode==RESULT_OK && data!=null && data.getData()!=null )
        {
            data.getData();
        }

    }

    private void showImageChooser(){
        Intent intent=new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent,"Set profile picture"),CHOOSE_IMAGE);
    }
}
