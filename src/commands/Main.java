package commands;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //test25252
        Scanner sc = new Scanner(System.in);
        System.out.println("Zvol si operaci");
        System.out.println("1 pro scitani");
        System.out.println("2 pro odcitani");
        int operace = Integer.parseInt(args[0]);
        System.out.println("Napis 2 cisla: ");
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        if(operace == 1)
        {
            System.out.println(a+b);
        }
        if(operace == 2)
        {
            System.out.println(a-b);
        }else{
            System.out.println("Neznam");
        }
    }
}
