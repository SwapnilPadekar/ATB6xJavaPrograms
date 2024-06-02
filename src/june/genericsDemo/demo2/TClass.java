package june.genericsDemo.demo2;

public class TClass {

    public static void main(String[] args) {
        Test<Integer> i1 = new Test<Integer>(5);
        System.out.println(i1.getObject());
        Test<Double> i2 = new Test<Double>(5.2);
        System.out.println(i2.getObject());
        Test<String> i3 = new Test<String>("Swapnil");
        System.out.println(i3.getObject());
    }

}


//Diamond operator is generally used after classname or static name
//Diamond operator is used to introduce generic operator e.g. <T>

class Test<T> {
    T obj;

    Test(T obj) {
        this.obj = obj;
    }

    public T getObject() {
        return this.obj;
    }
}