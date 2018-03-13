# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table review (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  author                        varchar(255),
  caption                       varchar(255),
  review                        varchar(255),
  rating                        integer not null,
  constraint pk_review primary key (id)
);

create table user (
  id                            bigint auto_increment not null,
  username                      varchar(255),
  role                          varchar(255),
  email                         varchar(255),
  password                      varchar(255),
  constraint pk_user primary key (id)
);


# --- !Downs

drop table if exists review;

drop table if exists user;

