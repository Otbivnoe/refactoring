package com.nikita.refactoring.Guice;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by nikita on 29/11/15.
 */
public class JsonHelper {

    private static final String JSON_FILE_PATH = "/Users/nikita/Documents/Projects/Universe/TRPO/gitRefactoring/Refactoring/src/main/java/com/nikita/refactoring/Guice/ClassManager.json";

    public static Object getObjectForKey(String key) {

        try {
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject)parser.parse(new FileReader(JSON_FILE_PATH));
            return jsonObject.get(key);
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
