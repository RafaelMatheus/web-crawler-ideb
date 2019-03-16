package utils;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import webcrawler.Config;

public class CsvUtils {
	public static List<String> getCodFromCsv() {
		 List<String> codigos = new ArrayList<String>();
		 try {
	    		
			 CSVReader reader = new CSVReader(new FileReader(Config.pathFile), ';');
    		  String [] nextLine;
     		     while ((nextLine = reader.readNext()) != null) {
    		        codigos.add(nextLine[20]);
    		     }
		} catch (IOException e) {
			e.printStackTrace();
		}
		return codigos;
		
	}
	public static void writeCsv(List<String[]> entries) {
		try {
			 CSVWriter writer = new CSVWriter(new FileWriter(Config.pathFileAfter));
			 writer.writeAll(entries);
		     writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	    
	}
}
