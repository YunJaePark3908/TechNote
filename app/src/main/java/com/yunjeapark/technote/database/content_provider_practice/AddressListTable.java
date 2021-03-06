package com.yunjeapark.technote.database.content_provider_practice;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class AddressListTable { //DB 생성 클래스

    public static final String KEY_ROWID = "_id";
    public static final String KEY_NAME = "name";
    public static final String KEY_PHONE_NUMBER = "phone_number";

    private static final String LOG_TAG = "AddressListTable";
    public static final String SQLITE_TABLE = "Country";

    private static final String DATABASE_CREATE =
            "CREATE TABLE if not exists " + SQLITE_TABLE + " (" +
                    KEY_ROWID + " integer PRIMARY KEY autoincrement," +
                    KEY_NAME + "," +
                    KEY_PHONE_NUMBER+ "," +
                    " UNIQUE (" + KEY_PHONE_NUMBER +"));";

    public static void onCreate(SQLiteDatabase db) {
        Log.w(LOG_TAG, DATABASE_CREATE);
        db.execSQL(DATABASE_CREATE);
    }

    public static void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.w(LOG_TAG, "Upgrading database from version " + oldVersion + " to "
                + newVersion + ", which will destroy all old data");
        db.execSQL("DROP TABLE IF EXISTS " + SQLITE_TABLE);
        onCreate(db);
    }

}