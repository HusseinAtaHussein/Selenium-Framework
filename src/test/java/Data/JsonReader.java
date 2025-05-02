package Data;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonReader {
    public static Object[][] getJsonData(){
        ObjectMapper mapper = new ObjectMapper();
        String filePath = System.getProperty("user.dir") + "\\src\\test\\java\\Data\\UserData.json";

        try {
            List<UserDataClass> userList = mapper.readValue(new File(filePath), new TypeReference<List<UserDataClass>>() {});
            Object[][] testData = new Object[userList.size()][1];
            for (int i = 0; i < userList.size(); i++) {
                testData[i][0] = userList.get(i);
            }
            return testData;
        } catch (IOException e) {
            e.printStackTrace();
            return new Object[0][];
        }
    }
}
