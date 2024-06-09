package Basics;
import java.util.*;
public class Switch_case_fruit_example {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the fruit");
        String fruit=in.next();
        switch (fruit) {
            case "mango" -> System.out.println("it is a sweet Indian fruit");
            case "orange" -> System.out.println("It is a orange coloured fruit");
            default -> System.out.println("enter a valid fruit");
        }
    }
}
