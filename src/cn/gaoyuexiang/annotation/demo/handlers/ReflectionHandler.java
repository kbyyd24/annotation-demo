package cn.gaoyuexiang.annotation.demo.handlers;

import cn.gaoyuexiang.annotation.demo.annotations.ClassNamePrinter;
import cn.gaoyuexiang.annotation.demo.clazzes.Hello;

import java.lang.annotation.Annotation;

public class ReflectionHandler {

  public void handle(Class clazz) {
    try {
      Annotation annotation = clazz.getAnnotation(ClassNamePrinter.class);
      String clazzName = clazz.getSimpleName();
      if (annotation == null) {
        throw new NullPointerException(clazzName);
      }
      System.out.printf("Class is %s\n", clazzName);
    } catch (NullPointerException e) {
      System.out.printf("No ClassNamePrinter annotation for %s\n", e.getMessage());
    }

  }

}
