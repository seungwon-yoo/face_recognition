package org.tensorflow.lite.examples.detection.room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

@Database(entities = PersonalInfo.class, version = 1)
@TypeConverters(Converters.class)
public abstract class PersonalInfoDatabase extends RoomDatabase {
    private static PersonalInfoDatabase INSTANCE;

    public abstract PersonalInfoDao personalInfoDao();

    public static PersonalInfoDatabase getAppDatabase(Context context){
        if(INSTANCE == null){
            /*INSTANCE = Room.databaseBuilder(
                    context, PersonalInfoDatabase.class, "personalInfo-db").setJournalMode(JournalMode.TRUNCATE).build();*/
            INSTANCE = Room.databaseBuilder(
                    context, PersonalInfoDatabase.class, "personalInfo-db").build();
        }
        return INSTANCE;
    }



    public static void destroyInstance(){
        INSTANCE = null;
    }
}
