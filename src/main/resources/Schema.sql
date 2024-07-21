--Table Creation Schema for an Admin Database Table

CREATE TABLE admin (
	adminid serial PRIMARY KEY UNIQUE NOT NULL,
	email VARCHAR ( 255 ) UNIQUE NOT NULL,
	firstname VARCHAR ( 255 ),
	lastname VARCHAR ( 255 ),
	password VARCHAR ( 50 ) NOT NULL,
);

--Table Creation Schema for an Employee Database Table
CREATE TABLE employees (
	employeeid PRIMARY KEY UNIQUE NOT NULL,
	firstname VARCHAR ( 255 ),
    lastname VARCHAR ( 255 ),
    employeenumber INTEGER NOT NULL,
    department VARCHAR ( 255 ) NOT NULL,
	email VARCHAR ( 255 ) UNIQUE NOT NULL,
	contacts INTEGER,
	CONSTRAINT adminid FOREIGN KEY (adminid)  REFERENCES Admin(adminid)
);