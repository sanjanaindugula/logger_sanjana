package cleancode_s;

import static org.junit.Assert.*;

import org.junit.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class interest {

	@Test
	public void test() {
		final Logger logger=LogManager.getLogger(interest.class);
		SI si=new SI();
		assertEquals(9000,si.calculation(1000,3,3),0);
		logger.info("Simple interest is calculated");
		logger.debug(si.calculation(1000,3,3));
		logger.warn("No warnings in Simple interest and calculated");
		logger.error("No errors in Simple interest and calculated");
		
		
		CI ci=new CI();
		assertEquals(1333.09,ci.calculation(1200,5.4,2),2);
		logger.info("Simple interest is calculated");
		logger.debug(ci.calculation(1200,5.4,2));
		logger.warn("No warnings in compound interest and calculated");
		logger.error("No errors in compound interest and calculated");
		
	}

}
