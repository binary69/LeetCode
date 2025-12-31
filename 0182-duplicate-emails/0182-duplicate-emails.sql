# Write your MySQL query statement below
SELECT Email
FROM PERSON
GROUP BY EMAIL
HAVING COUNT(EMAIL)>1;