package org.baseclass;

import java.awt.List;
import java.io.File;
import java.util.LinkedList;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReportClass {


	public static void jvmReportGenerate(String jsonPath) {
		
		//to mention the path of the file
		File f = new File(System.getProperty("user.dir") +"\\target\\Report\\JvmReport");
		
		//to create an object
		Configuration con= new Configuration(f, "adhotel");
		con.addClassifications("platform", "Windows");
		con.addClassifications("jdk", "1.8");
		con.addClassifications("sprint", "5");
		
		//add a json path
		java.util.List<String> l= new LinkedList<String>();
		l.add(jsonPath);
          
		//create an object for report builder
		ReportBuilder r=new ReportBuilder(l, con);
		r.generateReports();
	}
}
