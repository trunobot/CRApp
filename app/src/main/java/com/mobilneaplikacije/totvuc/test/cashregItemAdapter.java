package com.mobilneaplikacije.totvuc.test;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Otoman on 9.6.2018..
 */


public class cashregItemAdapter extends BaseAdapter {
    LayoutInflater inflater;
    String[] items;
    String[] prices;

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    public cashregItemAdapter(Context c, String[] i, String[] p) {
        items = i;
        prices = p;
        inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = inflater.inflate(R.layout.cashreg_itemlist, null);
        TextView itemnames = (TextView) v.findViewById(R.id.tv_itemNames);
        TextView itemprices = (TextView) v.findViewById(R.id.tv_itemPrices);
        String item = items[i];
        String price = prices[i];

        itemnames.setText(item);
        itemprices.setText(price);
        return v;
    }
}
