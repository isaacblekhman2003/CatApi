package com.example.catapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Retrofit retrofit = new Retrofit.Builder().baseUrl(Catservice.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        Catservice catservice = retrofit.create(Catservice.class);
        imageView = findViewById(R.id.imageView);

        button = findViewById(R.id.button);
button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Call<List<Cat>> catThing = catservice.getRandomImage("search");
        catThing.enqueue(new Callback<List<Cat>>() {
            @Override
            public void onResponse(Call<List<Cat>> call, Response<List<Cat>> response) {

                List<Cat> cat = response.body();

                Picasso.get().load(cat.get(0).getUrl()).into(imageView);

            }

            @Override
            public void onFailure(Call<List<Cat>> call, Throwable t) {
                Log.d("O NO PROBLEM", "onFailure: THERE BE RESPONSE FAILURE ");
            }
        });
    }

});







    }
}
