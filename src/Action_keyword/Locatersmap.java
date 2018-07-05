package Action_keyword;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.ho.yaml.Yaml;





public class Locatersmap {
	//HashMap<String, String> nameToTypeMap;
	//HashMap<String, String> nameToValueMap;
	HashMap<String,ArrayList<String>> name_TypeValue;
	@SuppressWarnings("unchecked")
	public Locatersmap() throws FileNotFoundException {
	    //String filePath1 = "/home/qainfotech/Music/eclipse-workspace/TATOC_MODULAR_APPROACH/src/Locator/NAME_ID.yaml";
	    //String filePath2 = "/home/qainfotech/Music/eclipse-workspace/TATOC_MODULAR_APPROACH/src/Locator/NAME_VAULE.yaml";
	    String filePath="/home/qainfotech/Music/eclipse-workspace/TATOC_MODULAR_APPROACH/src/Locator/NAME_TYPE_VALUE.yaml";
	    //nameToTypeMap = (HashMap<String, String>)Yaml.load(new FileInputStream(filePath1));
	    //nameToValueMap =(HashMap<String, String>)Yaml.load(new FileInputStream(filePath2));
	    name_TypeValue =(HashMap<String, ArrayList<String>>)Yaml.load(new FileInputStream(filePath));
	}
	
	public String getLocatorType(String LocatorName) {
		return name_TypeValue.get(LocatorName).get(0);
		
	}
	
	public String getLocatorValue(String LocatorName) {
		return name_TypeValue.get(LocatorName).get(1);
	}

}
