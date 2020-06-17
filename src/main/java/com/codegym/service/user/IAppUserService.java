package com.codegym.service.user;

import com.codegym.model.AppUser;

public interface IAppUserService {
    AppUser getUserByUserName(String username);
}
