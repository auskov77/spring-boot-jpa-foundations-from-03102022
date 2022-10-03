drop table if exists genre, place, films;

create table genre(
    id bigint primary key auto_increment,
    name varchar2(256)
);

create table films(
    id bigint primary key auto_increment,
    title varchar2(256),
    genre_id bigint references genre(id)
);

create table place(
    id bigint primary key auto_increment,
    name varchar2(256),
    film_id bigint references films(id)
);

