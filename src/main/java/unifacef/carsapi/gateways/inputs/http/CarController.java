package unifacef.carsapi.gateways.inputs.http;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import unifacef.carsapi.gateways.inputs.http.responses.CarResponse;
import unifacef.carsapi.gateways.inputs.http.responses.ListResponse;
import unifacef.carsapi.usecases.FindCars;

@Slf4j
@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/cars")
public class CarController {
	
	private final FindCars findCars;
	
	public ListResponse<CarResponse> findByPage (@RequestParam(defaultValue = "0") final Integer page,
            @RequestParam(defaultValue = "20") final Integer size){
				return null;
		
	}

}
