package assignment3;

import java.lang.annotation.*;

/**
 * 注解: 拦阻方法在主日执行
 * <a href="mailto:nathanael4ever@gmail.com">Nathanael Yang</a> 4/20/2016 1:09 PM
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface NotOnSunday {

}
