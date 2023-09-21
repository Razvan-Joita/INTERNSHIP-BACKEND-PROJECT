CREATE TABLE IF NOT EXISTS team (
    team_id                     INTEGER AUTO_INCREMENT PRIMARY KEY,
    name                        VARCHAR(50) UNIQUE NOT NULL,
    description                 VARCHAR(50) NOT NULL,
    creation_date               TIMESTAMP NOT NULL,
    last_modification_date      TIMESTAMP NOT NULL
);

CREATE TABLE IF NOT EXISTS role(
    role_id                    INTEGER AUTO_INCREMENT PRIMARY KEY,
    name                       VARCHAR(50) UNIQUE NOT NULL,
    description                VARCHAR(50),
    creation_date               TIMESTAMP NOT NULL,
    last_modification_date      TIMESTAMP NOT NULL
);

-- positions table
CREATE TABLE IF NOT EXISTS employee_position(
    employee_position_id                INTEGER AUTO_INCREMENT PRIMARY KEY,
    name                       VARCHAR(50) UNIQUE NOT NULL,
    description                VARCHAR(50) NOT NULL,
    creation_date               TIMESTAMP NOT NULL,
    last_modification_date      TIMESTAMP NOT NULL
);

CREATE TABLE IF NOT EXISTS employee(
    employee_id                INTEGER AUTO_INCREMENT PRIMARY KEY,
    start_date                  TIMESTAMP,
    employee_position_id                 INTEGER,
    first_name              VARCHAR(50),
    last_name               VARCHAR(50),
    work_email                  VARCHAR(100) UNIQUE NOT NULL,
    password                    VARCHAR(100),
    auth_role                   VARCHAR(50),
    manager_id                  INTEGER,
    seniority_level             VARCHAR(50),
    photo_URL               VARCHAR(256),
    creation_date               TIMESTAMP NOT NULL,
    last_modification_date      TIMESTAMP NOT NULL
);

CREATE TABLE IF NOT EXISTS project(
    project_id                 INTEGER AUTO_INCREMENT PRIMARY KEY,
    name                       VARCHAR(50) UNIQUE NOT NULL,
    description                VARCHAR(50),
    creation_date               TIMESTAMP NOT NULL,
    last_modification_date      TIMESTAMP NOT NULL
);

CREATE TABLE IF NOT EXISTS team_project(
    team_id                    INTEGER,
    project_id                 INTEGER,
    FOREIGN KEY (team_id) REFERENCES team(team_id),
    FOREIGN KEY (project_id) REFERENCES project(project_id),
    PRIMARY KEY(team_id, project_id),
    creation_date               TIMESTAMP NOT NULL,
    last_modification_date      TIMESTAMP NOT NULL
);

CREATE TABLE IF NOT EXISTS personal_details (
    account_id                 INTEGER AUTO_INCREMENT PRIMARY KEY,
    cnp                       VARCHAR(13) NOT NULL,
    iban                    VARCHAR(24) NOT NULL,
    phone_number         VARCHAR(13) NOT NULL,
    ci_series            VARCHAR(13) NOT NULL,
    ci_number            VARCHAR(13) NOT NULL,
    tshirt                  VARCHAR(100) NOT NULL,
    location                VARCHAR(100),
    creation_date           TIMESTAMP NOT NULL,
    last_modification_date  TIMESTAMP NOT NULL,
    employee_id            INTEGER
);

 ALTER TABLE personal_details
    ADD FOREIGN KEY (employee_id)
    REFERENCES employee(employee_id);

 ALTER TABLE employee
     ADD FOREIGN KEY (employee_position_id)
     REFERENCES employee_position(employee_position_id);

 ALTER TABLE employee
     ADD FOREIGN KEY (manager_id)
     REFERENCES employee(employee_id);

--new
 CREATE TABLE IF NOT EXISTS account_extra_column(
    title                      VARCHAR(50) PRIMARY KEY,
    creation_date               TIMESTAMP NOT NULL,
    last_modification_date      TIMESTAMP NOT NULL
 );

CREATE TABLE IF NOT EXISTS account_extra_details(
    account_id                    INTEGER,
    input_value                VARCHAR(50),
    title                      VARCHAR(50),
    FOREIGN KEY (title) REFERENCES account_extra_column(title),
    FOREIGN KEY (account_id) REFERENCES personal_details(account_id),
    PRIMARY KEY (account_id, title),
    creation_date               TIMESTAMP NOT NULL,
    last_modification_date      TIMESTAMP NOT NULL
);

