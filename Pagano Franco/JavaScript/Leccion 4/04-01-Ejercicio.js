/*
con var puedes reasignar en cualquier momento
esta forma parte del ambito global
Un error es que se sobrescriba
*/

var nombre = "Franco ";
nombre = "Oscar"; 
console.log(nombre);

function saludar(){
    var nombre = "Julieta";
    console.log(nombre)
}

console.log(nombre); //Aqui no lee el dato en la funcion


if (true){
    var edad = 27;
    console.log(edad);
}
console.log(edad) //En la funcion funciono correctamente, en la estructura if fallo

/*
let = esta puede ser reasignada en cualquier momento
la diferencia es que su ambito es de bloqueo, 
solo disponible dentro de un bloque de llaves
o dentro de una funcion
*/

function saludar2(){
    let nombre2 = "Franco";
    console.log(nombre2);
}
//console.log(nombre2);

if(true){
    let edad2 = 26;
    console.log(edad2);
}
//console.log(edad2);

/*
const se utiliza para valore que no pueden ser reasignadas 
*/

const fechaNacimiento = 1997;
console.log(fechaNacimiento);
fechaNacimiento = 1996;
console.log(fechaNacimiento); //Solo se ejecuta la consola anterior

