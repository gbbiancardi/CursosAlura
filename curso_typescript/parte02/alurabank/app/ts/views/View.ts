export abstract class View<T> { // Classe não pode ser instanciada

    private _elemento: JQuery;

    constructor(seletor: string) {
        this._elemento = $(seletor); // Utilizando sintaxe do jQuery
    }

    update(model: T): void {

        this._elemento.html(this.template(model)); // jQuery
    }

    abstract template(model: T): string; // Método obrigatório de ser implementado pelos filhos
}
