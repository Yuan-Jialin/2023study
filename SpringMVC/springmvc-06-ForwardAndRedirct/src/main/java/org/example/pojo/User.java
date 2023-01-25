package org.example.pojo;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.servlet.view.tiles3.SpringLocaleResolver;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private int age;
    private String name;

}
