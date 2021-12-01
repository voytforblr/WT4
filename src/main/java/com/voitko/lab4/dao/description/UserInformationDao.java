package com.voitko.lab4.dao.description;

import com.voitko.lab4.dao.Dao;
import com.voitko.lab4.entity.UserInformation;
import com.voitko.lab4.exeptions.DaoException;


public interface UserInformationDao extends Dao<UserInformation> {

    void updateById(int id, UserInformation userInformation) throws DaoException;
}
