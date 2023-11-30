package com.example.mobilehanzjoki.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.mobilehanzjoki.R;

import java.util.ArrayList;

public class Adaptor extends BaseAdapter {

    Context context;
    LayoutInflater inflater;
    ArrayList<GetPaket> model;

    public Adaptor(Context context, ArrayList<GetPaket> model) {
        this.context = context;
        this.inflater = LayoutInflater.from(context);
        this.model = model;
    }
    @Override
    public int getCount() {
        return model != null ? model.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return model.get(position);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        TextView jokiName, harga, hargadc;
        View view1 = inflater.inflate(R.layout.list_paket, null);

        jokiName = view1.findViewById(R.id.jokiName);
        harga = view1.findViewById(R.id.harga);
        hargadc = view1.findViewById(R.id.hargadc);

        jokiName.setText(model.get(position).getJokiName());
        harga.setText(model.get(position).getHarga());
        hargadc.setText(model.get(position).getHargadc());

        return view1;
    }
}
