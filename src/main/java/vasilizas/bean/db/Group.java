package vasilizas.bean.db;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Data
@NoArgsConstructor
public class Group implements Serializable {


    private TeacherDb teacherDb;
    private Integer id;
    private String name;
    private Set<StudentDb> students = new HashSet<>();
    private List<Themes> them = new LinkedList<>();

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", themes = " + them;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(id, group.id) && Objects.equals(name, group.name) && Objects.equals(students, group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, students);
    }
}