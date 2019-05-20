package com.example.cncarroyo.consumirapiimagen;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by cncarroyo on 20-05-2019.
 */

public interface RequestInterface {

    @GET("cars_list.json")
    Call<List<CarsModel>> getCarsJson();

}
