package properties;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JsonReader {

   public static String getJsonFile(String path) throws IOException {
      BufferedReader buffer = new BufferedReader(new FileReader(path));
      StringBuilder jsonString = new StringBuilder();
      String str;
      String result;
      while ((str = buffer.readLine()) != null) {
         result = str.replaceAll(" ", "");
         jsonString.append(result);
      }
      return jsonString.toString();
   }
}





