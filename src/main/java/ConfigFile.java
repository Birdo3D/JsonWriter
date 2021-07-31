package main.java;

import java.io.*;

public class ConfigFile {

    public static void createFile() {
        File configurationFile = new File("plugins/UraSyncro/Configuration.yml");
        if (!configurationFile.exists()) {
            try {
                configurationFile.createNewFile();
                InputStream in = ConfigFile.class.getResourceAsStream("/fr/uracraft/urasyncro/ressources/config.yml");
                try {
                    OutputStream out = new FileOutputStream(configurationFile);
                    try {
                        byte[] buf = new byte[8196];
                        int len;
                        while ((len = in.read(buf)) > 0) {
                            out.write(buf, 0, len);
                        }
                    } finally {
                        out.close();
                    }
                } finally {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
