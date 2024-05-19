package com.example.lab_10
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

object RetrofitClient {
    fun getInstance(): Retrofit {
        val mHttpLoggingInterceptor = HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BODY)

        val mOkHttpClient = OkHttpClient
            .Builder()
            .addInterceptor(mHttpLoggingInterceptor)
            .build()

        val retrofit: Retrofit = retrofit2.Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com")
            .addConverterFactory (GsonConverterFactory.create())
            .client(mOkHttpClient)
            .build()

        return retrofit
    }
}