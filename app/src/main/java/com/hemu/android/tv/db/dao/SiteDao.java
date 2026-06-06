package com.hemu.android.tv.db.dao;

import androidx.room.Dao;
import androidx.room.Query;

import com.hemu.android.tv.bean.Site;

import java.util.List;

@Dao
public abstract class SiteDao extends BaseDao<Site> {

    @Query("SELECT * FROM Site")
    public abstract List<Site> findAll();

    @Query("DELETE FROM Site")
    public abstract void delete();
}
