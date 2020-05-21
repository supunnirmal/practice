package lk.ac.kln.fct.covid;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;

public class DataReader {

	private static final String JSON_ARRAY = "records";
    private static final String DATE = "dateRep";
    private static final String CASE = "cases";
    private static final String DEATH = "deaths";
    private static final String COUNTRY = "countriesAndTerritories";
    
    public void readData(String filePath) {
        try {
        	
            String fileContent = new String (Files.readAllBytes(Paths.get(filePath)));
            JSONObject obj  = new JSONObject(fileContent);
            

            JSONArray arr = obj.getJSONArray(JSON_ARRAY);
            System.out.println("\tDate\t|\tReported Cases\t|\tDeaths");
            
            for(int i = 0; i < arr.length(); i ++) {
            	if(arr.getJSONObject(i).getString(COUNTRY).equals("Sri_Lanka"))
            		System.out.println("    "+arr.getJSONObject(i).getString(DATE)+"\t\t\t"+arr.getJSONObject(i).getString(CASE)+"\t\t"+arr.getJSONObject(i).getString(DEATH));
                
            }
            
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
