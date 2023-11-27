import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import java.util.Properties;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@ComponentScan(basePackages = {"com.msg.pre-orderBooking"})
public class PreOrderBookingApp extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(PreOrderBookingApp.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        builder.sources(PreOrderBookingApp.class);
        builder.properties(getProperties());
        return builder;
    }

    private Properties getProperties() {
        Properties prop = new Properties();
        prop.put("spring.config.location", "optional:classpath:pre-orderBooking/");
        prop.put("spring.config.additional-location", "optional:classpath:/application.yaml");
        return prop;
    }
}
