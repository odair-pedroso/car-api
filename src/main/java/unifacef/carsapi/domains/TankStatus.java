package unifacef.carsapi.domains;

public enum TankStatus {
	
	EMPTY("vazio"),
	ONE_QUARTER("1/4"),
	HALF("1/2"),
	THREE_QUARTERS("3/4"),
	FULL("cheio");
	
	private String description;
	
	TankStatus(String description){
		this.description = description;
		
	}
	
	public String getDescription() {
		return description;
	}
	

}
