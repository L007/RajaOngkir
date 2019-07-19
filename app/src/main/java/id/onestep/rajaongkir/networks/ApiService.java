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

}
