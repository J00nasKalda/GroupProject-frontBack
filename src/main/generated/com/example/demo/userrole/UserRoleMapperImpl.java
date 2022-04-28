package com.example.demo.userrole;

import com.example.demo.role.Role;
import com.example.demo.user.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-28T09:55:28+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class UserRoleMapperImpl implements UserRoleMapper {

    @Override
    public UserRole toEntity(UserRoleDto userRoleDto) {
        if ( userRoleDto == null ) {
            return null;
        }

        UserRole userRole = new UserRole();

        userRole.setUser( userRoleDtoToUser( userRoleDto ) );
        userRole.setRole( userRoleDtoToRole( userRoleDto ) );
        userRole.setId( userRoleDto.getId() );

        return userRole;
    }

    @Override
    public UserRoleDto toDto(UserRole userRole) {
        if ( userRole == null ) {
            return null;
        }

        Integer userId = null;
        String userUserName = null;
        String userPassword = null;
        Integer roleId = null;
        String roleName = null;
        Integer id = null;

        userId = userRoleUserId( userRole );
        userUserName = userRoleUserUserName( userRole );
        userPassword = userRoleUserPassword( userRole );
        roleId = userRoleRoleId( userRole );
        roleName = userRoleRoleName( userRole );
        id = userRole.getId();

        UserRoleDto userRoleDto = new UserRoleDto( id, userId, userUserName, userPassword, roleId, roleName );

        return userRoleDto;
    }

    @Override
    public void updateUserRoleFromUserRoleDto(UserRoleDto userRoleDto, UserRole userRole) {
        if ( userRoleDto == null ) {
            return;
        }

        if ( userRole.getUser() == null ) {
            userRole.setUser( new User() );
        }
        userRoleDtoToUser1( userRoleDto, userRole.getUser() );
        if ( userRole.getRole() == null ) {
            userRole.setRole( new Role() );
        }
        userRoleDtoToRole1( userRoleDto, userRole.getRole() );
        if ( userRoleDto.getId() != null ) {
            userRole.setId( userRoleDto.getId() );
        }
    }

    protected User userRoleDtoToUser(UserRoleDto userRoleDto) {
        if ( userRoleDto == null ) {
            return null;
        }

        User user = new User();

        user.setId( userRoleDto.getUserId() );
        user.setUserName( userRoleDto.getUserUserName() );
        user.setPassword( userRoleDto.getUserPassword() );

        return user;
    }

    protected Role userRoleDtoToRole(UserRoleDto userRoleDto) {
        if ( userRoleDto == null ) {
            return null;
        }

        Role role = new Role();

        role.setId( userRoleDto.getRoleId() );
        role.setName( userRoleDto.getRoleName() );

        return role;
    }

    private Integer userRoleUserId(UserRole userRole) {
        if ( userRole == null ) {
            return null;
        }
        User user = userRole.getUser();
        if ( user == null ) {
            return null;
        }
        Integer id = user.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String userRoleUserUserName(UserRole userRole) {
        if ( userRole == null ) {
            return null;
        }
        User user = userRole.getUser();
        if ( user == null ) {
            return null;
        }
        String userName = user.getUserName();
        if ( userName == null ) {
            return null;
        }
        return userName;
    }

    private String userRoleUserPassword(UserRole userRole) {
        if ( userRole == null ) {
            return null;
        }
        User user = userRole.getUser();
        if ( user == null ) {
            return null;
        }
        String password = user.getPassword();
        if ( password == null ) {
            return null;
        }
        return password;
    }

    private Integer userRoleRoleId(UserRole userRole) {
        if ( userRole == null ) {
            return null;
        }
        Role role = userRole.getRole();
        if ( role == null ) {
            return null;
        }
        Integer id = role.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String userRoleRoleName(UserRole userRole) {
        if ( userRole == null ) {
            return null;
        }
        Role role = userRole.getRole();
        if ( role == null ) {
            return null;
        }
        String name = role.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    protected void userRoleDtoToUser1(UserRoleDto userRoleDto, User mappingTarget) {
        if ( userRoleDto == null ) {
            return;
        }

        if ( userRoleDto.getUserId() != null ) {
            mappingTarget.setId( userRoleDto.getUserId() );
        }
        if ( userRoleDto.getUserUserName() != null ) {
            mappingTarget.setUserName( userRoleDto.getUserUserName() );
        }
        if ( userRoleDto.getUserPassword() != null ) {
            mappingTarget.setPassword( userRoleDto.getUserPassword() );
        }
    }

    protected void userRoleDtoToRole1(UserRoleDto userRoleDto, Role mappingTarget) {
        if ( userRoleDto == null ) {
            return;
        }

        if ( userRoleDto.getRoleId() != null ) {
            mappingTarget.setId( userRoleDto.getRoleId() );
        }
        if ( userRoleDto.getRoleName() != null ) {
            mappingTarget.setName( userRoleDto.getRoleName() );
        }
    }
}
