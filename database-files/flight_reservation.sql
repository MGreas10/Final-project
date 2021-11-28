drop database if exists flight_reservation;
create database if not exists flight_reservation;
use flight_reservation;

drop table if exists airport;
drop table if exists customer;
drop table if exists equipment;
drop table if exists flight;
drop table if exists reservation;

create table airport (
    id int(11) not null auto_increment,
    airport_code varchar(3) not null,
    description varchar(40) not null,
    primary key (id)
);

create table customer (
    id int(11) not null auto_increment,
    first_name varchar(45) not null, 
    last_name varchar(45) not null,
    phone varchar(20),
    primary key (id)
);

create table equipment (
    id int(11) not null auto_increment,
    description varchar(60) not null,
    number_of_seats int(11) not null,
    tail_number varchar(20) not null,
    primary key (id)
);

create table flight (
    id int(11) not null auto_increment,
    arrival_airport_id int(11) not null,
    arrival_date_time varchar(40) not null,
    departure_airport_id int(11) not null,
    departure_date_time varchar(40) not null,
    description varchar(60) not null,
    equipment_id int(11) not null,
    primary key (id),
    foreign key (arrival_airport_id) references airport(id),
    foreign key (departure_airport_id) references airport(id),
    foreign key (equipment_id) references equipment(id)
);

create table reservation (
    id int(11) not null auto_increment,
    customer_id int(11) not null,
    flight_id int(11) not null,
    primary key (id),
    foreign key (customer_id) references customer(id),
    foreign key (flight_id) references flight(id)
);
