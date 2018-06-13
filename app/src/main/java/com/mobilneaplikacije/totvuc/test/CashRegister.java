package com.mobilneaplikacije.totvuc.test;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class CashRegister extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cash_register);
        Resources res = getResources();
        ListView itemList;

        String[] items = res.getStringArray(R.array.test_items);
        String[] prices = res.getStringArray(R.array.test_prices);
        itemList = (ListView) findViewById(R.id.lv_cashreg_items);

        cashregItemAdapter itemAdapter;
        itemAdapter = new cashregItemAdapter(this,items,prices);
        itemList.setAdapter(itemAdapter);

    }
}
