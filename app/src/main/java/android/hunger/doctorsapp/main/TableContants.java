package android.hunger.doctorsapp.main;

/**
 * Created by hunger on 4/26/2017.
 */

public class TableContants {

    public static final String TABLE_NAME_PATIENT = "patient";
    public static final String TABLE_NAME_APPIONTMENT = "appionment";
    public static final String TABLE_NAME_CLINICAL_NOTES = "clinicalnotes";
    public static String[] TABLE_PATIENT_COLUMNS = new String[]{"_id","name","date","age","gender" +
            "    String dob;\n" +
            "    String fathersname;\n" +
            "    String mothersname;\n" +
            "    String mobileno;\n" +
            "    String altphoneno;\n" +
            "    String emailid;\n" +
            "    String address;\n" +
            "    String bloodtype;\n" +
            "    int weight;\n" +
            "    int height;\n" +
            "    String company;\n" +
            "    String occupation;\n" +
            "    String othernotes;\n"};
    public static final String CREATE_TABLE_PATIENT = "CREATE TABLE " + TABLE_NAME_PATIENT + " ( " +
            "_id" + " integer primary key autoincrement, " +
            "name" + " text " + "gender" + "INTEGER"+
            " ); ";

    public static final String CREATE_TABLE_APPIONTMENT = "";
    public static final String CREATE_TABLE_CLINICAL_NOTES = "";

}
