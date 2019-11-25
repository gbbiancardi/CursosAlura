<?php

$idade = 27;

// echo 'Minha idade é $idade anos.'; // dessa forma ele não entende a variável na string. Considera tudo como string
echo "Olá mundo!\n";
echo "\t";
echo "Minha idade é $idade anos.";
echo "\n\n";
echo "Olá mundo!" . PHP_EOL; // boa prática para quebra de linha. Insere a quebra de linha independente do SO
echo "\t";
echo "Minha idade é $idade anos.";