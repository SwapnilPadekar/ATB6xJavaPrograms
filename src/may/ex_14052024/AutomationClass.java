package src.may.ex_14052024;

public class AutomationClass {
    String name;

    AutomationClass(){
        dataBaseConnection();
        excelOpen();
    }

    public AutomationClass(String name) {
        this.name = name;
    }

    void dataBaseConnection(){
        System.out.println("Mysql Connection is created!");
    }

    void excelOpen(){
        System.out.println("Excel opened");
    }

    void testCase1(){
        System.out.println("testCase1" + this.name);

    }
    void testCase2(){
        System.out.println("testCase2" + this.name);
    }

    public static void main(String[] args) {
        AutomationClass tc1 = new AutomationClass("TC1");
<<<<<<< HEAD



        AutomationClass tc2 = new AutomationClass("TC2");
        tc1.dataBaseConnection();
=======
        AutomationClass tc2 = new AutomationClass("TC2");
>>>>>>> ca942ac0b992c9d15bf7b615a5eab376717350e7
        System.out.println(tc1.name);
        tc1.testCase1();
        tc1.testCase2();

<<<<<<< HEAD


        System.out.println(tc2.name);
        tc2.excelOpen();
=======
        System.out.println(tc2.name);
>>>>>>> ca942ac0b992c9d15bf7b615a5eab376717350e7
        tc2.testCase1();
        tc2.testCase2();

    }
}
