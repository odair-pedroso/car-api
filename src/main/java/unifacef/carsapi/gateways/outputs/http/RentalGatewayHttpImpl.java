package unifacef.carsapi.gateways.outputs.http;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import unifacef.carsapi.domains.Car;
import unifacef.carsapi.gateways.outputs.RentalGateway;
import unifacef.carsapi.gateways.outputs.http.resources.CarResource;

@Slf4j
@Component
@RequiredArgsConstructor
public class RentalGatewayHttpImpl implements RentalGateway {
	
	private final RentalFeignIntegration rentalFeignIntegration;	
	
	
	@Override
	public void send(final Car car) {
		log.info("Sending car to Rental. Car board: {}", car.getBoard());
		CarResource carResource = new CarResource(car);
		rentalFeignIntegration.send(car.getBoard(), carResource);
		
	}

}
