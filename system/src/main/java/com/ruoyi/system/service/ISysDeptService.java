package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.common.core.domain.TreeSelect;
import com.ruoyi.common.core.domain.entity.SysDept;

/**
 * 专业管理 服务层
 * 
 * @author ruoyi
 */
public interface ISysDeptService
{
    /**
     * 查询专业管理数据
     * 
     * @param dept 专业信息
     * @return 专业信息集合
     */
    public List<SysDept> selectDeptList(SysDept dept);

    /**
     * 查询专业树结构信息
     * 
     * @param dept 专业信息
     * @return 专业树信息集合
     */
    public List<TreeSelect> selectDeptTreeList(SysDept dept);

    /**
     * 构建前端所需要树结构
     * 
     * @param depts 专业列表
     * @return 树结构列表
     */
    public List<SysDept> buildDeptTree(List<SysDept> depts);

    /**
     * 构建前端所需要下拉树结构
     * 
     * @param depts 专业列表
     * @return 下拉树结构列表
     */
    public List<TreeSelect> buildDeptTreeSelect(List<SysDept> depts);

    /**
     * 根据权限ID查询专业树信息
     * 
     * @param roleId 权限ID
     * @return 选中专业列表
     */
    public List<Long> selectDeptListByRoleId(Long roleId);

    /**
     * 根据专业ID查询信息
     * 
     * @param deptId 专业ID
     * @return 专业信息
     */
    public SysDept selectDeptById(Long deptId);

    /**
     * 根据ID查询所有子专业（正常状态）
     * 
     * @param deptId 专业ID
     * @return 子专业数
     */
    public int selectNormalChildrenDeptById(Long deptId);

    /**
     * 是否存在专业子节点
     * 
     * @param deptId 专业ID
     * @return 结果
     */
    public boolean hasChildByDeptId(Long deptId);

    /**
     * 查询专业是否存在用户
     * 
     * @param deptId 专业ID
     * @return 结果 true 存在 false 不存在
     */
    public boolean checkDeptExistUser(Long deptId);

    /**
     * 校验专业名称是否唯一
     * 
     * @param dept 专业信息
     * @return 结果
     */
    public boolean checkDeptNameUnique(SysDept dept);

    /**
     * 校验专业是否有数据权限
     * 
     * @param deptId 专业id
     */
    public void checkDeptDataScope(Long deptId);

    /**
     * 新增保存专业信息
     * 
     * @param dept 专业信息
     * @return 结果
     */
    public int insertDept(SysDept dept);

    /**
     * 修改保存专业信息
     * 
     * @param dept 专业信息
     * @return 结果
     */
    public int updateDept(SysDept dept);

    /**
     * 删除专业管理信息
     * 
     * @param deptId 专业ID
     * @return 结果
     */
    public int deleteDeptById(Long deptId);
}
