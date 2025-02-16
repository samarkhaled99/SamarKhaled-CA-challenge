package utilities;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.IOException;

import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.PathNotFoundException;
import org.json.simple.parser.ParseException;


public class JsonFileManager {
    String jsonReader;
    String jsonFilePath;

    public JsonFileManager(String jsonFilePath) {
        this.jsonFilePath = jsonFilePath;
        try {
            JSONObject data = (JSONObject) new JSONParser().parse(new FileReader(jsonFilePath));
            jsonReader = data.toJSONString();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    public String getTestData(String jsonPath) {
        String testData = "";
        try {
            testData = JsonPath.read(jsonReader, jsonPath);
        } catch (PathNotFoundException e) {
            e.printStackTrace();
        }
        return testData;
    }


}
