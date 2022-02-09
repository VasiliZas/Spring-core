package vasilizas.bean.db;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@Data
@Setter
@NoArgsConstructor
public class Marks {
    private Integer id;
    private List<Integer> grade;

    @Override
    public String toString() {
        return " grade = " + grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Marks marks = (Marks) o;
        return Objects.equals(id, marks.id) && Objects.equals(grade, marks.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, grade);
    }
}
