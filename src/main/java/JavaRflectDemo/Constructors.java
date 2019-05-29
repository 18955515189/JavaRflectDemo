package JavaRflectDemo;

import java.lang.reflect.Constructor;

public class Constructors {
    public static void main(String[] args) throws Exception {
        Class aClass = Class.forName("JavaRflectDemo.Student");
        Constructor[] constructorArray = aClass.getConstructors();
        for(Constructor constructor : constructorArray){
            System.out.println(constructor);
        }


        Constructor constructor = aClass.getConstructor(null);
        System.out.println("constructor = "+constructor);


        Object o = constructor.newInstance();
        System.out.println("o = "+o);
        Student student = (Student) o;
        System.out.println(student.toString());

    }
}
