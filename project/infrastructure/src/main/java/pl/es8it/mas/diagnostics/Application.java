package pl.es8it.mas.diagnostics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "pl.es8it.mas")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}