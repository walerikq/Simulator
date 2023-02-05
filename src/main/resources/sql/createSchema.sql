create schema if not exists spacesimulator;

create table if not exists spacesimulator.pilot
(
    id         uuid primary key default gen_random_uuid(),
    name       varchar(30) not null,
    surname    varchar(30) not null,
    age        integer check (age >= 20),
    fighter_id uuid,
    room_id    uuid,
    foreign key (room_id) references spacesimulator.room (id),
    foreign key (fighter_id) references spacesimulator.fighter (id)
);

create table if not exists SpaceSimulator.Room
(
    id       uuid primary key default gen_random_uuid(),
    name     varchar(30),
    pilot_id integer,
    foreign key (pilot_id) references spacesimulator.pilot (id)
);


create table if not exists spacesimulator.Fighter
(
    id       uuid primary key default gen_random_uuid(),
    name     varchar(40) not null,
    pilot_id integer,
    foreign key (pilot_id) references spacesimulator.pilot (id)

);

