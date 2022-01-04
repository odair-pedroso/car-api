package unifacef.carsapi.usecases;

import static unifacef.carsapi.exceptions.MessageKey.CAR_ALREADY_EXISTS;
import org.ff4j.FF4j;
import org.springframework.stereotype.Component;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import unifacef.carsapi.configurations.ff4j.Features;
import unifacef.carsapi.domains.Car;
import unifacef.carsapi.gateways.outputs.CarDataGateway;
import unifacef.carsapi.gateways.outputs.RentalGateway;
import unifacef.carsapi.utils.MessageUtils;

@Slf4j
@Component
@RequiredArgsConstructor
public class CreateCar {
	
	private final CarDataGateway carDataGateway;
	private final MessageUtils messageUtils;
	private final RentalGateway rentalGateway;
	private final FF4j ff4j;
	
	
	public Car execute (final Car car) {
		log.info("Create car. Car board: {}", car.getBoard());
		if(carDataGateway.findByBoard(car.getBoard()).isPresent()) {
			throw new IllegalArgumentException(messageUtils.getMessage(CAR_ALREADY_EXISTS, car.getBoard()));
			
		}
		
		Car saved = carDataGateway.save(car);
		if(ff4j.check(Features.SEND_TO_LOCATION.getKey())) {
			rentalGateway.send(saved);
		}
		
		return saved;		
	}
}
