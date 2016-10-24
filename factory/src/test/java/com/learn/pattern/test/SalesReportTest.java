package com.learn.pattern.test;

import org.junit.Test;

import com.learn.pattern.AsiaPacificSalesReport;
import com.learn.pattern.EMEASalesReport;
import com.learn.pattern.SalesReport;
/**
 * Factory method pattern use case implementation test.
 */
public class SalesReportTest {
	
	@Test
	public void SalesReportTest() {
		SalesReport emeaReport = new EMEASalesReport();
		emeaReport.getReport();
		SalesReport asiaReport = new AsiaPacificSalesReport();
		emeaReport.getReport();
	}

}
