INSERT INTO tb_funcionario VALUES (gen_random_uuid(), '500.500.500-24', NOW(), 'julia@gmail.com', 'Júlia Schmidt', '11976656789', NOW());
INSERT INTO tb_funcionario VALUES (gen_random_uuid(), '111.222.333-44', NOW(), 'carlos.santos@gmail.com', 'Carlos Santos', '11981234567', NOW());
INSERT INTO tb_funcionario VALUES (gen_random_uuid(), '222.333.444-55', NOW(), 'ana.pereira@gmail.com', 'Ana Pereira', '11982345678', NOW());
INSERT INTO tb_funcionario VALUES (gen_random_uuid(), '333.444.555-66', NOW(), 'marcos.lima@gmail.com', 'Marcos Lima', '11983456789', NOW());
INSERT INTO tb_funcionario VALUES (gen_random_uuid(), '444.555.666-77', NOW(), 'bianca.oliveira@gmail.com', 'Bianca Oliveira', '11984567890', NOW());
INSERT INTO tb_funcionario VALUES (gen_random_uuid(), '555.666.777-88', NOW(), 'pedro.alves@gmail.com', 'Pedro Alves', '11985678901', NOW());
INSERT INTO tb_funcionario VALUES (gen_random_uuid(), '666.777.888-99', NOW(), 'camila.ribeiro@gmail.com', 'Camila Ribeiro', '11986789012', NOW());
INSERT INTO tb_funcionario VALUES (gen_random_uuid(), '777.888.999-00', NOW(), 'rafael.moraes@gmail.com', 'Rafael Moraes', '11987890123', NOW());
INSERT INTO tb_funcionario VALUES (gen_random_uuid(), '888.999.000-11', NOW(), 'larissa.costa@gmail.com', 'Larissa Costa', '11988901234', NOW());
INSERT INTO tb_funcionario VALUES (gen_random_uuid(), '999.000.111-22', NOW(), 'joao.silva@gmail.com', 'João Silva', '11989012345', NOW());
INSERT INTO tb_funcionario VALUES (gen_random_uuid(), '101.202.303-44', NOW(), 'fernanda.gomes@gmail.com', 'Fernanda Gomes', '11990123456', NOW());
INSERT INTO tb_funcionario VALUES (gen_random_uuid(), '202.303.404-55', NOW(), 'andre.souza@gmail.com', 'André Souza', '11991234567', NOW());
INSERT INTO tb_funcionario VALUES (gen_random_uuid(), '303.404.505-66', NOW(), 'isabela.martins@gmail.com', 'Isabela Martins', '11992345678', NOW());
INSERT INTO tb_funcionario VALUES (gen_random_uuid(), '404.505.606-77', NOW(), 'bruno.rodrigues@gmail.com', 'Bruno Rodrigues', '11993456789', NOW());
INSERT INTO tb_funcionario VALUES (gen_random_uuid(), '505.606.707-88', NOW(), 'juliana.carvalho@gmail.com', 'Juliana Carvalho', '11994567890', NOW());
INSERT INTO tb_funcionario VALUES (gen_random_uuid(), '606.707.808-99', NOW(), 'thiago.mendes@gmail.com', 'Thiago Mendes', '11995678901', NOW());
INSERT INTO tb_funcionario VALUES (gen_random_uuid(), '707.808.909-00', NOW(), 'mariana.fonseca@gmail.com', 'Mariana Fonseca', '11996789012', NOW());
INSERT INTO tb_funcionario VALUES (gen_random_uuid(), '808.909.010-11', NOW(), 'gustavo.lima@gmail.com', 'Gustavo Lima', '11997890123', NOW());
INSERT INTO tb_funcionario VALUES (gen_random_uuid(), '909.010.121-22', NOW(), 'aline.ferreira@gmail.com', 'Aline Ferreira', '11998901234', NOW());
INSERT INTO tb_funcionario VALUES (gen_random_uuid(), '010.121.232-33', NOW(), 'daniel.santos@gmail.com', 'Daniel Santos', '11999012345', NOW());


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

