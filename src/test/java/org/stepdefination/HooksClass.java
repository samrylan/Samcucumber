package org.stepdefination;

import java.io.IOException;

import org.baseclass.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {
    @Before
    public void bc() {
     System.out.println("****Before****");
     launchbrowser();
     maxwindow();
     
     towait();
     
	}
    @After
    public void acf(Scenario s) throws IOException {
    	String sam = s.getName(); 
    	Screenshot(sam);
    	quit(); 
      System.out.println("***END***");
	}
    
    
    
}
