package vasilizas.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import vasilizas.bean.TeacherDb;

@Configuration
public class TeacherConfig {
    @Bean
    public TeacherDb thomas() {
        TeacherDb thomas = new TeacherDb();
        thomas.setGroup(null);
        thomas.setAge(56);
        thomas.setLogin("Login");
        thomas.setPassword("qwerty");
        thomas.setSalary(null);
        thomas.setGroup(null);
        thomas.setId(1);
        thomas.setName("Thomas");
        return thomas;
    }
}
