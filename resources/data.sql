INSERT INTO team (name, description, creation_date, last_modification_date) VALUES
('Team Mobile', 'Team for mobile projects', NOW(), NOW()),
('Team Java', 'Team for java projects', NOW(), NOW()),
('Team Magento', 'Team for magento projects', NOW(), NOW()),
('Team Angular', 'Team for angular projects', NOW(), NOW());

INSERT INTO role (name, description, creation_date, last_modification_date) VALUES
('Team leader', 'Leader of the team', NOW(), NOW()),
('Delivery manager', 'Takes care of product delivery', NOW(), NOW()),
('Scrum master', 'Overview of agile ceremonies', NOW(), NOW()),
('Product owner', 'Owns the product', NOW(), NOW()),
('No role', 'This user has no role', NOW(), NOW());

INSERT INTO employee_position (name, description, creation_date, last_modification_date) VALUES
('Fullstack developer', 'Backend + Frontend developer', NOW(), NOW()),
('Backend developer', 'Writes code for backend', NOW(), NOW()),
('Frontend developer', 'Writes code for frontend', NOW(), NOW()),
('HR employee', 'Works in HR department', NOW(), NOW()),
('Mobile Developer', 'Works in mobile team', NOW(), NOW()),
('Magento Developer', 'Works in Magento team', NOW(), NOW());

INSERT INTO project (name, description, creation_date, last_modification_date) VALUES
('NXTHR-company', 'Company copy from sage', NOW(), NOW()),
('NXTHR-assets', 'Assets copy from sage', NOW(), NOW()),
('Calvin', 'Consors bank project', NOW(), NOW()),
('EFE', 'Employee frontend project', NOW(), NOW()),
('NXT-plug', 'Mobile app for ,car charging', NOW(), NOW());

INSERT INTO account_extra_column (title, creation_date, last_modification_date) VALUES
('IBAN eur', NOW(), NOW()),
('IBAN ron', NOW(), NOW()),
('Type of contract', NOW(), NOW());

INSERT INTO employee (first_name, last_name,work_email, password, auth_role,start_date, employee_position_id, manager_id, seniority_level, creation_date, last_modification_date,photo_URL) VALUES
( 'Dragos', 'Hulea','dragos.hulea@nexttech.ro','dragos634','ADMIN',NOW(), 1, NULL, 'INTERN', NOW(), NOW(),'https://whatsondisneyplus.com/wp-content/uploads/2021/09/homer.png'),
( 'Diana', 'Dragusin','diana.dragusin@nexttech.com','dianad21','NORMAL_USER',NOW(), 3, 1, 'INTERN', NOW(), NOW(),'https://whatsondisneyplus.com/wp-content/uploads/2021/09/lisa.png'),
( 'Victor', 'Greavu','victor.greavu@nexttech.ro','victor12','NORMAL_USER',NOW(), 1, 2, 'INTERN', NOW(), NOW(),''),
( 'Stefan', 'Iancu','stefan.iancu@nexttech.ro','stefaniancu623','ADMIN',NOW(), 3, 3, 'INTERN', NOW(), NOW(),'https://whatsondisneyplus.com/wp-content/uploads/2021/09/doctor.png'),
( 'Andreea', 'Dan','andreea.dan@nexttech.ro','andreeadan273','NORMAL_USER',NOW(), 2, 1, 'INTERN', NOW(), NOW(),'https://whatsondisneyplus.com/wp-content/uploads/2021/09/maggie.png'),
( 'Oana', 'Puscas','oana.puscas@nexttech.ro','oanap347','NORMAL_USER',NOW(), 3, 2, 'INTERN', NOW(), NOW(),'https://whatsondisneyplus.com/wp-content/uploads/2021/09/marge.png'),
( 'Mircea', 'Ilina','mircea.ilina@nexttech.ro','mirceailina783','NORMAL_USER',NOW(), 1, 2, 'INTERN', NOW(), NOW(),'https://whatsondisneyplus.com/wp-content/uploads/2021/09/krusty.png'),
( 'Ionut', 'Baias','ionut.baias@nexttech.ro','9348ionut','ADMIN',NOW(), 2, 1, 'INTERN', NOW(), NOW(),'https://whatsondisneyplus.com/wp-content/uploads/2021/09/ralph.png'),
( 'Razvan', 'Joita','razvan.joita@nexttech.ro','razvan99','ADMIN',NOW(), 2, 1, 'INTERN', NOW(), NOW(),''),
( 'Cleydy', 'Toma','cleydy.toma@nexttech.ro','cleydy0','NORMAL_USER',NOW(), 2, 3, 'INTERN', NOW(), NOW(),'https://whatsondisneyplus.com/wp-content/uploads/2021/09/homer.png'),
( 'Ariana', 'Vaida','ariana.vaida@nexttech.ro','arianavaida6','NORMAL_USER',NOW(), 3, 1, 'INTERN', NOW(), NOW(),''),
( 'Raluca', 'Barzaune','raluca.barzaune@nexttech.ro','raluca9','NORMAL_USER',NOW(), 3, 3, 'INTERN', NOW(), NOW(),'https://whatsondisneyplus.com/wp-content/uploads/2021/09/maggie.png'),
( 'Alexandru', 'Piciorus','alexandru.piciorus@nexttech.ro','alex7243','ADMIN',NOW(), 1, 2, 'INTERN', NOW(), NOW(),'https://whatsondisneyplus.com/wp-content/uploads/2021/09/bart-.png'),
( 'Darius', 'But','darius.but@nexttech.ro','but23658','ADMIN',NOW(), 3, 2, 'INTERN', NOW(), NOW(),'https://whatsondisneyplus.com/wp-content/uploads/2021/09/ralph.png'),
( 'admin', 'admin','admin@nexttech.ro','admin','ADMIN',NOW(), 3, 2, 'INTERN', NOW(), NOW(),'https://whatsondisneyplus.com/wp-content/uploads/2021/09/ralph.png'),
( 'user', 'user','user@nexttech.ro','user','NORMAL_USER',NOW(), 3, 2, 'INTERN', NOW(), NOW(),'https://whatsondisneyplus.com/wp-content/uploads/2021/09/marge.png');

