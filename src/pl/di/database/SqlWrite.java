package pl.di.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class SqlWrite implements WriteData {
    public void write(List list) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
    }
}