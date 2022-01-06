package org.tensorflow.lite.examples.detection.room;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface PersonalInfoDao {
    @Query("SELECT * FROM PersonalInfo")
    LiveData<List<PersonalInfo>> getAll();

    @Insert
    void insert(PersonalInfo personalInfo);

    @Update
    void update(PersonalInfo personalInfo);

    @Delete
    void delete(PersonalInfo personalInfo);

    @Query("DELETE FROM PersonalInfo")
    void deleteAll();

}
