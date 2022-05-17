package service.impl;

import dao.AppliDao;
import dao.impl.AppliDaoImpl;
import pojo.Appli;
import service.AppliService;

public class AppliServiceImpl implements AppliService {
    private AppliDao appliDao = new AppliDaoImpl();

    @Override
    public void signup(Appli appli) {

        appliDao.saveApp(appli);

    }

    @Override
    public void resignup(Appli appli) {
        appliDao.updateApp(appli);
    }

    @Override
    public boolean existId(String id) {
        if (appliDao.searchAppId(id) == null) {

            return false;
        }
        return true;
    }
}
