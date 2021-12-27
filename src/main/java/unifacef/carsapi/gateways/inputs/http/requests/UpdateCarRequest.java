package unifacef.carsapi.gateways.inputs.http.requests;

import unifacef.carsapi.domains.Car;

public class UpdateCarRequest extends CarRequest {
	
	private static final long serialVersionUID = -1414936822726798773L;
	
	public Car toDomain(final String board) {
		return Car.builder()
			.board(board)	
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
