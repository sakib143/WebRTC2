package com.example.webrtcdemo2.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.webrtcdemo2.R;

public class RoomActivity extends AppCompatActivity {

    private Button btnSubmit;
    private EditText edtRoomId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);


        getids();
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(RoomActivity.this,VideoCallActivity.class);
                intent.putExtra("room_id",edtRoomId.getText().toString().trim());
                startActivity(intent);
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
}
