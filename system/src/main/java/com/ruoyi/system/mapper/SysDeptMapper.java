package com.ruoyi.system.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.ruoyi.common.core.domain.entity.SysDept;

/**
 * 专业管理 数据层
 * 
 * @author ruoyi
 */
public interface SysDeptMapper
{
    /**
     * 查询专业管理数据
     * 
     * @param dept 专业信息
     * @return 专业信息集合
     */
    public List<SysDept> selectDeptList(SysDept dept);

    /**
     * 根据权限ID查询专业树信息
     * 
     * @param roleId 权限ID
     * @param deptCheckStrictly 专业树选择项是否关联显示
     * @return 选中专业列表
     */
    public List<Long> selectDeptListByRoleId(@Param("roleId") Long roleId, @Param("deptCheckStrictly") boolean deptCheckStrictly);

    /**
     * 根据专业ID查询信息
     * 
     * @param deptId 专业ID
     * @return 专业信息
     */
    public SysDept selectDeptById(Long deptId);

    /**
     * 根据ID查询所有子专业
     * 
     * @param deptId 专业ID
     * @return 专业列表
     */
    public List<SysDept> selectChildrenDeptById(Long deptId);

    /**
     * 根据ID查询所有子专业（正常状态）
     * 
     * @param deptId 专业ID
     * @return 子专业数
     */
    public int selectNormalChildrenDeptById(Long deptId);

    /**
     * 是否存在子节点
     * 
     * @param deptId 专业ID
     * @return 结果
     */
    public int hasChildByDeptId(Long deptId);

    /**
     * 查询专业是否存在用户
     * 
     * @param deptId 专业ID
     * @return 结果
     */
    public int checkDeptExistUser(Long deptId);

    /**
     * 校验专业名称是否唯一
     * 
     * @param deptName 专业名称
     * @param parentId 父专业ID
     * @return 结果
     */
    public SysDept checkDeptNameUnique(@Param("deptName") String deptName, @Param("parentId") Long parentId);

    /**
     * 新增专业信息
     * 
     * @param dept 专业信息
     * @return 结果
     */
    public int insertDept(SysDept dept);

    /**
     * 修改专业信息
     * 
     * @param dept 专业信息
     * @return 结果
     */
    public int updateDept(SysDept dept);

    /**
     * 修改所在专业正常状态
     * 
     * @param deptIds 专业ID组
     */
    public void updateDeptStatusNormal(Long[] deptIds);

    /**
     * 修改子元素关系
     * 
     * @param depts 子元素
     * @return 结果
     */
    public int updateDeptChildren(@Param("depts") List<SysDept> depts);

    /**
     * 删除专业管理信息
     * 
     * @param deptId 专业ID
     * @return 结果
     */
    public int deleteDeptById(Long deptId);
}
