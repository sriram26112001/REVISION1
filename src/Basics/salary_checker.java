package Basics;
import java.util.*;
public class salary_checker {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter your salary");
        int salary=in.nextInt();
        int totalSalary;
        if(salary>10000)
        {
            totalSalary=salary+2000;
        }
        else
        {
            totalSalary=salary+1000;
        }
        System.out.println("your salary for this month including the bonus is"+totalSalary);
    }
}
