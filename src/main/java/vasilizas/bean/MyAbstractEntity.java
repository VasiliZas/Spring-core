package vasilizas.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MyAbstractEntity {

    private Integer id;
    private String name;
    private String login;
    private String password;
    private int age;

}
