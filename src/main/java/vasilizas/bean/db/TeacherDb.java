package vasilizas.bean.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

@Data
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TeacherDb extends MyAbstractEntity {

    public TeacherDb(Integer id, String name, String login, String password, int age, Group group, List<Salary> salary) {
        super(id, name, login, password, age);
        this.group = group;
        this.salary = salary;
    }

    public TeacherDb(Integer id, String name, String login, String password, int age, List<Salary> salary) {
        super(id, name, login, password, age);
        this.salary = salary;
    }

    private Group group;
    private List<Salary> salary = new LinkedList<>();

    public TeacherDb withId(int id) {
        setId(id);
        return this;
    }

    public TeacherDb withAge(Integer age) {
        setAge(age);
        return this;
    }

    public TeacherDb withName(String name) {
        setName(name);
        return this;
    }

    public TeacherDb withLogin(String login) {
        setLogin(login);
        return this;
    }

    public TeacherDb withPassword(String password) {
        setPassword(password);
        return this;
    }

    public TeacherDb addSalary(Salary salarys) {
        if (salary != null) {
            salary.add(salarys);
        }
        return this;
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
}
