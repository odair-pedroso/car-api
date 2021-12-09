package unifacef.carsapi.gateways.outputs.mongodb;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import unifacef.carsapi.domains.Car;
import unifacef.carsapi.gateways.outputs.CarDataGateway;

@Component
@RequiredArgsConstructor
public class CarDataGatewayMongoImpl implements CarDataGateway {
	
	
	
	@Override
	public Car save(Car car) {		
		return null;
	}

	@Override
	public Optional<Car> findByBoard(String board) {		
		return null;
	}

	@Override
	public Page<Car> findByPage(Pageable pageable) {		
		return null;
	}

}
