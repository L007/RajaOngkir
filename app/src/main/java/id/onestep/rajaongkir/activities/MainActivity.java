package id.onestep.rajaongkir.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import id.onestep.rajaongkir.R;
import id.onestep.rajaongkir.models.cost_models.CostResponse;
import id.onestep.rajaongkir.networks.ApiService;
import id.onestep.rajaongkir.networks.UtilsApi;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ApiService apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apiService = UtilsApi.getApiService();
        getCost();

    }

    public void getCost(){
        Call<CostResponse> call = apiService.getCost("17","144","200","jne");
        call.enqueue(new Callback<CostResponse>() {
            @Override
            public void onResponse(Call<CostResponse> call, Response<CostResponse> response) {
                Log.d("response",response.body().getRajaongkir().getResults().toString());
            }

            @Override
            public void onFailure(Call<CostResponse> call, Throwable t) {

            }
        });
    }
}
