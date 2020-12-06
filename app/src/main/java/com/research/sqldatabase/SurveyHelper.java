package com.research.sqldatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import android.database.Cursor;
import android.widget.Toast;

import androidx.annotation.Nullable;

class Question{

    private String Question;
    private int Ans;

}

public class SurveyHelper extends SQLiteOpenHelper {

    private Context context;

    private static final String ID = "QID" ;
    public static String SURVEY_TABLE = "SURVEY_TABLE";
    public static String QUESTION = "QUESTION";
    public static String ANS = "ans";


    //constructor for new database class
    public SurveyHelper(@Nullable Context context) {
        super(context, "survey.db", null, 1);

        this.context = context;
    }

    //first time access
    @Override
    public void onCreate(SQLiteDatabase db) {
        String query1 = "CREATE TABLE " + SURVEY_TABLE +
                " (" + ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QUESTION + " TEXT, " +
                ANS + " INT);";
        db.execSQL(query1);

    }

    //this called when version number change
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + SURVEY_TABLE);
        onCreate(db);
    }

    //reading data

    Cursor readAllData(){
        String query = "SELECT * FROM " + SURVEY_TABLE;


        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = null;
        if(db != null){
            cursor = db.rawQuery(query, null);
        }
        return cursor;

    }

    void addItem(String question1, int ans1) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(QUESTION, question1);
        cv.put(ANS, ans1);

        long result = db.insert(SURVEY_TABLE,null, cv);
        if(result == -1){
            Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(context, "Added Successfully!", Toast.LENGTH_SHORT).show();
        }
    }

    void deleteAllData() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DELETE FROM " + SURVEY_TABLE);
    }



}





