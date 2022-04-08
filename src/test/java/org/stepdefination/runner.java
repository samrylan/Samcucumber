package org.stepdefination;

import org.baseclass.JvmReportClass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="G:\\eclipse workspace\\Cucumber\\src\\test\\resources\\FeatureFile"
,glue= {"org.stepdefination"},dryRun=false ,monochrome=true,strict=true,
 tags= {"@login"}, snippets= io.cucumber.junit.CucumberOptions.SnippetType.UNDERSCORE,
 plugin= {"pretty","html:target\\Report",
		   "json:target\\Report\\ad.json",
		   "junit:target\\Report\\ad1.xml",
 			"rerun:src\\test\\resources\\Rerun\\SeceneFail.txt"
		    }
)

public class runner {
      
	@AfterClass
	public static void tc1() {
          JvmReportClass.jvmReportGenerate("target\\Report\\ad.json");
	}
	
	
	}
 
 

