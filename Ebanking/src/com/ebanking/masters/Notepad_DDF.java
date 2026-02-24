package com.ebanking.masters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Notepad_DDF {

	public static void main(String[] args) throws Exception {

		Library Lb=new Library();
		
		Lb.opnapp("http://122.175.8.158/ranford2");
		
		Lb.Adminlogin("Admin","M1ndq");
		
			//To get test data file path
			
			String Fpath="D:\\Selenium live project\\workspacenew\\Ebanking\\src\\com\\ebanking\\testdata\\Role.txt";
			
			//To get Results file path
			
			String Rpath="D:\\Selenium live project\\workspacenew\\Ebanking\\src\\com\\ebanking\\results\\Res_Role.txt";
			String SD;
			//To get test data file
			
			FileReader FR=new FileReader(Fpath);
			BufferedReader BR=new BufferedReader(FR);
			String Sread=BR.readLine();
			System.out.println(Sread);
			
			//write header line into results file
			
			FileWriter FW=new FileWriter(Rpath);
			BufferedWriter BW=new BufferedWriter(FW);
			BW.write(Sread);
			BW.newLine();
			
			//Multiple Iterations-----Loop
			
			//While loop
			
			while ((SD=BR.readLine())!=null) 
			{
				System.out.println(SD);
				
				//Split
				
				String SR[]=SD.split("###");
				
				      String Rname=SR[0];
				      String Rtyp=SR[1];
				      
				      String Res=Lb.Rolecre(Rname, Rtyp);
				      System.out.println(Res);
				      
				      //Results
				      
				      BW.write(SD+"$$$$"+Res);
				      BW.newLine();
				      
			}
			
			BW.close();
			BR.close();
			}
	}


