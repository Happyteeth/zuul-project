package zuulproject.zuulproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringCloudApplication
public class ZuulProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulProjectApplication.class, args);
    }


    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }
}