INSERT INTO personal_details (cnp,iban,phone_number,ci_series,ci_number,tshirt, location, creation_date, last_modification_date, employee_id) VALUES
('1234567890123','RO12312312','0724323241','PX','123456','S', 'Sibiu', NOW(), NOW(), 2),
('1234567890123','RO12312312','0724323241','PX','123456','M', 'Oradea', NOW(), NOW(), 3),
('1234567890123','RO12312312','0724323241','PX','123456','S', 'Valcea', NOW(), NOW(), 4),
('1234567890123','RO12312312','0724323241','PX','123456','M', 'Cluj', NOW(), NOW(), 1);

INSERT INTO account_extra_details (account_id, input_value, title, creation_date, last_modification_date) VALUES
(1, 'RO49AAAA1B31007593840000', 'IBAN ron', NOW(), NOW()),
(1, 'EN49AAXX1B31007593840000', 'IBAN eur', NOW(), NOW()),
(3, 'DE49AAAA1B31007593840000', 'IBAN ron', NOW(), NOW()),
(4, 'AG49AAAA1B31007593840000', 'IBAN eur', NOW(), NOW());

--INSERT INTO employee_details_role (employee_id, role_id, creation_date, last_modification_date) VALUES
--(1, 5, NOW(), NOW()),
--(2, 2, NOW(), NOW()),
--(3, 3, NOW(), NOW());

INSERT INTO employee_details_extra_details (employee_id, input_value, title, creation_date, last_modification_date) VALUES
(1, 'Employee', 'Type of contract', NOW(), NOW()),
(2, 'SRL', 'Type of contract', NOW(), NOW()),
(3, 'PFA', 'Type of contract', NOW(), NOW()),
(4, 'Employee', 'Type of contract', NOW(), NOW());

--INSERT INTO employee_details_team (team_id, employee_id, creation_date, last_modification_date) VALUES
--(2, 1, NOW(), NOW()),
--(1, 2, NOW(), NOW()),
--(1, 3, NOW(), NOW()),
--(3, 4, NOW(), NOW());

INSERT INTO team_project (team_id, project_id, creation_date, last_modification_date) VALUES
(1, 1, NOW(), NOW()),
(1, 2, NOW(), NOW()),
(1, 3, NOW(), NOW()),
(1, 4, NOW(), NOW()),
(1, 5, NOW(), NOW()),
(2, 1, NOW(), NOW()),
(2, 2, NOW(), NOW()),
(2, 3, NOW(), NOW()),
(2, 4, NOW(), NOW()),
(2, 5, NOW(), NOW()),
(3, 1, NOW(), NOW()),
(3, 2, NOW(), NOW()),
(3, 3, NOW(), NOW()),
(3, 4, NOW(), NOW()),
(3, 5, NOW(), NOW()),
(4, 1, NOW(), NOW()),
(4, 2, NOW(), NOW()),
(4, 3, NOW(), NOW()),
(4, 4, NOW(), NOW());

