package JavaRflectDemo;

import java.lang.reflect.Field;

public class FieldsDemo {
    
    public static void main(String[] args) throws Exception {
        Class aClass = Class.forName("JavaRflectDemo.Student");

        Field[] fields = aClass.getFields();
        for(Field field:fields){
            System.out.println(field);
        }
    }
    
}
