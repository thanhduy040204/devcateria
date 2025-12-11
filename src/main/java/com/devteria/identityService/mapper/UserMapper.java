package com.devteria.identityService.mapper;

import com.devteria.identityService.dto.request.UserCreationRequest;
import com.devteria.identityService.dto.request.UserUpdateRequest;
import com.devteria.identityService.dto.response.UserResponse;
import com.devteria.identityService.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);
    UserResponse toUserResponse(User user);
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}

