create database if not exists flight_reservation;
use flight_reservation;

drop table if exists reservation;
drop table if exists customer;
drop table if exists flight;
drop table if exists equipment;
drop table if exists airport;

create table equipment (
id int(11) not null auto_increment,
number_of_seats int(11) not null,
description varchar (60) not null,
tail_number int(11) not null,
primary key (id)
);
create table airport (
id int(11) not null auto_increment,
airport_code int(11) not null,
description enum("Los Angeles LAX", "Orlando International Airport (MCO)","Chicago International Airport ORD", "Denver International Airport (DEN)") not null,
primary key (id)
);

create table flight (
id int(11) not null auto_increment,
departure_date varchar(40) not null,
arrival_date varchar(40) not null,
equipment_id int(11) not null,
departure_airport_id int(20) not null,
arrival_airport_id int(20) not null,
description varchar(60) not null,
primary key (id),
foreign key (equipment_id) references equipment(id),
foreign key (departure_airport_id) references airport(id),
foreign key (arrival_airport_id) references airport(id)
);

create table customer (
id varchar(40) not null ,
first_name varchar(45) not null, 
last_name varchar(45) not null,
phone varchar(20),
primary key (id)
);

create table reservation (
id int(11) not null auto_increment,
customer_id varchar(40) not null,
flight_id int(11) not null,
primary key (id),
foreign key (customer_id) references customer(id),
foreign key (flight_id) references flight(id)
);
