CREATE TABLE IF NOT EXISTS team (
    team_id                     SERIAL PRIMARY KEY,
    name                        VARCHAR(50) UNIQUE NOT NULL,
    description                 VARCHAR(50) NOT NULL,
    creation_date               TIMESTAMP NOT NULL,
    last_modification_date      TIMESTAMP NOT NULL
);

CREATE TABLE IF NOT EXISTS role(
    role_id                    SERIAL PRIMARY KEY,
    name                       VARCHAR(50) UNIQUE NOT NULL,
    description                VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS employee_position(
    employee_position_id                SERIAL PRIMARY KEY,
    name                       VARCHAR(50) UNIQUE NOT NULL,
    description                VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS employee_details(
    employee_details_id                SERIAL PRIMARY KEY,
    start_date                  TIMESTAMP NOT NULL,
    employee_position_id                 INTEGER,
    manager_id                  INTEGER,
    seniority_level             VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS personalDetails (
    account_id                 SERIAL PRIMARY KEY,
    first_name              VARCHAR(50) NOT NULL,
    last_name               VARCHAR(50) NOT NULL,
    work_email                  VARCHAR(100) UNIQUE NOT NULL,
    password                    VARCHAR(100) NOT NULL,
    auth_role                   VARCHAR(50),
    tshirt                  VARCHAR(100) NOT NULL,
    location                VARCHAR(100),
    creation_date           TIMESTAMP NOT NULL,
    last_modification_date  TIMESTAMP NOT NULL,
    employee_details_id            INTEGER,
    photo_URL               VARCHAR(256)
);

 ALTER TABLE personalDetails
    ADD FOREIGN KEY (employee_details_id)
    REFERENCES employee_details(employee_details_id);

 ALTER TABLE employee_details
     ADD FOREIGN KEY (employee_position_id)
     REFERENCES employee_position(employee_position_id);

 ALTER TABLE employee_details
     ADD FOREIGN KEY (manager_id)
     REFERENCES employee_details(employee_details_id);

--new
CREATE TABLE IF NOT EXISTS account_extra_column(
    title                      VARCHAR(50) PRIMARY KEY
 );

CREATE TABLE IF NOT EXISTS account_extra_details(
    account_id                    INTEGER,
    input_value                VARCHAR(50),
    title                      VARCHAR(50),
    FOREIGN KEY (title) REFERENCES account_extra_column(title),
    FOREIGN KEY (account_id) REFERENCES personalDetails(account_id),
    PRIMARY KEY (account_id, title)
);

CREATE TABLE IF NOT EXISTS employee_details_role(
    employee_details_id               INTEGER,
    role_id                    INTEGER,
    FOREIGN KEY (employee_details_id) REFERENCES employee_details(employee_details_id),
    FOREIGN KEY (role_id) REFERENCES role(role_id),
    PRIMARY KEY(employee_details_id, role_id)
);

CREATE TABLE IF NOT EXISTS employee_details_extra_details(
    employee_details_id                INTEGER,
    input_value                 VARCHAR(50),
    title                       VARCHAR(50),
    FOREIGN KEY (employee_details_id) REFERENCES employee_details(employee_details_id),
    FOREIGN KEY (title) REFERENCES account_extra_column(title),
    PRIMARY KEY (employee_details_id, title)
);

CREATE TABLE IF NOT EXISTS employee_details_team(
    team_id                     INTEGER,
    employee_details_id                INTEGER,
    FOREIGN KEY (team_id) REFERENCES team(team_id),
    FOREIGN KEY (employee_details_id) REFERENCES employee_details(employee_details_id),
    PRIMARY KEY (team_id, employee_details_id)
);

CREATE TABLE IF NOT EXISTS project(
    project_id                 SERIAL PRIMARY KEY,
    name                       VARCHAR(50) UNIQUE NOT NULL,
    description                VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS team_project(
    team_id                    INTEGER,
    project_id                 INTEGER,
    FOREIGN KEY (team_id) REFERENCES team(team_id),
    FOREIGN KEY (project_id) REFERENCES project(project_id),
    PRIMARY KEY(team_id, project_id)
);

CREATE TABLE IF NOT EXISTS team_project_position(
    team_id                    INTEGER,
    project_id                 INTEGER,
    employee_position_id                INTEGER,
    FOREIGN KEY (team_id) REFERENCES team(team_id),
    FOREIGN KEY (project_id) REFERENCES project(project_id),
    FOREIGN KEY (employee_position_id) REFERENCES employee_position(employee_position_id),
    PRIMARY KEY(team_id, project_id, employee_position_id)
);

CREATE TABLE IF NOT EXISTS employee_role_team_project_position (
    id                         SERIAL PRIMARY KEY,
    team_id                    INTEGER,
    project_id                 INTEGER,
    employee_position_id                INTEGER,
    employee_details_id        INTEGER,
    role_id                    INTEGER,

    FOREIGN KEY (team_id, project_id, employee_position_id)
    REFERENCES team_project_position (team_id, project_id, employee_position_id),

    FOREIGN KEY (employee_details_id, role_id)
    REFERENCES employee_details_role (employee_details_id, role_id)
);

create table IF NOT EXISTS assets
(
    asset_id            SERIAL,
    name                varchar(255),
    category            varchar(255),
    description         varchar(255),
    primary key (asset_id),
    CONSTRAINT check_category
    CHECK (category IN ('LAPTOP', 'MOUSE', 'KEYBOARD', 'HEADPHONES', 'DOCKING_STATION', 'EARBUDS'))
);

--new
create table if not exists assets_extra_column
(
    info_title          varchar(255),
    description         varchar(255),
    primary key (info_title)
);

create table if not exists asset_extra_info(
    info_title          varchar(255),
    asset_id            integer,
    value_info          varchar(255),
    primary key (info_title,asset_id),
    foreign key (info_title) references assets_extra_column(info_title),
    foreign key (asset_id) references assets(asset_id)
);

create table if not exists account_asset(
    account_asset_id       SERIAL,
    employee_details_id        integer,
    asset_id            integer,
    date_given          timestamp,
    primary key (account_asset_id),
    foreign key (employee_details_id) references employee_details(employee_details_id),
    foreign key (asset_id) references assets(asset_id)
);

create table if not exists account_asset_extra_info(
    account_asset_id       integer,
    info_title          varchar(255),
    value_info          varchar(255),
    foreign key (account_asset_id) references account_asset(account_asset_id),
    foreign key (info_title) references assets_extra_column(info_title),
    primary key (account_asset_id,info_title)
);


