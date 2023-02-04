package com.example.MyDataSource;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/*datasource:
    driver: com.mysql.jdbc.Driver
    username: root
    password: mysql*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@ConfigurationProperties(prefix = "datasource")
public class My {

    private String driver;
    private String username;
    private String mysql;


}
