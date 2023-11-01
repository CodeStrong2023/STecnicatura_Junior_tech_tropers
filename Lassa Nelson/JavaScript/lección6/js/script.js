/* Concatenación de Cadena */
var nombre = "Pedro ";
var apellido = "Michelli";
var nombreCompleto = nombre + " " + apellido;
console.log(nombreCompleto);
var nombreCompleto2 = "Nelson" + " " + "Lassa";
console.log(nombreCompleto2);
var juntos = nombre + 219; // Lee de izq a der siguiendo la cadena lee el numero como str
console.log(juntos);
juntos = nombre + 78 + 17; // Aqui se puede diferenciar a traves de los parensis
console.log(juntos);
juntos = 78 + 17 + nombre;
console.log(juntos); // Contexto str o contexto cadena

nombre += apellido; // Tercera Concatenación usando el operador simplificado
console.log(nombre);

/* Continuamos con similitudes entre Java y JavaScript*/

let x, y; // Se pueden crear varias variables dentro de una misma línea
(x = 17), (y = 21); // Se puede hacer asignación de varias variables dentro de la misma línea
let z = x + y; // Se asigna el valor de la operación
console.log(z);

let $1num = 31; // No utilizar números para iniciar el nombre de una variable
let rompiendo = "rompe"; // No utilizar palabras reservadas para variables(BREAK)

console.log($1num);
console.log(rompiendo);
