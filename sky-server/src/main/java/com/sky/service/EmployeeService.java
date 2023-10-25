package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);
    /**
     * 新增员工
     * @param employeeDTO
     * @return
     */
    void save(EmployeeDTO employeeDTO);

    /***
     * 分页查询
     * @param  employeePageQueryDTO
     * @return
     * @author LanL
     * @date 2023/10/24 22:05
     */
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

    /***
     * 启用禁用员工账号
     * @param status
     * @param id
     * @return
     * @author LanL
     * @date 2023/10/25 0:42
     */
    void startOrStop(Integer status, Long id);

    /**
     * 根据id查询员工
     * @param
     * @return
     * @author LanL
     * @date 2023/10/25 19:07
     */
    Employee getById(Long id);

    /**
     * 编辑员工信息
     * @param
     * @return
     * @author LanL
     * @date 2023/10/25 19:18
     */
    void update(EmployeeDTO employeeDTO);
}
