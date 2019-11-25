<?php

$contasCorrentes = [
    12345678910 => [
        'titular' => 'Vinicius',
        'saldo' => 1000
    ],
    12345678911 => [
        'titular' => 'Maria',
        'saldo' => 10000
    ],
    12325678912 => [
    'titular' => 'Alberto',
    'saldo' => 300
    ]
];

$contasCorrentes[12345637811] = [
    'titular' => 'Claudia',
    'saldo' => 2000
];

foreach ($contasCorrentes as $cpf => $conta) {
    echo $cpf . PHP_EOL;
    echo $conta['titular'] . PHP_EOL;
}

/* foreach ($contasCorrentes as $conta) {
    echo $conta['titular'] . PHP_EOL;
} assim seria se não declarasse o índice*/