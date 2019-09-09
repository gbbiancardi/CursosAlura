var pacientes = document.querySelectorAll(".paciente");

var tabela = document.querySelector("table");

tabela.addEventListener("dblclick", function(event){
    //Adicionar efeito fadeOut
    event.target.parentNode.classList.add("fadeOut");

    //Faz com que haja um delay nessa ação, delimitado por 500 milisegundos, ou seja, 5 segundos
    setTimeout(function(){
        var alvoEvento = event.target;
        var paiDoAlvo = alvoEvento.parentNode; // TR = paciente = remover
        paiDoAlvo.remove();
    }, 500);
    
});

// pacientes.forEach(function(paciente){
//     paciente.addEventListener("dblclick", function(){
//         console.log("Fui clicado com duplo click");
//         this.remove();
//     })
// });