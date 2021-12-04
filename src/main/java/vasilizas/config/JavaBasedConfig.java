package vasilizas.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import vasilizas.bean.Group;
import vasilizas.bean.Salary;
import vasilizas.bean.StudentDb;
import vasilizas.bean.Themes;
import vasilizas.qualifiers.CustomStringQualifier;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@Configuration
public class JavaBasedConfig {
    @Bean
    public Group group(@CustomStringQualifier(name = "sergio") StudentDb studentDb, Themes themes) {
        List<Themes> theme = List.of(themes);
        Set<StudentDb> studentDbs = Set.of(studentDb);
        Group group = new Group();
        group.setStudents(studentDbs);
        group.setId(1);
        group.setName("Second");
        group.setThem(theme);
        return group;
    }

    @Bean
    public Salary salary() {
        Salary salary = new Salary();
        salary.setId(1);
        salary.setSalary(BigDecimal.valueOf(5780));
        return salary;
    }

    @CustomStringQualifier(name = "sergio")
    @Bean
    public StudentDb sergio() {
        StudentDb sergio = new StudentDb();
        sergio.setName("Serg");
        sergio.setAge(87);
        sergio.setId(120);
        sergio.setPassword("serg");
        sergio.setLogin("Serg");
        return sergio;
    }
//
//    @Bean
//    public StudentDb ivan() {
//        StudentDb ivan = new StudentDb();
//        ivan.setAge(77);
//        ivan.setId(11);
//        ivan.setPassword("ivan");
//        ivan.setLogin("IVAN");
//        return ivan;
//    }

    @Bean
    public Themes themes() {
        Themes themes = new Themes();
        themes.setId(1);
        themes.setThemegroup("Running");
        themes.setIdgroup(1);
        themes.setGroup(null);
        return themes;
    }

//    @Bean
//    public TeacherDb thomas() {
//        TeacherDb thomas = new TeacherDb();
//        thomas.setGroup(null);
//        thomas.setAge(56);
//        thomas.setLogin("Login");
//        thomas.setPassword("qwerty");
//        thomas.setSalary(null);
//        thomas.setGroup(null);
//        return thomas;
//    }
}
