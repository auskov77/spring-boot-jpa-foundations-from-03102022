insert into genre(id, name) values (default, 'fantasy');
insert into genre(id, name) values (default, 'horror');
insert into genre(id, name) values (default, 'drama');

insert into films(id, title, genre_id) values (1, 'Lord of the Rings', 1);
insert into films(id, title, genre_id) values (2, 'Scream', 2);

insert into place(id, name, film_id) values (1, 'New Zealand', 1);
insert into place(id, name, film_id) values (2, 'USA', 1);
insert into place(id, name, film_id) values (3, 'Russia', 2);
