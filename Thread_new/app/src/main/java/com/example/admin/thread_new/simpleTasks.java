package com.example.admin.thread_new;

/**
 * Created by Admin on 08.09.2017.
 */

public class simpleTasks implements Runnable {

    public int countTasks = 10;

    public static int countProcess = 0;
    public int idProcess = countProcess++;
    public int table = 0;

    public String status(){

        table++;
        if (table==10){
            System.out.println();}

        return "#" + idProcess + "("+(countTasks > 0? countTasks: " end")+") ";
    }


    @Override
    public void run() {
        for (; countTasks > 0; countTasks--){

            System.out.print(status());
            Thread.yield();
        }

    }
}
