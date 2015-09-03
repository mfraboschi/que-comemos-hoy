# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table usuario (
  id                        varchar(255) not null,
  password                  varchar(255),
  nombre                    varchar(255),
  apellido                  varchar(255),
  fecha_nacimiento          timestamp,
  altura_en_centimetros     integer,
  peso                      integer,
  dieta                     varchar(255),
  constraint pk_usuario primary key (id))
;

create sequence usuario_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists usuario;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists usuario_seq;

