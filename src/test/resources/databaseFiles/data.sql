
INSERT INTO equipment (number_of_seats, description, tail_number) VALUES (234, "Airbus a354",3456), (245, "Boeing 747",276), (267, "Daron Jetblue",158);


INSERT INTO airport (airport_code, description) VALUES (123, "Los Angeles LAX"), (156, "Orlando International Airport (MCO)"),
 (134, "Chicago International Airport ORD"), (187, "Denver International Airport (DEN)");
 
 
INSERT INTO flight (departure_date, arrival_date, equipment_id, departure_airport_id, arrival_airport_id, description) VALUES("2021-01-23", "2021-01-23", 2, 3 , 1, "American Airline"),
("2021-06-20", "2021-06-20", 1, 2 , 3, "American Airline"),("2021-01-23", "2021-01-23", 2, 3 , 4, "American Airline");


INSERT INTO customer VALUES ('ATTAWAY_HECKTOR', 'Hektor', 'Attaway', '755.223.5969'),
('MAYNARD_TORBJORG', 'Torbjørg', 'Maynard', '256.399.4665'),
('FOSTER_BUSINGE', 'Businge', 'Foster', '399.377.3854');


INSERT INTO reservation (customer_id, flight_id) VALUES ("ATTAWAY_HECKTOR", 1),('MAYNARD_TORBJORG', 3),("FOSTER_BUSINGE", 2);
