<?php

$peso = 120;
$altura = 1.85;

$imc = $peso / ($altura * $altura); // poderia ter sido altura ** 2;

if ($imc < 18.5) {
    echo "Seu IMC é de $imc. Você está abaixo do peso!";
} elseif ($imc < 25) {
    echo "Seu IMC é de $imc. Você está no peso normal!";
} elseif ($imc < 30) {
    echo "Seu IMC é de $imc. Você está no sobrepeso!";
} elseif ($imc < 35) {
    echo "Seu IMC é de $imc. Você está com Obesidade grau 1!";
} elseif ($imc < 40) {
    echo "Seu IMC é de $imc. Você está com Obesidade grau 2!";
} else {
    echo "Seu IMC é de $imc. Você está com Obesidade grau 3!";
}