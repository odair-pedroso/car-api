package unifacef.carsapi.gateways.outputs.http.resources;

import lombok.Data;
import unifacef.carsapi.domains.Car;
import unifacef.carsapi.domains.TankStatus;
import unifacef.carsapi.domains.TypeCar;

@Data
public class CarResource {
	
	private String brand;
	private String model;
	private String color;
	private String year;	
	private TypeCar typeCar;
	private TankStatus tankStatus;
	private Boolean availability;
	
	public CarResource(final Car car) {
		this.brand = car.getBrand();
		this.model = car.getModel();
		this.color = car.getColor();
		this.year = car.getYear();
		this.typeCar = car.getTypeCar();
		this.tankStatus = car.getTankStatus();
		this.availability = car.getAvailability();
		
	}

}
