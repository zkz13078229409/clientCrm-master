package zkz.example.bangong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = {"zkz.example.bangong.mapper"})
public class bangongApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(bangongApplication2.class);
    }
}
