INSERT INTO tb_categoria VALUES (gen_random_uuid(), 'Higiene');
INSERT INTO tb_categoria VALUES (gen_random_uuid(), 'Alimentos');
INSERT INTO tb_categoria VALUES (gen_random_uuid(), 'Acessórios');
INSERT INTO tb_categoria VALUES (gen_random_uuid(), 'Medicamentos');
INSERT INTO tb_categoria VALUES (gen_random_uuid(), 'Brinquedos');

INSERT INTO tb_fornecedor VALUES (gen_random_uuid(), 'PetFood Distribuidora');
INSERT INTO tb_fornecedor VALUES (gen_random_uuid(), 'Brinquedos Pets Ltda');
INSERT INTO tb_fornecedor VALUES (gen_random_uuid(), 'VetPharma Indústria');
INSERT INTO tb_fornecedor VALUES (gen_random_uuid(), 'Mundo Pet Importações');
INSERT INTO tb_fornecedor VALUES (gen_random_uuid(), 'Amigos do Bicho Distribuidora');
INSERT INTO tb_fornecedor VALUES (gen_random_uuid(), 'EcoPet Sustentável');
INSERT INTO tb_fornecedor VALUES (gen_random_uuid(), 'Distribuidora PetNobre');
INSERT INTO tb_fornecedor VALUES (gen_random_uuid(), 'Top Rações Brasil');
INSERT INTO tb_fornecedor VALUES (gen_random_uuid(), 'PetLovers Atacado');
INSERT INTO tb_fornecedor VALUES (gen_random_uuid(), 'Farmapet Soluções Veterinárias');
INSERT INTO tb_fornecedor VALUES (gen_random_uuid(), 'Peludinhos Imports');
INSERT INTO tb_fornecedor VALUES (gen_random_uuid(), 'Dog&Cat Suprimentos');
INSERT INTO tb_fornecedor VALUES (gen_random_uuid(), 'Zoolar Comércio Animal');

INSERT INTO tb_marca VALUES (gen_random_uuid(), 'PetHappy');
INSERT INTO tb_marca VALUES (gen_random_uuid(), 'AnimalCare');
INSERT INTO tb_marca VALUES (gen_random_uuid(), 'PetPlay');
INSERT INTO tb_marca VALUES (gen_random_uuid(), 'CãoFeliz');
INSERT INTO tb_marca VALUES (gen_random_uuid(), 'GatoMimoso');
INSERT INTO tb_marca VALUES (gen_random_uuid(), 'NaturePet');
INSERT INTO tb_marca VALUES (gen_random_uuid(), 'VetPlus');
INSERT INTO tb_marca VALUES (gen_random_uuid(), 'PetPrime');
INSERT INTO tb_marca VALUES (gen_random_uuid(), 'PataLimpa');
INSERT INTO tb_marca VALUES (gen_random_uuid(), 'DogBem');
INSERT INTO tb_marca VALUES (gen_random_uuid(), 'ZooVida');
INSERT INTO tb_marca VALUES (gen_random_uuid(), 'BichoChic');
INSERT INTO tb_marca VALUES (gen_random_uuid(), 'PetLuxo');

INSERT INTO tb_produto 
VALUES 
  (gen_random_uuid(), 
   '22222',
    NOW(),
   'Brinquedo de Corda',
   30,
   NOW(),
   (SELECT id FROM tb_categoria WHERE nome_da_categoria = 'Brinquedos'), 
   (SELECT id FROM tb_fornecedor WHERE nome_do_fornecedor = 'Brinquedos Pets Ltda'), 
   (SELECT id FROM tb_marca WHERE nome_da_marca = 'PetPlay')
   );

INSERT INTO tb_produto 
VALUES 
  (gen_random_uuid(),
   '33333',
   NOW(),
   'Shampoo para Pets', 
   40, 
   NOW(),
   (SELECT id FROM tb_categoria WHERE nome_da_categoria = 'Higiene'), 
   (SELECT id FROM tb_fornecedor WHERE nome_do_fornecedor = 'VetPharma Indústria'), 
   (SELECT id FROM tb_marca WHERE nome_da_marca = 'AnimalCare')
   );


INSERT INTO tb_produto 
VALUES 
  (gen_random_uuid(), 
   '44444',
   NOW(),
   'Caminha Confortável', 
   120, 
   NOW(),
   (SELECT id FROM tb_categoria WHERE nome_da_categoria = 'Acessórios'), 
   (SELECT id FROM tb_fornecedor WHERE nome_do_fornecedor = 'Mundo Pet Importações'), 
   (SELECT id FROM tb_marca WHERE nome_da_marca = 'PetPrime')
   );

INSERT INTO tb_produto 
VALUES 
  (gen_random_uuid(), 
   '55555',
   NOW(),
   'Ração para Cães', 
   90, 
   NOW(),
   (SELECT id FROM tb_categoria WHERE nome_da_categoria = 'Alimentos'), 
   (SELECT id FROM tb_fornecedor WHERE nome_do_fornecedor = 'Amigos do Bicho Distribuidora'), 
   (SELECT id FROM tb_marca WHERE nome_da_marca = 'PetLuxo')
   );

