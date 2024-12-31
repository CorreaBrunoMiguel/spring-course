create table produtos (
    id varchar(255) not null primary key ,
    nome varchar(30) not null unique ,
    descricao varchar(255),
    preco numeric(18,2) not null ,
    quantidade numeric(5) not null
);