# 第N高的薪水  
编写一个 SQL 查询，获取 `Employee` 表中第 n 高的薪水（Salary），如果不存在则返回null。    
Id | Salary 
--- | ------- 
1 | 100
2 | 200
3 | 300
  
#  解答  
##  Oracle  
* 解题思路  
  1. 首先根据字段Salary降序排序，需要去重；（`distinct`, `order by`）  
  2. 使用Oracle的`rownum`取排序后的结果的前n条记录，并增加字段`rownum`;  
  3. 取`rownum`等于n的数据返回，注意没有时返回null。  
  
* 代码    
```sql
CREATE FUNCTION getNthHighestSalary(N IN NUMBER) RETURN NUMBER IS
result NUMBER;
BEGIN
    /* Write your PL/SQL query statement below */
    select nvl(Salary, null) into result from (select rownum rn,Salary from (select distinct Salary from Employee order by Salary desc) where rownum < n+1) where rn = n;
    RETURN result;
END;
```
***

## MySQL  
* 解题思路  
  1. 根据字段Salary降序排列并去重后使用`limit`取第`n-1`条数据（`limit`从0开始计数）。   
* 代码    
```sql
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  DECLARE m int;
  SET m = N - 1;
  RETURN (
      # Write your MySQL query statement below.
      select distinct Salary from Employee order by Salary desc limit m, 1
  );
END
```   