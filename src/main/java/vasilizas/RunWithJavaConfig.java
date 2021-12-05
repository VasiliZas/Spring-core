package vasilizas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import vasilizas.bean.Group;
import vasilizas.bean.Salary;
import vasilizas.bean.StudentDb;
import vasilizas.bean.TeacherDb;
import vasilizas.bean.Themes;

public class RunWithJavaConfig {
    private static final Logger log = LoggerFactory.getLogger("!!!! Spring : ");

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext("vasilizas");
        context.registerShutdownHook();

        StudentDb ahmed =  context.getBean("ahmed", StudentDb.class);
        log.info("Student info: {}", ahmed);

        StudentDb ivan =  context.getBean("ivan", StudentDb.class);
        log.info("Student info: {}", ivan);

        TeacherDb thomas =  context.getBean("thomas", TeacherDb.class);
        log.info("Teacher info: {}", thomas);

        Salary salary = context.getBean("salary", Salary.class);
        log.info("Salary info: {}", salary);

        Group group = context.getBean("group", Group.class);
        log.info("Group info: {}", group);

        Themes themes = context.getBean("themes", Themes.class);
        log.info("Theme info: {}", themes);
    }
}
