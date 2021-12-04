package vasilizas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import vasilizas.bean.db.Group;
import vasilizas.bean.db.Salary;
import vasilizas.bean.db.StudentDb;
import vasilizas.bean.db.TeacherDb;
import vasilizas.bean.db.Themes;
import vasilizas.config.JavaBasedConfig;

public class RunWithJavaConfig {
    private static final Logger log = LoggerFactory.getLogger("!!!! Spring : ");

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(JavaBasedConfig.class);
        context.registerShutdownHook();

        StudentDb ahmed = (StudentDb) context.getBean("ahmed");
        log.info("Student {}", ahmed);

        StudentDb ivan = (StudentDb) context.getBean("ivan");
        log.info("Student {}", ivan);

        TeacherDb thomas = (TeacherDb) context.getBean("thomas");
        log.info("Teacher {}", thomas);

        Salary salary = context.getBean("salary", Salary.class);
        log.info("Salary {}", salary);

        Group group = context.getBean("group", Group.class);
        log.info("Group {}", group);

        Themes themes = context.getBean("themes", Themes.class);
        log.info("Theme {}", themes);

    }

}
