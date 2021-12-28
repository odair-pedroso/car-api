package unifacef.carsapi.usecases;

import org.ff4j.FF4j;
import org.springframework.stereotype.Component;
import static unifacef.carsapi.exceptions.MessageKey.CAR_NOT_FOUND;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import unifacef.carsapi.configurations.ff4j.Features;
import unifacef.carsapi.domains.Car;
import unifacef.carsapi.exceptions.NotFoundException;
import unifacef.carsapi.gateways.outputs.CarDataGateway;
import unifacef.carsapi.gateways.outputs.LocationGateway;
import unifacef.carsapi.utils.MessageUtils;

@Slf4j
@Component
@RequiredArgsConstructor
public class UpdateCar {
	
	private final CarDataGateway carDataGateway;
	private final LocationGateway locationGateway;
	private final MessageUtils messageUtils;
	private final FF4j ff4j;
	
	
	public Car execute (final Car car) {
		log.info("Update car. Car board: {}",car.getBoard());
		Car oldCar = carDataGateway.findByBoard(car.getBoard()).orElseThrow(() ->
			new NotFoundException(messageUtils.getMessage(CAR_NOT_FOUND, car.getBoard())));
		car.setCreatedDate(oldCar.getCreatedDate());
		
		Car saved = carDataGateway.save(car);
		if(ff4j.check(Features.SEND_TO_LOCATION.getKey())) {
		  locationGateway.send(saved);
		}		
		return saved;		
	}
}
