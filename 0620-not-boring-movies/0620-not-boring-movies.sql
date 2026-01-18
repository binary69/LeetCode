# Write your MySQL query statement below
SELECT * FROM Cinema 
WHERE id MOD 2 = 1 AND NOT description = 'boring'
ORDER BY rating DESC;