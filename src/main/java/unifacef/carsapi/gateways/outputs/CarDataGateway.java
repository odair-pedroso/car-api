package unifacef.carsapi.gateways.outputs;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import unifacef.carsapi.domains.Car;

public interface CarDataGateway {
	
	Car save (Car car);
	
	Optional<Car> findByBoard(String board);
	
	Page<Car> findByPage(Pageable pageable);

}
