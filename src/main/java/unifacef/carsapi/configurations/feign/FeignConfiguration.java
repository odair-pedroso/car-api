package unifacef.carsapi.configurations.feign;

import feign.Retryer.Default;
import static java.util.concurrent.TimeUnit.MILLISECONDS;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import feign.Request;
import feign.Retryer;

@Configuration
@EnableFeignClients(basePackages = {"unifacef.carsapi.gateways.outputs.http"})
public class FeignConfiguration {
	
	@Value("${feign.connectionTimeout:60000}")
	private int feignConnectionTimeout;
	
	@Value("${feign.readTimeout:60000}")
	private int feignReadTimeout;
	
	@Bean
	public Retryer retry() {
		return new Default();
	}
	
	
	public Request.Options requestOptions(){		
		return new Request.Options(feignConnectionTimeout, MILLISECONDS, feignReadTimeout,MILLISECONDS,true);
	}

}
