--TABLE : Student
 
Id Subject Marks
1  Maths    80
1  Science  70
1  English   75
2  Maths    90
2  Science  60
2  English   85
3  Maths    85
3  Science  60
3  English   75
Find the Highest marks in each subject.

SELECT Subject, MAX(Marks) AS Highest_Marks
FROM Student
GROUP BY Subject;

--Retrieve the list of employees who joined in the last 6 months:
 
--Data:
 
--| id | name  | join_date |
--|----|-------|-----------|
--| 1  | Alice | 2024-09-01|
--| 2  | Bob   | 2023-11-15|
--| 3  | Carol | 2024-01-20|
--| 4  | Dave  | 2023-05-10|

Select name from employees where join_date<

SQL Query (MySQL, PostgreSQL)
SELECT * 
FROM Employee
WHERE join_date >= CURRENT_DATE - INTERVAL 6 MONTH;

SQL Query (SQL Server):
SELECT * 
FROM Employee
WHERE join_date >= DATEADD(MONTH, -6, GETDATE());