create table student(
                        idnp VARCHAR(13) NOT NULL PRIMARY KEY ,
                        nume VARCHAR(20) NOT NULL,
                        prenume VARCHAR(20) NOT NULL ,
                        grupa VARCHAR(10)  ,
                        media DOUBLE PRECISION,
                        email VARCHAR(40) NOT NULL ,
                        st_univ_id INT ,
                        FOREIGN KEY (st_univ_id) references universitate(id)
);