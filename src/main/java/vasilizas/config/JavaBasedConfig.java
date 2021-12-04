package vasilizas.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import vasilizas.bean.Group;
import vasilizas.bean.Salary;
import vasilizas.bean.StudentDb;
import vasilizas.bean.TeacherDb;
import vasilizas.bean.Themes;

import java.math.BigDecimal;

@Configuration
public class JavaBasedConfig {
    @Bean
    public Group group() {
        Group group = new Group();
        group.setId(1);
        group.setName("Second");
        group.setThem(null);
        return group;
    }

    @Bean
    public Salary salary() {
        Salary salary = new Salary();
        salary.setId(1);
        salary.setSalary(BigDecimal.valueOf(5780));
        return salary;
    }

    @Bean
    public StudentDb ahmed() {
        StudentDb ahmed = new StudentDb();
        ahmed.setAge(87);
        ahmed.setId(12);
        ahmed.setPassword("dfgh");
        ahmed.setLogin("rty");
        return ahmed;
    }

    @Bean
    public StudentDb ivan() {
        StudentDb ivan = new StudentDb();
        ivan.setAge(77);
        ivan.setId(11);
        ivan.setPassword("ivan");
        ivan.setLogin("IVAN");
        return ivan;
    }

    @Bean
    public Themes themes() {
        Themes themes = new Themes();
        themes.setId(1);
        themes.setThemegroup("Running");
        themes.setIdgroup(1);
        themes.setGroup(null);
        return themes;
    }

    @Bean
    public TeacherDb thomas() {
        TeacherDb thomas = new TeacherDb();
        thomas.setGroup(null);
        thomas.setAge(56);
        thomas.setLogin("Login");
        thomas.setPassword("qwerty");
        thomas.setSalary(null);
        thomas.setGroup(null);
        return thomas;
    }
}
