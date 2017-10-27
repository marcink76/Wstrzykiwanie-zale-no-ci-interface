package pl.di.database;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileWrite implements WriteData {
    public void write(List list) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt", true));
        bufferedWriter.write("zapisałem do pliku i co?");
        bufferedWriter.newLine();
        bufferedWriter.close();
    }
}