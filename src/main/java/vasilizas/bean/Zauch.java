package vasilizas.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
@Setter
public class Zauch extends TeacherDb{
    public Zauch(Group group, List<Salary> salary) {
        super(group, salary);
    }

    public Zauch() {
    }

    public Zauch(Integer id, String name, String login, String password, int age, Group group, List<Salary> salary) {
        super(id, name, login, password, age, group, salary);
    }

    public Zauch(Integer id, String name, String login, String password, int age, List<Salary> salary) {
        super(id, name, login, password, age, salary);
    }
}
