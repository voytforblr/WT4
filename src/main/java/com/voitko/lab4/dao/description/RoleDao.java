package com.voitko.lab4.dao.description;

import com.voitko.lab4.dao.Dao;
import com.voitko.lab4.entity.Role;
import com.voitko.lab4.exeptions.DaoException;

import java.util.Optional;

public interface RoleDao extends Dao<Role> {


    Optional<Role> findByName(String name) throws DaoException;
}