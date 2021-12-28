package unifacef.carsapi.gateways.outputs;

import unifacef.carsapi.domains.Car;


public interface LocationGateway {
	
	void send(Car car);

}
