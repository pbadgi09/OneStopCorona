package com.pranavbadgi.onestopcorona;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;

import com.pranavbadgi.onestopcorona.databinding.ActivityHelplineBinding;

public class Helpline extends AppCompatActivity {

    ActivityHelplineBinding binding;
    Vibrator vibrator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_helpline);

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
                Intent i = new Intent(Helpline.this, MainActivity.class);
                startActivity(i);
            }
        });

        //states button click listeners
        binding.andhraPradeshCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                binding.stateNameTextView.setText("Andhra Pradesh");
                binding.stateNumberTextView.setText("0866-2410978");
                hideLayout();

            }
        });

        binding.arunachalPradeshCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                binding.stateNameTextView.setText("Arunachal Pradesh");
                binding.stateNumberTextView.setText("9436055743");
                hideLayout();
            }
        });

        binding.assamCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                binding.stateNameTextView.setText("Assam");
                binding.stateNumberTextView.setText("6913347770");
                hideLayout();
            }
        });

        binding.biharCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                binding.stateNameTextView.setText("Bihar");
                binding.stateNumberTextView.setText("104");
                hideLayout();
            }
        });


        binding.chhattisgarhCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                binding.stateNameTextView.setText("Chhattisgarh");
                binding.stateNumberTextView.setText("104");
                hideLayout();
            }
        });

        binding.goaCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                binding.stateNameTextView.setText("Goa");
                binding.stateNumberTextView.setText("104");
                hideLayout();
            }
        });


        binding.gujaratCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                binding.stateNameTextView.setText("Gujarat");
                binding.stateNumberTextView.setText("104");
                hideLayout();
            }
        });


        binding.haryanaCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                binding.stateNameTextView.setText("Haryana");
                binding.stateNumberTextView.setText("8558893911");
                hideLayout();
            }
        });

        binding.himachalCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                binding.stateNameTextView.setText("Himachal Pradesh");
                binding.stateNumberTextView.setText("104");
                hideLayout();
            }
        });


        binding.jharkhandCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                binding.stateNameTextView.setText("Jharkhand");
                binding.stateNumberTextView.setText("104");
                hideLayout();
            }
        });


        binding.karnatakaCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                binding.stateNameTextView.setText("Karnataka");
                binding.stateNumberTextView.setText("104");
                hideLayout();
            }
        });


        binding.keralaCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                binding.stateNameTextView.setText("Kerala");
                binding.stateNumberTextView.setText("0471-2552056");
                hideLayout();
            }
        });

        binding.madhyaPradeshCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                binding.stateNameTextView.setText("Madhya Pradesh");
                binding.stateNumberTextView.setText("104");
                hideLayout();
            }
        });

        binding.maharashtraCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                binding.stateNameTextView.setText("Maharashtra");
                binding.stateNumberTextView.setText("020-26127394");
                hideLayout();
            }
        });


        binding.manipurCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                binding.stateNameTextView.setText("Manipur");
                binding.stateNumberTextView.setText("3852411668");
                hideLayout();
            }
        });


        binding.meghalayaCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                binding.stateNameTextView.setText("Meghalaya");
                binding.stateNumberTextView.setText("108");
                hideLayout();
            }
        });


        binding.mizoramCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                binding.stateNameTextView.setText("Mizoram");
                binding.stateNumberTextView.setText("102");
                hideLayout();
            }
        });


        binding.nagalandCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                binding.stateNameTextView.setText("Nagaland");
                binding.stateNumberTextView.setText("7005539653");
                hideLayout();
            }
        });

        binding.odishaCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                binding.stateNameTextView.setText("Odisha");
                binding.stateNumberTextView.setText("9439994859");
                hideLayout();
            }
        });

        binding.punjabCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                binding.stateNameTextView.setText("Punjab");
                binding.stateNumberTextView.setText("104");
                hideLayout();
            }
        });


        binding.rajasthanCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                binding.stateNameTextView.setText("Rajasthan");
                binding.stateNumberTextView.setText("0141-2225624");
                hideLayout();
            }
        });


        binding.sikkimCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                binding.stateNameTextView.setText("Sikkim");
                binding.stateNumberTextView.setText("104");
                hideLayout();
            }
        });


        binding.tamilNaduCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                binding.stateNameTextView.setText("Tamil Nadu");
                binding.stateNumberTextView.setText("044-29510500");
                hideLayout();
            }
        });


        binding.telanganaCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                binding.stateNameTextView.setText("Telangana");
                binding.stateNumberTextView.setText("104");
                hideLayout();
            }
        });

        binding.tripuraCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                binding.stateNameTextView.setText("Tripura");
                binding.stateNumberTextView.setText("0381-2315879");
                hideLayout();
            }
        });

        binding.uttarakhandCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                binding.stateNameTextView.setText("Uttarakhand");
                binding.stateNumberTextView.setText("104");
                hideLayout();
            }
        });

        binding.uttarPradeshCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                binding.stateNameTextView.setText("Uttar Pradesh");
                binding.stateNumberTextView.setText("18001805145");
                hideLayout();
            }
        });

        binding.westBengalCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                binding.stateNameTextView.setText("West Bengal");
                binding.stateNumberTextView.setText("1800313444222,03323412600");
                hideLayout();
            }
        });


        //union territories
        binding.andamanCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                binding.stateNameTextView.setText("Andaman and Nicobar");
                binding.stateNumberTextView.setText("03192-232102");
                hideLayout();
            }
        });


        binding.chandigarhCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                binding.stateNameTextView.setText("Chandigarh");
                binding.stateNumberTextView.setText("9779558282");
                hideLayout();
            }
        });

        binding.dnhCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                binding.stateNameTextView.setText("Dadra and Nagar Haveli");
                binding.stateNumberTextView.setText("104");
                hideLayout();
            }
        });

        binding.diuCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                binding.stateNameTextView.setText("Daman and Diu");
                binding.stateNumberTextView.setText("104");
                hideLayout();
            }
        });

        binding.delhiCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                binding.stateNameTextView.setText("Delhi");
                binding.stateNumberTextView.setText("011-22307145");
                hideLayout();
            }
        });


        binding.jammuCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                binding.stateNameTextView.setText("Jammu and Kashmir");
                binding.stateNumberTextView.setText("01912520982, 0194-2440283");
                hideLayout();
            }
        });

        binding.ladakhCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                binding.stateNameTextView.setText("Ladakh");
                binding.stateNumberTextView.setText("1982256462");
                hideLayout();
            }
        });


        binding.lakshadweepCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                binding.stateNameTextView.setText("Lakshadweep");
                binding.stateNumberTextView.setText("104");
                hideLayout();
            }
        });


        binding.showStatesCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                binding.relativeLayout.setVisibility(View.GONE);
                binding.scrollViewStates.setVisibility(View.VISIBLE);
            }
        });

        binding.copyCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                String state_name = binding.stateNameTextView.getText().toString();
                String state_number = binding.stateNumberTextView.getText().toString();
                shareNumber(state_name,state_number);
            }
        });


    }


    private void hideLayout() {
        binding.scrollViewStates.setVisibility(View.GONE);
        binding.relativeLayout.setVisibility(View.VISIBLE);
    }


    private void shareNumber(String state_name ,String state_number) {
        String full = "State: "+state_name+"\n"+"Contact Number: "+state_number;
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_TEXT,full);
        startActivity(i.createChooser(i,"Share Helpline Number of "+state_name));
    }
}
