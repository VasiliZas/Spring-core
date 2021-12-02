package vasilizas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import vasilizas.bean.db.Salary;
import vasilizas.bean.db.StudentDb;
import vasilizas.bean.db.TeacherDb;

public class App {
    private static final Logger log = LoggerFactory.getLogger("!!!! Spring = ");

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        StudentDb bakke = (StudentDb) context.getBean("bakke");
        log.info("Student {}", bakke);
        TeacherDb vasili = (TeacherDb) context.getBean("vasili");
        log.info("Teacher {}", vasili);
        Salary salary = context.getBean("salary", Salary.class);
        log.info("Salary {}", salary);
    }
}