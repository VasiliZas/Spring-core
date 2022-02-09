package vasilizas.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import vasilizas.bean.Group;
import vasilizas.bean.Salary;
import vasilizas.bean.StudentDb;
import vasilizas.bean.Themes;
import vasilizas.qualifiers.CustomStringQualifier;

import java.math.BigDecimal;
import java.util.Set;

@Configuration
public class JavaBasedConfig {
    @Bean
    //public Group group(@CustomStringQualifier(name = "sergio") StudentDb studentDb, Themes themes,) {
        public Group group(Set<StudentDb> students) {

        //Set<StudentDb> studentDbs = Set.of(studentDb);
        Group group = new Group();
        group.setStudents(students);
        group.setId(1);
        group.setName("Second");
       // group.setThem(themes);
        return group;
    }

//    @Bean
//    public Set<StudentDb> students(StudentDb sergio, StudentDb punGiMun) {
//        Set<StudentDb> students = new HashSet<>();
//        students.add(sergio);
//        students.add(punGiMun);
//        return students;
//    }

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

    @Bean
    public StudentDb punGiMun() {
        StudentDb punGiMun = new StudentDb();
        punGiMun.setAge(47);
        punGiMun.setId(13);
        punGiMun.setPassword("punGiMun");
        punGiMun.setLogin("punGiMun");
        punGiMun.setName("Pun Gi Mun");
        return punGiMun;
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
