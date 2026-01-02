# Write your MySQL query statement below
SELECT author_id AS id
FROM Views
WHERE AUTHOR_ID = VIEWER_ID
GROUP BY AUTHOR_ID
ORDER BY AUTHOR_ID ASC;