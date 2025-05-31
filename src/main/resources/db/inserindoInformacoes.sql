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
   'Brinquedo de Corda',
   '30',
   (SELECT id FROM tb_categoria WHERE nome_da_categoria = 'Brinquedos'), 
   (SELECT id FROM tb_fornecedor WHERE nome_do_fornecedor = 'Brinquedos Pets Ltda'), 
   (SELECT id FROM tb_marca WHERE nome_da_marca = 'PetPlay'), NOW(), NOW()
   );

INSERT INTO tb_produto 
VALUES 
  (gen_random_uuid(),
   '33333',
   'Shampoo para Pets', 
   '40', 
   (SELECT id FROM tb_categoria WHERE nome_da_categoria = 'Higiene'), 
   (SELECT id FROM tb_fornecedor WHERE nome_do_fornecedor = 'VetPharma Indústria'), 
   (SELECT id FROM tb_marca WHERE nome_da_marca = 'AnimalCare'), NOW(), NOW()
   );


INSERT INTO tb_produto 
VALUES 
  (gen_random_uuid(), 
   '44444',
   'Caminha Confortável', 
   '120', 
   (SELECT id FROM tb_categoria WHERE nome_da_categoria = 'Acessórios'), 
   (SELECT id FROM tb_fornecedor WHERE nome_do_fornecedor = 'Mundo Pet Importações'), 
   (SELECT id FROM tb_marca WHERE nome_da_marca = 'PetPrime'), NOW(), NOW()
   );

INSERT INTO tb_produto 
VALUES 
  (gen_random_uuid(), 
   '55555',
   'Ração para Cães', 
   '90', 
   (SELECT id FROM tb_categoria WHERE nome_da_categoria = 'Alimentos'), 
   (SELECT id FROM tb_fornecedor WHERE nome_do_fornecedor = 'Amigos do Bicho Distribuidora'), 
   (SELECT id FROM tb_marca WHERE nome_da_marca = 'PetLuxo'), NOW(), NOW()
   );

INSERT INTO tb_produto 
VALUES 
  (gen_random_uuid(), 
   '66666',
   'Alimento Natural', 
   '75', 
   (SELECT id FROM tb_categoria WHERE nome_da_categoria = 'Alimentos'), 
   (SELECT id FROM tb_fornecedor WHERE nome_do_fornecedor = 'EcoPet Sustentável'), 
   (SELECT id FROM tb_marca WHERE nome_da_marca = 'VetPlus'), NOW(), NOW()
   );

INSERT INTO tb_produto 
VALUES 
  (gen_random_uuid(), 
   '77777',
   'Coleira Antirrábica', 
   '50', 
   (SELECT id FROM tb_categoria WHERE nome_da_categoria = 'Acessórios'), 
   (SELECT id FROM tb_fornecedor WHERE nome_do_fornecedor = 'Distribuidora PetNobre'), 
   (SELECT id FROM tb_marca WHERE nome_da_marca = 'ZooVida'), NOW(), NOW()
   );

INSERT INTO tb_produto 
VALUES 
  (gen_random_uuid(), 
   '88888',
   'Vacina Antirrábica', 
   '130', 
   (SELECT id FROM tb_categoria WHERE nome_da_categoria = 'Medicamentos'), 
   (SELECT id FROM tb_fornecedor WHERE nome_do_fornecedor = 'Top Rações Brasil'), 
   (SELECT id FROM tb_marca WHERE nome_da_marca = 'PetHappy'), NOW(), NOW()
   );

INSERT INTO tb_produto 
VALUES 
  (gen_random_uuid(), 
   '99999',
   'Ração para Gatos', 
   '110', 
   (SELECT id FROM tb_categoria WHERE nome_da_categoria = 'Alimentos'), 
   (SELECT id FROM tb_fornecedor WHERE nome_do_fornecedor = 'PetLovers Atacado'), 
   (SELECT id FROM tb_marca WHERE nome_da_marca = 'PetPlay'), NOW(), NOW() 
   );

INSERT INTO tb_produto 
VALUES 
  (gen_random_uuid(),
   '10101',
   'Suplemento Nutricional', 
   '65', 
   (SELECT id FROM tb_categoria WHERE nome_da_categoria = 'Medicamentos'), 
   (SELECT id FROM tb_fornecedor WHERE nome_do_fornecedor = 'Farmapet Soluções Veterinárias'), 
   (SELECT id FROM tb_marca WHERE nome_da_marca = 'BichoChic'), NOW(), NOW()
   );

INSERT INTO tb_produto 
VALUES 
  (gen_random_uuid(), 
   '12121',
   'Brinquedo de Pelúcia', 
   '40', 
   (SELECT id FROM tb_categoria WHERE nome_da_categoria = 'Brinquedos'), 
   (SELECT id FROM tb_fornecedor WHERE nome_do_fornecedor = 'Peludinhos Imports'), 
   (SELECT id FROM tb_marca WHERE nome_da_marca = 'DogBem'), NOW(), NOW() 
   );

INSERT INTO tb_produto 
VALUES 
  (gen_random_uuid(), 
   '13131',
   'Cama para Cães', 
   '150', 
   (SELECT id FROM tb_categoria WHERE nome_da_categoria = 'Acessórios'), 
   (SELECT id FROM tb_fornecedor WHERE nome_do_fornecedor = 'Dog&Cat Suprimentos'), 
   (SELECT id FROM tb_marca WHERE nome_da_marca = 'NaturePet'), NOW(), NOW() 
   );

SELECT * FROM tb_produto

INSERT INTO tb_estoque VALUES
(gen_random_uuid(), '65','100', '15', '4111b11f-de2a-4cb3-9cb7-73c6a039ce35', NOW(), NOW()),
(gen_random_uuid(), '50', '70', '10','6a995931-5c38-4651-8ffd-5cdea0128652', NOW(), NOW()),
(gen_random_uuid(), '45', '100', '15', 'a495780a-148e-41ab-8c84-e3b07a8247a5', NOW(), NOW()),
(gen_random_uuid(), '40', '55', '5','c6b806c7-ff2c-42c6-bb55-57f7923d9c2e', NOW(), NOW()),
(gen_random_uuid(), '70', '100', '10', '651bd221-16f6-432f-b834-1ce519336457', NOW(), NOW()),
(gen_random_uuid(), '55', '60', '15', '8690ed7c-0bf3-4e15-b9b4-0037d6a1bf49', NOW(), NOW()),
(gen_random_uuid(), '55', '55', '5','5ee566c4-8c20-4d87-abd5-75daa406b790', NOW(), NOW()),
(gen_random_uuid(), '20', '40', '5', 'dbe8f8cc-0e36-4082-b631-a5798eeb2867', NOW(), NOW()),
(gen_random_uuid(), '40', '100', '15', '1f4f61b5-fc72-42c3-8e45-dcddac696bb7', NOW(), NOW()),
(gen_random_uuid(), '50', '70', '15', '83c81627-28a9-407e-abe9-7cd9019c8b1d', NOW(), NOW()),
(gen_random_uuid(), '30', '80', '5', 'c65349d1-7002-41ee-a44f-894f3a8cfff7', NOW(), NOW());

