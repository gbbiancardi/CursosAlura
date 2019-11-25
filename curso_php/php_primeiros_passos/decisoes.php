<?php

$idade = 17;
$acompanhante = false;
$mensagemInicial = 'Você só pode entrar se tiver mais do que 18 anos ou à partir de 16 anos com acompanhante.' . PHP_EOL;
$mensagemSucesso = "Você tem $idade anos. Pode entrar!";
$mensagemSucessoAcompanhante = "Você tem $idade anos e está acompanhado. Você pode entrar!";
$mensagemErroMenorSemAcompanhante = "Você tem $idade anos, porém, não está com acompanhante. Você não pode entrar!";
$mensagemErroMenorComAcompanhante = "Você está acompanhado, porém, tem apenas $idade. Você não pode entrar!";
$mensagemErro = "Você tem $idade anos e não está com acompanhante. Você não pode entrar!";

echo $mensagemInicial;

if ($idade >= 18 ) {
    echo $mensagemSucesso;
} elseif ($idade >= 16 && $acompanhante==true) {
    echo $mensagemSucessoAcompanhante;
} elseif ($idade >= 16 && $acompanhante==false) {
    echo $mensagemErroMenorSemAcompanhante;
} elseif ($idade < 16 && $acompanhante==true) {
    echo $mensagemErroMenorComAcompanhante;
} else {
    echo $mensagemErro;
}

echo PHP_EOL;
echo 'Adeus!';