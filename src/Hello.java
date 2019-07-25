/**
 * @ClassName: Hello
 * @Description: 欢迎来到java
 * @author: heyunqiang
 */
public class Hello {

    // 使用static修饰的方法，属于这个类本身。
    // 使用static修饰的方法, 既可以使用类作为调用者，也可以使用对象
    public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("swap方法里，a=" + a + ",b=" + b);
    }


    public static void test(int a,String...books){


    }

    public static void main(String[] args) {
        /*
            对象的产生 和 使用？
            创建对象的根本途径是构造器，
            通过new 关键字来调用某一个类的构造器
            即可创建这个类的实例。
         */
        Person personOne = new Person();
        personOne.say("Heyunqiang", 20);

        int a = 1;
        int b = 3;
        swap(a, b); //上面int a,int b,副本 传入swap()
        System.out.println("swap方法里，a=" + a + ",b=" + b);

    }
}