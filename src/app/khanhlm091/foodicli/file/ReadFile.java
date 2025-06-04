package app.khanhlm091.foodicli.file;

import app.khanhlm091.foodicli.logger.Logger;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    private List<String> lines = new ArrayList<>();

    public ReadFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader("/home/khanhlm091/java/FoodiCLI/src/app/khanhlm091/foodicli/" + fileName))) {
            String line;

            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (FileNotFoundException fnfe) {
            Logger.getError(fnfe);
        } catch (IOException ioe) {
            Logger.getError(ioe);
        }

        Logger.getMessage("Getting file successfully");
    }

    public List<String> getLines() {
        return this.lines;
    }
}