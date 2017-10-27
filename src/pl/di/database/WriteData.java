package pl.di.database;

import java.io.IOException;
import java.util.List;

public interface WriteData {
    void write(List list) throws IOException;
}