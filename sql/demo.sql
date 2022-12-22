-- auto-generated definition
create table demo
(
    id         bigint auto_increment
        primary key,
    name       varchar(20)   null,
    department varchar(20)   null,
    salary     decimal(9, 2) null
)
    comment 'This is a demo';

