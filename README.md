# Engenharia Software II - Sistema de Gestão de Condomínio

## Objetivo:

O objetivo deste projeto é desenvolver um sistema de gestão para um condomínio que permita aos administradores do condomínio e aos moradores registrar informações sobre unidades, moradores, pagamentos de taxas, manutenção e comunicações internas. Este projeto é a primeira parte de uma série de atividades que os alunos realizarão como parte do
curso de Engenharia de Software.

## Requisitos Funcionais:

1. Cadastro de Unidades Residenciais: Os administradores devem ser capazes de adicionar informações sobre as unidades residenciais, incluindo número da unidade, tamanho, proprietário e dados de contato.
2. Cadastro de Moradores: O sistema deve permitir que os administradores cadastrem informações sobre os moradores, incluindo nome, número de documentos, contato e dados de veículos (se houver).
3. Gestão de Taxas de Condomínio: Os administradores devem ser capazes de registrar e gerenciar as taxas de condomínio, incluindo datas de vencimento, valores e status de pagamento.
4. Comunicações Internas: O sistema deve permitir que os moradores enviem e recebam mensagens internas, notificações e comunicados importantes.
5. Reservas de Áreas Comuns: Os moradores devem poder reservar áreas comuns, como salão de festas, churrasqueira e piscina, especificando datas e horários desejados.
6. Manutenção de Áreas Comuns: Os administradores devem poder registrar solicitações de manutenção para áreas comuns, bem como rastrear o progresso e custos associados.
7. Controle de Acesso: O sistema deve permitir o controle de acesso às áreas comuns por meio de cartões de acesso ou códigos de segurança.
8. Relatórios: O sistema deve ser capaz de gerar relatórios que incluam informações sobre unidades, moradores, taxas de condomínio, reservas e manutenção.

## Requisitos Não Funcionais:

1. Interface de Usuário (UI): O sistema deve ter uma interface de usuário intuitiva e amigável.
2. Desempenho: O sistema deve ser responsivo, mesmo quando há um grande número de unidades e moradores registrados.
3. Segurança: O sistema deve proteger os dados dos moradores e informações financeiras, garantindo a autenticação segura e o armazenamento criptografado das senhas.
4. Compatibilidade: O software deve ser compatível com sistemas operacionais Windows.
5. Documentação: Deve ser fornecida documentação abrangente que inclua um manual do usuário e documentação técnica para os desenvolvedores.

## Tecnologias:

* O sistema será implementado em Java como linguagem de programação.
* Para o banco de dados, será utilizado o PostgreSQL (um sistema de gerenciamento de banco de dados relacional).

## Instruções

### PostgreSQL

| Servidor  | Porta | Banco de Dados | Usuário | Senha    |
| :-------- | ----- | -------------- | ------- | -------- |
| localhost | 5432  | condominio     | user    | password |

Usando o Docker para criar um Servidor PostgreSQL em container:
`docker run -d --name postgres_condominio -e POSTGRES_PASSWORD=password -e POSTGRES_USER=user -e POSTGRES_DB=condominio -p 5432:5432 postgres`

Usando o Docker para criar um PgAdmin em container (ip da máquina host: 172.17.0.1)
`docker run -p 8080:80 -e 'PGADMIN_DEFAULT_EMAIL=user@email.com' -e 'PGADMIN_DEFAULT_PASSWORD=password' -d dpage/pgadmin4`

### Auth

Usuário: admin
Senha: admin