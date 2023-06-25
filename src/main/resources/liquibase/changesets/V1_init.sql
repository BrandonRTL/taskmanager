create schema if not exists taskmanager;

create table if not exists users
(
    id bigserial primary key,
    username varchar(255) not null unique,
    password varchar(255) not null,
    role varchar(255) not null
);

create table if not exists tasks
(
    id bigserial primary key,
    title varchar(255) not null unique,
    description varchar(255),
    status varchar(255) not null
);

create table if not exists users_tasks
(
    user_id bigint not null references users (id) on delete cascade,
    task_id bigint not null references tasks (id) on delete cascade,
    primary key (user_id, task_id)
);