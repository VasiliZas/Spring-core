package vasilizas.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import vasilizas.bean.StudentDb;
import vasilizas.qualifiers.CustomStringQualifier;

@Configuration
public class StudentConfig {

//    @CustomStringQualifier(name = "Ahmed")
    @Bean
    public StudentDb ahmed() {
        StudentDb ahmed = new StudentDb();
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
