class NegociacaoController {

    private _inputData: JQuery;
    private _inputQuantidade: JQuery;
    private _inputValor: JQuery;
    private _negociacoes = new Negociacoes();
    private _negociacoesView = new NegociacoesView('#negociacoesView');
    private _mensagemView = new MensagemView('#mensagemView');

    constructor() {

        this._inputData = $('#data'); // Fazendo casting < >
        this._inputQuantidade = $('#quantidade');
        this._inputValor = $('#valor');
        this._negociacoesView.update(this._negociacoes);
    }
    
    adiciona(event: Event) {
        
        event.preventDefault();
        
        const negociacao = new Negociacao(
            new Date(this._inputData.val().replace(/-/g, ',')),
            parseInt(this._inputQuantidade.val()),
            parseInt(this._inputValor.val())
            );
            
            this._negociacoes.paraArray().forEach(negociacao => {
                console.log(negociacao.data);
                console.log(negociacao.quantidade);
                console.log(negociacao.valor);
            });

            this._negociacoes.adiciona(negociacao);

            this._negociacoesView.update(this._negociacoes);
            this._mensagemView.update('Negociação adicionada com sucesso!');
        }
    }