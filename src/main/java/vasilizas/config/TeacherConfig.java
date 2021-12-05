package vasilizas.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import vasilizas.bean.Group;
import vasilizas.bean.Salary;
import vasilizas.bean.TeacherDb;
import vasilizas.qualifiers.CustomClassQualifier;

import java.math.BigDecimal;
import java.util.List;

@Import(JavaBasedConfig.class)
@PropertySource({"classpath:salary.properties"})
@Configuration
public class TeacherConfig {
    @Value("${bigSalary.id}")
    private int salaryId;
    @Value("${bigSalary.salary}")
    private BigDecimal salary;

    @CustomClassQualifier(clazz = Salary.class)
    @Bean
    public Salary bigSalary() {
        Salary bigSalary = new Salary();
        bigSalary.setSalary(salary);
        bigSalary.setId(salaryId);
        return bigSalary;
    }

    @Bean
    public TeacherDb thomas(@CustomClassQualifier(clazz = Salary.class) Salary salary, @Autowired Group group) {
        List<Salary> salaries = List.of(salary);
        TeacherDb thomas = new TeacherDb();
        thomas.setGroup(null);
        thomas.setAge(56);
        thomas.setLogin("Login");
        thomas.setPassword("qwerty");
        thomas.setSalary(salaries);
        thomas.setGroup(group);
        thomas.setId(1);
        thomas.setName("Thomas");
        return thomas;
    }
  }
