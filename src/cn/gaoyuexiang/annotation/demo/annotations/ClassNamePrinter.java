package cn.gaoyuexiang.annotation.demo.annotations;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ClassNamePrinter {
}
