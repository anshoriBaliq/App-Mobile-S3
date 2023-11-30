package com.example.mobilehanzjoki.fragment;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.mobilehanzjoki.Adapter.Adaptor;
import com.example.mobilehanzjoki.Adapter.GetPaket;
import com.example.mobilehanzjoki.Configurasi;
import com.example.mobilehanzjoki.Jasa.JokiRankActivity;
import com.example.mobilehanzjoki.LoginActivity;
import com.example.mobilehanzjoki.MainActivity;
import com.example.mobilehanzjoki.R;
import com.example.mobilehanzjoki.RegisterActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
//
//    ImageView imageButton, imageButton2, imageButton3, imageButton4,imageButton5;
//    ListView listView;
//    ArrayList<GetPaket> model;
//    Adaptor adaptor;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

//        // Inisialisasi ListView dari layout fragment_home.xml
//        listView = view.findViewById(R.id.list);
//
//        // Load data dan set adapter
//        load_data();
//
//        ImageView image = (ImageView) view.findViewById(R.id.imageButton);
//        image.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                Log.d("HomeFragment", "ImageView diklik");
//                Intent intent = new Intent(getActivity(), JokiRankActivity.class);
//                startActivity(intent);
//            }
//        });
//
        return view;
    }

//    void load_data() {
//
//        String url = new Configurasi().baseUrl()+"api_get_promo.php";
//        StringRequest stringRequest = new StringRequest(
//                Request.Method.POST, url, new Response.Listener<String>()  {
//            @Override
//            public void onResponse(String response) {
//                try {
//                    Log.d(null, "onResponse: " + response);
//                    JSONObject object = new JSONObject(response);
//
//
//                    JSONArray jsonArray = object.getJSONArray("data");
//                    model = new ArrayList<>();
//                        for(int i = 0 ; i <= jsonArray.length();i++){
//                                JSONObject GetPaket = jsonArray.getJSONObject(i);
//
//                                model.add(new GetPaket(
//                                        GetPaket.getString("nama_paket"),
//                                        GetPaket.getString("harga"),
//                                        GetPaket.getString("hasil_pengurangan")
//
//                                        ));
//                        }
//                    adaptor = new Adaptor(getActivity().getApplicationContext(), model);
//                    listView.setAdapter(adaptor);
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//
//            }
//        }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                Toast.makeText(getActivity(), "Error: " + error.getMessage(), Toast.LENGTH_SHORT).show();
//            }
//        });
//        RequestQueue requestQueue = Volley.newRequestQueue(getActivity());
//        requestQueue.add(stringRequest);
//    }
}
