package com.example.demo.userrole;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface UserRoleMapper {
    @Mapping(source = "userId", target = "user.id")
    @Mapping(source = "userUserName", target = "user.userName")
    @Mapping(source = "userPassword", target = "user.password")
    @Mapping(source = "roleId", target = "role.id")
    @Mapping(source = "roleName", target = "role.name")
    UserRole toEntity(UserRoleDto userRoleDto);

    @InheritInverseConfiguration(name = "toEntity")
    UserRoleDto toDto(UserRole userRole);

    @InheritConfiguration(name = "toEntity")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateUserRoleFromUserRoleDto(UserRoleDto userRoleDto, @MappingTarget UserRole userRole);
}