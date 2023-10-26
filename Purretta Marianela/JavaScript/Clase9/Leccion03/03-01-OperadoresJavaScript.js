/*Ejercicio para encontrar números pares e impares: */
let parImpar = 19;
if (parImpar % 2 == 0) {
  console.log("Es un número par");
} else {
  console.log("Es un número impar");
}

/*Ejercicio: es mayor de edad:*/

let edad = 25,
  mayor = 18;
if (edad >= mayor) {
  console.log("Es mayor de edad!");
} else {
  console.log("Es menor de edad");
}
//Ejercicio: Dentro de un rango
let dentroRango = 5; //Aquí vamos a ir cambiando el valor
let valMin = 0,
  valMax = 10;
if (dentroRango >= valMin && dentroRango <= valMax) {
  console.log("Esta fuera de rango establecido");
} else {
  console.log("Esta fuera del rango establecido");
}
//OPERADOR or
//Ejercicio: Si puede asistir o no
let vacaciones = false,
  diaFeriado = true;
if (vacaciones || diaFeriado) {
  console.log("Puede asistir");
} else {
  console.log("No puede asistir");
}
//OPERADOR ternario: se usa para extenciones de código corto y es muy similar a java
let resultado2 = 3 > 2 ? "Verdadero" : "Falso";
console.log(resultado2);
//Ejercicio par o impar con op ternario:
let numero = 15;
resultado2 = numero % 2 == 0 ? "Es un número Par" : "Es un número Impar";
console.log(resultado2);

//Convertir str a Number
let miNumero = "25"; //cadena
console.log(typeof miNumero);
//Si la cadena tiene alguna letra afecta a la coversión
let edad2 = Number(miNumero); //Función para convertir a Number
console.log(typeof edad2);

//FUNCIÓN isNaN:(is Not A Number) Para verificar que el valor de una variable sea de tipo numérica

if (isNaN(edad2)) {
    console.log("Esta variable no contiene sólo números");
}
else{
    if (edad2 >= 18) {
        console.log("Puede votar");
} 
    else{
        console.log("No puede votar");
    }
}
//con op ternario
let resultado3 = edad2 >= 18 ? "Vota" : "No vota";
console.log(resultado3);

