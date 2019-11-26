<?php

$idadeList = [21, 19, 25, 27, 28, 24, 18, 34, 38];

list($idadeVinicius, $idadeJoao, $idadeMaria) = $idadeList;

$idadeList[] = 20;

foreach ($idadeList as $idade) {
    echo $idade . PHP_EOL;
}