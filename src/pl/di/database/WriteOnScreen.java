package pl.di.database;

import java.util.List;

public class WriteOnScreen implements WriteData{
    public void write(List list){
        System.out.println(list.get(0));
    }
}