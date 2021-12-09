package unifacef.carsapi.configurations.mongodb;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = {"unifacef.carsapi.gateways.outputs.mongodb"})
public class MongoDbConfiguration {}
