package pl.di.database;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Facade {

    public void costamWriter(WriteData writeData) throws IOException {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        writeData.write(integerList);
    }
}