package com.example.anji.cdac_discussion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Display_Contact extends AppCompatActivity {
    TextView displaytv1, displaytv2, displaytv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display__contact);
        displaytv1 = (TextView) findViewById(R.id.display_tv1);
        displaytv2 = (TextView) findViewById(R.id.display_tv2);
        displaytv3 = (TextView) findViewById(R.id.display_tv3);
        Intent res = getIntent();


        if (res.hasExtra("position")) {
            int data = res.getIntExtra("position", 12);
            if (data == 0) {
                displaytv1.setText("C-DAC Corporate Office");
                displaytv2.setText("Centre for Development of Advanced Computing\n" +
                        "Pune University Campus, Ganesh Khind\n" +
                        "Pune - 411 007\n" +
                        "Maharashtra (India)\n" +
                        "Phones:+91-20-2570-4100, Fax: +91-20-2569 4004");


            }
            if (data == 1) {
                displaytv1.setText("Bengaluru");
                displaytv2.setText("C-DAC Knowledge Park\n" +
                        "Opp. HAL Aeroengine Division\n" +
                        "Old Madras Road, Byappanahalli\n" +
                        "Bengaluru - 560 038\n" +
                        "Karnataka (India)\n" +
                        "Phones: +91-80-6611 6400/01/02/03, 25244059/25246823/25246826\n" +
                        "Fax: +91-80-2524-7724");
                displaytv3.setText("C-DAC Electronics City\n" +
                        "68, Electronics City\n" +
                        "Bengaluru - 561229\n" +
                        "Karnataka (India)\n" +
                        "Phones:+91-80-2852-3300\n" +
                        "Fax: +91-80-28522590");


            }
            if (data == 2) {
                displaytv1.setText("Chennai");
                displaytv2.setText("C-DAC\n" +
                        "Tidel Park, 8th Floor,\n" +
                        "'D' Block(North & Sauth), \n" +
                        "No.4 Rajiv Gandhi Salai,Taramani,\n" +
                        "Chennai- 600113\n" +
                        "Phones:+91-44-22542226/7\n" +
                        "Fax: +91-44-22542294");


            }
            if (data == 3) {
                displaytv1.setText("Delhi");
                displaytv2.setText("C-DAC\n" +
                        "First and Second Floors\n" +
                        "E - 25, Hauz Khas Market\n" +
                        "New Delhi - 110016. India\n" +
                        "Phones:+91-11-26510221\n" +
                        "Fax: +91-11-26510207\n");


            }
            if (data == 4) {
                displaytv1.setText("Hyderabad");
                displaytv2.setText("C-DAC\n" +
                        "Plot No. 6 & 7, Hardware Park, Sy No. 1/1, \n" +
                        "Srisailam Highway, Pahadi Shareef Via Keshavagiri (Post) \n" +
                        "Hyderabad - 500005\n" +
                        "Telangana(India)");
                displaytv3.setText("C-DAC\n" +
                        "Nalanda Building, No. 1 Shivabagh\n" +
                        "Satyam Theatre Road\n" +
                        "Ameerpet, Hyderabad - 500016\n" +
                        "Telangana (India)\n" +
                        "Phones:+91-40-23737124/25\n" +
                        "Fax: +91-040-23743382\n");

            }
            if (data == 5) {
                displaytv1.setText("Kolkata");
                displaytv2.setText("C-DAC\n" +
                        "Plot - E-2/1, Block-GP, Sector-V\n" +
                        "Salt Lake Electronics Complex\n" +
                        "Bidhannagar, Kolkata - 700 091\n" +
                        "Westbengal (India)\n" +
                        "Phone: +91-33-2357-9846/5989/4258\n" +
                        "Fax: +91-33-2357-5141");
            }
            if (data == 6) {
                displaytv1.setText("Mohali");
                displaytv2.setText("C-DAC\n" +
                        "A-34, Industrial Area\n" +
                        "Phase VIII, Mohali\n" +
                        "Chandigarh - 160 071\n" +
                        "India.\n" +
                        "Phones: +91-172-223-7052-57\n" +
                        "Fax: +91-172-2237050-51");
            }
            if (data == 7) {
                displaytv1.setText("Mumbai");
                displaytv2.setText("C-DAC\n" +
                        "Gulmohar Cross Road No. 9\n" +
                        "Juhu, Mumbai - 400 049\n" +
                        "Maharashtra (India)\n" +
                        "Phone: +91-22-2620-1606/1574\n" +
                        "Fax: +91-22-26232195/ 26210139");
                displaytv3.setText("C-DAC\n" +
                        "Raintree Marg, Near Bharati Vidyapeeth, Opp. Kharghar Railway Station, Sector 7, CBD Belapur\n" +
                        "Navi Mumbai - 400 614\n" +
                        "Maharashtra (India)\n" +
                        "Phones: +91-22-27565303\n" +
                        "Fax: +91-22-2756-0004");

            }
            if (data == 8) {
                displaytv1.setText("Noida");
                displaytv2.setText("C-DAC\n" +
                        "Anusandhan Bhawan, C-56/1, Sector-62,\n" +
                        "Noida - 201307\n" +
                        "Uttar Pradesh (India)\n" +
                        "Phones: +91-120-3063311-13\n" +
                        "Fax: +91-120-3063317");
                displaytv3.setText("Academic Block\n" +
                        "C-DAC, Noida : B-30, Sector-62,\tInstitution Area,\n" +
                        "Noida - 201307\n" +
                        "Uttar Pradesh (India)\n" +
                        "Phones: +91-120-3063371-73,\n" +
                        "Fax: +91-120-3063374");
            }
            if (data == 9) {
                displaytv1.setText("Pune");
                displaytv2.setText("C-DAC\n" +
                        "3rd Floor, RMZ Westend Center 3, \n" +
                        "Westend IT Park, Nagras Road,\n" +
                        "Aundh, Pune - 411007 \n" +
                        "Maharashtra (India)\n" +
                        "Landmark: Near Reliance Mart");
                displaytv3.setText("C-DAC ACTS\n" +
                        "3rd Floor, Westend Centre III,\n" +
                        "S. No. 169/1, Sector II, D P Road, Aundh\n" +
                        "Pune - 411007, Maharashtra(India)\n" +
                        "Landmark: Next to Reliance Mart, Above Domino's Pizza\n" +
                        "Phones: +91-20-25503100/01/06/07");
            }
            if (data == 10) {
                displaytv1.setText("Silchar");
                displaytv2.setText("C-DAC\n" +
                        "NIT Silchar campus\n" +
                        "Silchar\n" +
                        "Assam - 788010.\n" +
                        "India\n" +
                        "Phones:+91 8136016951");
            }
            if (data == 11) {
                displaytv1.setText("Thiruvananthapuram");
                displaytv2.setText("C-DAC\n" +
                        "P.B.NO:6520, Vellayambalam\n" +
                        "Thiruvananthapuram - 695033\n" +
                        "Kerala (India)\n" +
                        "Phones: +91-471-272-3333\n" +
                        "Fax: +91-471-2722239/ 2723456");
            }
        }

    }
}