package com.example.mobilehanzjoki.Adapter;

public class GetPaket {
    String jokiName="", harga ="", hargadc ="";

    public GetPaket(String jokiNamem, String harga, String hargadc){
        this.jokiName = jokiNamem;
        this.harga = harga;
        this.hargadc = hargadc;
    }


    public String getJokiName() {
        return jokiName;
    }

    public String getHarga() {
        return harga;
    }

    public String getHargadc() {
        return hargadc;
    }
}
