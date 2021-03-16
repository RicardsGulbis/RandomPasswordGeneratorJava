package rg;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));
        Random random = new Random();
        StringBuilder complete = new StringBuilder();
        System.out.println("Input Character count:");

        int length = sc.nextInt();
        int i = 0;

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";

       for (i = 0; i <length ; i++) {
           int index = random.nextInt(chars.length());
           char randomchars = chars.charAt(index);
           complete.append(randomchars);
       }

        String output = complete.toString();
        System.out.println("Password " +" ="+output);



    }
}

