package vasilizas.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import vasilizas.bean.Salary;
import vasilizas.bean.TeacherDb;

import java.math.BigDecimal;
import java.util.List;

@PropertySource({"classpath:salary.properties"})
@Configuration
public class TeacherConfig {
    @Value("${bigSalary.id}")
    private int salaryId;
    @Value("${bigSalary.salary}")
    private BigDecimal salary;

    @Bean
    public Salary bigSalary() {
        Salary bigSalary = new Salary();
        bigSalary.setSalary(salary);
        bigSalary.setId(salaryId);
        return bigSalary;
    }

    @Bean
    public TeacherDb thomas(Salary bigSalary) {
        List<Salary> salaries = List.of(bigSalary);
        TeacherDb thomas = new TeacherDb();
        thomas.setGroup(null);
        thomas.setAge(56);
        thomas.setLogin("Login");
        thomas.setPassword("qwerty");
        thomas.setSalary(salaries);
        thomas.setGroup(null);
        thomas.setId(1);
        thomas.setName("Thomas");
        return thomas;
    }
}
