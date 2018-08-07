/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

/**
 *
 * @author Yudistyra_OP355
 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface TesterInfoAnnotation {
    public enum Priority {
        LOW, MEDIUM, HIGH
    }
    
    Priority priority() default Priority.MEDIUM;
    
    String[] tags() default "";
    
    String createdBy() default "Yudis";
    
    String lastModified() default "07/08/2018";
}
