// Ejercicio para encontrar números pares
let numero = 10;
if (numero % 2 == 0) {
  console.log("El número es par:" + numero);
} else {
  console.log("El número es impar:" + numero);
}

// Ejercicio: es mayor de edad
let mayorMenor = 18;
if (mayorMenor >= 18) {
  console.log(
    "La persona es mayor de edad porque tiene " + mayorMenor + " años"
  );
} else {
  console.log(
    "La persona es menor de edad porque tiene " + mayorMenor + " años"
  );
}

// Ejercicio: Dentro de un rango
let dentroRango = 11;
let valMin = 0,
  valMax = 10;
if (dentroRango >= valMin && dentroRango <= valMax) {
  console.log("Esta dentro del rango establecido");
} else {
  console.log("Esta fuera del rango establecido");
}

// Ampliamos el uso de var let y const
/*
Con var puedes reasignar en cualquier momento
este forma parte del ambito global
Un error es que se sobreescriba
 */

var nombre = "Nelson";
nombre = "Ezequiel";
console.log(nombre);

function saludar() {
  var nombre3 = "Lassa";
  console.log(nombre3);
}
//console.log(nombre3); // Aqui no lee el dato en la funcion

if (true) {
  var edad = 34;
  console.log(edad);
}
console.log(edad); // En la funcion funciono correctamente la estructura if fallo

/*
let :  esta puede ser reasifnada en cualquier momento
la diferencia es que su ambito es del bloque,
solo disponible dentro de un bloque de llaves
o dentro de una función
 */

function saludar() {
  let nombre2 = "Nelson";
  console.log(nombre2);
}
console.log(nombre);
if (true) {
  let edad2 = 33;
  console.log(edad2);
}
//console.log(edad2);
/* 
const se utiliza para valores constantes que no pueden ser reasignados
 */

const fechaNacimiento = 2006;
console.log(fechaNacimiento);
//fechaNacimiento = 2003;
console.log(fechaNacimiento);

// Ejercicio: Si el padre puede asistir al juego de su hijo
let vacaciones = true,
  diaDescanso = true;
if (vacaciones || diaDescanso) {
  console.log("El padre puede asistir al juego de su hijo");
} else {
  console.log("El padre no puede asistir al juego de su hijo");
}

// Operador ternario
let resultado2 = 1 > 2 ? "Verdadero" : "Falso";
console.log(resultado2);
let numero1 = 9;
resultado2 = numero1 % 2 == 0 ? "Es un numero PAR" : "Es un numero IMPAR";
console.log(resultado2);

// Convertir String a Numero
let miNumero = "18";
console.log(typeof miNumero);
let edad3 = Number(miNumero); // ESto es una funcion
console.log(typeof edad3);

// Funcion isNan
if (isNaN(edad3)) {
  // No es un número = is not a Number(devuelve un resultado boleano)
  console.log("Esta Variable no contiene solo numeros");
} else {
  if (edad3 >= 18) {
    console.log("Pede votar");
  } else {
    console.log("Muy joven para votar");
  }
}

let resultado3 = edad3 >= 18 ? "Pede votar" : "Muy joven para votar";
console.log(resultado3);
