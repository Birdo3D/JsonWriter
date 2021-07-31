package main.java;

public class Templates {

    public static String blockModel(String textureName){
        return "{\n" + "  \"parent\": \"block/cube_all\",\n" + "  \"textures\": {\n" + "    \"all\": \"" + JsonWriter.modID + ":blocks/" + textureName + "\"\n" + "  }\n" + "}";
    }

    public static String itemModel(String textureName){
        return "{\n" + "  \"parent\": \"item/generated\",\n" + "  \"textures\": {\n" + "    \"layer0\": \"" + JsonWriter.modID + ":items/" + textureName + "\"\n" + "  }\n" + "}";
    }

    public static String itemBlockModel(String textureName){
        return "{\n" + "  \"parent\": \"" + JsonWriter.modID + ":block/" + textureName + "\"\n" + "}";
    }

    public static String blockstate(String textureName){
        return "{\n" + "  \"variants\": {\n" + "    \"normal\": {\n" + "      \"model\": \"" + JsonWriter.modID + ":" + textureName + "\"\n" + "    }\n" + "  }\n" + "}";
    }

    public static String blockstateColorVariant(String textureName, String variantWhite){
        return "{\n" + "  \"variants\": {\n" +
                "    \"variant="  + textureName + variantWhite + "\": {\n" + "      \"model\": \"" + JsonWriter.modID + ":" + textureName + variantWhite + "\"\n" + "    },\n" +
                "    \"variant=" + textureName + "_orange\": {\n" + "      \"model\": \"" + JsonWriter.modID + ":" + textureName + "_orange\"\n" + "    },\n" +
                "    \"variant=" + textureName + "_magenta\": {\n" + "      \"model\": \"" + JsonWriter.modID + ":" + textureName + "_magenta\"\n" + "    },\n" +
                "    \"variant=" + textureName + "_light_blue\": {\n" + "      \"model\": \"" + JsonWriter.modID + ":" + textureName + "_light_blue\"\n" + "    },\n" +
                "    \"variant=" + textureName + "_yellow\": {\n" + "      \"model\": \"" + JsonWriter.modID + ":" + textureName + "_yellow\"\n" + "    },\n" +
                "    \"variant=" + textureName + "_lime\": {\n" + "      \"model\": \"" + JsonWriter.modID + ":" + textureName + "_lime\"\n" + "    },\n" +
                "    \"variant=" + textureName + "_pink\": {\n" + "      \"model\": \"" + JsonWriter.modID + ":" + textureName + "_pink\"\n" + "    },\n" +
                "    \"variant=" + textureName + "_gray\": {\n" + "      \"model\": \"" + JsonWriter.modID + ":" + textureName + "_gray\"\n" + "    },\n" +
                "    \"variant=" + textureName + "_silver\": {\n" + "      \"model\": \"" + JsonWriter.modID + ":" + textureName + "_silver\"\n" + "    },\n" +
                "    \"variant=" + textureName + "_cyan\": {\n" + "      \"model\": \"" + JsonWriter.modID + ":" + textureName + "_cyan\"\n" + "    },\n" +
                "    \"variant=" + textureName + "_purple\": {\n" + "      \"model\": \"" + JsonWriter.modID + ":" + textureName + "_purple\"\n" + "    },\n" +
                "    \"variant=" + textureName + "_blue\": {\n" + "      \"model\": \"" + JsonWriter.modID + ":" + textureName + "_blue\"\n" + "    },\n" +
                "    \"variant=" + textureName + "_brown\": {\n" + "      \"model\": \"" + JsonWriter.modID + ":" + textureName + "_brown\"\n" + "    },\n" +
                "    \"variant=" + textureName + "_green\": {\n" + "      \"model\": \"" + JsonWriter.modID + ":" + textureName + "_green\"\n" + "    },\n" +
                "    \"variant=" + textureName + "_red\": {\n" + "      \"model\": \"" + JsonWriter.modID + ":" + textureName + "_red\"\n" + "    },\n" +
                "    \"variant=" + textureName + "_black\": {\n" + "      \"model\": \"" + JsonWriter.modID + ":" + textureName + "_black\"\n" + "    }\n" +
                "  }\n" +
                "}";
    }
}