//Tipos de datos en JS
//sintáxis para comentarios = Java: //, /*...*/
var nombre = 'Marianela'; //tipo str
console.log(typeof nombre);
nombre = 7;
console.log(typeof nombre)
//usamos typeof para ver que tipo de dato hay en la variable
nombre = 12.3;
console.log(typeof nombre);


var numero = 3000; //tipo int
console.log(numero);

var objeto = {
    nombre : 'Marianela',
    apellido : 'Purretta',
    telefono : '2604641466'
}
console.log (objeto);

//Datos tipos boolean
var bandera = true;
console.log(bandera);
//funcion es un tipo de dato, se pueden reutilizar las veces necesarias
//TIPO DE DATO FUNCION
function miFuncion(){}
console.log(miFuncion);
//TIPO DE DATO SYMBOL
var simbolo = Symbol("Mi simbolo");
console.log(simbolo);
//TIPO DE DATO CLASES * es tambien una funcion
class Persona{
    constructor(nombre,apellido){
        this.nombre = nombre; //this. es para hacer referencia alos atributos de la clase
        this.apellido = apellido;
    }
}
console.log(Persona);