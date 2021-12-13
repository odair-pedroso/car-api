package unifacef.carsapi.gateways.inputs.http.responses;

import java.io.Serializable;
import java.time.LocalDateTime;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import unifacef.carsapi.domains.Car;
import unifacef.carsapi.domains.TankStatus;
import unifacef.carsapi.domains.TypeCar;

@Data
public class CarResponse implements Serializable {
	 
	private static final long serialVersionUID = 7720638133263136151L;
	
	@ApiModelProperty(position=0)
	private String id;
	
	@ApiModelProperty(position=1)
	private String board;
	
	@ApiModelProperty(position=2)
	private String brand;
	
	@ApiModelProperty(position=3)
	private String model;
	
	@ApiModelProperty(position=4)
	private String color;
	
	@ApiModelProperty(position=5)
	private String year;
	
	@ApiModelProperty(position=6)
	private TypeCar typeCar;
	
	@ApiModelProperty(position=7)
	private TankStatus tankStatus;
	
	@ApiModelProperty(position=8)
	private Boolean availability;
	
	@ApiModelProperty(position=9)
	private LocalDateTime createDate;
	
	@ApiModelProperty(position=10)
	private LocalDateTime lastModifiedDate;
	
	public CarResponse(final Car car) {
		this.id = car.getId();
		this.board = car.getBoard();
		this.brand = car.getBrand();
		this.model = car.getModel();
		this.color = car.getColor();
		this.year = car.getYear();
		this.typeCar = car.getTypeCar();
		this.tankStatus = car.getTankStatus();
		this.availability = car.getAvailability();
		this.createDate = car.getCreatedDate();
		this.lastModifiedDate = car.getLastModifieldDate();
		
		
	}

}
