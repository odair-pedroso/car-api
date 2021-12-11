package unifacef.carsapi.usecases;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import unifacef.carsapi.domains.Car;
import unifacef.carsapi.gateways.outputs.CarDataGateway;

@Slf4j
@Component
@RequiredArgsConstructor
public class FindCars {
	
	private final CarDataGateway carDataGateway;
	
	public Page<Car> execute (final Pageable pageable ) {
		log.info("Find cars. Page: {}, Size: {}", pageable.getPageNumber(), pageable.getPageSize());
		return carDataGateway.findByPage(pageable);
	}

}
