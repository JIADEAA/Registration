package dao;

import pojo.Appli;

import java.sql.SQLException;

public interface AppliDao {
    public int saveApp(Appli appli);

    public int updateApp(Appli appli);

    public Appli searchAppId(String id);
}
