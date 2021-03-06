package vasilizas.qualifiers;

import org.springframework.beans.factory.annotation.Qualifier;
import vasilizas.bean.Salary;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
public @interface CustomClassQualifier {
    Class<Salary> clazz();
}
