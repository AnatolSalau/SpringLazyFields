create table if not exists employee
(
    id         bigserial
        primary key,
    first_name varchar(255) not null,
    last_name  varchar(255) not null,
    org_id     bigint
);

alter table employee
    owner to postgres;

create table if not exists org_codes
(
    id   bigserial
        primary key,
    inn  varchar(255) not null,
    kpp  varchar(255) not null,
    ogrn varchar(255) not null
);

alter table org_codes
    owner to postgres;

create table org
(
    id      bigserial
        primary key,
    code_id bigint
        constraint fkrcp1yfc2ow8dqji0jf7qpcx93
            references org_codes,
    head_id bigint
        constraint uk_sm3j7tqia3g6las8rguhx4dib
            unique
        constraint fk98151ym1l6dbw3umksi3ysw7v
            references employee
);

alter table org
    owner to postgres;

alter table employee
    add constraint fkihrwdvgeycwmfwr0uckpldp9r
        foreign key (org_id) references org;