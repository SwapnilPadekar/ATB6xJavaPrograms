package june.ex_18062024;

public class BuilderPatternDesignPatternJava {

    public BuilderPatternDesignPatternJava groundFloor() {
        System.out.println("On the Ground Floor");
        return this;
    }

    public BuilderPatternDesignPatternJava firstFloor(String name) {
        System.out.println("On the First Floor" + name);
        return this;
    }

    public BuilderPatternDesignPatternJava secondFloor(String name, String color) {
        System.out.println("On the Second Floor" + name + color);
        return this;
    }

    public static void main(String[] args) {
        BuilderPatternDesignPatternJava bp = new BuilderPatternDesignPatternJava();
//        bp.groundFloor()
//        bp.firstFloor("FF");
//        bp.secondFloor("SF","Beige");

        bp.groundFloor().firstFloor("FF").secondFloor("SF", "Beige");

        //RestAssured
        //get().header().auth().make().response().verify() ......
    }
}