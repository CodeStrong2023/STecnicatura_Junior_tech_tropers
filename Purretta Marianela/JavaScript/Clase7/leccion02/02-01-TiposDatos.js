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

//TIPO DE DATO UNDEFINED (cualquier variable no inicializada recibe este tipo de dato)
var x;
console.log(typeof x);
x = undefined;//agregamos un tipo
console.log(x);

// null: es ausencia de valor, variable, vacía
var y = null; //null no es un tipo de dato pero su origen es de tipo object
console.log(typeof y)

//TIPO DE DATO ARRAY Y EMPTY STRING: en JS los arreglos son de tipo object
var autos = ['Citroen', 'Audi', 'BMW', 'Ford'] //arrays entre corchetes
console.log(autos);
console.log(typeof autos); //tipo de dato:

var z = '';
console.log(z) //tipo de dato cadena pero vacía ->
console.log(typeof z);
