/*create table employee
(
    id         bigserial
        primary key,
    first_name varchar(255) not null,
    last_name  varchar(255) not null,
    inn        varchar(255) not null,
    kpp        varchar(255) not null,
    ogrn       varchar(255) not null,
    org_id     bigint
        constraint fkihrwdvgeycwmfwr0uckpldp9r
            references org
);

create table org
(
    id      bigserial
        primary key,
    code_id bigint
        constraint uk_k7nx480w596et5ludc60vmyrd
            unique
        constraint fk9gh80cbnm435eo79hi5i82o0o
            references employee,
    head_id bigint
        constraint uk_sm3j7tqia3g6las8rguhx4dib
            unique
        constraint fk98151ym1l6dbw3umksi3ysw7v
            references employee
);*/