var nombre = "Franco";
var apellido = "Pagano";
var nombreCompleto = nombre +" "+ apellido; //Primera concatenacion
console.log(nombreCompleto);
var nombreCompleto2 = "Franco"+" "+"Pagano"; //Segunda concatenacion
console.log(nombreCompleto2);
var juntos = nombre + 2018; //Lee de izq. a der. seguiendo la cadena lee el numero como str
console.log(juntos);
juntos = nombre + 78 + 17;
console.log(juntos);
juntos = nombre + (78 + 17); //Los parentesis presentan prioridad por lo que resuelve la suma y concatena
console.log(juntos);
 juntos = 78 + 17 + nombre; // Primero realiza la suma y despues concatena como str. 
console.log(juntos);

nombre += apellido; //Tercer concatenacion usando el operador simplificado
console.log(nombre); 
nombre = "Franco " //Podemos agregar un espacio en el nonbre a la hora de concatenar
nombre += apellido; 
console.log(nombre);

let x, y; //Se pueden crear varios variables dentro de una misma lista
x = 17, y = 21; //Se puede hacer varias asignaciones de varias variables dentor de la misma linea
let z = x + y;
console.log(z);

let $1num = 31; //El signo $  habilita colocar numeros, pero no es recomendable
let _1num = 31;
console.log(_1num)

// let break = "rompe"; No usar palabras reservadas en variables
let _break = "rompe";
console.log(_break)

//Hoy ya no se usa var, se utiliza let y const
let nombre2 = "Franco";
console.log(nombre2);

const apellido2 = "Pagano";
//apellido2 = "Pantaley"; //una constante no puede ser modificada
console.log(apellido2);
