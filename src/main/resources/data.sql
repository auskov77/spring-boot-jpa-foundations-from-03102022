insert into genre(id, name) values (default, 'fantasy');
insert into genre(id, name) values (default, 'fantastic');

insert into films(id, title, genre_id) values (1, 'Harry Potter', 1);
insert into films(id, title, genre_id) values (2, 'Back to the Future', 2);

insert into place(id, name, film_id) values (1, 'London square', 1);
insert into place(id, name, film_id) values (2, 'Train', 1);
insert into place(id, name, film_id) values (3, 'USA', 2);