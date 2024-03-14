
INSERT INTO employee (first_name, last_name)
VALUES ('first_name1', 'last_name1'),
       ('first_name2', 'last_name2'),
       ('first_name3', 'last_name3'),
       ('first_name4', 'last_name4'),
       ('first_name5', 'last_name5');

INSERT INTO org_codes (inn, kpp, ogrn)
VALUES ('inn1', 'kpp1', 'orgn1'),
       ('inn2', 'kpp2', 'orgn2');

INSERT INTO org (code_id, head_id)
VALUES (1, 1),
       (2, 2),
       (1, 3),
       (2, 4),
       (1, 5);

UPDATE employee SET org_id = 1 WHERE id = 1;

UPDATE employee SET  org_id = CASE
    WHEN id = 2 THEN 2
    WHEN id = 3 THEN 1
    WHEN id = 4 THEN 2
    WHEN id = 5 THEN 1
END
WHERE id IN (2, 3, 4, 5);



