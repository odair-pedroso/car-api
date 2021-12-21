package unifacef.carsapi.configurations.ff4j;

import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "org.ff4j.aop")
public class FF4JConfiguration extends SpringBootServletInitializer {

}