INSERT INTO tb_produto
VALUES
  (gen_random_uuid(),
   '14141',
   NOW(),
   'Escova de Dentes Pet',
   25,
   NOW(),
   (SELECT id FROM tb_categoria WHERE nome_da_categoria = 'Higiene'),
   (SELECT id FROM tb_fornecedor WHERE nome_do_fornecedor = 'EcoPet Sustentável'),
   (SELECT id FROM tb_marca WHERE nome_da_marca = 'PataLimpa')
  );

INSERT INTO tb_produto
VALUES
  (gen_random_uuid(),
   '15151',
   NOW(),
   'Antipulgas Natural',
   55,
   NOW(),
   (SELECT id FROM tb_categoria WHERE nome_da_categoria = 'Medicamentos'),
   (SELECT id FROM tb_fornecedor WHERE nome_do_fornecedor = 'Farmapet Soluções Veterinárias'),
   (SELECT id FROM tb_marca WHERE nome_da_marca = 'VetPlus')
  );

INSERT INTO tb_produto
VALUES
  (gen_random_uuid(),
   '16161',
   NOW(),
   'Comedouro Antiderramamento',
   60,
   NOW(),
   (SELECT id FROM tb_categoria WHERE nome_da_categoria = 'Acessórios'),
   (SELECT id FROM tb_fornecedor WHERE nome_do_fornecedor = 'Peludinhos Imports'),
   (SELECT id FROM tb_marca WHERE nome_da_marca = 'DogBem')
  );

INSERT INTO tb_produto
VALUES
  (gen_random_uuid(),
   '17171',
   NOW(),
   'Petiscos Naturais',
   45,
   NOW(),
   (SELECT id FROM tb_categoria WHERE nome_da_categoria = 'Alimentos'),
   (SELECT id FROM tb_fornecedor WHERE nome_do_fornecedor = 'PetFood Distribuidora'),
   (SELECT id FROM tb_marca WHERE nome_da_marca = 'PetHappy')
  );

INSERT INTO tb_produto
VALUES
  (gen_random_uuid(),
   '18181',
   NOW(),
   'Brinquedo Bola de Borracha',
   20,
   NOW(),
   (SELECT id FROM tb_categoria WHERE nome_da_categoria = 'Brinquedos'),
   (SELECT id FROM tb_fornecedor WHERE nome_do_fornecedor = 'Brinquedos Pets Ltda'),
   (SELECT id FROM tb_marca WHERE nome_da_marca = 'CãoFeliz')
  );

INSERT INTO tb_produto
VALUES
  (gen_random_uuid(),
   '19191',
   NOW(),
   'Kit Higiene Básico',
   80,
   NOW(),
   (SELECT id FROM tb_categoria WHERE nome_da_categoria = 'Higiene'),
   (SELECT id FROM tb_fornecedor WHERE nome_do_fornecedor = 'Dog&Cat Suprimentos'),
   (SELECT id FROM tb_marca WHERE nome_da_marca = 'PetPrime')
  );

INSERT INTO tb_produto
VALUES
  (gen_random_uuid(),
   '20202',
   NOW(),
   'Medicamento para Dor Articular',
   95,
   NOW(),
   (SELECT id FROM tb_categoria WHERE nome_da_categoria = 'Medicamentos'),
   (SELECT id FROM tb_fornecedor WHERE nome_do_fornecedor = 'VetPharma Indústria'),
   (SELECT id FROM tb_marca WHERE nome_da_marca = 'VetPlus')
  );

INSERT INTO tb_produto
VALUES
  (gen_random_uuid(),
   '21212',
   NOW(),
   'Coleira LED para Passeio Noturno',
   70,
   NOW(),
   (SELECT id FROM tb_categoria WHERE nome_da_categoria = 'Acessórios'),
   (SELECT id FROM tb_fornecedor WHERE nome_do_fornecedor = 'Distribuidora PetNobre'),
   (SELECT id FROM tb_marca WHERE nome_da_marca = 'ZooVida')
  );

