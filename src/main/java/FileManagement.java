package main.java;

import java.io.*;

public class FileManagement {

    static String baseName = JsonWriter.baseName;
    static int i = 1;
    static String variantWhite = "";
    static String file;

    public static void writeFile(String type, boolean multipleBlockstateFiles, String fileName) throws IOException {
        if(fileName.equalsIgnoreCase("")){
            file = baseName;
        }else{
            file = baseName + "_" + fileName;
        }

        File blockModelOutputFile = new File(Configuration.blockModelFolderPath + "/" + file + ".json");
        File itemModelOutputFile = new File(Configuration.itemModelFolderPath + "/" + file + ".json");
        File blockstateOutputFile = new File(Configuration.blockstateFolderPath + "/" + file + ".json");
        File singleBlockstateOutputFile = new File(Configuration.blockstateFolderPath + "/" + baseName + ".json");

        if(JsonWriter.whiteIsColor){
            variantWhite = "_white";
        }
        if (type.equalsIgnoreCase("blockModel")) {
            ConsoleMessages.space();
            ConsoleMessages.log(Configuration.consoleOutputMessageCreateFile(type, file), Configuration.ANSI_CYAN);
            if (fileExist(file, blockModelOutputFile, type)) {
                FileWriter writer = new FileWriter(blockModelOutputFile);
                writer.write(Templates.blockModel(file));
                writer.flush();
                writer.close();
                ConsoleMessages.log(Configuration.consoleOutputMessageFileCreated(type, file), Configuration.ANSI_GREEN);
            }
        } else if (type.equalsIgnoreCase("itemModel")) {
            ConsoleMessages.space();
            ConsoleMessages.log(Configuration.consoleOutputMessageCreateFile(type, file), Configuration.ANSI_CYAN);
            if (fileExist(file, itemModelOutputFile, type)) {
                FileWriter writer = new FileWriter(itemModelOutputFile);
                writer.write(Templates.itemModel(file));
                writer.flush();
                writer.close();
                ConsoleMessages.log(Configuration.consoleOutputMessageFileCreated(type, file), Configuration.ANSI_GREEN);
            }
        } else if (type.equalsIgnoreCase("itemBlockModel")) {
            ConsoleMessages.space();
            ConsoleMessages.log(Configuration.consoleOutputMessageCreateFile(type, file), Configuration.ANSI_CYAN);
            if (fileExist(file, itemModelOutputFile, type)) {
                FileWriter writer = new FileWriter(itemModelOutputFile);
                writer.write(Templates.itemBlockModel(file));
                writer.flush();
                writer.close();
                ConsoleMessages.log(Configuration.consoleOutputMessageFileCreated(type, file), Configuration.ANSI_GREEN);
            }
        } else if (type.equalsIgnoreCase("blockstate")) {
            if (multipleBlockstateFiles) {
                ConsoleMessages.space();
                ConsoleMessages.log(Configuration.consoleOutputMessageCreateFile(type, file), Configuration.ANSI_CYAN);
                if (fileExist(file, blockstateOutputFile, type)) {
                    FileWriter writer = new FileWriter(blockstateOutputFile);
                    writer.write(Templates.blockstate(file));
                    writer.flush();
                    writer.close();
                    ConsoleMessages.log(Configuration.consoleOutputMessageFileCreated(type, file), Configuration.ANSI_GREEN);
                }
            } else {
                if (i == 1) {
                    ConsoleMessages.space();
                    ConsoleMessages.log(Configuration.consoleOutputMessageCreateFile(type, baseName), Configuration.ANSI_CYAN);
                    if (fileExist(baseName, blockstateOutputFile, type)) {
                        if(JsonWriter.variantType.equalsIgnoreCase("Color")) {
                            FileWriter writer = new FileWriter(singleBlockstateOutputFile);
                            writer.write(Templates.blockstateColorVariant(baseName, variantWhite));
                            writer.flush();
                            writer.close();
                        }else{
                            FileWriter writer = new FileWriter(singleBlockstateOutputFile);
                            writer.write(Templates.blockstateColorVariant(baseName, variantWhite));
                            writer.flush();
                            writer.close();
                        }
                        ConsoleMessages.log(Configuration.consoleOutputMessageFileCreated(type, baseName), Configuration.ANSI_GREEN);
                    }
                }
                i++;
            }
        }
    }

    public static boolean fileExist(String fileName, File file, String fileType) {
        if (file.exists()) {
            ConsoleMessages.output("File " + fileType + " " + fileName + " already exist ! Do you want replace this ? (y or n)");
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            String string = scanner.next();
            if (string.equalsIgnoreCase("y") || string.equalsIgnoreCase("yes")) {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return true;
            }
        } else {
            return true;
        }
        return false;
    }
}
