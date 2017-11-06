package Game;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Language {

	public Map<String, String> languageSetup(String languageFile) {
		
		Map<String, String> gameText = new HashMap<String, String>();
		String file ="src/Languages/" + languageFile;
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(file));
			
			String currentLine = reader.readLine();
			
			for(int i = 0; currentLine != null; i++){
				String lastLine = currentLine;
				currentLine = reader.readLine();
				gameText.put(lastLine, currentLine);
				
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
		return gameText;
		
	}
}

