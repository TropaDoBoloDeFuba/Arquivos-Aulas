SELECT peca.PeNome 
FROM peca 
WHERE peca.PeNome IN (
    SELECT fornece_para.PeNro 
    FROM fornece_para
    WHERE fornece_para.Fnr = 4);


SELECT peca.PeNro 
FROM peca 
WHERE peca.PeNro IN (SELECT fornece_para.PeNro 
                     FROM fornece_para 
                     WHERE fornece_para.PeNro 
                     IN ( SELECT projeto.Pnr FROM projeto WHERE projeto.Pduracao > 3));


SELECT fornecedor.Fnome 
FROM fornecedor
WHERE EXISTS (
    SELECT * 
    FROM fornece_para
    WHERE (fornece_para.Fnr = fornecedor.Fnr AND fornece_para.PeNro = '2'));