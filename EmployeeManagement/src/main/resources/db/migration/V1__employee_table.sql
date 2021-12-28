create table employee(
                         idnp varchar (20) not null ,
                         first_name varchar (20) not null,
                         last_name varchar (30) not null,
                         age int,
                         position varchar(40),
                         period float,
                         salary float,
                         department_id int,
                         foreign key (department_id) references department(id)
);