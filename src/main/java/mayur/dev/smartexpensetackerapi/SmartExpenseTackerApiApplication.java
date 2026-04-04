package mayur.dev.smartexpensetackerapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmartExpenseTackerApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartExpenseTackerApiApplication.class, args);
    }

//    @Bean
//    CommandLineRunner checkEnv(Environment env) {
//        return args -> {
//            System.out.println("DB URL loaded: " + (env.getProperty("spring.datasource.url") != null ? "✅" : "❌"));
////            System.out.println("JWT Secret loaded: " + (env.getProperty("jwt.secret") != null ? "✅" : "❌"));
//        };
//    }

}
