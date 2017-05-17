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
perfil varchar(255) not null,

primary key(id)
);

-- CRIANDO TABLE DE ESTUDANTES
CREATE TABLE estudantes (
estudante_id int unsigned not null auto_increment,
user_id int unsigned not null,
nome varchar(255) not null,
sobrenome varchar(255) not null,
cpf varchar(255) unique not null,
email varchar(255) unique not null,
telefone varchar(255) not null,

primary key(estudante_id),
constraint fk_users_estudantes foreign key (user_id) references users (id)
);

-- CRIANDO TABLE DE EMPRESAS
CREATE TABLE empresas (
empresa_id int unsigned not null auto_increment,
user_id int unsigned not null,
cnpj varchar(255) not null,
razao_social varchar(255) not null,
nome_fantasia varchar(255) not null,
telefone varchar(255) not null,
email varchar(255) unique not null,
responsavel varchar(255) unique not null,
ramo_atividades varchar(255) unique not null,

primary key(empresa_id),
constraint fk_users_empresas foreign key (user_id) references users (id)
);

-- CRIANDO TABLE DE ENDEREÇOS
CREATE TABLE enderecos (
endereco_id int unsigned not null auto_increment,
user_id int unsigned not null,
logradouro varchar(255) not null,
bairro varchar(255) not null,
numero varchar(255) not null,
cep varchar(255) not null,

primary key(endereco_id),
constraint fk_users_endereco foreign key (user_id) references users (id)
);

-- CRIANDO TABLE DE VAGAS
CREATE TABLE vagas (
vagas_id int unsigned not null auto_increment,
empresa_id int unsigned not null,
area varchar(255) not null,
titulo varchar(255) not null,
jornada varchar(255) not null,
contrato varchar(255) not null,
salario varchar(255) not null,
estado varchar(255) not null,
cidade varchar(255) not null,
obs varchar(255) not null,
activities varchar(255),

primary key(vagas_id),
constraint fk_empresas_vagas foreign key (user_id) references empresas (id)
);

-- Adidionando Administrador
INSERT INTO users (username,senha,perfil) VALUES('admin','admin8520','administrador');

-- Adicionado usuarios
INSERT INTO users (id,username,senha,perfil) VALUES(2,'fabioga','la123la','estudante');
INSERT INTO users (id,username,senha,perfil) VALUES(3,'alele','5h6a33','estudante');
INSERT INTO users (id,username,senha,perfil) VALUES(4,'ronaldin12','2s4rg5','estudante');
INSERT INTO users (id,username,senha,perfil) VALUES(5,'patfranca','6a5d8we4','estudante');

INSERT INTO users (id,username,senha,perfil) VALUES(6,'recursoshbm','b9s32d7h','empresa');
INSERT INTO users (id,username,senha,perfil) VALUES(7,'rhparceria','agh1925a47','empresa');
INSERT INTO users (id,username,senha,perfil) VALUES(8,'cnestagio','a45v68d98','empresa');
INSERT INTO users (id,username,senha,perfil) VALUES(9,'premierh','54a8a7d97','empresa');

-- Adicionado estudantes
INSERT INTO estudantes (estudante_id,user_id,nome,sobrenome,cpf,email,telefone) VALUES(1,2,'fabio','gomes de araujo','1234564489','fabinho.hs@hotmail.com','99999-9999');
INSERT INTO estudantes (estudante_id,user_id,nome,sobrenome,cpf,email,telefone) VALUES(2,3,'alef','junio','123456781119','alephjunio@gmail.com','99999-9999');
INSERT INTO estudantes (estudante_id,user_id,nome,sobrenome,cpf,email,telefone) VALUES(3,4,'patricia','franca','123456222789','patricia_franca@hotmail.com','99999-9999');
INSERT INTO estudantes (estudante_id,user_id,nome,sobrenome,cpf,email,telefone) VALUES(4,5,'ronaldo','ferreira','123453336789','1980ronaldoferreira@gmail.com','99999-9999');

-- Adicionado empresas
INSERT INTO empresas (empresa_id,user_id,cnpj,razao_social,nome_fantasia,telefone,email,responsavel,ramo_atividades) VALUES(1,6,'12345678911','uninove','uniestagio','321456787','uniestagio@estagios.com','-ss---','auxiliar administrativo');
INSERT INTO empresas (empresa_id,user_id,cnpj,razao_social,nome_fantasia,telefone,email,responsavel,ramo_atividades) VALUES(2,7,'13549872771','optiplex','dell','58214576','dell@estagios.com','---dd-','tecnico em informatica');
INSERT INTO empresas (empresa_id,user_id,cnpj,razao_social,nome_fantasia,telefone,email,responsavel,ramo_atividades) VALUES(3,8,'32189468775','cnesportes','cn','28641897','cnesportes@estagios.com','---ff-','recursos humanos');
INSERT INTO empresas (empresa_id,user_id,cnpj,razao_social,nome_fantasia,telefone,email,responsavel,ramo_atividades) VALUES(4,9,'65823154685','danone','bonafonte','46548759','danone@estagios.com','--gg--','vendas');

-- Adicionado endereços
INSERT INTO enderecos (logradouro,bairro,numero,cep) VALUES('rua borges','freguesia do o','150','01123-000'(user_id));
INSERT INTO enderecos (logradouro,bairro,numero,cep) VALUES('rua hermenegildo','itaquaquecetuba','3012','02233-000'(user_id));
INSERT INTO enderecos (logradouro,bairro,numero,cep) VALUES('rua osasco','novo osasco','1476','02845-000'(user_id));
INSERT INTO enderecos (logradouro,bairro,numero,cep) VALUES('rua santo andre','parque guarani','258','03464-000'(user_id));
INSERT INTO enderecos (logradouro,bairro,numero,cep) VALUES('rua tagipuru','barra funda','150','06487-000'(user_id));
INSERT INTO enderecos (logradouro,bairro,numero,cep) VALUES('rua flor','vila silvana','2945','01364-000'(user_id));
INSERT INTO enderecos (logradouro,bairro,numero,cep) VALUES('rua parauapeba','penha','1637','02131-000'(user_id));
INSERT INTO enderecos (logradouro,bairro,numero,cep) VALUES('rua pereque','pinheiros','651','02531-000'(user_id));

-- Adicionado vagas
INSERT INTO vagas (area,titulo,jornada,contrato,salario,estado,cidade,obs,activities) VALUES('financeiro','titulo','jornada','estagio','salario','estado','cidade','observação','activities'(empresa_id));
INSERT INTO vagas (area,titulo,jornada,contrato,salario,estado,cidade,obs,activities) VALUES('informatica','titulo','jornada','estagio','salario','estado','cidade','observação','activities'(empresa_id));
INSERT INTO vagas (area,titulo,jornada,contrato,salario,estado,cidade,obs,activities) VALUES('rh','titulo','jornada','estagio','salario','estado','cidade','observação','activities'(empresa_id));
INSERT INTO vagas (area,titulo,jornada,contrato,salario,estado,cidade,obs,activities) VALUES('vendas','titulo','jornada','estagio','salario','estado','cidade','observação','activities'(empresa_id));
