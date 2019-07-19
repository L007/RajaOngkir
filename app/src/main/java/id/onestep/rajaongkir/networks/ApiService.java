package id.onestep.rajaongkir.networks;



import id.onestep.rajaongkir.BuildConfig;
import id.onestep.rajaongkir.models.city_models.CityResponse;
import id.onestep.rajaongkir.models.cost_models.CostResponse;
import id.onestep.rajaongkir.models.province_models.ProvinceResponse;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {
    @GET("province")
    Call<ProvinceResponse> getProvince(@Query("key") String key);

    @GET("city")
    Call<CityResponse> getCity(@Query("key") String key, @Query("province") String province);

    @FormUrlEncoded
    @Headers("key: "+ BuildConfig.key)
    @POST("cost")
    Call<CostResponse> getCost(@Field("origin") String origin,
                               @Field("destination") String destination,
                               @Field("weight") String weight,
                               @Field("courier") String courier
                               );
//    @GET("movie/popular")
//    Call <MovieResponse> getMovie(@Query(("api_key")) String api_key);
//
//    @GET("movie/{category}")
//    Call <MovieResponse> getMovieCategory(@Path("category") String category, @Query(("api_key")) String api_key);
//
////    @GET("movie/{movie_id}?api_key="+Const.API_KEY)
////    Call<MovieDetailResponse> getDetail(@Path("movie_id") int movie_id);
//
//    @GET("search/movie?language=en-US")
//    Call<MovieResponse> getSearchMovie(@Query("query") String query, @Query(("api_key")) String api_key);



//    @GET("/posts/{id_post}/comments")
//    Call <List<Comment>> getComment(@Path("id_post") int id_post);
}
