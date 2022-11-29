package alex.example.a08_retrofit.conexiones;

import java.util.ArrayList;

import alex.example.a08_retrofit.constantes.Constante;
import alex.example.a08_retrofit.modelos.Album;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;

public interface ApiConexiones {
    //que tiop de peticion tiene que hacer (GET) y
    @GET("/album")
    Call <ArrayList<Album>> getAlbums();


}
