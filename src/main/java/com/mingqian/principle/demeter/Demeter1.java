package com.mingqian.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mingqian on 2019/7/14
 */
public class Demeter1 {
  public static void main(String[] args) {

    SchoolManager manager = new SchoolManager();
    //输出学院的员工id 和 学校总部的员工信息
    manager.printAllEmployee(new CollegeManager());

    /**
     * 运行结果：
     *    --------学院员工----------
     * 学院员工id=0
     * 学院员工id=1
     * 学院员工id=2
     * 学院员工id=3
     * 学院员工id=4
     * 学院员工id=5
     * 学院员工id=6
     * 学院员工id=7
     * 学院员工id=8
     * 学院员工id=9
     * -------学校总部员工----------
     * 学校总部员工id=0
     * 学校总部员工id=1
     * 学校总部员工id=2
     * 学校总部员工id=3
     * 学校总部员工id=4
     */
  }
}

/**
 * 学校总部员工类
 */
class Employee {

  /**
   * 总部员工id
   */
  private String id;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}

/**
 * 学院的员工类
 */
class CollegeEmployee {

  /**
   * 学院员工id
   */
  private String id;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}

/**
 * 管理学院员工的管理类
 */
class CollegeManager {

  /**
   * 返回学院的所有员工
   *
   * @return
   */
  public List<CollegeEmployee> getAllCollegeEmployee() {

    List<CollegeEmployee> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      CollegeEmployee employee = new CollegeEmployee();
      employee.setId("学院员工id=" + String.valueOf(i));
      list.add(employee);
    }

    return list;
  }
}

/**
 * 学校管理类
 * 分析：
 * SchoolManager类的直接朋友有Employee，CollegeManager
 * CollegeEmployee 不是直接朋友，而是一个陌生类，这样就违背了迪米特法则
 */
class SchoolManager {

  /**
   * 返回学校总部的员工
   *
   * @return
   */
  public List<Employee> getAllEmployee() {
    List<Employee> list = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      Employee employee = new Employee();
      employee.setId("学校总部员工id=" + String.valueOf(i));
      list.add(employee);
    }
    return list;
  }

  /**
   * 该方法完成输出学下总部和学院员工信息(id)
   *
   * @param collegeManager
   */
  void printAllEmployee(CollegeManager collegeManager) {

    /**
     * 分析问题：
     *     1.这里的 CollegeEmployee 不是 SchoolManager 的直接朋友
     *     2. CollegeEmployee是以局部变量方式出现在 SchoolManager
     *     3.违反了迪米特法则
     */

    //获取学院员工
    List<CollegeEmployee> allCollegeEmployee = collegeManager.getAllCollegeEmployee();
    System.out.println("--------学院员工----------");
    for (CollegeEmployee employee : allCollegeEmployee) {
      System.out.println(employee.getId());
    }

    //获取学院总部员工
    List<Employee> allEmployee = this.getAllEmployee();
    System.out.println("-------学校总部员工----------");
    for (Employee employee : allEmployee) {
      System.out.println(employee.getId());
    }
  }
}