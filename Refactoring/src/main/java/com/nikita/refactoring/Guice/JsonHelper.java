package com.nikita.refactoring.Guice;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileReader;

/**
 * Created by nikita on 29/11/15.
 */

public class JsonHelper {

    private static final String JSON_FILE_PATH = "/Users/nikita/Documents/Projects/Universe/TRPO/gitRefactoring/Refactoring/src/main/java/com/nikita/refactoring/Guice/ClassManager.json";
    private static final Logger log = LoggerFactory.getLogger(JsonHelper.class);

    public static Object getObjectForKeyPath(String keyPath) {

        try {
            String[] keys = keyPath.split("\\.");

            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject)parser.parse(new FileReader(JSON_FILE_PATH));

            for (String key : keys) {
                Object object = (Object)jsonObject.get(key);
                if (object instanceof JSONObject) {
                    jsonObject = (JSONObject)object;
                    continue;
                }
                return object;
            }
            return null;
        } catch (Exception e) {
            log.error("Json exception", e);
        }

        return null;
    }
}
