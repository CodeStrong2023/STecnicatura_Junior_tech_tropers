let nombre = "Joaquín";
//Tipo string
console.log(typeof nombre);
num = 7;
console.log(typeof num);
//Tipo numerico
let numero = 3000;
console.log(typeof numero);

//Tipo objeto
let objeto = {
    nombre:"Joaquín",
    apellido:"Viñolo",
    edad: 24
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

//Clase 5 JavaScript: Tipos de datos especiales
//Tipo de dato undefined
let x;
console.log(typeof x);

x= undefined;
console.log(x);

//null: significa ausencia de valor 
let y = null; //null no es un tipo de dato, pero su origen es object
console.log(typeof y); 

//Tipo de dato array y Empity String
let autos = ['BMW','Audi','Volvo','Renault'];
console.log(autos);
console.log(typeof autos); //Preguntamos qué tipo de datos es autos

let z = '';
console.log(z); //Esto es una cadena vacía
console.log(typeof z); //Preguntamos qué tipo de datos es z