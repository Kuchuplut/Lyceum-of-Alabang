package com.lyceum.experiment;

import java.awt.Desktop;
import java.io.File;

import org.apache.commons.io.FileUtils;

public class CopyFile {

	public static void main(String[]args){
		
		File image1 = new File("C:/Users/kez layug/Pictures/pogi.jpg");
		File image2 = new File("WebContent/display_photos/img1.jpg");
		
		try{
			
			FileUtils.copyFile(image1, image2);
			System.out.println("SUCCESS");
			Desktop.getDesktop().open(image2);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
