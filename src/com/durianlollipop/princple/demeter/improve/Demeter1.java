package com.durianlollipop.princple.demeter.improve;

import java.util.ArrayList;
import java.util.List;

public class Demeter1 {
    public static void main(String[] args) {
        //创建一个SchoolManager对象
        SchoolManager schoolManager = new SchoolManager();
        //输出学院的员工Id和学校总部员工信息
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

//学校总部员工类
class Employee{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

//学院员工类
class CollegeEmployee{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

//学院管理类
class CollegeManager{
    //返回学院的所有员工
    public List<CollegeEmployee> getAllEmployee(){
        List<CollegeEmployee> list = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            CollegeEmployee employee = new CollegeEmployee();
            employee.setId("学院员工Id" + i);
            list.add(employee);
        }
        return list;
    }

    //输出学院员工
    public void printCollegeEmployee(){
        List<CollegeEmployee> list1 = this.getAllEmployee();
        System.out.println("----------------学院员工--------------------");
        for (CollegeEmployee employee : list1){
            System.out.println(employee.getId());
        }
    }

}

//学校管理类

//直接朋友 Employee，CollegeManager
//简间接朋友 CollegeEmployee
class SchoolManager{
    public List<Employee> getAllEmployee(){
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            Employee employee = new Employee();
            employee.setId("学校总部员工Id" + i);
            list.add(employee);
        }
        return list;
    }

    void printAllEmployee(CollegeManager sub){

        //将此处处理代码移到自己的类中
        sub.printCollegeEmployee();
        //获取到学校员工
        List<Employee> list2 = this.getAllEmployee();
        for (Employee employee : list2){
            System.out.println(employee.getId());
        }
    }
}