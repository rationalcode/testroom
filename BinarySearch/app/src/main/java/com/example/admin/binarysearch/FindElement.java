package com.example.admin.binarysearch;

import java.sql.Time;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created by Admin on 25.09.2017.
 */

public class FindElement implements Runnable {

    private static  int n;
    private static  int key;
    private static long currentTime;
    public  static Date date = new Date();
    private static int [] array;
    private static int start =0;
    private static int end;
    private static int mid;
    private static int iteration =1;
    private static boolean found = false;

    public static void main(String[] args) {


        Thread searchBynary = new Thread(new FindElement());
            Scanner in = new Scanner(System.in);

                    System.out.println("Enter length array: ");

            n =  in.nextInt();

                    System.out.println("Enter key for search: ");

            key = in.nextInt();

                currentTime = System.currentTimeMillis();
                System.out.println();
                System.out.println(currentTime);
                            //System.out.println(" "+System.nanoTime());

            createArray(n);
            searchBynary.start();


    }

    public static void createArray (int n){

        array = new int[n];

        for (int i = 0, k=0;  i<array.length; i++, k++){

            array [i] = k;
        }

        end = array.length-1;
    }

    public static void find (int key, int [] array) {

        //int start = 0;
        //int end = array.length;
        int mid;
        int iteration =1;
        boolean found = false;

        while (start<=end){

            mid = start +(end - start) / 2;
            System.out.print(iteration++ + ". mid: "+ mid);

            if (key == array[mid]) {

                System.out.println();
                System.out.println(" Value in array: " + array[mid]);

                found = true;
                break;
            }
            if (key < array [mid]) {

                end = mid - 1;}

            else if (key > array [mid]){

                start = mid + 1;

            }
            System.out.println(" "+ start + " - "+ end);
        }

        if (!found) System.out.println("key = "+key + " not found");

    }

    public static void find (int key, int [] array, int start, int end){



        System.out.println("; "+ start + " - "+ end);
        //System.out.print(iteration++ + ". mid: "+ mid);

        if (start<=end){

            mid = start +(end - start) / 2;
            System.out.println(iteration++ +". mid =  ("+ end + " - "+ start + ")/2 " + "= "+ mid);

            if (key == array[mid]) {

                System.out.println();
                System.out.println(mid +" Value in array: " + array[mid]);

                found = true;
            }
            if (key < array [mid]) {

                find(key,array,start,mid-1);    //end = mid - 1;

                System.out.println(iteration++ +" . " +mid + " = mid - 1");}

            else if (key > array [mid]){

                find(key,array,mid+1,end);  //start = mid + 1;

                System.out.println(iteration++ +" . " +mid + " = mid + 1");}

        }
        if (!found) System.out.println("key = "+key + " not found");
    }

    @Override
    public void run() {
        //find(key, array);
        find(key,array,start,end);
        System.out.println();
        System.out.println(System.currentTimeMillis());
        System.out.println(" "+(System.currentTimeMillis()-currentTime));

    }
}
