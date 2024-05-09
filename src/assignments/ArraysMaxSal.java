package assignments;

public class ArraysMaxSal {
    public static void main(String[] args) {
        int[] salary = {30, 50, 60, 90, 10, 100, 999};
        int max_sal = 0;

        for (int i = 0; i < salary.length; i++) {
            if (max_sal < salary[i]) {
                max_sal = salary[i];
            }
        }
        System.out.println("The maximum salary is: " + max_sal);
    }
}
