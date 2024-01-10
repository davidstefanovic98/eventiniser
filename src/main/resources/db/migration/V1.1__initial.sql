create table `user`(
    `user_id` int auto_increment primary key,
    `email` varchar(100) not null unique,
    `password` varchar(255) not null,

    `created_date`       timestamp   default current_timestamp(),
    `last_modified_by`   varchar(32) default 'system',
    `last_modified_date` timestamp   default current_timestamp(),
    `record_status`      int         default 1
);

create table `role`
(
    `role_id`            int auto_increment primary key,
    `name`               varchar(32) not null unique,

    `created_date`       timestamp   default current_timestamp(),
    `last_modified_by`   varchar(32) default 'system',
    `last_modified_date` timestamp   default current_timestamp(),
    `record_status`      int         default 1
);

create table `event` (
    `event_id` int auto_increment primary key,
    `organizer_fk` int not null,
    `title` varchar(100) not null,
    `date_time` timestamp not null,
    `location` varchar(255) not null,
    `description` text,
    `capacity` int,

    `created_date`       timestamp   default current_timestamp(),
    `last_modified_by`   varchar(32) default 'system',
    `last_modified_date` timestamp   default current_timestamp(),
    `record_status`      int         default 1,

    constraint foreign key `fk_organizer_event` (`organizer_fk`) references `user` (`user_id`)
);

create table `user_role`
(
    `role_fk` int not null,
    `user_fk` int not null,
    primary key (`role_fk`, `user_fk`),
    constraint fk_user_role_role foreign key (`role_fk`) references `role` (`role_id`)
        on update cascade on delete cascade,
    constraint fk_user_role_user foreign key (`user_fk`) references `user` (`user_id`)
        on update cascade on delete cascade
);

CREATE TABLE `registration` (
    `registration_id` int auto_increment primary key ,
    `participant_fk` int not null,
    `event_fk` int not null,

    `created_date`       timestamp   default current_timestamp(),
    `last_modified_by`   varchar(32) default 'system',
    `last_modified_date` timestamp   default current_timestamp(),
    `record_status`      int         default 1,

    constraint foreign key `fk_participant_registration` (`participant_fk`) references `user` (`user_id`),
    constraint foreign key `fk_event_registration` (`event_fk`) references `event` (`event_id`)
);