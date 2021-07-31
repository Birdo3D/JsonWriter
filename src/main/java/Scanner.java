package main.java;

import java.io.IOException;

public class Scanner {

    public static String question(String question, boolean rep, int repNb, String ans1, String ans2, String ans3, String ans4) {
        String answer;
        ConsoleMessages.output(question);
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        answer = scanner.next();
        if (rep) {
            for (int i = 1; i < repNb; i++) {
                if (!(answer.equalsIgnoreCase(ans1) || answer.equalsIgnoreCase(ans2) || answer.equalsIgnoreCase(ans3) || answer.equalsIgnoreCase(ans4))) {
                    ConsoleMessages.log("Vous devez choisir une des possibilité énoncée !", Configuration.ANSI_YELLOW);
                    question(question, true, repNb, ans1, ans2, ans3, ans4);
                }
            }
        }
        return answer;
    }

    public static void run() throws IOException {
        if (JsonWriter.whiteIsColor) {
            Configuration.colors.add("white");
        }else{
            Configuration.colors.add("");
        }
        if (JsonWriter.fileType.equalsIgnoreCase("Block")) {
            if (JsonWriter.variantType.equalsIgnoreCase("Color")) {
                for (int i = 0; i < 16; i++) {
                    FileManagement.writeFile("blockstate", JsonWriter.multipleBlockstateFile, Configuration.colors.get(i));
                    FileManagement.writeFile("blockModel", false, Configuration.colors.get(i));
                    FileManagement.writeFile("itemBlockModel", false, Configuration.colors.get(i));
                }
            } else {
                for (int i = 0; i < JsonWriter.customVariantsLength; i++) {
                    FileManagement.writeFile("blockstate", JsonWriter.multipleBlockstateFile, JsonWriter.customVariants.get(i));
                    FileManagement.writeFile("blockModel", false, JsonWriter.customVariants.get(i));
                    FileManagement.writeFile("itemBlockModel", false, JsonWriter.customVariants.get(i));
                }
            }
        } else {
            if (JsonWriter.variantType.equalsIgnoreCase("Color")) {
                for (int i = 0; i < 16; i++) {
                    FileManagement.writeFile("itemModel", false, Configuration.colors.get(i));
                }
            } else {
                for (int i = 0; i < JsonWriter.customVariantsLength; i++) {
                    FileManagement.writeFile("itemModel", false, JsonWriter.customVariants.get(i));
                }
            }
        }
    }
}
