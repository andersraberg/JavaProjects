package proj1;

import java.util.logging.Logger;

public class HelloWorld {
	private static Logger LOGGER = Logger.getLogger(HelloWorld.class.getName());

	public static void main(String[] args) {
		LOGGER.info("Hello World!");
		LOGGER.info("Hello Universe!");
		LOGGER.info("Hello Universe again!");
		LOGGER.info("Hello Multiverse!");
		LOGGER.info("Hello again");
	}

}
