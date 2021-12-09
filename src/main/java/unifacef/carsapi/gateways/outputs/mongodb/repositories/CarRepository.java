package unifacef.carsapi.gateways.outputs.mongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarRepository extends MongoRepository<CarDocument, String> {

}
