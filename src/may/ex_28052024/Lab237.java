package src.may.ex_28052024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab237 {
    public static void main(String[] args) {
        // API Endpoints
        // Pages - LoginPage, Dashboard, HomePage
        List url_pages = new ArrayList();
        url_pages.add("LoginPage");
        url_pages.add("Dashboard");
        url_pages.add("HomePage");

        System.out.println("------------------Print Type 1--------------------");
        System.out.println(url_pages);
        System.out.println("------------------Print Type 2--------------------");
        for (int i = 0; i < url_pages.size(); i++) {
            System.out.println(url_pages.get(i));
        }
        System.out.println("------------------Print Type 3--------------------");
        for (Object page : url_pages) {
            System.out.println(page);
        }
        System.out.println("------------------Print Type 4--------------------");
        Iterator itr = url_pages.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
