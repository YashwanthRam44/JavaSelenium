package PropertiesFile;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;
public class PropertiesFileExtractor {

    static Map<?,?> property;
    static String TestDataFilePath= "C:\\Users\\softw\\IdeaProjects\\YashProject-STL\\src\\main\\java\\Resources\\TestData.yml";

    public static String initializeTestData(String objectString) throws IOException {
        Reader rd = new FileReader(TestDataFilePath);
        Yaml yml = new Yaml();
        property = (Map<?,?>) yml.load(rd);
        rd.close();
        Map<?,?> map = (Map<?,?>) property.get(objectString.split("\\.")[0]);
        return map.get(objectString.split("\\.")[1]).toString();
    }


}
