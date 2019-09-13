class ListaNegociacoes {

    constructor() {

        this._negociacoes = []; // Cria o array das negociações
    }

    adiciona(negociacao) {

        this._negociacoes.push(negociacao); // Adiciona elemento no array de negociações
    }

    get negociacoes() {

        return [].concat(this._negociacoes); // Programação defensiva para evitar que a lista seja alterada
    }
}