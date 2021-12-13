package unifacef.carsapi.gateways.outputs.mongodb.documents;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;
import unifacef.carsapi.domains.Car;
import unifacef.carsapi.domains.TankStatus;
import unifacef.carsapi.domains.TypeCar;

@Data
@NoArgsConstructor
@Document("cars")
public class CarDocument {
	
	@Id
	private String id;
	private String board;
	private String brand;
	private String model;
	private String color;
	private String year;	
	private TypeCar typeCar;
	private TankStatus tankStatus;
	private Boolean availability;
	private LocalDateTime createdDate;
	@LastModifiedDate
	private LocalDateTime lastModifieldDate;
	
	
	public CarDocument(final Car car) {
		this.id = car.getId();
		this.board = car.getBoard();
		this.brand = car.getBrand();
		this.model = car.getModel();
		this.color = car.getColor();
		this.year = car.getYear();
		this.typeCar = car.getTypeCar();
		this.tankStatus = car.getTankStatus();
		this.availability = car.getAvailability();
		this.createdDate = car.getCreatedDate();
		this.lastModifieldDate = car.getLastModifieldDate();
		
		
	}
	
	public Car toDomain() {
		return Car.builder()
			.id(this.id)	
			.board(this.board)
			.brand(this.brand)
			.model(this.model)
			.color(this.color)
			.year(this.year)
			.typeCar(this.typeCar)
			.tankStatus(this.tankStatus)
			.availability(this.availability)
			.createdDate(this.createdDate)
			.lastModifieldDate(this.lastModifieldDate)
			.build();		
		
	}
	

}
