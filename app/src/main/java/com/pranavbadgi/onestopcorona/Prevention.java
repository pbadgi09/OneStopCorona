package com.pranavbadgi.onestopcorona;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;

import com.pranavbadgi.onestopcorona.databinding.ActivityPreventionBinding;

public class Prevention extends AppCompatActivity {

    ActivityPreventionBinding binding;
    Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_prevention);

        initialize();
        listener();



    }


    private void initialize() {
        vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
    }

    private void listener() {

        binding.goHomeScreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                Intent i = new Intent(Prevention.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
