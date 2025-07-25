package com.example.p2;

import static androidx.fragment.app.FragmentManager.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onbuttonClick();
            }
        });
        Log.d(TAG, "onCreate: Activity is ebing created");
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();


    }
    private void onbuttonClick(){
        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: Activity is about to become visible");
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: Activity has become visible (it is now resumed)");
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }


        @Override
        protected void onPause() {
            super.onPause();
            Log.d(TAG, "onPause: Another activity is taking focus (this activity is about to be paused)");
            Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onStop() {
            super.onStop();
            Log.d(TAG, "onStop: Activity is no longer visible (it is now stopped)");
            Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onRestart() {
            super.onRestart();
            Log.d(TAG, "onRestart: Activity is being restarted after being stopped");
            Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onDestroy() {
            super.onDestroy();
            Log.d(TAG, "onDestroy: Activity is about to be destroyed");
            Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
        }
    }












