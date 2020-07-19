package com.pranavbadgi.onestopcorona;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;

import com.pranavbadgi.onestopcorona.databinding.ActivityTestCentersBinding;

public class TestCenters extends AppCompatActivity {

    ActivityTestCentersBinding binding;
    Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_test_centers);
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
                Intent i = new Intent(TestCenters.this, MainActivity.class);
                startActivity(i);
            }
        });

        binding.andhraPradeshCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.andhraPradeshRelativeLayout.setVisibility(View.VISIBLE);
                binding.scrollViewStates.setVisibility(View.GONE);
                binding.stateNameTextView.setText("Andhra Pradesh");
                binding.testCenterOne.setText("Sri Venkateswara Institute of Medical Sciences, Tirupati");
                binding.testCenterTwo.setText("Andhra Medical College, Visakhapatnam");
                binding.testCenterThree.setText("GMC, Anantapur, AP");
                binding.testCenterFour.setText("Rangaraya Medical College, Kakinada");
                binding.testCenterFive.setText("Sidhartha Medical College, Vijaywada");
                binding.testCenterOne.setVisibility(View.VISIBLE);
                binding.testCenterTwo.setVisibility(View.VISIBLE);
                binding.testCenterThree.setVisibility(View.VISIBLE);
                binding.testCenterFour.setVisibility(View.VISIBLE);
                binding.testCenterFive.setVisibility(View.VISIBLE);

            }
        });

        binding.andamanCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.scrollViewStates.setVisibility(View.GONE);
                binding.andhraPradeshRelativeLayout.setVisibility(View.VISIBLE);
                binding.stateNameTextView.setText("Andaman and Nicobar");
                binding.testCenterOne.setText("Regional Medical Research Centre, Port Blair");
                binding.testCenterOne.setVisibility(View.VISIBLE);
                binding.testCenterTwo.setVisibility(View.GONE);
                binding.testCenterThree.setVisibility(View.GONE);
                binding.testCenterFour.setVisibility(View.GONE);
                binding.testCenterFive.setVisibility(View.GONE);
            }
        });

        binding.assamCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.scrollViewStates.setVisibility(View.GONE);
                binding.andhraPradeshRelativeLayout.setVisibility(View.VISIBLE);
                binding.stateNameTextView.setText("Assam");
                binding.testCenterOne.setText("Gauhati Medical College, Guwahati");
                binding.testCenterTwo.setText("Regional Medical Research Center, Dibrugarh");
                binding.testCenterThree.setText("Jorhat Medical College, Jorhat");
                binding.testCenterFour.setText("Silchar Medical College, Silchar");
                binding.testCenterFive.setText("Fakkhruddin Ali Ahmed Medical College, Barpeta");
                binding.testCenterOne.setVisibility(View.VISIBLE);
                binding.testCenterTwo.setVisibility(View.VISIBLE);
                binding.testCenterThree.setVisibility(View.VISIBLE);
                binding.testCenterFour.setVisibility(View.VISIBLE);
                binding.testCenterFive.setVisibility(View.VISIBLE);


            }
        });

        binding.biharCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.scrollViewStates.setVisibility(View.GONE);
                binding.andhraPradeshRelativeLayout.setVisibility(View.VISIBLE);
                binding.stateNameTextView.setText("Bihar");
                binding.testCenterOne.setText("Rajendra Memorial Research Institute of Medical Sciences, Patna");
                binding.testCenterTwo.setText("Indira Gandhi Institute Medical Sciences, Patna");
                binding.testCenterThree.setText("Patna Medical College, Patna");
                binding.testCenterFour.setText("Darbhanga Medical College, Darbhanga");
                binding.testCenterOne.setVisibility(View.VISIBLE);
                binding.testCenterTwo.setVisibility(View.VISIBLE);
                binding.testCenterThree.setVisibility(View.VISIBLE);
                binding.testCenterFour.setVisibility(View.VISIBLE);
                binding.testCenterFive.setVisibility(View.GONE);

            }
        });

        binding.chandigarhCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.scrollViewStates.setVisibility(View.GONE);
                binding.andhraPradeshRelativeLayout.setVisibility(View.VISIBLE);
                binding.stateNameTextView.setText("Chandigarh");
                binding.testCenterOne.setText("Post Graduate Institute of Medical Education & Research, Chandigarh");
                binding.testCenterTwo.setText("Govt. Medical College, Chandigarh");
                binding.testCenterOne.setVisibility(View.VISIBLE);
                binding.testCenterTwo.setVisibility(View.VISIBLE);
                binding.testCenterThree.setVisibility(View.GONE);
                binding.testCenterFour.setVisibility(View.GONE);
                binding.testCenterFive.setVisibility(View.GONE);

            }
        });

        binding.chhattisgarhCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.scrollViewStates.setVisibility(View.GONE);
                binding.andhraPradeshRelativeLayout.setVisibility(View.VISIBLE);
                binding.stateNameTextView.setText("Chhattisgarh");
                binding.testCenterOne.setText("All India Institute Medical Sciences, Delhi");
                binding.testCenterTwo.setText("Late Baliram Kashyap M Govt. Medical College, Jagdalpur");
                binding.testCenterOne.setVisibility(View.VISIBLE);
                binding.testCenterTwo.setVisibility(View.VISIBLE);
                binding.testCenterThree.setVisibility(View.GONE);
                binding.testCenterFour.setVisibility(View.GONE);
                binding.testCenterFive.setVisibility(View.GONE);

            }
        });

        binding.delhincrCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.scrollViewStates.setVisibility(View.GONE);
                binding.andhraPradeshRelativeLayout.setVisibility(View.VISIBLE);
                binding.stateNameTextView.setText("Delhi NCR");
                binding.testCenterOne.setText("All India Institute Medical Sciences, Delhi");
                binding.testCenterTwo.setText("National Centre for Disease Control, Delhi");
                binding.testCenterThree.setText("Lady Hardinge Medical College");
                binding.testCenterFour.setText("Ram Manohar Lohia Hospital");
                binding.testCenterFive.setText("Institute of Liver & Biliary Sciences");
                binding.testCenterOne.setVisibility(View.VISIBLE);
                binding.testCenterTwo.setVisibility(View.VISIBLE);
                binding.testCenterThree.setVisibility(View.VISIBLE);
                binding.testCenterFour.setVisibility(View.VISIBLE);
                binding.testCenterFive.setVisibility(View.VISIBLE);

            }
        });

        binding.gujaratCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.scrollViewStates.setVisibility(View.GONE);
                binding.andhraPradeshRelativeLayout.setVisibility(View.VISIBLE);
                binding.stateNameTextView.setText("Gujarat");
                binding.testCenterOne.setText("BJ Medical College, Ahmedabad");
                binding.testCenterTwo.setText("M.P.Shah Government Medical College, Jamnagar");
                binding.testCenterThree.setText("Govt. Medical College, Surat");
                binding.testCenterFour.setText("Govt. Medical College, Bhavnagar");
                binding.testCenterFive.setText("Govt. Medical College, Vadodara");
                binding.testCenterOne.setVisibility(View.VISIBLE);
                binding.testCenterTwo.setVisibility(View.VISIBLE);
                binding.testCenterThree.setVisibility(View.VISIBLE);
                binding.testCenterFour.setVisibility(View.VISIBLE);
                binding.testCenterFive.setVisibility(View.VISIBLE);

            }
        });

        binding.goaCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.scrollViewStates.setVisibility(View.GONE);
                binding.andhraPradeshRelativeLayout.setVisibility(View.VISIBLE);
                binding.stateNameTextView.setText("Goa");
                binding.testCenterOne.setText("Goa Medical College, Goa");
                binding.testCenterOne.setVisibility(View.VISIBLE);
                binding.testCenterTwo.setVisibility(View.GONE);
                binding.testCenterThree.setVisibility(View.GONE);
                binding.testCenterFour.setVisibility(View.GONE);
                binding.testCenterFive.setVisibility(View.GONE);

            }
        });

        binding.haryanaCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.scrollViewStates.setVisibility(View.GONE);
                binding.andhraPradeshRelativeLayout.setVisibility(View.VISIBLE);
                binding.stateNameTextView.setText("Haryana");
                binding.testCenterOne.setText("BPS Govt Medical College, Sonipat");
                binding.testCenterTwo.setText("Pt. B.D. Sharma Post Graduate Inst. of Med. Sciences, Rohtak, Haryana");
                binding.testCenterOne.setVisibility(View.VISIBLE);
                binding.testCenterTwo.setVisibility(View.VISIBLE);
                binding.testCenterThree.setVisibility(View.GONE);
                binding.testCenterFour.setVisibility(View.GONE);
                binding.testCenterFive.setVisibility(View.GONE);

            }
        });

        binding.himachalCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.scrollViewStates.setVisibility(View.GONE);
                binding.andhraPradeshRelativeLayout.setVisibility(View.VISIBLE);
                binding.stateNameTextView.setText("Himachal Pradesh");
                binding.testCenterOne.setText("Indira Gandhi Medical College, Shimla, Himachal Pradesh");
                binding.testCenterTwo.setText("Dr.Rajendra Prasad Govt. Med. College, Kangra, Tanda, HP");
                binding.testCenterOne.setVisibility(View.VISIBLE);
                binding.testCenterTwo.setVisibility(View.VISIBLE);
                binding.testCenterThree.setVisibility(View.GONE);
                binding.testCenterFour.setVisibility(View.GONE);
                binding.testCenterFive.setVisibility(View.GONE);

            }
        });

        binding.jammuCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.scrollViewStates.setVisibility(View.GONE);
                binding.andhraPradeshRelativeLayout.setVisibility(View.VISIBLE);
                binding.stateNameTextView.setText("Jammu and Kashmir");
                binding.testCenterOne.setText("Government Medical College, Jammu");
                binding.testCenterTwo.setText("Command Hospital (NC) Udhampur");
                binding.testCenterThree.setText("Sher-e- Kashmir Institute of Medical Sciences, Srinagar");
                binding.testCenterFour.setText("Govt. Medical College, Srinagar");
                binding.testCenterOne.setVisibility(View.VISIBLE);
                binding.testCenterTwo.setVisibility(View.VISIBLE);
                binding.testCenterThree.setVisibility(View.VISIBLE);
                binding.testCenterFour.setVisibility(View.VISIBLE);
                binding.testCenterFive.setVisibility(View.GONE);

            }
        });

        binding.jharkhandCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.scrollViewStates.setVisibility(View.GONE);
                binding.andhraPradeshRelativeLayout.setVisibility(View.VISIBLE);
                binding.stateNameTextView.setText("Jharkhand");
                binding.testCenterOne.setText("MGM Medical College, Jamshedpur");
                binding.testCenterTwo.setText("Rajendra Institute of Medical Sciences, Ranchi");
                binding.testCenterOne.setVisibility(View.VISIBLE);
                binding.testCenterTwo.setVisibility(View.VISIBLE);
                binding.testCenterThree.setVisibility(View.GONE);
                binding.testCenterFour.setVisibility(View.GONE);
                binding.testCenterFive.setVisibility(View.GONE);


            }
        });

        binding.karnatakaCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.scrollViewStates.setVisibility(View.GONE);
                binding.andhraPradeshRelativeLayout.setVisibility(View.VISIBLE);
                binding.stateNameTextView.setText("Karnataka");
                binding.testCenterOne.setText("Bangalore Medical College & Research Institute, Bangalore");
                binding.testCenterTwo.setText("National Institute of Virology Field Unit Bangalore");
                binding.testCenterThree.setText("Mysore Medical College & Research Institute, Mysore");
                binding.testCenterFour.setText("Command Hospital (Air Force), Bengaluru");
                binding.testCenterFive.setText("Gulbarga Institute of Medical Sciences, Gulbarga");
                binding.testCenterOne.setVisibility(View.VISIBLE);
                binding.testCenterTwo.setVisibility(View.VISIBLE);
                binding.testCenterThree.setVisibility(View.VISIBLE);
                binding.testCenterFour.setVisibility(View.VISIBLE);
                binding.testCenterFive.setVisibility(View.VISIBLE);

            }
        });

        binding.keralaCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.scrollViewStates.setVisibility(View.GONE);
                binding.andhraPradeshRelativeLayout.setVisibility(View.VISIBLE);
                binding.stateNameTextView.setText("Kerala");
                binding.testCenterOne.setText("National Institute of Virology Field Unit, Allapuzza");
                binding.testCenterTwo.setText("Govt. Medical College, Thriuvananthapuram");
                binding.testCenterThree.setText("Govt. Medical College, Kozhikhode");
                binding.testCenterFour.setText("Rajiv Gandhi Center for Biotechnology, Thiruvanathapuram");
                binding.testCenterFive.setText("State Public Health Laboratory, Trivandrum");
                binding.testCenterOne.setVisibility(View.VISIBLE);
                binding.testCenterTwo.setVisibility(View.VISIBLE);
                binding.testCenterThree.setVisibility(View.VISIBLE);
                binding.testCenterFour.setVisibility(View.VISIBLE);
                binding.testCenterFive.setVisibility(View.VISIBLE);

            }
        });

        binding.ladakhCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.scrollViewStates.setVisibility(View.GONE);
                binding.andhraPradeshRelativeLayout.setVisibility(View.VISIBLE);
                binding.stateNameTextView.setText("Ladakh");
                binding.testCenterOne.setText("Sonam Namgyal Memorial Hospital, Leh");
                binding.testCenterOne.setVisibility(View.VISIBLE);
                binding.testCenterTwo.setVisibility(View.GONE);
                binding.testCenterThree.setVisibility(View.GONE);
                binding.testCenterFour.setVisibility(View.GONE);
                binding.testCenterFive.setVisibility(View.GONE);

            }
        });

        binding.madhyaPradeshCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.scrollViewStates.setVisibility(View.GONE);
                binding.andhraPradeshRelativeLayout.setVisibility(View.VISIBLE);
                binding.stateNameTextView.setText("Madhya Pradesh");
                binding.testCenterOne.setText("All India Institute Medical Sciences, Bhopal");
                binding.testCenterTwo.setText("National Institute of Research in Tribal Health (NIRTH), Jabalpur");
                binding.testCenterThree.setText("Mahatma Gandhi Memorial Medical College, Indore");
                binding.testCenterFour.setText("Gandhi Medical College, Bhopal");
                binding.testCenterOne.setVisibility(View.VISIBLE);
                binding.testCenterTwo.setVisibility(View.VISIBLE);
                binding.testCenterThree.setVisibility(View.VISIBLE);
                binding.testCenterFour.setVisibility(View.VISIBLE);
                binding.testCenterFive.setVisibility(View.GONE);

            }
        });

        binding.maharashtraCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.scrollViewStates.setVisibility(View.GONE);
                binding.andhraPradeshRelativeLayout.setVisibility(View.VISIBLE);
                binding.stateNameTextView.setText("Maharashtra");
                binding.testCenterOne.setText("Kasturba Hospital for Infectious Diseases, Mumbai");
                binding.testCenterTwo.setText("Seth GS Medical College & KEM Hospital, Mumbai");
                binding.testCenterThree.setText("National Institute of Virology Field Unit, Mumbai");
                binding.testCenterFour.setText("Grant Medical College & Sir JJ Hospital, Mumbai");
                binding.testCenterFive.setText("Haffkine Institute, Mumbai");
                binding.testCenterOne.setVisibility(View.VISIBLE);
                binding.testCenterTwo.setVisibility(View.VISIBLE);
                binding.testCenterThree.setVisibility(View.VISIBLE);
                binding.testCenterFour.setVisibility(View.VISIBLE);
                binding.testCenterFive.setVisibility(View.VISIBLE);

            }
        });

        binding.manipurCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.scrollViewStates.setVisibility(View.GONE);
                binding.andhraPradeshRelativeLayout.setVisibility(View.VISIBLE);
                binding.stateNameTextView.setText("Manipur");
                binding.testCenterOne.setText("J N Inst. of Med. Sciences Hospital, Imphal-East");
                binding.testCenterTwo.setText("Regional Institute of Medical Sciences, Imphal");
                binding.testCenterOne.setVisibility(View.VISIBLE);
                binding.testCenterTwo.setVisibility(View.VISIBLE);
                binding.testCenterThree.setVisibility(View.GONE);
                binding.testCenterFour.setVisibility(View.GONE);
                binding.testCenterFive.setVisibility(View.GONE);

            }
        });

        binding.meghalayaCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.scrollViewStates.setVisibility(View.GONE);
                binding.andhraPradeshRelativeLayout.setVisibility(View.VISIBLE);
                binding.stateNameTextView.setText("Meghalaya");
                binding.testCenterOne.setText("NEIGRI of Health and Medical Sciences, Shillong, Meghalaya");
                binding.testCenterOne.setVisibility(View.VISIBLE);
                binding.testCenterTwo.setVisibility(View.GONE);
                binding.testCenterThree.setVisibility(View.GONE);
                binding.testCenterFour.setVisibility(View.GONE);
                binding.testCenterFive.setVisibility(View.GONE);

            }
        });

        binding.odishaCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.scrollViewStates.setVisibility(View.GONE);
                binding.andhraPradeshRelativeLayout.setVisibility(View.VISIBLE);
                binding.stateNameTextView.setText("Odisha");
                binding.testCenterOne.setText("Regional Medical Research Center, Bhubaneswar");
                binding.testCenterTwo.setText("All India Institute of Medical Sciences, Bhubaneshwar");
                binding.testCenterThree.setText("SCB Medical College and Hospital, Cuttack");
                binding.testCenterOne.setVisibility(View.VISIBLE);
                binding.testCenterTwo.setVisibility(View.VISIBLE);
                binding.testCenterThree.setVisibility(View.VISIBLE);
                binding.testCenterFour.setVisibility(View.GONE);
                binding.testCenterFive.setVisibility(View.GONE);

            }
        });

        binding.puducherryCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.scrollViewStates.setVisibility(View.GONE);
                binding.andhraPradeshRelativeLayout.setVisibility(View.VISIBLE);
                binding.stateNameTextView.setText("Puducherry");
                binding.testCenterOne.setText("Jawaharlal Institute of Postgraduate Medical Education & Research");
                binding.testCenterOne.setVisibility(View.VISIBLE);
                binding.testCenterTwo.setVisibility(View.GONE);
                binding.testCenterThree.setVisibility(View.GONE);
                binding.testCenterFour.setVisibility(View.GONE);
                binding.testCenterFive.setVisibility(View.GONE);

            }
        });

        binding.punjabCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.scrollViewStates.setVisibility(View.GONE);
                binding.andhraPradeshRelativeLayout.setVisibility(View.VISIBLE);
                binding.stateNameTextView.setText("Punjab");
                binding.testCenterOne.setText("Government Medical College, Patiala");
                binding.testCenterTwo.setText("Government Medical College, Amritsar");
                binding.testCenterOne.setVisibility(View.VISIBLE);
                binding.testCenterTwo.setVisibility(View.VISIBLE);
                binding.testCenterThree.setVisibility(View.GONE);
                binding.testCenterFour.setVisibility(View.GONE);
                binding.testCenterFive.setVisibility(View.GONE);

            }
        });

        binding.rajasthanCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.scrollViewStates.setVisibility(View.GONE);
                binding.andhraPradeshRelativeLayout.setVisibility(View.VISIBLE);
                binding.stateNameTextView.setText("Rajasthan");
                binding.testCenterOne.setText("Sawai Man Singh, Jaipur");
                binding.testCenterTwo.setText("Dr. S.N Medical College, Jodhpur");
                binding.testCenterThree.setText("Jhalawar Medical College, Jhalawar");
                binding.testCenterFour.setText("RNT Medical College, Udaipur");
                binding.testCenterFive.setText("SP Medical College, Bikaner");
                binding.testCenterOne.setVisibility(View.VISIBLE);
                binding.testCenterTwo.setVisibility(View.VISIBLE);
                binding.testCenterThree.setVisibility(View.VISIBLE);
                binding.testCenterFour.setVisibility(View.VISIBLE);
                binding.testCenterFive.setVisibility(View.VISIBLE);

            }
        });

        binding.tamilNaduCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.scrollViewStates.setVisibility(View.GONE);
                binding.andhraPradeshRelativeLayout.setVisibility(View.VISIBLE);
                binding.stateNameTextView.setText("Tamil Nadu");
                binding.testCenterOne.setText("King's Institute of Preventive Medicine & Research");
                binding.testCenterTwo.setText("Madras Medical College, Chennai");
                binding.testCenterThree.setText("Government Medical College, Theni");
                binding.testCenterFour.setText("Tirunelveli Medical College, Tirunelveli");
                binding.testCenterFive.setText("Govt. Medical College, Thiruvarur");
                binding.testCenterOne.setVisibility(View.VISIBLE);
                binding.testCenterTwo.setVisibility(View.VISIBLE);
                binding.testCenterThree.setVisibility(View.VISIBLE);
                binding.testCenterFour.setVisibility(View.VISIBLE);
                binding.testCenterFive.setVisibility(View.VISIBLE);

            }
        });

        binding.telanganaCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.scrollViewStates.setVisibility(View.GONE);
                binding.andhraPradeshRelativeLayout.setVisibility(View.VISIBLE);
                binding.stateNameTextView.setText("Telangana");
                binding.testCenterOne.setText("Gandhi Medical College, Secunderabad");
                binding.testCenterTwo.setText("Osmania Medical College, Hyderabad");
                binding.testCenterThree.setText("Sir Ronald Ross of Tropical & Communicable Diseases, Hyderabad");
                binding.testCenterFour.setText("Nizam’s Institute of Medical Sciences, Hyderabad");
                binding.testCenterFive.setText("Institute of Preventive Medicine, Hyderabad");
                binding.testCenterOne.setVisibility(View.VISIBLE);
                binding.testCenterTwo.setVisibility(View.VISIBLE);
                binding.testCenterThree.setVisibility(View.VISIBLE);
                binding.testCenterFour.setVisibility(View.VISIBLE);
                binding.testCenterFive.setVisibility(View.VISIBLE);

            }
        });

        binding.tripuraCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.scrollViewStates.setVisibility(View.GONE);
                binding.andhraPradeshRelativeLayout.setVisibility(View.VISIBLE);
                binding.stateNameTextView.setText("Tripura");
                binding.testCenterOne.setText("Government Medical College, Agartala");
                binding.testCenterOne.setVisibility(View.VISIBLE);
                binding.testCenterTwo.setVisibility(View.GONE);
                binding.testCenterThree.setVisibility(View.GONE);
                binding.testCenterFour.setVisibility(View.GONE);
                binding.testCenterFive.setVisibility(View.GONE);

            }
        });

        binding.uttarPradeshCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.scrollViewStates.setVisibility(View.GONE);
                binding.andhraPradeshRelativeLayout.setVisibility(View.VISIBLE);
                binding.stateNameTextView.setText("Uttar Pradesh");
                binding.testCenterOne.setText("King's George Medical University, Lucknow");
                binding.testCenterTwo.setText("Institute of Medical Sciences, Banaras Hindu University, Varanasi");
                binding.testCenterThree.setText("Jawaharlal Nehru Medical College, Aligarh");
                binding.testCenterFour.setText("Command Hospital, Lucknow");
                binding.testCenterFive.setText("Lala Lajpat Rai Memorial Medical College, Meerut");
                binding.testCenterOne.setVisibility(View.VISIBLE);
                binding.testCenterTwo.setVisibility(View.VISIBLE);
                binding.testCenterThree.setVisibility(View.VISIBLE);
                binding.testCenterFour.setVisibility(View.VISIBLE);
                binding.testCenterFive.setVisibility(View.VISIBLE);

            }
        });

        binding.uttarakhandCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.scrollViewStates.setVisibility(View.GONE);
                binding.andhraPradeshRelativeLayout.setVisibility(View.VISIBLE);
                binding.stateNameTextView.setText("Uttarakhand");
                binding.testCenterOne.setText("Government Medical College, Haldwani");
                binding.testCenterTwo.setText("All India Institute of Medical Sciences, Rishikesh");
                binding.testCenterOne.setVisibility(View.VISIBLE);
                binding.testCenterTwo.setVisibility(View.VISIBLE);
                binding.testCenterThree.setVisibility(View.GONE);
                binding.testCenterFour.setVisibility(View.GONE);
                binding.testCenterFive.setVisibility(View.GONE);


            }
        });

        binding.westbengalCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.scrollViewStates.setVisibility(View.GONE);
                binding.andhraPradeshRelativeLayout.setVisibility(View.VISIBLE);
                binding.stateNameTextView.setText("West Bengal");
                binding.testCenterOne.setText("National Institute of Cholera and Enteric Diseases, Kolkata");
                binding.testCenterTwo.setText("Institute of Post Graduate Medical Education & Research, Kolkata");
                binding.testCenterThree.setText("School of Tropical Medicine, Kolkata");
                binding.testCenterFour.setText("North Bengal Medical College, Darjeeling");
                binding.testCenterFive.setText("Midnapore Medical College, Midnapore");
                binding.testCenterOne.setVisibility(View.VISIBLE);
                binding.testCenterTwo.setVisibility(View.VISIBLE);
                binding.testCenterThree.setVisibility(View.VISIBLE);
                binding.testCenterFour.setVisibility(View.VISIBLE);
                binding.testCenterFive.setVisibility(View.VISIBLE);

            }
        });

        binding.showOtherStates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.andhraPradeshRelativeLayout.setVisibility(View.GONE);
                binding.scrollViewStates.setVisibility(View.VISIBLE);
            }
        });


    }
}
