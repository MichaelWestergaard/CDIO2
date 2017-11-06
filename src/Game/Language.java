package Game;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Language {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JSONArray languageArray = new JSONArray();
		JSONObject object = new JSONObject();
				
		String file ="src/Languages/Dansk";
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(file));
			
			String currentLine = reader.readLine();
			
			for(int i = 0; currentLine != null; i++){
				
				System.out.println(currentLine);
				
				currentLine = reader.readLine();
				
			}			
			reader.close();
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

