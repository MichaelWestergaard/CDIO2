package Game;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Language {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String file ="src/Languages/Dansk.txt";
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(file));
			String currentLine = reader.readLine();
			reader.close();
			for(int i=0;i<40;i++)
			System.out.println();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
		
	}


