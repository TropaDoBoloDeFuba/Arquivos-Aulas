-- Parte 01
SELECT PeNome
FROM peca
WHERE ((PeCor = 'Vermelho' OR PeCor = 'Amarelo') AND PePreco IN (09, 18, 22, 40, 90));

-- Parte 02
SELECT Fnome FROM fornecedor WHERE Fcidade LIKE 'S%';

-- Parte 03 - Ver se tal campo está vazio
SELECT PeNome FROM peca WHERE PeCor IS NULL;

-- Exercício 
SELECT * FROM `peca` WHERE PePreco NOT IN (09, 14, 60);

-- Parte 04
SELECT DISTINCT PeNro FROM `fornece_para`;

