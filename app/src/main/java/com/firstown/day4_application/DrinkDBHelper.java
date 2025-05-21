package com.firstown.day4_application;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DrinkDBHelper extends SQLiteOpenHelper {

    private static String dbName = "day4_application";
    private static int dbVersion = 1;

    public DrinkDBHelper(Context context){
//        Class constructor of the superclass
        super(context, dbName, null, dbVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE Drinks (" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "DrinksName TEXT, " +
                "description TEXT)";

        db.execSQL(sql);

        this.addSomeData(db, "Kolakanda", "Energy Drink");
        this.addSomeData(db, "Koththamalli", "Good for health");
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


    }

    // Insert data into the database
    public void addSomeData(SQLiteDatabase db, String DrinksName, String description) {
        ContentValues contentValues = new ContentValues();

        contentValues.put("DrinksName", DrinksName);
        contentValues.put("description", description);

        db.insert("Drinks", null, contentValues);

    }

    // Update Description in the database
    public void updateData(SQLiteDatabase db, int id, String DrinksName, String description) {
        ContentValues contentValues = new ContentValues();

//        contentValues.put("DrinksName", DrinksName);
        contentValues.put("description", description);

        db.update("Drinks", contentValues, "DrinksName = ?", new String[]{"Pepsi"});

    }

}

