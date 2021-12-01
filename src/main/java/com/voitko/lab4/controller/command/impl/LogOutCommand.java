package com.voitko.lab4.controller.command.impl;

import com.voitko.lab4.controller.command.Command;
import com.voitko.lab4.controller.command.CommandResult;
import com.voitko.lab4.controller.command.CommandResultType;
import com.voitko.lab4.controller.context.RequestContext;
import com.voitko.lab4.controller.context.RequestContextHelper;

import javax.servlet.http.HttpServletResponse;

public class LogOutCommand implements Command {
    private static final String LOGIN_PAGE = "command=logIn";
    private static final String USER = "user";
    private static final String ROLE = "role";

    @Override
    public CommandResult execute(RequestContextHelper helper, HttpServletResponse response) {
        RequestContext requestContext = helper.createContext();
        requestContext.removeSessionAttribute(USER);
        requestContext.removeSessionAttribute(ROLE);
        helper.updateRequest(requestContext);
        return new CommandResult(LOGIN_PAGE, CommandResultType.REDIRECT);
    }
}