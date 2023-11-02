/*
Con var puedes reasignar en cualquier momento
este forma parte del ambito global
Un error es que se sobreescriba
*/

var nombre = "Yamil Jesus";
nombre = "Osvaldo";
console.log(nombre);

function saludar(){
    var nombre = "Yunes";
    console.log(nombre);
}

console.log(nombre); //El problema es que aquí no lee el dato de la función
if(true){
    var edad = 34;
    console.log(edad);
}
console.log(edad); //En la función funciona correctamente, en la estructura if falla

/*
let: esta puede ser reasignada en cualquier momento
la diferencia es que su ambito es local o de bloque
solo disponible dentro de un bloque de llaves
o dentro de una función
*/
function saludar2(){
    let nombre = "Yunes";
    console.log(nombre);
}
//console.log(nombre2); //Aquí no lee el dato de la función

if(true){
    let edad2 = 33;
    console.log(edad);
}
//console.log(edad2);
/*
const se utiliza para valores constantes que no pueden ser reasignadas
*/

const fechaNacimiento = 1994;
console.log(fechaNacimiento);
//fechaNacimiento = 1999; //No se puede reasignar