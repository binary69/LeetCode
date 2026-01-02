# Write your MySQL query statement below
SELECT a.Id 
FROM Weather a
JOIN Weather b ON DATEDIFF(a.recordDate,b.recordDate)=1
WHERE a.temperature > b.temperature;