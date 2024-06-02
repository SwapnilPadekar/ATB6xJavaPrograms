package june.genericsDemo.demo2;

public class G1 {
    public static void main(String[] args) {
        temp(23);
        temp(45.4);
        temp("a");
        temp("abcd");
    }

//    public static void temp(int a){
//        System.out.println(a);
//    }

    public static <DT> void temp(DT a) {
        System.out.println(a);
    }
}