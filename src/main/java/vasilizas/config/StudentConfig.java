package vasilizas.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import vasilizas.bean.Marks;
import vasilizas.bean.StudentDb;
import vasilizas.qualifiers.CustomStringQualifier;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Configuration
public class StudentConfig {

@CustomStringQualifier(name = "ahmedMarks")
    @Bean
public Marks marks(){
        Marks marks = new Marks();
        marks.setId(9);
        marks.setGrade(List.of(55,89,100));
        return marks;
    }

    @CustomStringQualifier( name = "ahmed")
    @Bean
    public List<Marks> ahmedMarks(@CustomStringQualifier( name = "ahmedMarks") Marks marks) {
       List<Marks> ahmedMarks = List.of(marks());
        return ahmedMarks;
    }

//    @CustomStringQualifier(name = "Ahmed")
    @Bean
    public StudentDb ahmed(@CustomStringQualifier(name = "ahmed") List<Marks> marks) {
        StudentDb ahmed = new StudentDb();
        ahmed.setGrade(marks);
        ahmed.setName("Ahmed");
        ahmed.setAge(87);
        ahmed.setId(12);
        ahmed.setPassword("dfgh");
        ahmed.setLogin("rty");
        return ahmed;
    }

    @Bean
    public StudentDb ivan() {
        StudentDb ivan = new StudentDb();
        ivan.setName("Ivan");
        ivan.setAge(77);
        ivan.setId(11);
        ivan.setPassword("ivan");
        ivan.setLogin("IVAN");
        return ivan;
    }
}