--INSERT INTO team_project_position (team_id, project_id, employee_position_id, creation_date, last_modification_date) VALUES
--(2, 1, 1, NOW(), NOW()),
--(2, 2, 2, NOW(), NOW()),
--(2, 3, 4, NOW(), NOW()),
--(4, 4, 3, NOW(), NOW());

INSERT INTO employee_role_team_project_position (team_id, project_id, employee_position_id ,employee_id, role_id, creation_date, last_modification_date) VALUES
--(2, 1, 1, 2, 2),
--(2, 3, 4, 3, 3),
(2, 1, 2, 1, 2, NOW(), NOW()),
(2, 4, 2, 1, 1, NOW(), NOW()),
(4, 2, 3, 2, 2, NOW(), NOW()),
(2, 2, 2, 3, 4, NOW(), NOW()),
(4, 1, 1, 4, 2, NOW(), NOW()),
(4, 1, 3, 4, 4, NOW(), NOW()),
(2, 4, 1, 5, 1, NOW(), NOW()),
(1, 4, 2, 6, 2, NOW(), NOW()),
(4, 3, 2, 7, 3, NOW(), NOW()),
(2, 1, 3, 8, 1, NOW(), NOW()),
(2, 3, 2, 9, 1, NOW(), NOW()),
(2, 1, 2, 9, 2, NOW(), NOW()),
(3, 4, 2, 10, 1, NOW(), NOW()),
(4, 3, 3, 11, 4, NOW(), NOW()),
(4, 4, 3, 12, 3, NOW(), NOW()),
(2, 3, 3, 13, 1, NOW(), NOW()),
(2, 1, 1, 13, 3, NOW(), NOW()),
(2, 5, 2, 13, 2, NOW(), NOW()),
(4, 3, 1, 14, 1, NOW(), NOW()),
(3, 3, 3, 15, 2, NOW(), NOW()),
(4, 4, 3, 16, 1, NOW(), NOW());



-- Example data for the assets table
INSERT INTO assets (name, category, description, creation_date, last_modification_date)
VALUES
    ('Dell XPS 13', 'LAPTOP', 'Ultra-thin laptop for professionals', NOW(), NOW()),
    ('Logitech MX Master 3', 'MOUSE', 'High-performance wireless mouse', NOW(), NOW()),
    ('Corsair K95 RGB Platinum', 'KEYBOARD', 'Mechanical gaming keyboard', NOW(), NOW()),
    ('Sony WH-1000XM4', 'HEADPHONES', 'Noise-canceling over-ear headphones', NOW(), NOW());

-- Example data for the extra_info table
INSERT INTO assets_extra_column (info_title, description, creation_date, last_modification_date)
VALUES
    ('Serial Number', 'Asset serial number', NOW(), NOW()),
    ('Purchase Date', 'Date of asset purchase', NOW(), NOW()),
    ('Warranty Expires', 'Warranty expiration date', NOW(), NOW());

-- Example data for the asset_extra_info table
INSERT INTO asset_extra_info (info_title, asset_id, value_info, creation_date, last_modification_date)
VALUES
    ('Serial Number', 1, '12345', NOW(), NOW()),
    ('Purchase Date', 2, '2023-01-15', NOW(), NOW()),
    ('Warranty Expires', 3, '2024-05-20', NOW(), NOW());

-- Example data for the user_asset table
INSERT INTO account_asset (employee_id, asset_id, date_given, creation_date, last_modification_date)
VALUES
    (1, 1, '2023-02-10 08:00:00', NOW(), NOW()),
    (2, 3, '2023-03-20 14:30:00', NOW(), NOW()),
    (3, 2, '2023-04-05 10:15:00', NOW(), NOW());

-- Example data for the user_asset_extra_info table
INSERT INTO account_asset_extra_info (account_asset_id, info_title, value_info, creation_date, last_modification_date)
VALUES
    (1, 'Serial Number', '54321', NOW(), NOW()),
    (1, 'Purchase Date', '2023-02-05', NOW(), NOW()),
    (2, 'Serial Number', '67890', NOW(), NOW()),
    (3, 'Purchase Date', '2023-03-18', NOW(), NOW());


