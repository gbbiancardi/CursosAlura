import { logarTempoDeExecucao } from '../helpers/decorators/index';

export abstract class View<T> { // Classe não pode ser instanciada

    private _elemento: JQuery;
    private _escapar: boolean;

    constructor(seletor: string, escapar: boolean = false) {

        this._elemento = $(seletor); // Utilizando sintaxe do jQuery
        this._escapar = escapar;
    }

    @logarTempoDeExecucao(true)
    update(model: T): void {

        let template = this.template(model);
        if(this._escapar)
            template = template.replace(/<script>[\s\S]*?<\/script>/, '');

        this._elemento.html(this.template(model)); // jQuery
    }

    abstract template(model: T): string; // Método obrigatório de ser implementado pelos filhos
}
