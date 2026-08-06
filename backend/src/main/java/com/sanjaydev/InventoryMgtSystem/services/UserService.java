package com.sanjaydev.InventoryMgtSystem.services;

import com.sanjaydev.InventoryMgtSystem.dtos.LoginRequest;
import com.sanjaydev.InventoryMgtSystem.dtos.RegisterRequest;
import com.sanjaydev.InventoryMgtSystem.dtos.Response;
import com.sanjaydev.InventoryMgtSystem.dtos.UserDTO;
import com.sanjaydev.InventoryMgtSystem.models.User;

public interface UserService {
    Response registerUser(RegisterRequest registerRequest);

    Response loginUser(LoginRequest loginRequest);

    Response getAllUsers();

    User getCurrentLoggedInUser();

    Response getUserById(Long id);

    Response updateUser(Long id, UserDTO userDTO);

    Response deleteUser(Long id);

    Response getUserTransactions(Long id);
}
