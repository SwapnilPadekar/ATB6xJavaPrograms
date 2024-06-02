package june.genericsDemo;

public class MaxThree {

    public static <DT extends Comparable<DT>> DT maximumOf(DT a, DT b, DT c) {

        //We can write a generic code which supports all the datatypes (DT)
        //DT custom class created
        //Comparable - int, double, string
        //<DT extends Comparable<DT>> - need to extend for Strings comparable

        DT max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maximumOf(34, 54, 76));
        System.out.println(maximumOf(4.2, 3.4, 1.2));
        System.out.println(maximumOf('p', 'z', 'a'));
    }
}
