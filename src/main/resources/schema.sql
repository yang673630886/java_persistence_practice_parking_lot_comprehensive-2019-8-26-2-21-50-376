CREATE TABLE employee
(
   id INTEGER PRIMARY KEY,
   name VARCHAR (64) NOT NULL,
   age int (4) NOT NULL
);
CREATE TABLE `parkingboy`
(
   `parkingboy_id` int (11) NOT NULL,
   `parkingboy_name` varchar (50) DEFAULT NULL,
   `parkingboy_age` int (3) DEFAULT NULL,
   PRIMARY KEY (`parkingboy_id`)
)
ENGINE= InnoDB DEFAULT CHARSET= utf8;
CREATE TABLE `parkinglot`
(
   `parkinglot_id` int (11) NOT NULL,
   `parkinglot_capasity` int (11) DEFAULT NULL,
   `parkinglot_available_position_count` int (11) DEFAULT NULL,
   `parkingboy_id` int (11) DEFAULT NULL,
   PRIMARY KEY (`parkinglot_id`),
   KEY `parkingboy_id` (`parkingboy_id`),
   CONSTRAINT `parkingboy_id` FOREIGN KEY (`parkingboy_id`) REFERENCES `parkingboy` (`parkingboy_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
)
ENGINE= InnoDB DEFAULT CHARSET= utf8;