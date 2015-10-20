package cc.thiago.my.pet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan("cc.thiago.my.pet")
public class MypetApplication {

    public static void main(String[] args) {
        SpringApplication.run(MypetApplication.class, args);
    }
}
