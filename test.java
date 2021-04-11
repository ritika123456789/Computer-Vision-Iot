package tess4j;

import java.io.File;

import java.io.*;
import net.sourceforge.tess4j.*;


public class test {
	    public static void main(String[] args) throws IOException{
	    	//creating file instance and referencing the file in its location
	    	File imageFile= new File("C:\\Users\\win10\\eclipse-workspace\\Tess4j\\images\\eurotext.tif");
	    	 
	    	//creating a new tesseract instance and setting the data path that
	    	//references trained data and the English language library
	    	ITesseract instance = new Tesseract();// JNA Interface Mapping
	    	instance .setDatapath("C:\\Users\\win10\\eclipse-workspace\\Tess4j\\tessdata");
	    	
	    	//create a try catch to run the OCR on the document referenced above
	    	try {
	    		String result = instance.doOCR(imageFile);
	    		System.out.println(result);
	    		
	    		//catch that delivers an error message if OCR fails
	    	} catch (TesseractException e) {
	    		       System.err.println(e.getMessage());
	    	}
	    	
	    }

	}






	




	




