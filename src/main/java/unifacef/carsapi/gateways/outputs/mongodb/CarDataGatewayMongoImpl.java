package unifacef.carsapi.gateways.outputs.mongodb;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import unifacef.carsapi.domains.Car;
import unifacef.carsapi.gateways.outputs.CarDataGateway;
import unifacef.carsapi.gateways.outputs.mongodb.documents.CarDocument;
import unifacef.carsapi.gateways.outputs.mongodb.repositories.CarRepository;

@Component
@RequiredArgsConstructor
public class CarDataGatewayMongoImpl implements CarDataGateway {
	
	private final CarRepository carRepository;	

	@Override
	public Car save(final Car car) {
		if(Objects.isNull(car.getCreatedDate())) {
			car.setCreatedDate(LocalDateTime.now());
		}
		return carRepository.save(new CarDocument(car)).toDomain();
	}



	
	
	@Override
	public Page<Car> findByPage(final Pageable pageable) {		
		return carRepository.findAll(pageable).map(CarDocument::toDomain);
	}





	@Override
	public Optional<Car> findByBoard(String board) {
		// TODO Auto-generated method stub
		return null;
	}


}
