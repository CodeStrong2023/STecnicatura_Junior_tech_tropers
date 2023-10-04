var nombre = 'José';
var apellido = ' Montes'
var nombreCompleto = nombre+' '+apellido; //primera concatenación
console.log(nombreCompleto);
var nombreCompleto2 = 'Marianela' + ' ' + 'Purretta';//segunda concatenación
console.log(nombreCompleto2);
var juntos = nombre + 219; //lee de izq a der y lee el num como str
console.log(juntos);
juntos = nombre + 78 + 17; //Se puede diferenciar a través de los paréntesis
console.log(juntos); //sigue concatenado dentro de la misma variable
juntos = 78 + 17 + nombre;
console.log(juntos); // sumó y luego concatenó de Tipo str. "CONTEXTO STR O CADENA"

nombre += apellido; //tercera forma de concatenar
console.log(nombre);

//Hoy ya no se usa var, usamos let y const
let nombre2 = "Mari";
console.log(nombre2);


const apellido2 = "Siri";
//apellido2 = "Siri"; una constante no puede ser modificada
console.log(apellido2);


let x, y; //similitud con java: declaramos varias variables en una misma línea
x = 17, y = 21; //asignación de varias variables en la misma línea
let z = x + y; // Se le asigna a la variable el valor de la asignación
console.log(z)

let _1num = 31;// no usar números para inicializar una variable key: "value", 
let rompiendo = "rompe"; //no usar palabras reservadas para variables

console.log(_1num)
console.log(rompiendo)