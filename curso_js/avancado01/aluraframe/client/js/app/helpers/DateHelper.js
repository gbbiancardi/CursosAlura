class DateHelper { // Classe para auxiliar na manipulação do objeto Date
    
    constructor() { // Evita que a classe seja instanciada
        throw new Error('Esta classe não pode ser instanciada!');
    }

    static dataParaTexto(data) { // Transforma a data para String, para que seja possível formatá-la da forma correta de apresentação
        return `${data.getDate()}/${data.getMonth() + 1}/${data.getFullYear()}`;
    }
    
    static textoParaData(texto) { // Pega a String e transforma novamente para Date
        if(!/\d{4}-\d{2}-\d{2}/.test(texto)) { // Evita com que o usuário insira uma forma errada da data
            throw new Error('Deve estar no formato aaaa-mm-dd');
        }

        return new Date(...texto.split('-').map((item, indice) => item - indice % 2)); // função para alterar o mês e deixá-lo correto, subtraindo 1 do valor inserido
    }

}