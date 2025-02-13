create table users(
    id serial,
    name text,
    email text
);

insert into users(id, name, email)
values ('1', 'John Doe', 'john@example.com'),
 ('2', 'Jane Doe', 'jane@example.com');