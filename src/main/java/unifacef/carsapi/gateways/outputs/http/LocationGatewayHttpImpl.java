package unifacef.carsapi.gateways.outputs.http;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import unifacef.carsapi.domains.Car;
import unifacef.carsapi.gateways.outputs.LocationGateway;
import unifacef.carsapi.gateways.outputs.http.resources.CarResource;

@Slf4j
@Component
@RequiredArgsConstructor
public class LocationGatewayHttpImpl implements LocationGateway {
	
	private final LocationFeignIntegration locationFeignIntegration;	
	
	
	@Override
	public void send(final Car car) {
		log.info("Sending car to Location. Car board: {}", car.getBoard());
		CarResource carResource = new CarResource(car);
		locationFeignIntegration.send(car.getBoard(), carResource);
		
	}

}
