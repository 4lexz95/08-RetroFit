package alex.example.a08_retrofit.conexiones;

import alex.example.a08_retrofit.constantes.Constante;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class retrofitObject {
    public static Retrofit getConexion(){
        return new Retrofit.Builder()
                .baseUrl(Constante.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
