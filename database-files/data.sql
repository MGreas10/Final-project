USE flight_reservation;

INSERT INTO airport 
    (airport_code, description) 
VALUES 
    ("DEN", "Denver International Airport"),
    ("LAX", "Los Angeles International Airport"), 
    ("MCO", "Orlando International Airport"),
    ("ORD", "Chicago O'Hare International Airport");


INSERT INTO customer 
  (first_name, last_name, phone)
VALUES 
    ('Hektor', 'Attaway', '755.223.5969'),
    ('Businge', 'Foster', '399.377.3854'),
    ('Torbjørg', 'Maynard', '256.399.4665');



INSERT INTO equipment 
    (description, number_of_seats, tail_number) 
VALUES 
    ("Airbus a354", 234, "N183DN"), 
    ("Boeing 747", 276, "N832MH"), 
    ("Daron Jetblue", 158 , "N919DU");
 
 
INSERT INTO flight 
    (arrival_airport_id, arrival_date_time, departure_airport_id, departure_date_time, description, equipment_id) 
VALUES
    (1, "2021-11-25T05:25:00Z", 2, "2021-11-25T02:55:00Z", "American Airlines", 1),
    (1, "2021-11-25T06:25:00Z", 3, "2021-11-25T03:55:00Z", "Delta Airlines", 2),
    (1, "2021-11-25T07:25:00Z", 4, "2021-11-25T04:55:00Z", "United Airlines", 3);


INSERT INTO reservation 
    (customer_id, flight_id) 
VALUES 
    (1, 1),
    (2, 3),
    (3, 2);
