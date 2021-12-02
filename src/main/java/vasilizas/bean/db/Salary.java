package vasilizas.bean.db;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Objects;

@Data
@NoArgsConstructor
public class Salary {

    private int id;
    private BigDecimal salary;

    public Salary(int id, BigDecimal salary) {
        this.id = id;
        this.salary = salary;
    }

    public Salary withSalary(BigDecimal salary) {
        setSalary(salary);
        return this;
    }

    public Salary withId(Integer id) {
        setId(id);
        return this;
    }

    @Override
    public String toString() {
        return " " + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Salary salary1 = (Salary) o;
        return id == salary1.id && Objects.equals(salary, salary1.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, salary);
    }
}