--CREATE TABLE IF NOT EXISTS employee_details_role(
--    employee_id               INTEGER,
--    role_id                    INTEGER,
--    FOREIGN KEY (employee_id) REFERENCES employee_details(employee_id),
--    FOREIGN KEY (role_id) REFERENCES role(role_id),
--    PRIMARY KEY(employee_id, role_id),
--    creation_date               TIMESTAMP NOT NULL,
--    last_modification_date      TIMESTAMP NOT NULL
--);

CREATE TABLE IF NOT EXISTS employee_details_extra_details(
    employee_id                INTEGER,
    input_value                 VARCHAR(50),
    title                       VARCHAR(50),
    FOREIGN KEY (employee_id) REFERENCES employee(employee_id),
    FOREIGN KEY (title) REFERENCES account_extra_column(title),
    PRIMARY KEY (employee_id, title),
    creation_date               TIMESTAMP NOT NULL,
    last_modification_date      TIMESTAMP NOT NULL
);

--CREATE TABLE IF NOT EXISTS employee_details_team(
--    team_id                     INTEGER,
--    employee_id                INTEGER,
--    FOREIGN KEY (team_id) REFERENCES team(team_id),
--    FOREIGN KEY (employee_id) REFERENCES employee_details(employee_id),
--    PRIMARY KEY (team_id, employee_id),
--    creation_date               TIMESTAMP NOT NULL,
--    last_modification_date      TIMESTAMP NOT NULL
--);

CREATE TABLE IF NOT EXISTS employee_role_team_project_position (
    id                          INTEGER AUTO_INCREMENT PRIMARY KEY,
    team_id                     INTEGER,
    project_id                  INTEGER,
    employee_position_id        INTEGER,
    employee_id                 INTEGER,
    role_id                     INTEGER,
    creation_date               TIMESTAMP NOT NULL,
    last_modification_date      TIMESTAMP NOT NULL,

    FOREIGN KEY (employee_position_id)
    REFERENCES employee_position (employee_position_id),

    FOREIGN KEY (team_id, project_id)
    REFERENCES team_project (team_id, project_id),

    FOREIGN KEY (role_id)
    REFERENCES role (role_id),

    FOREIGN KEY (employee_id)
    REFERENCES employee (employee_id)
);


--ASSETS


create table IF NOT EXISTS assets
(
    asset_id            integer AUTO_INCREMENT,
    name                varchar(255),
    category            varchar(255),
    description         varchar(255),
    primary key (asset_id),
    CONSTRAINT check_category
    CHECK (category IN ('LAPTOP', 'MOUSE', 'KEYBOARD', 'HEADPHONES', 'DOCKING_STATION', 'EARBUDS')),
    creation_date               TIMESTAMP NOT NULL,
    last_modification_date      TIMESTAMP NOT NULL
);

--new
create table if not exists assets_extra_column
(
    info_title          varchar(255),
    description         varchar(255),
    primary key (info_title),
    creation_date               TIMESTAMP NOT NULL,
    last_modification_date      TIMESTAMP NOT NULL
);

create table if not exists asset_extra_info(
    info_title          varchar(255),
    asset_id            integer,
    value_info          varchar(255),
    primary key (info_title,asset_id),
    foreign key (info_title) references assets_extra_column(info_title),
    foreign key (asset_id) references assets(asset_id),
    creation_date               TIMESTAMP NOT NULL,
    last_modification_date      TIMESTAMP NOT NULL
);

create table if not exists account_asset(
    account_asset_id       integer AUTO_INCREMENT,
    employee_id        integer,
    asset_id            integer,
    date_given          timestamp,
    primary key (account_asset_id),
    foreign key (employee_id) references employee(employee_id),
    foreign key (asset_id) references assets(asset_id),
    creation_date               TIMESTAMP NOT NULL,
    last_modification_date      TIMESTAMP NOT NULL
);

create table if not exists account_asset_extra_info(
    account_asset_id       integer,
    info_title          varchar(255),
    value_info          varchar(255),
    foreign key (account_asset_id) references account_asset(account_asset_id),
    foreign key (info_title) references assets_extra_column(info_title),
    primary key (account_asset_id,info_title),
    creation_date               TIMESTAMP NOT NULL,
    last_modification_date      TIMESTAMP NOT NULL
);


