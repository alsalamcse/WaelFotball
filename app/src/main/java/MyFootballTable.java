import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.kersh.wael.waelfotball.MainActivity;

public class MyFootballTable extends SQLiteOpenHelper
{
    private static final int DATABASE_VERSION=1;
    private static final String DATABASE_NAME="MYFOTBALL_DB";
    private static final String TABLE_CONTACTS="MYFOTBALL_TBL";

    private static final String KEY_ID="_id";
    private static final String KEY_ED2TEAMS="_ED2TEAMS";
    private static final String KEY_EDPLACE="_EDPLACE";
    private static final String KEY_EDTIME="_EDTIME";
    private static final String KEY_EDDATE="_EDDATE";


    public MyFootballTable( Context context) {
        super(context, DATABASE_NAME,  null , DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
      String sqlCreate = "CREATE TABLE " + TABLE_CONTACTS+ "("+KEY_ID+ " INTEGER PRIMARY KEY ," +KEY_ED2TEAMS + "TEXT" +KEY_EDDATE +"TEXT,"+KEY_EDPLACE+"TEXT"+KEY_EDTIME+"TEXT"+KEY_ID +"TEXT"+ " )";
      db.execSQL(sqlCreate);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sqlDrop = "DROP TABLE IF EXISTS " + TABLE_CONTACTS;
        db.execSQL( sqlDrop );
        onCreate( db );
    }
        public long matchDetais(myFotball mfotball) {
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues values = new ContentValues();
            values.put( KEY_ED2TEAMS, myFotball.geted2Teams() );
            values.put( KEY_EDDATE, myFotball.getDate() );
            values.put( KEY_EDPLACE, myFotball.getplace() );
            values.put( KEY_EDTIME, myFotball.getTIME );
            long row=db.insert(TABLE_CONTACTS,null,values);
            db.close();
            return row;
        }
        public int uptademfotball(myFotball mFotball) {

            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues values = new ContentValues();
            values.put( KEY_EDTIME, mFotball.getEdTime() );
            values.put( KEY_EDPLACE, mFotball.getEdPlace() );
            values.put( KEY_ED2TEAMS, myFotball.geted2Teams() );
            values.put( KEY_EDDATE, myFotball.getDate() );
            int num = db.update( TABLE_CONTACTS, values, KEY_ID + "=" + mFotball.getId(), null );
            db.close();
            return num;


        }
}



