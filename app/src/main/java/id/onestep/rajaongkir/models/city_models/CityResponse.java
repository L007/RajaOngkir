package id.onestep.rajaongkir.models.city_models;


import com.google.gson.annotations.SerializedName;


public class CityResponse{

	@SerializedName("rajaongkir")
	private Rajaongkir rajaongkir;

	public void setRajaongkir(Rajaongkir rajaongkir){
		this.rajaongkir = rajaongkir;
	}

	public Rajaongkir getRajaongkir(){
		return rajaongkir;
	}

	@Override
 	public String toString(){
		return 
			"CityResponse{" + 
			"rajaongkir = '" + rajaongkir + '\'' + 
			"}";
		}
}