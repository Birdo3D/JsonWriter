package main.java;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonWriter {

    public static List<String> customVariants = new ArrayList<>();
    public static int customVariantsLength;
    public static String fileType;
    public static String variantType;
    public static String baseName;
    public static boolean whiteIsColor;
    public static boolean multipleBlockstateFile;
    public static String modID;

    public static void main(String[] args) {
        init();
        postinit();
    }

    public static void init() {
        Configuration.completeColorList();
        fileType = Scanner.question("What type of model do you want ? (Block/Item) :", true, 2, "Block", "Item", null, null);
        baseName = Scanner.question("What is the name of your items / blocks ? (Example : elevator_red = elevator) :", false, 0, null, null, null, null);
        modID = Scanner.question("What is your ModID ?", false, 0, null, null, null, null);
        if(fileType.equalsIgnoreCase("Block")) {
            String multipleblockstatefile = Scanner.question("Do you want multiple blockstate files ? (y or n)", true, 4, "y", "yes", "n", "no");
            multipleBlockstateFile = multipleblockstatefile.equalsIgnoreCase("y") || multipleblockstatefile.equalsIgnoreCase("yes");
        }
        variantType = Scanner.question("What type of variations do you want ? (Color/Custom) :", true, 2, "Color", "Custom", null, null);
        if (variantType.equalsIgnoreCase("Custom")) {
            String customVariant = Scanner.question("Variations (Example : {var1,var2} :", false, 0, null, null, null, null);
            customVariant = customVariant.replace("{", "").replace("}", "").replace(" ", "");
            String[] result = customVariant.split(",");
            customVariantsLength = result.length;
            for (int i = 0; i < customVariantsLength; i++) {
                customVariants.add(result[i]);
            }
        } else {
            String whiteColor = Scanner.question("Do you want use white color ? (y or n) :", true, 4, "y", "yes", "n", "no");
            whiteIsColor = whiteColor.equalsIgnoreCase("y") || whiteColor.equalsIgnoreCase("yes");
            for (int i = 0; i < 15; i++) {
                customVariants.add(Configuration.colors.get(i));
            }
        }
    }

    public static void postinit() {
        try {
            Scanner.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}