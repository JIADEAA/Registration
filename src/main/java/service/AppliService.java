package service;

import pojo.Appli;

public interface AppliService {
    public void signup(Appli appli);

    public void resignup(Appli appli);

    public boolean existId(String id);
}