INSERT INTO tb_produto 
VALUES 
  (gen_random_uuid(), 
   '66666',
   NOW(),
   'Alimento Natural', 
   75, 
   NOW(),
   (SELECT id FROM tb_categoria WHERE nome_da_categoria = 'Alimentos'), 
   (SELECT id FROM tb_fornecedor WHERE nome_do_fornecedor = 'EcoPet Sustentável'), 
   (SELECT id FROM tb_marca WHERE nome_da_marca = 'VetPlus')
   );

INSERT INTO tb_produto 
VALUES 
  (gen_random_uuid(), 
   '77777',
   NOW(),
   'Coleira Antirrábica', 
   50, 
   NOW(),
   (SELECT id FROM tb_categoria WHERE nome_da_categoria = 'Acessórios'), 
   (SELECT id FROM tb_fornecedor WHERE nome_do_fornecedor = 'Distribuidora PetNobre'), 
   (SELECT id FROM tb_marca WHERE nome_da_marca = 'ZooVida')
   );

INSERT INTO tb_produto
VALUES 
  (gen_random_uuid(), 
   '88888',
    NOW(),
   'Vacina Antirrábica', 
   130, 
   NOW(),
   (SELECT id FROM tb_categoria WHERE nome_da_categoria = 'Medicamentos'), 
   (SELECT id FROM tb_fornecedor WHERE nome_do_fornecedor = 'Top Rações Brasil'), 
   (SELECT id FROM tb_marca WHERE nome_da_marca = 'PetHappy')
   );

INSERT INTO tb_produto 
VALUES 
  (gen_random_uuid(), 
   '99999',
    NOW(),
   'Ração para Gatos', 
   110, 
   NOW(),
   (SELECT id FROM tb_categoria WHERE nome_da_categoria = 'Alimentos'), 
   (SELECT id FROM tb_fornecedor WHERE nome_do_fornecedor = 'PetLovers Atacado'), 
   (SELECT id FROM tb_marca WHERE nome_da_marca = 'PetPlay')
   );

INSERT INTO tb_produto 
VALUES 
  (gen_random_uuid(),
   '10101', NOW(),
   'Suplemento Nutricional', 
   65.5, NOW(),
   (SELECT id FROM tb_categoria WHERE nome_da_categoria = 'Medicamentos'), 
   (SELECT id FROM tb_fornecedor WHERE nome_do_fornecedor = 'Farmapet Soluções Veterinárias'), 
   (SELECT id FROM tb_marca WHERE nome_da_marca = 'BichoChic')
   );

INSERT INTO tb_produto 
VALUES 
  (gen_random_uuid(), 
   '12121',
   NOW(),
   'Brinquedo de Pelúcia', 
   40, NOW(),
   (SELECT id FROM tb_categoria WHERE nome_da_categoria = 'Brinquedos'), 
   (SELECT id FROM tb_fornecedor WHERE nome_do_fornecedor = 'Peludinhos Imports'), 
   (SELECT id FROM tb_marca WHERE nome_da_marca = 'DogBem')
   );

INSERT INTO tb_produto 
VALUES 
  (gen_random_uuid(), 
   '13131',
   NOW(),
   'Cama para Cães', 
   150, NOW(),
   (SELECT id FROM tb_categoria WHERE nome_da_categoria = 'Acessórios'), 
   (SELECT id FROM tb_fornecedor WHERE nome_do_fornecedor = 'Dog&Cat Suprimentos'), 
   (SELECT id FROM tb_marca WHERE nome_da_marca = 'NaturePet')
   );

SELECT * FROM tb_estoque;

INSERT INTO tb_estoque VALUES
(gen_random_uuid(), now(), 65, 100, 15,  NOW(), (SELECT id FROM tb_produto where codigoean_13 = '22222')),
(gen_random_uuid(), NOW(), 50, 70, 10, NOW(), (SELECT id FROM tb_produto where codigoean_13 = '33333')),
(gen_random_uuid(), NOW(), 45, 100, 15, NOW(), (SELECT id FROM tb_produto where codigoean_13 = '44444')),
(gen_random_uuid(), NOW(), 40, 55, 5, NOW(), (SELECT id FROM tb_produto where codigoean_13 = '55555')),
(gen_random_uuid(), NOW(), 70, 100, 10, NOW(), (SELECT id FROM tb_produto where codigoean_13 = '66666')),
(gen_random_uuid(), NOW(), 55, 60, 15, NOW(), (SELECT id FROM tb_produto where codigoean_13 = '77777')),
(gen_random_uuid(), NOW(), 55, 55, 5, NOW(), (SELECT id FROM tb_produto where codigoean_13 = '88888')),
(gen_random_uuid(), NOW(), 20, 40, 5, NOW(), (SELECT id FROM tb_produto where codigoean_13 = '99999')),
(gen_random_uuid(), NOW(), 40, 100, 15, NOW(), (SELECT id FROM tb_produto where codigoean_13 = '10101')),
(gen_random_uuid(), NOW(), 50, 70, 15, NOW(), (SELECT id FROM tb_produto where codigoean_13 = '12121')),
(gen_random_uuid(), NOW(), 30, 80, 5, NOW(), (SELECT id FROM tb_produto where codigoean_13 = '13131'));

