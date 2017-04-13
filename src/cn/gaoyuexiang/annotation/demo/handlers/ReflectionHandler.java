package cn.gaoyuexiang.annotation.demo.handlers;

import cn.gaoyuexiang.annotation.demo.annotations.ClassNamePrinter;
import cn.gaoyuexiang.annotation.demo.clazzes.Hello;

import java.lang.annotation.Annotation;

public class ReflectionHandler {

  public void handle(Class clazz) {
    try {
      Annotation annotation = clazz.getAnnotation(ClassNamePrinter.class);
      System.out.printf("Class is %s", clazz.getName());
    } catch (NullPointerException e) {
      System.out.println("No ClassNamePrinter annotation");
    }

  }

}
