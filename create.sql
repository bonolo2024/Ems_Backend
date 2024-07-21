create sequence admin_seq start with 1 increment by 50;
create sequence employees_seq start with 1 increment by 50;
create table admin (adminid integer not null, email varchar(255), firstname varchar(255), lastname varchar(255), password varchar(255), primary key (adminid));
create table employees (admin_id integer not null, employeeid integer not null, employeenumber integer not null unique, contacts bigint not null unique, department varchar(255), email varchar(255) not null unique, firstname varchar(255), lastname varchar(255), primary key (employeeid));
alter table if exists employees add constraint FKesg0c03q35bfag5vixeh8f3ij foreign key (admin_id) references admin;
