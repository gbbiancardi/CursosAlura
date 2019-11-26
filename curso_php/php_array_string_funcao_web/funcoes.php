<?php

function sacar (array $conta, float $valorASacar): array 
{
    if ($valorASacar > $conta['saldo']) {
        exibeMensagem("Você não pode sacar este valor");
    } else {
        $conta['saldo'] -= $valorASacar;
    }

    return $conta;
}

function depositar (array $conta, float $valorADepositar): array 
{
    if ($valorADepositar < 0) {
        exibeMensagem("Você não pode depositar este valor");
    } else {
    }
    $conta['saldo'] += $valorADepositar;

    return $conta;
}

function exibeMensagem(string $mensagem)
{
    echo $mensagem . '<br>';
}

function titularComLetrasMaiuscular(array &$conta) // O & significa que você está pegando o objeto em si e não uma referência dele.
{
    $conta['titular'] = mb_strtoupper($conta['titular']);
}

function exibeConta(array $conta)
{
    ['titular' => $titular, 'saldo' => $saldo] = $conta;
    echo "<li>Titular: $titular. Saldo: $saldo.</li>";
}