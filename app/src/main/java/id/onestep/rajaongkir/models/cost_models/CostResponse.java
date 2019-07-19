package id.onestep.rajaongkir.models.cost_models;


import com.google.gson.annotations.SerializedName;


public class CostResponse{

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
			"CostResponse{" + 
			"rajaongkir = '" + rajaongkir + '\'' + 
			"}";
		}
}