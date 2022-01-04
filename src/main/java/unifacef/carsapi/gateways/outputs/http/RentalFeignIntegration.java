package unifacef.carsapi.gateways.outputs.http;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import unifacef.carsapi.gateways.outputs.http.resources.CarResource;

@FeignClient(name = "rental", url = "${integration.rental.url}")
public interface RentalFeignIntegration {
	
	
	@PostMapping(path = "/api/v1/cars/{carBoard}", produces = APPLICATION_JSON_VALUE)
	void send (@PathVariable ("carBoard") final String carBoard, final CarResource carResource);

}
