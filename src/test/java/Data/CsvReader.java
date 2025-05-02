package Data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    public static Object[][] readCsvFile() throws IOException {
        List<Object[]> data = new ArrayList<>();
        String filePath = System.getProperty("user.dir") + "\\src\\test\\java\\Data\\UserData.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;

        // Skip header
        br.readLine();

        while ((line = br.readLine()) != null) {
            String[] values = line.split(",", -1); // -1 to keep empty strings
            if (values.length >= 5) {
                // Take only the first 5 columns
                Object[] row = new Object[] {
                        values[0].trim(),
                        values[1].trim(),
                        values[2].trim(),
                        values[3].trim(),
                        values[4].trim()
                };
                data.add(row);
            }
        }

        br.close();

        // Convert List to 2D Object array
        Object[][] dataArray = new Object[data.size()][];
        for (int i = 0; i < data.size(); i++) {
            dataArray[i] = data.get(i);
        }

        return dataArray;
    }
}
