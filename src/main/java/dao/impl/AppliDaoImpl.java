package dao.impl;

import dao.AppliDao;
import org.apache.commons.dbutils.QueryRunner;
import pojo.Appli;

import java.sql.SQLException;

public class AppliDaoImpl extends BaseDao implements AppliDao {
    @Override
    public int saveApp(Appli appli) {
        String sql = "insert into app(`id`,`name`,`sex`,`phone`,`dept`,`desc`)values(?,?,?,?,?,?)";
        return update(sql, appli.getId(), appli.getName(), appli.getSex(), appli.getPhone(), appli.getDept(), appli.getDesc());
    }

    @Override
    public int updateApp(Appli appli) {
        String sql = "update app set `name` = ?,`sex` = ?,`phone` = ?,`dept` = ?,`desc` = ? where id = ?";
        return update(sql, appli.getName(), appli.getSex(), appli.getPhone(), appli.getDept(), appli.getDesc(), appli.getId());
    }

    @Override
    public Appli searchAppId(String id) {
        String sql = "select `id`,`name`,`sex`,`phone`,`dept`,`desc` from app where id = ?";
        return queryForOne(Appli.class, sql, id);
    }


}
