# 部门工资前三高的员工  
Employee 表包含所有员工信息，每个员工有其对应的 Id, salary 和 department Id 。  


Id | Name | Salary | DepartmentId
------------ | ------------- | --------- | ------
1 | Joe | 70000 | 1
2 | Henry | 80000 | 2
3 | Sam | 60000 | 2
4 | Max | 90000 | 1
5 | Janet | 69000 | 1
6 | Randy | 85000 | 1

  
Department 表包含公司所有部门的信息。

Id | Name  
----- | -----  
1 | IT  
2 | Sales

# 解答  
## MySQL  
```sql
SELECT d.Name Department,e.Name Employee,e.Salary Salary
FROM Employee e,Department d
WHERE e.DepartmentId = d.Id AND (SELECT COUNT(DISTINCT Salary) FROM Employee WHERE d.Id=DepartmentId AND Salary > e.Salary)<3

```
  