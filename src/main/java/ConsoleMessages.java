package main.java;

public class ConsoleMessages {

    public static void output(String message){
        System.out.println(message);
    }

    public static void space(){
        System.out.println(" ");
    }

    public static void log(String message, String color){
        System.out.println(color+message+Configuration.ANSI_RESET);
    }

    public static void error(int errorID, String file, int line){
        System.out.println(Configuration.ANSI_RED+"Error! id:" + errorID + ",file:" + file + ",line:" + line + Configuration.ANSI_RESET);
    }
}
