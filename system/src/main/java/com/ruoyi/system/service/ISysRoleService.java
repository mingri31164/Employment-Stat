package com.ruoyi.system.service;

import java.util.List;
import java.util.Set;
import com.ruoyi.common.core.domain.entity.SysRole;
import com.ruoyi.system.domain.SysUserRole;

/**
 * 权限业务层
 * 
 * @author ruoyi
 */
public interface ISysRoleService
{
    /**
     * 根据条件分页查询权限数据
     * 
     * @param role 权限信息
     * @return 权限数据集合信息
     */
    public List<SysRole> selectRoleList(SysRole role);

    /**
     * 根据用户ID查询权限列表
     * 
     * @param userId 用户ID
     * @return 权限列表
     */
    public List<SysRole> selectRolesByUserId(Long userId);

    /**
     * 根据用户ID查询权限权限
     * 
     * @param userId 用户ID
     * @return 权限列表
     */
    public Set<String> selectRolePermissionByUserId(Long userId);

    /**
     * 查询所有权限
     * 
     * @return 权限列表
     */
    public List<SysRole> selectRoleAll();

    /**
     * 根据用户ID获取权限选择框列表
     * 
     * @param userId 用户ID
     * @return 选中权限ID列表
     */
    public List<Long> selectRoleListByUserId(Long userId);

    /**
     * 通过权限ID查询权限
     * 
     * @param roleId 权限ID
     * @return 权限对象信息
     */
    public SysRole selectRoleById(Long roleId);

    /**
     * 校验权限名称是否唯一
     * 
     * @param role 权限信息
     * @return 结果
     */
    public boolean checkRoleNameUnique(SysRole role);

    /**
     * 校验权限权限是否唯一
     * 
     * @param role 权限信息
     * @return 结果
     */
    public boolean checkRoleKeyUnique(SysRole role);

    /**
     * 校验权限是否允许操作
     * 
     * @param role 权限信息
     */
    public void checkRoleAllowed(SysRole role);

    /**
     * 校验权限是否有数据权限
     * 
     * @param roleIds 权限id
     */
    public void checkRoleDataScope(Long... roleIds);

    /**
     * 通过权限ID查询权限使用数量
     * 
     * @param roleId 权限ID
     * @return 结果
     */
    public int countUserRoleByRoleId(Long roleId);

    /**
     * 新增保存权限信息
     * 
     * @param role 权限信息
     * @return 结果
     */
    public int insertRole(SysRole role);

    /**
     * 修改保存权限信息
     * 
     * @param role 权限信息
     * @return 结果
     */
    public int updateRole(SysRole role);

    /**
     * 修改权限状态
     * 
     * @param role 权限信息
     * @return 结果
     */
    public int updateRoleStatus(SysRole role);

    /**
     * 修改数据权限信息
     * 
     * @param role 权限信息
     * @return 结果
     */
    public int authDataScope(SysRole role);

    /**
     * 通过权限ID删除权限
     * 
     * @param roleId 权限ID
     * @return 结果
     */
    public int deleteRoleById(Long roleId);

    /**
     * 批量删除权限信息
     * 
     * @param roleIds 需要删除的权限ID
     * @return 结果
     */
    public int deleteRoleByIds(Long[] roleIds);

    /**
     * 取消授权用户权限
     * 
     * @param userRole 用户和权限关联信息
     * @return 结果
     */
    public int deleteAuthUser(SysUserRole userRole);

    /**
     * 批量取消授权用户权限
     * 
     * @param roleId 权限ID
     * @param userIds 需要取消授权的用户数据ID
     * @return 结果
     */
    public int deleteAuthUsers(Long roleId, Long[] userIds);

    /**
     * 批量选择授权用户权限
     * 
     * @param roleId 权限ID
     * @param userIds 需要删除的用户数据ID
     * @return 结果
     */
    public int insertAuthUsers(Long roleId, Long[] userIds);
}
