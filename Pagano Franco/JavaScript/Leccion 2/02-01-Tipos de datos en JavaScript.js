// Tipos de datos en JavaScript    
/*
La sintaxis en lo que es comentarios es muy
similar a la de Java realmente diria que es
identica
*/
var nombre = "Franco"; //Tipo Str
console.log(typeof nombre);
nombre = 7;
console.log(typeof nombre);
nombre = 12.3;
console.log(typeof nombre)

var numero = 3000; //Tipo numerico
console.log(numero);

var objeto = {
    nombre : "Franco",
    apellido : "Pagano",
    telefono: "2604694746"
}
console.log(typeof objeto);

//Tipo boolean
var bandera = true;
console.log(bandera);
console.log(typeof bandera);

//tipo de dato funcion (permite reutilizar lineas de codigo)
function miFuncion(){}
console.log(typeof miFuncion);

//Tipo de datos symbol
var simbolo = Symbol("Mi simbolo");
console.log(simbolo);

//Tipo de dato clase
class Persona{
    constructor(nombre,apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
console.log(typeof Persona);

//Tipo de dato undefined
var x;
console.log(typeof x);

x = undefined;
console.log(x);

// null: significa ausencia de valor
var y = null; //No es un tipo de dato, pero su origen es object
console.log(typeof y);

//Tipo de dato array y Empty String
var autos = ["Fiat","Ford","Peugeot","BMW"];
console.log(autos);
console.log(typeof autos);

var z = "";
console.log(z); //Cadena vacia
console.log(typeof z);