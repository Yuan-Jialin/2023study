package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.test.autoconfigure.data.cassandra.DataCassandraTest;

/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/27 11:53
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    String msg;
    String name;
}
