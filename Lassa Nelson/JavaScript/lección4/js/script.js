// Tipos de Datos en JavaScript
/*
La sintaxis en lo que es comenterios
es muy similar a la de Java 
realmente diriamos es es identica
*/
var nombre = "Nelson"; // Tipo Str
console.log(typeof nombre);
nombre = 7;
console.log(typeof nombre);
nombre = 12.3;
console.log(typeof nombre);
var numero = 3000; //Tipo Númerico
console.log(numero);

var objeto = {
  nombre: "Nelson",
  apellido: "Lassa",
  telefono: "26404621012",
};
console.log(objeto);

// Tipo de dato boolean
var bandera = true;
console.log(typeof bandera);
console.log(bandera);

// Tipo de dato función
function miFuncion() {}
console.log(typeof miFuncion);
console.log(miFuncion);

// Tipo de dato symbol
var simbolo = Symbol("Mi simbolo");
console.log(typeof simbolo);
console.log(simbolo);

//Tipo de dato de clase
class Persona {
  constructor(nombre, apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
  }
}

console.log(typeof Persona);
console.log(Persona);

//Tipo de dato undefine
var x;
console.log(x);
console.log(typeof x);

x = undefined;
console.log(x);

// null: significa ausencia de valor
var y = null; // null no es un tipo de dato, pero su origen es de tipo object
console.log(y);
console.log(typeof y); // devuelve es un tipo Object

/**Tipoi de dato array y Emoty String * */
var autos = [" Citroen ", " Audi ", " BMW ", " Ford "];
console.log(autos);
console.log(typeof autos); // Preguntamos que tipo de dato es:
//alert("Los autos son: " + autos);

var z = "";
console.log(z); // Este hace referencia a que es una cadena vacia:
console.log(typeof z);
