package unifacef.carsapi.gateways.inputs.http;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import unifacef.carsapi.domains.Car;
import unifacef.carsapi.gateways.inputs.http.requests.CreateCarRequest;
import unifacef.carsapi.gateways.inputs.http.requests.UpdateCarRequest;
import unifacef.carsapi.gateways.inputs.http.responses.CarResponse;
import unifacef.carsapi.gateways.inputs.http.responses.ListResponse;
import unifacef.carsapi.usecases.CreateCar;
import unifacef.carsapi.usecases.FindByCarBoard;
import unifacef.carsapi.usecases.FindCars;
import unifacef.carsapi.usecases.UpdateCar;

@Slf4j
@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/cars")
public class CarController {
	
	private final FindCars findCars;
	private final FindByCarBoard findByCarBoard;
	private final UpdateCar updateCar;
	private final CreateCar createCar;	
	
	@PostMapping
	public CarResponse create(@RequestBody @Validated final CreateCarRequest request) {
		Car car = createCar.execute(request.toDomain());
		return new CarResponse(car);
		
	}
	
	
	@GetMapping
	public ListResponse<CarResponse> findByPage (@RequestParam(defaultValue = "0") final Integer page,
            @RequestParam(defaultValue = "20") final Integer size){
		Page<CarResponse> carPage = findCars.execute(PageRequest.of(page, size)).map(CarResponse::new);
				return new ListResponse<>(carPage);
		
	}
	
	@GetMapping(path = "/{board}")
	public CarResponse find (@PathVariable final String board) {
		Car car = findByCarBoard.execute(board);
		return new CarResponse(car);
		
	}
	
	@PutMapping(path = "/{board}")
	public CarResponse update (@PathVariable final String board,@RequestBody @Validated final UpdateCarRequest request) {
		Car car = updateCar.execute(request.toDomain(board));
		return new CarResponse(car);
		
		
		
	}

}
