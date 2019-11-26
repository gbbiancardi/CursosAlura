<?php

// importa um arquivo apenas uma vez, com seu nome tendo que estar correto.
require_once 'funcoes.php'; 

$contasCorrentes = [
    '123.456.789-10' => [
        'titular' => 'Maria',
        'saldo' => 10000
    ],
    '123.456.789-11' => [
        'titular' => 'Alberto',
        'saldo' => 300
    ],
    '123.256.789-12' => [
        'titular' => 'Vinicius',
        'saldo' => 100
    ]
];

$contasCorrentes['123.456.789-10'] = sacar($contasCorrentes['123.456.789-10'], 500);
$contasCorrentes['123.456.789-11'] = depositar($contasCorrentes['123.456.789-11'], 500);

// remove uma variável ou item de uma lista.
unset($contasCorrentes['123.456.789-11']); 

titularComLetrasMaiuscular($contasCorrentes['123.256.789-12']);

// Usando lista
foreach ($contasCorrentes as $cpf => $conta) {
    ['titular' => $titular, 'saldo' => $saldo] = $conta;
    exibeMensagem(
        "$cpf $titular $saldo"
    );
}

// Forma correta sem o uso de lista
/* foreach ($contasCorrentes as $cpf => $conta) {
    exibeMensagem(
        "$cpf {$conta['titular']} {$conta['saldo']}"
    );
} */

// Uma das formas corretas sem o uso de lista
/* foreach ($contasCorrentes as $cpf => $conta) {
    exibeMensagem(
        "$cpf $conta[titular] $conta[saldo]"
    );
} */

// Maneira antiga e trabalhosa
/* foreach ($contasCorrentes as $cpf => $conta) {
    exibeMensagem($cpf . " " . $conta['titular'] . ' ' . $conta['saldo']);
} */