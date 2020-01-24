package com.skillbox.blog.mapper;

import com.skillbox.blog.dto.UserDto;
import com.skillbox.blog.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserDtoToUser {

    User map(UserDto userDto);
}
