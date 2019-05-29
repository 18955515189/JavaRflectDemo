package JavaRflectDemo;

public class Student {

    private String name ;
    private int age;
    private String sex;
    public String pubName;
    public int pubAge;
    public String pubSex;

    public String getPubName() {
        return pubName;
    }

    public void setPubName(String pubName) {
        this.pubName = pubName;
    }

    public int getPubAge() {
        return pubAge;
    }

    public void setPubAge(int pubAge) {
        this.pubAge = pubAge;
    }

    public String getPubSex() {
        return pubSex;
    }

    public void setPubSex(String pubSex) {
        this.pubSex = pubSex;
    }

    public void show1(String s){
        System.out.println("调用了：公有的，String参数的show1(): s = " + s);
    }
    protected void show2(){
        System.out.println("调用了：受保护的，无参的show2()");
    }
    void show3(){
        System.out.println("调用了：默认的，无参的show3()");
    }
    private String show4(int age) {
        System.out.println("调用了，私有的，并且有返回值的，int参数的show4(): age = " + age);
        return "abcd";

    }

    public Student() {
        System.out.println("调用了公有，无参构造方法执行。。。");
    }

    public Student(String name) {
        System.out.println("构造方法 name = " + name);
        this.name = name;
    }

    public Student(String name, int age, String sex) {
        System.out.println("构造方法 多参 name= " + name+",age= "+age+",sex= "+sex  );
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
