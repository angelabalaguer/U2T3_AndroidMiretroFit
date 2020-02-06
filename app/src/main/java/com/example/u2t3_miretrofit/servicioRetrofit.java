package com.example.u2t3_miretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface servicioRetrofit {
    @GET("verano/clientes.php")//indicamos el metodo y el endpoint
    Call<List<Cliente>> getUsersGet();//Recuerda que debes colocar como recibiremos esos datos,en este caso una lista de objs
}
