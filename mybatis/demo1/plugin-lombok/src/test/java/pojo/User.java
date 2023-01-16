package pojo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class User {

    private int id;
    private String name;
    private String password;
}
