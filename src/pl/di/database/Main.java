package pl.di.database;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FileWrite fileWrite = new FileWrite();
        SqlWrite sqlWrite = new SqlWrite();
        WriteOnScreen writeOnScreen = new WriteOnScreen();

        Facade facade = new Facade();
        facade.costamWriter(fileWrite);

    }
}