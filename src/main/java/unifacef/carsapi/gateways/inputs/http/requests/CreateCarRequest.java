package unifacef.carsapi.gateways.inputs.http.requests;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;
import unifacef.carsapi.domains.Car;

@Data
@EqualsAndHashCode(callSuper = true)
public class CreateCarRequest extends CarRequest {
	
	private static final long serialVersionUID = -6349644718099330841L;
	
	@NotNull(message = "{required.field}")
	private String board;
	
	
	public Car toDomain() {
		return Car.builder()
			.board(this.board)	
			.brand(super.getBrand())
			.model(super.getModel())
			.color(super.getColor())
			.year(super.getYear())
			.typeCar(super.getTypeCar())
			.tankStatus(super.getTankStatus())	
			.availability(super.getAvailability())	
			.build();		
		
		}

	}


