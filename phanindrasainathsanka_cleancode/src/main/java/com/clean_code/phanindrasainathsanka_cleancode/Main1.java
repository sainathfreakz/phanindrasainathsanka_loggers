package com.clean_code.phanindrasainathsanka_cleancode;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Main1 {
	private static final Logger LOGGER=LogManager.getLogger(Main1.class);
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		 String str=null;
		 Methods m=new Methods();
		 LOGGER.info("Enter the principle amount");
         double p=s.nextDouble();
         LOGGER.info("Enter the time period");
         double t=s.nextDouble();
         LOGGER.info("Enter the rate of interest");
         double r=s.nextDouble();
         do {
        	 LOGGER.info("\n1.Simple Interest\n2.Compound Interest");
        	 LOGGER.info("Enter the choice");
         int n=s.nextInt();
         switch(n)
         {
         case 1:
        	 LOGGER.info(m.getSimpleInterest(p,t,r));
        	  break;
         case 2:
        	 LOGGER.info(m.getCompoundInterest(p,t,r));
        	  break;
         }
         LOGGER.info("Do you want to continue Y/N?");
         str=s.next();
	}while(str.equalsIgnoreCase("Y"));
	}

}