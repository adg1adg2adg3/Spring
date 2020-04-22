package com.smart.aSimpleAnnotation;



import java.lang.reflect.Method;

public class AnnotationTool {


    public static void main(String[] args) {

        Class<ForumService> aClass = ForumService.class;

        Method[] methods = aClass.getDeclaredMethods();

        System.out.println(methods.length);

        for (Method method:methods){

            MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
            if (annotation != null){

                if (annotation.value()){
                    System.out.println(method.getName() + "()需要测试");
                }else {
                    System.out.println(method.getName() + "()不需要测试");
                }
            }
        }
    }
}
