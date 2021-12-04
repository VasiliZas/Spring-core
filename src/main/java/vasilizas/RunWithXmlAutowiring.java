package vasilizas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import vasilizas.bean.Group;
import vasilizas.bean.Salary;
import vasilizas.bean.StudentDb;
import vasilizas.bean.Themes;

public class RunWithXmlAutowiring {
    private static final Logger log = LoggerFactory.getLogger("!!!! Spring : ");

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("myBeans.xml");
        context.registerShutdownHook();

        StudentDb bakke = (StudentDb) context.getBean("bakke");
        log.info("Student {}", bakke);
        StudentDb petr = (StudentDb) context.getBean("petr");
        log.info("Student {}", petr);
//        TeacherDb vasili = (TeacherDb) context.getBean("vasili");
//        log.info("Teacher {}", vasili);
        Salary salary = context.getBean("salary", Salary.class);
        log.info("Salary {}", salary);
        Group group = context.getBean("group", Group.class);
        log.info("Group {}", group);
        Themes themes = context.getBean("theme", Themes.class);
        log.info("Theme {}", themes);
    }
}
