package pluralsight.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EnableConfigServer
public class PluralsightSpringcloudM2ConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(PluralsightSpringcloudM2ConfigserverApplication.class, args);
	}

}
