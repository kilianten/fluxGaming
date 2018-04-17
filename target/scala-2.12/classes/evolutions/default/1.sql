# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table basket (
  id                            bigint auto_increment not null,
  user_username                 varchar(255),
  constraint uq_basket_user_username unique (user_username),
  constraint pk_basket primary key (id)
);

create table genre (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_genre primary key (id)
);

create table genre_review (
  genre_id                      bigint not null,
  review_id                     bigint not null,
  constraint pk_genre_review primary key (genre_id,review_id)
);

create table order_item (
  id                            bigint auto_increment not null,
  basket_id                     bigint,
  product_id                    bigint,
  quantity                      integer not null,
  price                         double not null,
  constraint pk_order_item primary key (id)
);

create table product (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  description                   varchar(255),
  stock                         integer not null,
  price                         double not null,
  constraint pk_product primary key (id)
);

create table review (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  author                        varchar(255),
  caption                       varchar(255),
  review                        varchar(7000),
  rating                        integer not null,
  year                          integer not null,
  review_date                   timestamp,
  constraint pk_review primary key (id)
);

create table user (
  role                          varchar(255),
  username                      varchar(255) not null,
  email                         varchar(255),
  password                      varchar(255),
  constraint pk_user primary key (username)
);

alter table basket add constraint fk_basket_user_username foreign key (user_username) references user (username) on delete restrict on update restrict;

alter table genre_review add constraint fk_genre_review_genre foreign key (genre_id) references genre (id) on delete restrict on update restrict;
create index ix_genre_review_genre on genre_review (genre_id);

alter table genre_review add constraint fk_genre_review_review foreign key (review_id) references review (id) on delete restrict on update restrict;
create index ix_genre_review_review on genre_review (review_id);

alter table order_item add constraint fk_order_item_basket_id foreign key (basket_id) references basket (id) on delete restrict on update restrict;
create index ix_order_item_basket_id on order_item (basket_id);

alter table order_item add constraint fk_order_item_product_id foreign key (product_id) references product (id) on delete restrict on update restrict;
create index ix_order_item_product_id on order_item (product_id);


# --- !Downs

alter table basket drop constraint if exists fk_basket_user_username;

alter table genre_review drop constraint if exists fk_genre_review_genre;
drop index if exists ix_genre_review_genre;

alter table genre_review drop constraint if exists fk_genre_review_review;
drop index if exists ix_genre_review_review;

alter table order_item drop constraint if exists fk_order_item_basket_id;
drop index if exists ix_order_item_basket_id;

alter table order_item drop constraint if exists fk_order_item_product_id;
drop index if exists ix_order_item_product_id;

drop table if exists basket;

drop table if exists genre;

drop table if exists genre_review;

drop table if exists order_item;

drop table if exists product;

drop table if exists review;

drop table if exists user;

