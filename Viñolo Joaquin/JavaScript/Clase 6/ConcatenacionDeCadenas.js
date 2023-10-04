let nombre = "Joaquín";
let apellido = "Viñolo";
let nombreCompleto = nombre + " " + apellido;
console.log(nombreCompleto);
let nombreCompleto2 = "Joaquín" + " " + "Viñolo";
console.log(nombreCompleto2);
let juntos = nombre + 219; //Lee de izquierda a derecha siguienda la cadena, lee el numero como string
console.log(juntos);
juntos = nombre + 78 + 17;
console.log(juntos);
juntos = nombre + (78 + 17);
console.log(juntos);

nombre += " " + apellido;
console.log(nombre);