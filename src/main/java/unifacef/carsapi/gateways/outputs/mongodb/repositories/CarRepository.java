package unifacef.carsapi.gateways.outputs.mongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;


import unifacef.carsapi.gateways.outputs.mongodb.documents.CarDocument;


public interface CarRepository extends MongoRepository<CarDocument, String> {

}
