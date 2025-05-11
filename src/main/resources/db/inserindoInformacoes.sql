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

INSERT INTO tb_estoque VALUES
(gen_random_uuid(), '65','100', '15', '264506b9-2cab-4a45-a633-3dbb6a616472', NOW(), NOW()),
(gen_random_uuid(), '50', '70', '10','fc138984-11d8-4a4f-a4ac-ba54a65c3e3f', NOW(), NOW()),
(gen_random_uuid(), '45', '100', '15', 'e3103adf-4b45-4656-8708-4ce4402ec51a', NOW(), NOW()),
(gen_random_uuid(), '40', '55', '5','b4965819-96fb-4760-a10f-3524aa2a6e27', NOW(), NOW()),
(gen_random_uuid(), '70', '100', '10', '4824c893-8bce-4c80-86ef-334dedb345e9', NOW(), NOW()),
(gen_random_uuid(), '55', '60', '15', 'b43f58b0-72ab-43b5-88b7-bc4fddd21549', NOW(), NOW()),
(gen_random_uuid(), '55', '55', '5','f05a3770-bedf-4692-87f3-b1e4747974ad', NOW(), NOW()),
(gen_random_uuid(), '20', '40', '5', 'e535ab7c-a920-4d01-8865-be353c8d8464', NOW(), NOW()),
(gen_random_uuid(), '40', '100', '15', '7a241441-7650-4a00-a3ea-35ca7b7540e5', NOW(), NOW()),
(gen_random_uuid(), '50', '70', '15', '8117e09c-823e-4f64-88da-71408341d55b', NOW(), NOW()),
(gen_random_uuid(), '30', '80', '5', '8bbeba3b-612d-4d0a-8b5f-fe97db0692af', NOW(), NOW());

