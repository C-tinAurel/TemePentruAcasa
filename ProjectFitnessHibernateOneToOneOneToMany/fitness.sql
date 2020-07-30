drop database if exists fitness;

create database fitness;

use fitness;
drop table passes;

create table passes(
id int not null primary key auto_increment,
nume varchar(50) not null,
price int not null,
begin_date int not null,
end_date int not null);



drop table if exists workouts;

create table workouts(
id int not null primary key auto_increment unique,
name varchar(20) not null,
duration int not null,
aerobic boolean);

drop table if exists gyms;

alter table gyms drop foreign key fk_gyms_workouts;

create table gyms(
id int not null primary key auto_increment ,
name varchar(15) not null,
workouts_id int not null unique,
constraint fk_gyms_workouts 
foreign key(workouts_id) 
references workouts(id));

drop table if exists personas;

create table personas(
id int not null primary key auto_increment,
name varchar(15) not null,
surname varchar(15) not null,
year_of_birth int not null,
passes_id int not null,
constraint fk_personas_passes 
foreign key (passes_id) 
references passes(id),
workouts_id int not null unique,
constraint fk_personas_workouts 
foreign key (workouts_id) 
references workouts(id));

