# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table basket (
  id                            bigint auto_increment not null,
  user_username                 varchar(255),
  constraint uq_basket_user_username unique (user_username),
  constraint pk_basket primary key (id)
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
  constraint pk_review primary key (id)
);

create table user (
  username                      varchar(255) not null,
  role                          varchar(255),
  email                         varchar(255),
  password                      varchar(255),
  constraint pk_user primary key (username)
);

alter table basket add constraint fk_basket_user_username foreign key (user_username) references user (username) on delete restrict on update restrict;

alter table order_item add constraint fk_order_item_basket_id foreign key (basket_id) references basket (id) on delete restrict on update restrict;
create index ix_order_item_basket_id on order_item (basket_id);

alter table order_item add constraint fk_order_item_product_id foreign key (product_id) references product (id) on delete restrict on update restrict;
create index ix_order_item_product_id on order_item (product_id);


# --- !Downs

alter table basket drop constraint if exists fk_basket_user_username;

alter table order_item drop constraint if exists fk_order_item_basket_id;
drop index if exists ix_order_item_basket_id;

alter table order_item drop constraint if exists fk_order_item_product_id;
drop index if exists ix_order_item_product_id;

drop table if exists basket;

drop table if exists order_item;

drop table if exists product;

drop table if exists review;

drop table if exists user;

