function desenharGraficos() {
    //Gráfico de Pizza
    var tabela = new google.visualization.DataTable(); // inserir dados e colunas
    //Colunas
    tabela.addColumn('string', 'categorias');
    tabela.addColumn('number', 'valores');
    //Linhas
    tabela.addRows([
        ['Educação', 2000],
        ['Transporte', 500],
        ['Lazer', 230],
        ['Saúde', 50],
        ['Cartão de crédito', 900],
        ['Alimentação', 260]
    ]);

    var opcoes = { // customizar aparencia
        title: 'Tipos de Gastos',
        height: 500,
        width: 900,
        //'pieHole': 0.4
        is3D: true,
        legend: 'labeled',
        pieSliceText: 'value',
        //colors: ['grey']
        slices: {
            0: {},
            1: { color: 'grey' },
            2: { color: '#A6A6A6' },
            3: { color: 'grey' },
            4: { offset: 0.4 },
            5: { color: 'grey' }
        }
    };
    //Desenhando gráfico
    var grafico = new google.visualization.PieChart(document.getElementById('graficoPizza'));
    grafico.draw(tabela, opcoes);

    // Gráfico de Linha
    tabela = new google.visualization.DataTable();

    tabela.addColumn('string', 'mês');
    tabela.addColumn('number', 'gastos');

    tabela.addRows([
        ['jan', 800],
        ['fev', 400],
        ['mar', 1100],
        ['abr', 400],
        ['mai', 500],
        ['jun', 750],
        ['jul', 1500],
        ['ago', 650],
        ['set', 850],
        ['out', 400],
        ['nov', 1000],
        ['dez', 720]
    ]);

    var opcoes = {
        title: 'Gastos por mês',
        width: 650,
        height: 300,
        vAxis: {
            format: 'currency',
            gridlines: {
                count: 5,
                color: 'transparent'
            }
        },
        curveType: 'function',
        legend: 'none'
    }

    var grafico = new google.visualization.LineChart(document.getElementById('graficoLinha'));
    grafico.draw(tabela, opcoes);

    // Gráfico de Colunas
    var tabela = google.visualization.arrayToDataTable(
        [
            ['Mês', 'Entrada', 'Saída'],
            ['jan', 2500, 1000],
            ['fev', 1000, 500],
            ['mar', 3000, 1300],
            ['abr', 1500, 1700],
            ['mai', 5000, 2250],
            ['jun', 3567, 3000],
            ['jul', 3452, 1468],
            ['ago', 1833, 5250],
            ['set', 1800, 1000],
            ['out', 1800, 1000],
            ['nov', 3569, 1500],
            ['dez', 3000, 1740]
        ]);

    var opcoes = {

        title: 'Entradas e saídas da conta',
        width: 800,
        height: 400,
        vAxis: {
            gridlines: { color: 'transparent' },
            format: 'currency',
            title: 'Valores'
        },
        hAxis: {
            title: 'Mês'
        }

    }

    var grafico = new google.visualization.ColumnChart(document.getElementById('graficoColuna'));
    grafico.draw(tabela, opcoes);

    // Gráfico Barras
    var tabela = new google.visualization.DataTable(); // inserir dados e colunas

    tabela.addColumn('string', 'categorias');
    tabela.addColumn('number', 'valores');
    tabela.addColumn({ type: 'string', role: 'annotation' });
    tabela.addColumn({ type: 'string', role: 'style' });

    tabela.addRows([
        ['Educação', 2000, 'R$2000,00', 'blue'],
        ['Transporte', 500, 'R$500,00', 'gray'],
        ['Lazer', 230, 'R$230,00', 'gray'],
        ['Saúde', 50, 'R$50,00', 'gray'],
        ['Cartão de crédito', 900, 'R$900,00', '#8904B1'],
        ['Alimentação', 260, 'R$260,00', 'gray']
    ]);

    // Ordena a tabela pelo índice especificado da coluna.
    tabela.sort([{ column: 1, desc: true }]);

    var opcoes = {
        title: 'Tipos de Gastos',
        height: 400,
        width: 800,
        vAxis: {
            gridlines:
            {
                color: 'transparent'
            },
            textPosition: 'none'
        },
        hAxis: {
            gridlines:
            {
                color: 'transparent'
            },
            format: 'currency',
            textPosition: 'none'
        },
        legend: 'none',
        annotations:
        {
            alwaysOutside: true
        }
    }

    var grafico = new google.visualization.BarChart(document.getElementById('graficoBarras'));
    grafico.draw(tabela, opcoes);

    //Gráfico de Barras com arquivo JSON
    var dadosJson = $.ajax({
        url: 'dados.json',
        dataType: 'json',
        async: false
    }).responseText;

    var tabela = new google.visualization.DataTable(dadosJson);

    var grafico = new google.visualization.BarChart(document.getElementById('graficoBarrasJson'));
    grafico.draw(tabela, opcoes);
}