package Singleton;

import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    //Eager-initialization of the singleton instance
    private static final Logger INSTANCE = new Logger();

    private FileWriter fileWriter;

    // Private constructor to prevent external instantiation
    private Logger() {
        try {
            fileWriter = new FileWriter("log-file.txt", true);
            //allows multiple log messages to be written to the file without overwriting the existing content.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Returns the singleton instance
    public static Logger getInstance() {
        return INSTANCE;
    }

    // To write a message to the log file
    public void log(String message) {
        try {
            // Append the message to the end of the file and flush the writer to ensure the message is written immediately
            fileWriter.write(message + "\n");
            fileWriter.flush();
        } catch (IOException e) {
            // Logs the error if the message could not be written
            e.printStackTrace();
        }
    }

    // Closing the file writer to release the resources.
    public void close() {
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
