package ba.sum.fsre.kvizapp.service;


import ba.sum.fsre.kvizapp.dto.UserDto;
import ba.sum.fsre.kvizapp.entity.User;

import java.util.List;


public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