INSERT INTO tb_produto
VALUES
  (gen_random_uuid(),
   '22223',
   NOW(),
   'Ração Seca para Cães Filhotes',
   85,
   NOW(),
   (SELECT id FROM tb_categoria WHERE nome_da_categoria = 'Alimentos'),
   (SELECT id FROM tb_fornecedor WHERE nome_do_fornecedor = 'Top Rações Brasil'),
   (SELECT id FROM tb_marca WHERE nome_da_marca = 'AnimalCare')
  );

INSERT INTO tb_produto
VALUES
  (gen_random_uuid(),
   '23232',
   NOW(),
   'Caminha Dobrável para Pets',
   140,
   NOW(),
   (SELECT id FROM tb_categoria WHERE nome_da_categoria = 'Acessórios'),
   (SELECT id FROM tb_fornecedor WHERE nome_do_fornecedor = 'Mundo Pet Importações'),
   (SELECT id FROM tb_marca WHERE nome_da_marca = 'PetPrime')
  );


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

INSERT INTO tb_estoque VALUES
(gen_random_uuid(), NOW(), 25, 50, 10, NOW(), (SELECT id FROM tb_produto WHERE codigoean_13 = '14141')),
(gen_random_uuid(), NOW(), 40, 70, 15, NOW(), (SELECT id FROM tb_produto WHERE codigoean_13 = '15151')),
(gen_random_uuid(), NOW(), 35, 60, 12, NOW(), (SELECT id FROM tb_produto WHERE codigoean_13 = '16161')),
(gen_random_uuid(), NOW(), 30, 55, 10, NOW(), (SELECT id FROM tb_produto WHERE codigoean_13 = '17171')),
(gen_random_uuid(), NOW(), 20, 40, 8, NOW(), (SELECT id FROM tb_produto WHERE codigoean_13 = '18181')),
(gen_random_uuid(), NOW(), 50, 90, 20, NOW(), (SELECT id FROM tb_produto WHERE codigoean_13 = '19191')),
(gen_random_uuid(), NOW(), 45, 85, 15, NOW(), (SELECT id FROM tb_produto WHERE codigoean_13 = '20202')),
(gen_random_uuid(), NOW(), 55, 100, 20, NOW(), (SELECT id FROM tb_produto WHERE codigoean_13 = '21212')),
(gen_random_uuid(), NOW(), 60, 110, 25, NOW(), (SELECT id FROM tb_produto WHERE codigoean_13 = '22223')),
(gen_random_uuid(), NOW(), 35, 70, 15, NOW(), (SELECT id FROM tb_produto WHERE codigoean_13 = '23232'));

INSERT INTO tb_registroprodutos VALUES
(gen_random_uuid(), NOW(), 3, NOW(), (SELECT id FROM tb_funcionario WHERE nome = 'Ana Pereira'), (SELECT id FROM tb_produto WHERE codigoean_13 = '14141')),
(gen_random_uuid(), NOW(), 1, NOW(), (SELECT id FROM tb_funcionario WHERE nome = 'Daniel Santos'), (SELECT id FROM tb_produto WHERE codigoean_13 = '15151')),
(gen_random_uuid(), NOW(), 5, NOW(), (SELECT id FROM tb_funcionario WHERE nome = 'Pedro Alves'), (SELECT id FROM tb_produto WHERE codigoean_13 = '16161')),
(gen_random_uuid(), NOW(), 2, NOW(), (SELECT id FROM tb_funcionario WHERE nome = 'Ana Pereira'), (SELECT id FROM tb_produto WHERE codigoean_13 = '17171')),
(gen_random_uuid(), NOW(), 4, NOW(), (SELECT id FROM tb_funcionario WHERE nome = 'Daniel Santos'), (SELECT id FROM tb_produto WHERE codigoean_13 = '18181'));

INSERT INTO tb_servico VALUES
(gen_random_uuid(),'banho','25.0'),
(gen_random_uuid(),'tosa','30.0'),
(gen_random_uuid(),'banho e tosa','55.0');
