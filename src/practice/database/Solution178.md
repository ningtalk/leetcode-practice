# 分数排名  

编写一个 SQL 查询来实现分数排名。如果两个分数相同，则两个分数排名（Rank）相同。
请注意，平分后的下一个名次应该是下一个连续的整数值。换句话说，名次之间不应该有“间隔”。  

题目描述：https://leetcode-cn.com/problems/rank-scores/description/  

# 解答  
## MySQL  
* 解题思路  
对于每一个分数，从表中找出有多少个大于或等于该分数的不重复分数，然后降序排列。  

* 代码  
```sql
SELECT Score, (SELECT COUNT(DISTINCT Score)  FROM Scores s2 WHERE s2.SCORE >= s1.SCORE ) r
FROM Scores s1
ORDER BY Score DESC;
```

