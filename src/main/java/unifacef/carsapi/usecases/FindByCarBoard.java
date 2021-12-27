package unifacef.carsapi.usecases;

import org.springframework.stereotype.Component;
import static unifacef.carsapi.exceptions.MessageKey.CAR_NOT_FOUND;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import unifacef.carsapi.domains.Car;
import unifacef.carsapi.exceptions.NotFoundException;
import unifacef.carsapi.gateways.outputs.CarDataGateway;
import unifacef.carsapi.utils.MessageUtils;

@Slf4j
@Component
@RequiredArgsConstructor
public class FindByCarBoard {
	
	private final CarDataGateway carDataGateway;
	private final MessageUtils messageUtils;
	
	public Car execute(final String board) {
		log.info("Find board. Car board: {}", board);
		return carDataGateway.findByBoard(board).orElseThrow(
			() -> new NotFoundException(messageUtils.getMessage(CAR_NOT_FOUND, board)));		
		
	}
}
