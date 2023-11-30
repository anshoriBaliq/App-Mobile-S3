package com.example.mobilehanzjoki.Jasa;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.mobilehanzjoki.Adapter.Adaptor;
import com.example.mobilehanzjoki.Adapter.GetPaket;
import com.example.mobilehanzjoki.Configurasi;
import com.example.mobilehanzjoki.R;
import com.example.mobilehanzjoki.RegisterActivity;
import com.example.mobilehanzjoki.fragment.HomeFragment;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class JokiRankActivity extends AppCompatActivity {

    ImageView back;
    ListView listView;
    ArrayList<GetPaket> model;
    Adaptor adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joki_rank);

        // Inisialisasi ListView dari layout activity_joki_rank.xml
        listView = findViewById(R.id.list);

        // Load data dan set adapter
        load_data();
    }

    void load_data() {

        back.setOnClickListener(v->{
            startActivity(new Intent(getApplicationContext(), HomeFragment.class));
        });

        String url = new Configurasi().baseUrl() + "api_get_promo.php";
        StringRequest stringRequest = new StringRequest(
                Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    Log.d(null, "onResponse: " + response);
                    JSONObject object = new JSONObject(response);

                    JSONArray jsonArray = object.getJSONArray("data");
                    model = new ArrayList<>();
                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject getPaket = jsonArray.getJSONObject(i);

                        model.add(new GetPaket(
                                getPaket.getString("nama_paket"),
                                getPaket.getString("harga"),
                                getPaket.getString("hasil_pengurangan")
                        ));
                    }

                    adaptor = new Adaptor(JokiRankActivity.this, model);
                    listView.setAdapter(adaptor);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(JokiRankActivity.this, "Error: " + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
}
