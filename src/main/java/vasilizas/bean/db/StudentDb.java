package vasilizas.bean.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

@Data
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDb extends MyAbstractEntity {

    private List<Group> groups = new ArrayList<>();
    private List<Marks> grade = new LinkedList<>();

    public StudentDb(Integer id, String name, String login, String password, int age) {
        super(id, name, login, password, age);
    }

    public StudentDb(Integer id, String name, String login, String password, int age, List<Group> groups, List<Marks> grade) {
        super(id, name, login, password, age);
        this.groups = groups;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return " Student name = " + getName() + '\'' +
                " , id = " + getId() +
                ", login = " + getLogin() + '\'' +
                ", password =  " + getPassword() + '\'' +
                ", age = " + getAge() +
                ", marks = " + grade + '\'' +
                ", group = " + groups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        StudentDb studentDb = (StudentDb) o;
        return Objects.equals(groups, studentDb.groups) && Objects.equals(grade, studentDb.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), groups, grade);
    }
}