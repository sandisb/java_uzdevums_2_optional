package com.company;

import java.util.Arrays;
import java.util.Random;

public class SortArray {

    public static void generateArrayElements (int[] arr){

        //Tiek veikta nejaušu skaitļu masīva ģenerēšana
        Random rand = new Random();
        for(int i=0; i< arr.length; i++){
            arr[i] = rand.nextInt(100);
        }
    }
    public static void findLargestElement (int[] arr){

        //Atrod lielāko elementu masīvā un tā lokāciju
        int largestElement = 0;
        int elemLocation = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i] > largestElement){
                largestElement =  arr[i];
                elemLocation = i;
            }
        }

        //Tiek samainīts ar vietām lielākais masīva elements ar pirmo masīva elementu
        int temp = arr[0];
        arr[0] = largestElement;
        arr[elemLocation] = temp;

    }

    public static void sortArray (int [] arr){
        for(int i=1; i< arr.length; i++){

            //Novieto mazāko masīva elementu kā pirmo
            int min = arr[i];
            int minLocation = i;

            //Iziet cauri atlikušajam masīvam un, ja kāds masīva elements ir mazāks, tad piešķir jaunu mazāko elementu un saglabā tā lokāciju
            for(int j=i+1; j<arr.length;j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minLocation = j;
                }
            }

            //Tiek samainīts pirmais līnijas elements ar mazāko elementu
            int temp = arr[i];
            arr[i] = min;
            arr[minLocation] = temp;
        }
    }

    public static void main (String args[]) {

        //Tiek deklerēts masīvs
        int arr[] = new int[25];

        generateArrayElements(arr);
        findLargestElement(arr);
        sortArray(arr);
        System.out.println("Programmā tiek definēts veselo skaitļu viendimensijas masīvs, izmantojot nejaušo skaitļu ģeneratoru un sakārtos pēc nosacījumiem.");
        System.out.println(Arrays.toString(arr));

    }
}
