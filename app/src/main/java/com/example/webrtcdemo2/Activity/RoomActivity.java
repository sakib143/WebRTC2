package com.example.webrtcdemo2.Activity;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.webrtcdemo2.R;

public class RoomActivity extends AppCompatActivity {

    private Button btnSubmit;
    private EditText edtRoomId;

    private int PERMISSION_ALL_CODE = 786;
    private String[] ALL_PERMISSIONS = {Manifest.permission.CAMERA, Manifest.permission.CHANGE_NETWORK_STATE, Manifest.permission.MODIFY_AUDIO_SETTINGS,
            Manifest.permission.RECORD_AUDIO, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.ACCESS_NETWORK_STATE};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);


        getids();

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!hasAllPermission(RoomActivity.this, ALL_PERMISSIONS)) {
                    ActivityCompat.requestPermissions(RoomActivity.this, ALL_PERMISSIONS, PERMISSION_ALL_CODE);
                }else {
                    startIntent();
                }
            }
        });


    }

    private void getids() {
        try {
            btnSubmit = findViewById(R.id.btnSubmit);
            edtRoomId = findViewById(R.id.edtRoomId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static boolean hasAllPermission(Context context, String... permissions) {
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && context != null && permissions != null) {
            for (String permission : permissions) {
                if (ActivityCompat.checkSelfPermission(context, permission) != PackageManager.PERMISSION_GRANTED) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == PERMISSION_ALL_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                for (int i = 0; i < grantResults.length; i++) {
                    if (grantResults[i] == -1) {
                        ActivityCompat.requestPermissions(RoomActivity.this, ALL_PERMISSIONS, PERMISSION_ALL_CODE);
                    } else {
                        startIntent();
                    }
                }
            } else {
               // Toast.makeText(RoomActivity.this,"All permission required",Toast.LENGTH_LONG).show();
            }
        }
    }

    private void startIntent() {
        Intent intent  = new Intent(RoomActivity.this,VideoCallActivity.class);
        intent.putExtra("room_id",edtRoomId.getText().toString().trim());
        startActivity(intent);
    }

}
