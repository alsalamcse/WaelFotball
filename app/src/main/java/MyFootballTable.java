import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.kersh.wael.waelfotball.MainActivity;

import java.util.ArrayList;

public class MyFootballTable extends SQLiteOpenHelper
{
    private static final int DATABASE_VERSION=1;
    private static final String DATABASE_NAME="MYFOTBALL_DB";
    private static final String TABLE_CONTACTS="MYFOTBALL_TBL";

    private static final String KEY_ID="_id";
    private static final String KEY_TEAMNAME="_TEAMNAME";
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
        public long matchDetais(myFotball f) {
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues values = new ContentValues();
            values.put( KEY_TEAMNAME, f.getTeamName() );
            values.put( KEY_EDDATE, f.getDate() );
            values.put( KEY_EDPLACE, f.getPlace() );
            values.put( KEY_EDTIME, f.getTime() );
            long row=db.insert(TABLE_CONTACTS,null,values);
            db.close();
            return row;
        }
        public int uptademfotball(myFotball mFotball) {

            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues values = new ContentValues();
            values.put( KEY_EDTIME, mFotball.getTime() );
            values.put( KEY_EDPLACE, mFotball() );
            values.put( KEY_ED2TEAMS, myFotball.geted2Teams() );
            values.put( KEY_EDDATE, myFotball.getDate() );
            int num = db.update( TABLE_CONTACTS, values, KEY_ID + "=" + myFotball.getid() , null );
            db.close();
            return num;


        }

        public int deletContactByld(myFotball fotball) {
            SQLiteDatabase db = this.getWritableDatabase();
            int num= db.delete( TABLE_CONTACTS ,  KEY_ID + "=" + myFotball.getid() , null);
            db.close();
            return num;
        }
        public ArrayList <myFotball> getAllfotball()
        {
            ArrayList<myFotball> fotballlist=new
                    ArrayList<myFotball>();
            String selectQuert="SELECT * FROM "+TABLE_CONTACTS;
            SQLiteDatabase db=this.getWritableDatabase();
            Cursor Cursor=db.rawQuery( selectQuert ,null );
            boolean flag=Cursor.moveToFirst();
            while (flag==true)
            {
               myFotball fotball=new myFotball(  );
                fotball.set(Cursor.setLong(0));
            }

        }


}



