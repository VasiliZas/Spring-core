package vasilizas.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

@Data
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TeacherDb extends MyAbstractEntity {
    private final Logger log = LoggerFactory.getLogger(TeacherDb.class);
    private Group group;
    private List<Salary> salary = new LinkedList<>();

    public TeacherDb(Integer id, String name, String login, String password, int age, Group group, List<Salary> salary) {
        super(id, name, login, password, age);
        this.group = group;
        this.salary = salary;
    }

    public TeacherDb(Integer id, String name, String login, String password, int age, List<Salary> salary) {
        super(id, name, login, password, age);
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TeacherDb teacherDb = (TeacherDb) o;
        return Objects.equals(group, teacherDb.group) && Objects.equals(salary, teacherDb.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), group, salary);
    }

    @Override
    public String toString() {
        return "Teacher name = " + getName() +
                ", id = " + getId() +
                ", login = " + getLogin() +
                ", password = " + getPassword() +
                ", age = " + getAge() +
                ", salary = " + salary +
                ", group = " + group;
    }

    @PostConstruct
    public void start() {
        log.info("!!!!!! Teacher has been started. !!!!!");
        log.info("!!!!!! Teacher " + this.getName() + " has been started. !!!!!");
    }


    @PreDestroy
    public String finish() {
        String str = "!!!!! Teacher " + this.getName() + "  has been finished. !!!!!!!";
        log.info(str);
        return str;
    }
}
