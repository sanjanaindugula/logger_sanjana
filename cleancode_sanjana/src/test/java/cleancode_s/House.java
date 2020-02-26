package cleancode_s;

import static org.junit.Assert.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class House {

	@Test
	public void test() {
		final Logger logger=LogManager.getLogger(House.class);
			MainHouse mh=new MainHouse();
			assertEquals(4800,mh.sase("Standard",4),0);
			logger.info("House construction with Standard material is calculated");
			logger.debug(mh.sase("Standard", 4));
			logger.warn("No warnings in calculating the standard material house construction cost");
			logger.error("No errors in calculating the standard material house construction cost");

			assertEquals(3000,mh.sase("AboveStandard",2),0);
			logger.info("House construction with above Standard material is calculated");
			logger.debug(mh.sase("AboveStandard", 2));
			logger.warn("No warnings in calculating the above standard material house construction cost");
			logger.error("No errors in calculating the above standard material house construction cost");

			assertEquals(5400,mh.sase("HighStandard",3),0);
			logger.info("House construction with Standard material is calculated");
			logger.debug(mh.sase("HighStandard", 3));
			logger.warn("No warnings in calculating the above standard material house construction cost");
			logger.error("No errors in calculating the above standard material house construction cost");

			assertEquals(10000,mh.sase("FullyHighStandard",4),0);
			logger.info("House construction with above Standard material is calculated");
			logger.debug(mh.sase("FullyHighStandard", 4));
			logger.warn("No warnings in calculating the above standard material house construction cost");
			logger.error("No errors in calculating the above standard material house construction cost");

	}

}
