package com.voitko.lab4.service.impl;

import com.voitko.lab4.dao.DaoFactory;
import com.voitko.lab4.dao.description.RoleDao;
import com.voitko.lab4.entity.Role;
import com.voitko.lab4.exeptions.DaoException;
import com.voitko.lab4.exeptions.ServiceException;
import com.voitko.lab4.service.description.RoleService;

import java.util.Optional;

public class RoleServiceImpl implements RoleService {




    @Override
    public Optional<Role> retrieveRoleById(int roleId) throws ServiceException {
        try {
            RoleDao roleDao = DaoFactory.getInstance().getRoleDao();
            Optional<Role> result;
            result = roleDao.findById(roleId);
            return result;
        } catch (DaoException e) {

            throw new ServiceException(e.getMessage(), e);
        }

    }

    @Override
    public Optional<Role> retrieveRoleByRoleName(String roleName) throws ServiceException {
        try {
            RoleDao roleDao = DaoFactory.getInstance().getRoleDao();
            Optional<Role> result;
            result = roleDao.findByName(roleName);
            return result;
        } catch (DaoException e) {

            throw new ServiceException(e.getMessage(), e);
        }
    }
}