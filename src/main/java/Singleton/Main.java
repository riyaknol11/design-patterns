package Singleton;

public class Main {

    public static void main(String[] args) {

        // Getting an instance of the Logger class
        Logger logger = Logger.getInstance();

        // Using the Logger instance to log a message
        logger.log("Implementing the singleton pattern!");

        // close() method to free up the resources
        logger.close();

    }

}
