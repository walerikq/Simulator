insert into SpaceSimulator.pilot(
    id,name,surname,age)
values
    (gen_random_uuid(),'Valera','Lolikovich',22),
    (gen_random_uuid(),'Valera','Popikovich',25),
    (gen_random_uuid(),'Migera','Klokoovich',22),
    (gen_random_uuid(),'Walera','Lolikovi4' ,22);

insert into SpaceSimulator.fighter(id,name)
values (gen_random_uuid(),'Super-Fighter'),
       (gen_random_uuid(),'X-Wing'),
       (gen_random_uuid(),'TIE-Fighter'),
       (gen_random_uuid(),'Star-Destructor');

insert into SpaceSimulator.Room(id, name)
values (gen_random_uuid(),'relax room'),
       (gen_random_uuid(),'cabin №1'),
       (gen_random_uuid(),'cabin №2'),
       (gen_random_uuid(),'cabin №3'),
       (gen_random_uuid(),'planning room');