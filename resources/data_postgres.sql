INSERT INTO team (name, description, creation_date, last_modification_date) VALUES
('Team Mobile', 'Team for mobile projects', NOW(), NOW()),
('Team Java', 'Team for java projects', NOW(), NOW()),
('Team Magento', 'Team for magento projects', NOW(), NOW()),
('Team Angular', 'Team for angular projects', NOW(), NOW());

INSERT INTO role (name, description) VALUES
('Team leader', 'Leader of the team'),
('Delivery manager', 'Takes care of product delivery'),
('Scrum master', 'Overview of agile ceremonies'),
('Product owner', 'Owns the product'),
('No role', 'This user has no role');

INSERT INTO employee_position (name, description) VALUES
('Fullstack developer', 'Backend + Frontend developer'),
('Backend developer', 'Writes code for backend'),
('Frontend developer', 'Writes code for frontend'),
('HR employee', 'Works in HR department');

INSERT INTO project (name, description) VALUES
('NXTHR-company', 'Company copy from sage'),
('NXTHR-assets', 'Assets copy from sage'),
('Calvin', 'Consors bank project'),
('EFE', 'Employee frontend project'),
('NXT-plug', 'Mobile app for ,car charging');

INSERT INTO account_extra_column (title) VALUES
('IBAN eur'),
('IBAN ron'),
('Type of contract');

INSERT INTO employee_details (start_date, employee_position_id, manager_id, seniority_level) VALUES
( NOW(), 1, NULL, 'INTERN'),
( NOW(), 2, 1, 'JUNIOR_DEVELOPER'),
( NOW(), 3, 2, 'MID_DEVELOPER'),
( NOW(), 4, 3, 'SENIOR_DEVELOPER');

INSERT INTO personalDetails (first_name, last_name,work_email, password, auth_role, tshirt, location, creation_date, last_modification_date, employee_details_id, photo_URL) VALUES
('Radu', 'Marinau','email1@example.com','password1','ADMIN', 'M', 'Cluj', NOW(), NOW(), 1, 'https://media.istockphoto.com/id/1150528651/photo/successful-it-developer.jpg?b=1&s=612x612&w=0&k=20&c=sizKCRrpGQgYdIBBczZnuKQbBKEEmyTxoFKApGd3HBs='),
('Ionut', 'Baias','email2@example.com','password2','NORMAL_USER', 'S', 'Sibiu', NOW(), NOW(), 2, 'https://media.istockphoto.com/id/1150528651/photo/successful-it-developer.jpg?b=1&s=612x612&w=0&k=20&c=sizKCRrpGQgYdIBBczZnuKQbBKEEmyTxoFKApGd3HBs='),
('Razvan', 'Joita','email3@example.com','password3','NORMAL_USER', 'M', 'Oradea', NOW(), NOW(), 3, 'https://media.istockphoto.com/id/1150528651/photo/successful-it-developer.jpg?b=1&s=612x612&w=0&k=20&c=sizKCRrpGQgYdIBBczZnuKQbBKEEmyTxoFKApGd3HBs='),
('Mircea', 'Ilina','email4@example.com','password4','ADMIN', 'S', 'Valcea', NOW(), NOW(), 4, 'https://media.istockphoto.com/id/1150528651/photo/successful-it-developer.jpg?b=1&s=612x612&w=0&k=20&c=sizKCRrpGQgYdIBBczZnuKQbBKEEmyTxoFKApGd3HBs=');

INSERT INTO account_extra_details (account_id, input_value, title) VALUES
(1, 'RO49AAAA1B31007593840000', 'IBAN ron'),
(1, 'EN49AAXX1B31007593840000', 'IBAN eur'),
(3, 'DE49AAAA1B31007593840000', 'IBAN ron'),
(4, 'AG49AAAA1B31007593840000', 'IBAN eur');

INSERT INTO employee_details_role (employee_details_id, role_id) VALUES
(1, 5),
(2, 2),
(3, 3);

INSERT INTO employee_details_extra_details (employee_details_id, input_value, title) VALUES
(1, 'Employee', 'Type of contract'),
(2, 'SRL', 'Type of contract'),
(3, 'PFA', 'Type of contract'),
(4, 'Employee', 'Type of contract');

INSERT INTO employee_details_team (team_id, employee_details_id) VALUES
(2, 1),
(1, 2),
(1, 3),
(3, 4);

INSERT INTO team_project (team_id, project_id) VALUES
(2, 1),
(2, 2),
(2, 3),
(4, 4),
(1, 5);

INSERT INTO team_project_position (team_id, project_id, employee_position_id) VALUES
(2, 1, 1),
(2, 2, 2),
(2, 3, 4),
(4, 4, 3);

INSERT INTO employee_role_team_project_position (team_id, project_id, employee_position_id ,employee_details_id, role_id) VALUES
--(2, 1, 1, 2, 2),
--(2, 3, 4, 3, 3),
(2, 2, 2, 1, 5),
(2, 1, 1, 2, 2);






-- Example data for the assets table
INSERT INTO assets (name, category, description)
VALUES
    ('Dell XPS 13', 'LAPTOP', 'Ultra-thin laptop for professionals'),
    ('Logitech MX Master 3', 'MOUSE', 'High-performance wireless mouse'),
    ('Corsair K95 RGB Platinum', 'KEYBOARD', 'Mechanical gaming keyboard'),
    ('Sony WH-1000XM4', 'HEADPHONES', 'Noise-canceling over-ear headphones');

-- Example data for the extra_info table
INSERT INTO assets_extra_column (info_title, description)
VALUES
    ('Serial Number', 'Asset serial number'),
    ('Purchase Date', 'Date of asset purchase'),
    ('Warranty Expires', 'Warranty expiration date');

-- Example data for the asset_extra_info table
INSERT INTO asset_extra_info (info_title, asset_id, value_info)
VALUES
    ('Serial Number', 1, '12345'),
    ('Purchase Date', 2, '2023-01-15'),
    ('Warranty Expires', 3, '2024-05-20');

-- Example data for the user_asset table
INSERT INTO account_asset (employee_details_id, asset_id, date_given)
VALUES
    (1, 1, '2023-02-10 08:00:00'),
    (2, 3, '2023-03-20 14:30:00'),
    (3, 2, '2023-04-05 10:15:00');

-- Example data for the user_asset_extra_info table
INSERT INTO account_asset_extra_info (account_asset_id, info_title, value_info)
VALUES
    (1, 'Serial Number', '54321'),
    (1, 'Purchase Date', '2023-02-05'),
    (2, 'Serial Number', '67890'),
    (3, 'Purchase Date', '2023-03-18');


