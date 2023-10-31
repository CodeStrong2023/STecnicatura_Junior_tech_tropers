let nombre = "Valentino";
//Tipo string
console.log(typeof nombre);
num = 7;
console.log(typeof num);
//Tipo numerico
let numero = 3000;
console.log(typeof numero);

//Tipo objeto
let objeto = {
    nombre:"Valentino",
    apellido:"Giachero",
    edad: 21
}

console.log(typeof objeto);

//Tipos de datos booleanos
let bandera = true;
console.log(bandera);
console.log(typeof bandera);

//Tipos de datos function
function miFuncion(){}
console.log(typeof miFuncion)

//Tipo de dato Symbol
let simbolo  = Symbol("Mi simbolo");
console.log(simbolo);

//Tipo de dato clase 
class Persona{
    constructor(nombre, apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}

console.log(typeof Persona);