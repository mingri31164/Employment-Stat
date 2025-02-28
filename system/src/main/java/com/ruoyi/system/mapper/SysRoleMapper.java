package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.common.core.domain.entity.SysRole;

/**
 * 权限表 数据层
 * 
 * @author ruoyi
 */
public interface SysRoleMapper
{
    /**
     * 根据条件分页查询权限数据
     * 
     * @param role 权限信息
     * @return 权限数据集合信息
     */
    public List<SysRole> selectRoleList(SysRole role);

    /**
     * 根据用户ID查询权限
     * 
     * @param userId 用户ID
     * @return 权限列表
     */
    public List<SysRole> selectRolePermissionByUserId(Long userId);

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
     * 根据用户ID查询权限
     * 
     * @param userName 用户名
     * @return 权限列表
     */
    public List<SysRole> selectRolesByUserName(String userName);

    /**
     * 校验权限名称是否唯一
     * 
     * @param roleName 权限名称
     * @return 权限信息
     */
    public SysRole checkRoleNameUnique(String roleName);

    /**
     * 校验权限权限是否唯一
     * 
     * @param roleKey 权限权限
     * @return 权限信息
     */
    public SysRole checkRoleKeyUnique(String roleKey);

    /**
     * 修改权限信息
     * 
     * @param role 权限信息
     * @return 结果
     */
    public int updateRole(SysRole role);

    /**
     * 新增权限信息
     * 
     * @param role 权限信息
     * @return 结果
     */
    public int insertRole(SysRole role);

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
}
