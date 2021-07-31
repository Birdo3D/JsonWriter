package main.java;

import java.util.ArrayList;
import java.util.List;

public class Configuration {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static String blockModelFolderPath = "C:\\Users\\dylan\\Downloads\\folder\\model\\blocks";

    public static String itemModelFolderPath = "C:\\Users\\dylan\\Downloads\\folder\\model\\items";

    public static String blockstateFolderPath = "C:\\Users\\dylan\\Downloads\\folder\\blockstate";

    public static String consoleOutputMessageCreateFile(String fileType, String fileName){
        return "Create " + fileType + " " + fileName + "...";
    }

    public static String consoleOutputMessageFileCreated(String fileType, String fileName){
        return "File (" + fileType + ") " + fileName + " has been create !";
    }

    public static List<String> colors = new ArrayList<>();

    public static void completeColorList(){
        //colors.add("white");
        colors.add("orange");
        colors.add("magenta");
        colors.add("light_blue");
        colors.add("yellow");
        colors.add("lime");
        colors.add("pink");
        colors.add("gray");
        colors.add("silver");
        colors.add("cyan");
        colors.add("purple");
        colors.add("blue");
        colors.add("brown");
        colors.add("green");
        colors.add("red");
        colors.add("black");
    }
}
