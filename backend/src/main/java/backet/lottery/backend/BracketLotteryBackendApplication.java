package backet.lottery.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class BracketLotteryBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BracketLotteryBackendApplication.class, args);
	}

}
