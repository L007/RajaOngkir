package id.onestep.rajaongkir.models.province_models;


import com.google.gson.annotations.SerializedName;


public class ProvinceResponse{

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
			"ProvinceResponse{" + 
			"rajaongkir = '" + rajaongkir + '\'' + 
			"}";
		}
}