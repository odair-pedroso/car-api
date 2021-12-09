package unifacef.carsapi.domains;


import java.time.LocalDateTime;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Car  {		
	
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
