package com.example.taskmanager.mapper;

import com.example.taskmanager.dto.UserDto;
import com.example.taskmanager.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDto(User user);

    User toEntity(UserDto dto);
}
