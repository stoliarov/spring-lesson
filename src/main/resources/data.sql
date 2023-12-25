-- employer
INSERT INTO employer(description)
values ('IT-лаборатория. О нас: ...');

INSERT INTO employer(description)
values ('Автосалон. О нас: ...');


-- vacancy
INSERT INTO vacancy(employer_id, title, description)
values (1, 'Java Developer', 'Ищем java-разработчика. Требования: ...');

INSERT INTO vacancy(employer_id, title, description)
values (1, 'QA manual', 'Ищем тестровщика. Требования: ...');

INSERT INTO vacancy(employer_id, title, description)
values (2, 'Менеджер по продажам', 'Ищем менеджера по продажам. Требования: ...');
