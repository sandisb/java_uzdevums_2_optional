package com.company;

import java.lang.*;
import java.util.*;


public class IsSymmetrical {
    public static void main (String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.println("Programma pārbaudīs vai virkne ir simetriska.");
        System.out.print("Lūdzu, ievadiet simbolu virkni: ");
        String s = input.nextLine();
        if (s.equals(new StringBuilder(s).reverse().toString())) {
            System.out.println("Ievadītā virkne '" + (s.toString()) + "' ir simetriska");
        } else {
            System.out.println("Ievadītā virkne '" + (s.toString()) + "' nav simetriska");
        }

        input.close();
    }}
