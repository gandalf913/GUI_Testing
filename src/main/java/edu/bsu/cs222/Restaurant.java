package edu.bsu.cs222;

import java.sql.Driver;

public class Restaurant{
    boolean DriveThrough;
    boolean TakeOut;
    boolean DineIn;

    public void setDriveThrough(boolean DT){
        DriveThrough = DT;
    }

    public void setTakeOut(boolean TO){
        TakeOut = TO;
    }

    public void setDineIn(boolean DI){
        DineIn=DI;
    }

    public boolean getDriveThrough(){
        return DriveThrough;
    }

    public boolean getTakeOut(){
        return TakeOut;
    }

    public boolean getDineIn(){
        return DineIn;
    }
}
