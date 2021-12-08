package unifacef.carsapi.domains;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(value = "cars")
public class Car implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	@Id
	private Long id;
	private String brand;
	private String model;
	private String color;
	private String year;
	private String board;
	private TypeCar typeCar;
	private TankStatus tankStatus;
	private String availability;
	private LocalDateTime createdDate;
	private LocalDateTime lastModifieldDate;	

}
