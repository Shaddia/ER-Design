package com.epam.rd.tasks.sqlqueries;

/**
 * Implement sql queries like described
 */
public class SqlQueries {
    // Select all employees sorted by last name in ascending order
    // language=HSQLDB
    String select01 = "SELECT * FROM EMPLOYEE ORDER BY LASTNAME ASC;";

    // Select employees having no more than 5 characters in last name sorted by last name in ascending order
    // language=HSQLDB
    String select02 = "SELECT * FROM EMPLOYEE WHERE LENGTH(LASTNAME) <= 5 ORDER BY LASTNAME ASC;";

    // Select employees having salary no less than 2000 and no more than 3000
    // language=HSQLDB
    String select03 = "SELECT * FROM EMPLOYEE WHERE SALARY >= 2000 AND SALARY <= 3000;";

    // Select employees having salary no more than 2000 or no less than 3000
    // language=HSQLDB
    String select04 = "SELECT * FROM EMPLOYEE WHERE SALARY <= 2000 OR SALARY >= 3000;";

    // Select all employees assigned to departments and corresponding department
    // language=HSQLDB
    String select05 = "SELECT E.*, D.* FROM EMPLOYEE E JOIN DEPARTMENT D ON E.DEPARTMENT = D.ID;";

    // Select all employees and corresponding department name if there is one.
    // Name column containing name of the department "depname".
    // language=HSQLDB
    String select06 = "SELECT E.*, D.NAME AS depname FROM EMPLOYEE E LEFT JOIN DEPARTMENT D ON E.DEPARTMENT = D.ID;";

    // Select total salary of all employees. Name it "total".
    // language=HSQLDB
    String select07 = "SELECT SUM(SALARY) AS total FROM EMPLOYEE;";

    // Select all departments and amount of employees assigned per department
    // Name column containing name of the department "depname".
    // Name column containing employee amount "staff_size".
    // language=HSQLDB
    String select08 = "SELECT D.NAME AS depname, COUNT(E.ID) AS staff_size FROM DEPARTMENT D LEFT JOIN EMPLOYEE E ON D.ID = E.DEPARTMENT GROUP BY D.NAME;";

    // Select all departments and values of total and average salary per department
    // Name column containing name of the department "depname".
    // language=HSQLDB
    String select09 = "SELECT D.NAME AS depname, SUM(E.SALARY) AS total, AVG(E.SALARY) AS average FROM DEPARTMENT D LEFT JOIN EMPLOYEE E ON D.ID = E.DEPARTMENT GROUP BY D.NAME;";

    // Select lastnames of all employees and lastnames of their managers if an employee has a manager.
    // Name column containing employee's lastname "employee".
    // Name column containing manager's lastname "manager".
    // language=HSQLDB
    String select10 = "SELECT E.LASTNAME AS employee, M.LASTNAME AS manager " +
                      "FROM EMPLOYEE E " +
                      "LEFT JOIN EMPLOYEE M ON E.MANAGER = M.ID;";
}
