/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  alefsilva
 * Created: 25/04/2017
 */

-- CRIANDO A BASE DE DADOS

CREATE DATABASE uniestagios;

-- USANDO A BASE DE DADOS
USE uniestagios;

-- CRIANDO TABLE DE USUARIOS
CREATE TABLE users (
id int unsigned not null auto_increment,
username varchar(255) unique not null,
senha varchar(255) not null,

primary key(id)
);

-- CRIANDO TABLE DE ESTUDANTES
CREATE TABLE estudantes (
id int unsigned not null auto_increment,
user_id int unsigned not null,
nome varchar(255) not null,
sobrenome varchar(255) not null,
cpf varchar(14) unique not null,
email varchar(255) unique not null,
telefone varchar(255) not null,

primary key(id),
constraint fk_users_estudantes foreign key (user_id) references users (id)
);

-- CRIANDO TABLE DE EMPRESAS
CREATE TABLE empresas (
id int unsigned not null auto_increment,
user_id int unsigned not null,
cnpj varchar(255) not null,
razao_social varchar(255) not null,
nome_fantasia varchar(255) not null,
telefone varchar(255) not null,
email varchar(255) unique not null,
ramo_atividades varchar(255) unique not null,

primary key(id),
constraint fk_users_empresas foreign key (user_id) references users (id)
);

-- CRIANDO TABLE DE ENDEREÇOS
CREATE TABLE enderecos (
id int unsigned not null auto_increment,
user_id int unsigned not null,
logradouro varchar(255) not null,
bairro varchar(255) not null,
numero varchar(255) not null,
cep varchar(255) not null,

primary key(id),
constraint fk_users_endereco foreign key (user_id) references users (id)
);

-- CRIANDO TABLE DE VAGAS
CREATE TABLE vagas (
id int unsigned not null auto_increment,
empresa_id int unsigned not null,
area varchar(255) not null,
titulo varchar(255) not null,
jornada varchar(255) not null,
contrato varchar(255) not null,
salario varchar(255) not null,
localidade varchar(255) not null,

primary key(id),
constraint fk_empresas_vagas foreign key (empresa_id) references empresas (id)
);

-- Adidionando Administrador
INSERT INTO users (username,senha) VALUES('admin','admin8520');