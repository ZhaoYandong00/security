drop table if exists SYS_USER;
CREATE TABLE SYS_USER (
    id       INTEGER      PRIMARY KEY AUTOINCREMENT
                          UNIQUE,
    username VARCHAR (20),
    password VARCHAR (20) 
);
drop table if exists SYS_ROLE;
CREATE TABLE SYS_ROLE (
    id   INTEGER      PRIMARY KEY AUTOINCREMENT
                      UNIQUE,
    name VARCHAR (30) 
);
drop table if exists SYS_USER_ROLES;
CREATE TABLE SYS_USER_ROLES (
    SYS_USER_ID INTEGER,
    ROLES_ID    INTEGER
);
insert into SYS_USER(id,username,password) values(1,'zyd','zyd');
insert into SYS_USER(id,username,password) values(2,'zl','zl');
insert into SYS_ROLE(id,name) values(1,'ROLE_ADMIN');
insert into SYS_ROLE(id,name) values(2,'ROLE_USER');
insert into SYS_USER_ROLES(SYS_USER_ID,ROLES_ID) values(1,1);
insert into SYS_USER_ROLES(SYS_USER_ID,ROLES_ID) values(2,2);
