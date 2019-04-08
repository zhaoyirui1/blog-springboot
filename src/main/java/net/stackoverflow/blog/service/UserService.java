package net.stackoverflow.blog.service;

import net.stackoverflow.blog.common.Page;
import net.stackoverflow.blog.pojo.entity.Permission;
import net.stackoverflow.blog.pojo.entity.Role;
import net.stackoverflow.blog.pojo.entity.User;
import net.stackoverflow.blog.pojo.entity.UserRole;

import java.util.List;
import java.util.Map;

/**
 * 用户服务接口
 *
 * @author 凉衫薄
 */
public interface UserService {

    List<User> selectByPage(Page page);

    List<User> selectByCondition(Map<String, Object> searchMap);

    User selectById(String id);

    User insert(User user);

    int batchInsert(List<User> users);

    User deleteById(String id);

    int batchDeleteById(List<String> ids);

    User update(User user);

    int batchUpdate(List<User> users);

    UserRole grantRole(String userId, String roleCode);

    UserRole revokeRole(String userId, String roleCode);

    List<Role> getRoleByUserId(String userId);

    List<Permission> getPermissionByUserId(String userId);
}
