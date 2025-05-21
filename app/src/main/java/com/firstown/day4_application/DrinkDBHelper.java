package com.firstown.day4_application;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DrinkDBHelper extends SQLiteOpenHelper {

    private static String dbName = "Drinks Application";
    private static int dbVersion = 1;

    public DrinkDBHelper(Context context){
//        Class constructor of the superclass
        super(context, dbName, null, dbVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}

