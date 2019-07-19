package id.onestep.rajaongkir.networks;

public class UtilsApi {
    private static final String BASE_URL_API="https://api.rajaongkir.com/starter/";
    public static ApiService getApiService(){
        return ApiClient.getClient(BASE_URL_API).create(ApiService.class);
    }
}
