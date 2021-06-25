package com.example.androidhomeworktext;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner city;
    Spinner nightmarkets;
    TextView txv;
    Button B01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txv = findViewById(R.id.txv);
        nightmarkets = findViewById(R.id.nightmarkets);
        city = findViewById(R.id.city);
        B01 = this.findViewById(R.id.B01);
        city.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String[] tempSet = new String[0];
                if (position == 0)
                    tempSet = getResources().getStringArray(R.array.error);
                else if (position == 1)
                    tempSet = getResources().getStringArray(R.array.nightmarket);
                else if (position == 2)
                    tempSet = getResources().getStringArray(R.array.nightmarket1);
                else if (position == 3)
                    tempSet = getResources().getStringArray(R.array.nightmarket2);
                else if (position == 4)
                    tempSet = getResources().getStringArray(R.array.nightmarket3);
                else if (position == 5)
                    tempSet = getResources().getStringArray(R.array.nightmarket4);
                else if (position == 6)
                    tempSet = getResources().getStringArray(R.array.nightmarket5);
                else if (position == 7)
                    tempSet = getResources().getStringArray(R.array.nightmarket6);
                else if (position == 8)
                    tempSet = getResources().getStringArray(R.array.nightmarket7);
                else if (position == 9)
                    tempSet = getResources().getStringArray(R.array.nightmarket8);
                else if (position == 10)
                    tempSet = getResources().getStringArray(R.array.nightmarket9);
                else if (position == 11)
                    tempSet = getResources().getStringArray(R.array.nightmarket10);
                else if (position == 12)
                    tempSet = getResources().getStringArray(R.array.nightmarket11);
                else if (position == 13)
                    tempSet = getResources().getStringArray(R.array.nightmarket12);
                else if (position == 14)
                    tempSet = getResources().getStringArray(R.array.nightmarket13);
                else if (position == 15)
                    tempSet = getResources().getStringArray(R.array.nightmarket14);
                else if (position == 16)
                    tempSet = getResources().getStringArray(R.array.nightmarket15);
                else if (position == 17)
                    tempSet = getResources().getStringArray(R.array.nightmarket16);
                else if (position == 18)
                    tempSet = getResources().getStringArray(R.array.nightmarket17);
                else if (position == 19)
                    tempSet = getResources().getStringArray(R.array.nightmarket18);
                else if (position == 20)
                    tempSet = getResources().getStringArray(R.array.nightmarket19);
                else if (position == 21)
                    tempSet = getResources().getStringArray(R.array.nightmarket20);
                else if (position == 22)
                    tempSet = getResources().getStringArray(R.array.nightmarket21);
                ArrayAdapter<String> tempAd = new ArrayAdapter<>(
                        MainActivity.this,
                        R.layout.support_simple_spinner_dropdown_item, tempSet);
                tempAd.setDropDownViewResource(
                        R.layout.support_simple_spinner_dropdown_item);
                nightmarkets.setAdapter(tempAd);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        B01.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                int idcity = city.getSelectedItemPosition();
                int idnightmarket = nightmarkets.getSelectedItemPosition();
                if (idcity == 1 & idnightmarket == 1)
                    txv.setText(getResources().getString(R.string.KLUfood));
                else if (idcity == 1 & idnightmarket == 2)
                    txv.setText(getResources().getString(R.string.KLUfood1));
                else if (idcity == 1 & idnightmarket == 3)
                    txv.setText(getResources().getString(R.string.KLUfood2));
                else if (idcity == 1 & idnightmarket == 4)
                    txv.setText(getResources().getString(R.string.KLUfood3));
                else if (idcity == 2 & idnightmarket == 1)
                    txv.setText(getResources().getString(R.string.NTPfood));
                else if (idcity == 2 & idnightmarket == 2)
                    txv.setText(getResources().getString(R.string.NTPfood1));
                else if (idcity == 2 & idnightmarket == 3)
                    txv.setText(getResources().getString(R.string.NTPfood2));
                else if (idcity == 2 & idnightmarket == 4)
                    txv.setText(getResources().getString(R.string.NTPfood3));
                else if (idcity == 2 & idnightmarket == 5)
                    txv.setText(getResources().getString(R.string.NTPfood4));
                else if (idcity == 2 & idnightmarket == 6)
                    txv.setText(getResources().getString(R.string.NTPfood5));
                else if (idcity == 2 & idnightmarket == 7)
                    txv.setText(getResources().getString(R.string.NTPfood6));
                else if (idcity == 2 & idnightmarket == 8)
                    txv.setText(getResources().getString(R.string.NTPfood7));
                else if (idcity == 2 & idnightmarket == 9)
                    txv.setText(getResources().getString(R.string.NTPfood8));
                else if (idcity == 2 & idnightmarket == 10)
                    txv.setText(getResources().getString(R.string.NTPfood9));
                else if (idcity == 2 & idnightmarket == 11)
                    txv.setText(getResources().getString(R.string.NTPfood10));
                else if (idcity == 2 & idnightmarket == 12)
                    txv.setText(getResources().getString(R.string.NTPfood11));
                else if (idcity == 2 & idnightmarket == 13)
                    txv.setText(getResources().getString(R.string.NTPfood12));
                else if (idcity == 2 & idnightmarket == 14)
                    txv.setText(getResources().getString(R.string.NTPfood13));
                else if (idcity == 2 & idnightmarket == 15)
                    txv.setText(getResources().getString(R.string.NTPfood14));
                else if (idcity == 2 & idnightmarket == 16)
                    txv.setText(getResources().getString(R.string.NTPfood15));
                else if (idcity == 2 & idnightmarket == 17)
                    txv.setText(getResources().getString(R.string.NTPfood16));
                else if (idcity == 2 & idnightmarket == 18)
                    txv.setText(getResources().getString(R.string.NTPfood17));
                else if (idcity == 2 & idnightmarket == 19)
                    txv.setText(getResources().getString(R.string.NTPfood18));
                else if (idcity == 2 & idnightmarket == 20)
                    txv.setText(getResources().getString(R.string.NTPfood19));
                else if (idcity == 2 & idnightmarket == 21)
                    txv.setText(getResources().getString(R.string.NTPfood20));
                else if (idcity == 2 & idnightmarket == 22)
                    txv.setText(getResources().getString(R.string.NTPfood21));
                else if (idcity == 2 & idnightmarket == 23)
                    txv.setText(getResources().getString(R.string.NTPfood22));
                else if (idcity == 2 & idnightmarket == 24)
                    txv.setText(getResources().getString(R.string.NTPfood23));
                else if (idcity == 2 & idnightmarket == 25)
                    txv.setText(getResources().getString(R.string.NTPfood24));
                else if (idcity == 2 & idnightmarket == 26)
                    txv.setText(getResources().getString(R.string.NTPfood25));
                else if (idcity == 2 & idnightmarket == 27)
                    txv.setText(getResources().getString(R.string.NTPfood26));
                else if (idcity == 3 & idnightmarket == 1)
                    txv.setText(getResources().getString(R.string.TPEfood));
                else if (idcity == 3 & idnightmarket == 2)
                    txv.setText(getResources().getString(R.string.TPEfood1));
                else if (idcity == 3 & idnightmarket == 3)
                    txv.setText(getResources().getString(R.string.TPEfood2));
                else if (idcity == 3 & idnightmarket == 4)
                    txv.setText(getResources().getString(R.string.TPEfood3));
                else if (idcity == 3 & idnightmarket == 5)
                    txv.setText(getResources().getString(R.string.TPEfood4));
                else if (idcity == 3 & idnightmarket == 6)
                    txv.setText(getResources().getString(R.string.TPEfood5));
                else if (idcity == 3 & idnightmarket == 7)
                    txv.setText(getResources().getString(R.string.TPEfood6));
                else if (idcity == 3 & idnightmarket == 8)
                    txv.setText(getResources().getString(R.string.TPEfood7));
                else if (idcity == 3 & idnightmarket == 9)
                    txv.setText(getResources().getString(R.string.TPEfood8));
                else if (idcity == 3 & idnightmarket == 10)
                    txv.setText(getResources().getString(R.string.TPEfood9));
                else if (idcity == 3 & idnightmarket == 11)
                    txv.setText(getResources().getString(R.string.TPEfood10));
                else if (idcity == 3 & idnightmarket == 12)
                    txv.setText(getResources().getString(R.string.TPEfood11));
                else if (idcity == 3 & idnightmarket == 13)
                    txv.setText(getResources().getString(R.string.TPEfood12));
                else if (idcity == 3 & idnightmarket == 14)
                    txv.setText(getResources().getString(R.string.TPEfood13));
                else if (idcity == 3 & idnightmarket == 15)
                    txv.setText(getResources().getString(R.string.TPEfood14));
                else if (idcity == 3 & idnightmarket == 16)
                    txv.setText(getResources().getString(R.string.TPEfood15));
                else if (idcity == 3 & idnightmarket == 17)
                    txv.setText(getResources().getString(R.string.TPEfood16));
                else if (idcity == 3 & idnightmarket == 18)
                    txv.setText(getResources().getString(R.string.TPEfood17));
                else if (idcity == 4 & idnightmarket == 1)
                    txv.setText(getResources().getString(R.string.TYCfood));
                else if (idcity == 4 & idnightmarket == 2)
                    txv.setText(getResources().getString(R.string.TYCfood1));
                else if (idcity == 4 & idnightmarket == 3)
                    txv.setText(getResources().getString(R.string.TYCfood2));
                else if (idcity == 4 & idnightmarket == 4)
                    txv.setText(getResources().getString(R.string.TYCfood3));
                else if (idcity == 4 & idnightmarket == 5)
                    txv.setText(getResources().getString(R.string.TYCfood4));
                else if (idcity == 4 & idnightmarket == 6)
                    txv.setText(getResources().getString(R.string.TYCfood5));
                else if (idcity == 4 & idnightmarket == 7)
                    txv.setText(getResources().getString(R.string.TYCfood6));
                else if (idcity == 4 & idnightmarket == 8)
                    txv.setText(getResources().getString(R.string.TYCfood7));
                else if (idcity == 4 & idnightmarket == 9)
                    txv.setText(getResources().getString(R.string.TYCfood8));
                else if (idcity == 4 & idnightmarket == 10)
                    txv.setText(getResources().getString(R.string.TYCfood9));
                else if (idcity == 4 & idnightmarket == 11)
                    txv.setText(getResources().getString(R.string.TYCfood10));
                else if (idcity == 4 & idnightmarket == 12)
                    txv.setText(getResources().getString(R.string.TYCfood11));
                else if (idcity == 4 & idnightmarket == 13)
                    txv.setText(getResources().getString(R.string.TYCfood12));
                else if (idcity == 4 & idnightmarket == 14)
                    txv.setText(getResources().getString(R.string.TYCfood13));
                else if (idcity == 4 & idnightmarket == 15)
                    txv.setText(getResources().getString(R.string.TYCfood14));
                else if (idcity == 4 & idnightmarket == 16)
                    txv.setText(getResources().getString(R.string.TYCfood15));
                else if (idcity == 4 & idnightmarket == 17)
                    txv.setText(getResources().getString(R.string.TYCfood16));
                else if (idcity == 4 & idnightmarket == 18)
                    txv.setText(getResources().getString(R.string.TYCfood17));
                else if (idcity == 4 & idnightmarket == 19)
                    txv.setText(getResources().getString(R.string.TYCfood18));
                else if (idcity == 4 & idnightmarket == 20)
                    txv.setText(getResources().getString(R.string.TYCfood19));
                else if (idcity == 4 & idnightmarket == 21)
                    txv.setText(getResources().getString(R.string.TYCfood20));
                else if (idcity == 4 & idnightmarket == 22)
                    txv.setText(getResources().getString(R.string.TYCfood21));
                else if (idcity == 5 & idnightmarket == 1)
                    txv.setText(getResources().getString(R.string.HSCfood));
                else if (idcity == 5 & idnightmarket == 2)
                    txv.setText(getResources().getString(R.string.HSCfood1));
                else if (idcity == 5 & idnightmarket == 3)
                    txv.setText(getResources().getString(R.string.HSCfood2));
                else if (idcity == 5 & idnightmarket == 4)
                    txv.setText(getResources().getString(R.string.HSCfood3));
                else if (idcity == 5 & idnightmarket == 5)
                    txv.setText(getResources().getString(R.string.HSCfood4));
                else if (idcity == 5 & idnightmarket == 6)
                    txv.setText(getResources().getString(R.string.HSCfood5));
                else if (idcity == 5 & idnightmarket == 7)
                    txv.setText(getResources().getString(R.string.HSCfood6));
                else if (idcity == 5 & idnightmarket == 8)
                    txv.setText(getResources().getString(R.string.HSCfood7));
                else if (idcity == 6 & idnightmarket == 1)
                    txv.setText(getResources().getString(R.string.HSHfood));
                else if (idcity == 6 & idnightmarket == 2)
                    txv.setText(getResources().getString(R.string.HSHfood1));
                else if (idcity == 6 & idnightmarket == 3)
                    txv.setText(getResources().getString(R.string.HSHfood2));
                else if (idcity == 6 & idnightmarket == 4)
                    txv.setText(getResources().getString(R.string.HSHfood3));
                else if (idcity == 6 & idnightmarket == 5)
                    txv.setText(getResources().getString(R.string.HSHfood4));
                else if (idcity == 6 & idnightmarket == 6)
                    txv.setText(getResources().getString(R.string.HSHfood5));
                else if (idcity == 6 & idnightmarket == 7)
                    txv.setText(getResources().getString(R.string.HSHfood6));
                else if (idcity == 6 & idnightmarket == 8)
                    txv.setText(getResources().getString(R.string.HSHfood7));
                else if (idcity == 6 & idnightmarket == 9)
                    txv.setText(getResources().getString(R.string.HSHfood8));
                else if (idcity == 6 & idnightmarket == 10)
                    txv.setText(getResources().getString(R.string.HSHfood9));
                else if (idcity == 6 & idnightmarket == 11)
                    txv.setText(getResources().getString(R.string.HSHfood10));
                else if (idcity == 6 & idnightmarket == 12)
                    txv.setText(getResources().getString(R.string.HSHfood11));

                else
                    txv.setText("請選擇縣市或夜市");
            }
        });
    }
}