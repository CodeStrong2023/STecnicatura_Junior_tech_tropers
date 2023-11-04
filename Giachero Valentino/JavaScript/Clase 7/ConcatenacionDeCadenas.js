let nombre = "Valentino";
let apellido = "Giachero";
let nombreCompleto = nombre + " " + apellido;
console.log(nombreCompleto);
let nombreCompleto2 = "Valentino" + " " + "Giachero";
console.log(nombreCompleto2);
let juntos = nombre + 219; //Lee de izquierda a derecha siguienda la cadena, lee el numero como string
console.log(juntos);
juntos = nombre + 78 + 17;
console.log(juntos);
juntos = nombre + (78 + 17);
console.log(juntos);

nombre += " " + apellido;
console.log(nombre);

//Hoy ya no se usa var, usamos let y const
let nombre2 = "Valentino";
console.log(nombre2);


const apellido2 = "Giachero";
console.log(apellido2);

let x, y; //Se pueden crear varias vaiables en una misma línea
x = 17, y = 21; //Asignación de varias variables en la misma línea
let z = x + y; //Se le asigna a la variable el valor de la asignación
console.log(z);

let _1num = 31; //No se puede usar un número al principio del nombre de una variable
//let break = "romer"; //No se puede usar break como nombre de variable

console.log(_1num);