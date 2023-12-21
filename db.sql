SELECT * FROM brand;
SELECT * FROM privilege;
SELECT * FROM product;
SELECT * FROM rol;
SELECT * FROM sale;
SELECT * FROM user;

INSERT INTO brand
	(name)
VALUES
	('acme'),
    ('mecha'),
    ('asgardian'),
    ('batigadget');

INSERT INTO product
	(name, price, value, id_brand)
VALUES
	('producto1', 1200, 850, 1),
    ('producto2', 5800, 3200, 3 ),
    ('producto3', 4500, 2000, 3);

INSERT INTO rol
	(name)
VALUES
	('system'),
    ('admin'),
    ('user');

INSERT INTO sale
	(prod_id, prod_name, prod_count)
VALUES
	(3, 'producto3', 5),
	(1, 'producto1', 3),
    (2, 'producto2', 4);

INSERT INTO user 
	(mail, name, password, id_rol)
values
	('super@hero.cl', 'Saitama', '123456', 3),
	('isaac@hxh.cl', 'Netero', '123456', 3),
	('clarck@s.cl', 'Superman', '123456', 3);
    
DROP TABLE brand;
DROP TABLE privilege;
DROP TABLE product;
DROP TABLE rol;
DROP TABLE sale;
DROP TABLE user;

