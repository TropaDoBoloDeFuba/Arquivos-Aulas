-- Comando 01
SELECT PeNro, SUM(Quant) FROM fornece_para GROUP BY PeNro; 
    -- SUM = Este comando soma.
    -- GROUP BY = Agrupa.
    -- Este comando pode por exemplo agrupar todos os item que tem a cor vermelha.

SELECT PeNro, COUNT(*) FROM fornece_para GROUP BY PeNro;
    -- COUNT = Conta as ocorrências.

SELECT PeNro, COUNT(*) FROM fornece_para GROUP BY PeNro ORDER BY 2;
    -- ORDER BY 2 = Organiza em ordem crescente a coluna 2.
    -- DESC = Decrescente.

SELECT PeNro, COUNT(*) FROM fornece_para GROUP BY PeNro ORDER BY 2 ASC, PeNro DESC;

SELECT PeNro, SUM(Quant) FROM fornece_para GROUP BY PeNro HAVING SUM(Quant) < 5;
    -- HAVING = Tendo.
    