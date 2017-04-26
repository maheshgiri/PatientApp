package android.hunger.doctorsapp.helpers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by hunger on 4/26/2017.
 */

public class DoctorsDatabaseHelper extends SQLiteOpenHelper {

    private static DoctorsDatabaseHelper sInstance;

    private static final String DATABASE_NAME = "doctorspadindb";
    private static final String DATABASE_PATIIENT_TABLE = "patient";
    private static final String DATABASE_VISIT_HISTORY_TABLE = "visit";

    private static final int DATABASE_VERSION = 1;

    //Make Thread Safe
    public static synchronized DoctorsDatabaseHelper getInstance(Context context) {

        // Use the application context, which will ensure that you
        // don't accidentally leak an Activity's context.
        // See this article for more information: http://bit.ly/6LRzfx
        if (sInstance == null) {
            sInstance = new DoctorsDatabaseHelper(context.getApplicationContext());
        }
        return sInstance;
    }


    public DoctorsDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {


    }
}
