package JavaRflectDemo;

public class FanShe {
    
    public static void main(String[] args) throws ClassNotFoundException {
        // 第一种方式获取Class对象
        Student student = new Student();
        Class studentClass = student.getClass();
        System.out.println(studentClass.getName());

        // 第二种方式获取Class
        Class studentClass2 = Student.class;
        System.out.println(studentClass2.getName());
        System.out.println(studentClass2==studentClass);

        // 第三种方式获取
        Class studentClass3 = Class.forName("JavaRflectDemo.Student");
        System.out.println(studentClass3.getName());
        System.out.println(studentClass2==studentClass3);

    }
    
}
