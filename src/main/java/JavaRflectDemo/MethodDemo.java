package JavaRflectDemo;


import java.lang.reflect.Method;

public class MethodDemo {

    public static void main(String[] args) throws Exception {
        Class aClass = Class.forName("JavaRflectDemo.Student");
        
        System.out.println("****获取所有的共有方法*****");
        Method[] methods = aClass.getMethods();
        System.out.println(methods.length);
        for(Method method:methods){
            System.out.println(method);
        }

        System.out.println("****获取所有的方法,包含私有的*****");
        methods = aClass.getDeclaredMethods();
        System.out.println(methods.length);
        for(Method method:methods){
            System.out.println(method);
        }

        System.out.println("****获取show1()方法*****");
        Method method = aClass.getMethod("show1", String.class);
        System.out.println(method);
        Object o = aClass.getConstructor().newInstance();
        method.invoke(o,"牛得很");

        System.out.println("***************获取私有的show4()方法******************");
        method = aClass.getDeclaredMethod("show4", int.class);
        System.out.println(method);
        method.setAccessible(true);//解除私有限定
        Object result = method.invoke(o, 20);//需要两个参数，一个是要调用的对象（获取有反射），一个是实参
        System.out.println("返回值：" + result);

    }

}
