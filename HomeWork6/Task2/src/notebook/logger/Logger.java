package notebook.logger;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Logger implements Logable{
    private String filename;

    public Logger(String filename) {
        this.filename = filename;
    }

    @Override
    public void saveLog(String data) {
        try{
            FileWriter writer = new FileWriter(filename, true);
            LocalDateTime eventTime = LocalDateTime.now();
            writer.write(String.format("%s  %s \n", eventTime, data));
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
