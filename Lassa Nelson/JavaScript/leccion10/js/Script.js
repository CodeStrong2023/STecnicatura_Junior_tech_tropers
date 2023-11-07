// Evitar repetir tu codigo
// Dry don´t repeat yourself

let days = 1;
switch (days) {
  case 1:
    console.log("El dia de hoy es Lunes");
    break;
  case 2:
    console.log("El dia de hoy es Martes");
    break;
  case 3:
    console.log("El dia de hoy es Miercoles");
    break;
  case 4:
    console.log("El dia de hoy es Jueves");
    break;
  case 5:
    console.log("El dia de hoy es Viernes");
    break;
  case 6:
    console.log("El dia de hoy es Sabado");
    break;
  case 7:
    console.log("El dia de hoy es Domingo");
    break;
  default:
    console.log("No representa un dia de la semana");
    break;
}

// Version mejorada

let days2 = [
  "Lunes",
  "Martes",
  "Miercoles",
  "Jueves",
  "Viernes",
  "Sabado",
  "Domingo",
];

function getDays2(i) {
  if (i < 1 || i > 7) {
    throw new Error("Fuera de rango");
  }
  return days2[i - 1];
}
console.log(getDays2(2));

/* Hacer un ejercicio similar al que esta hecho, pero ahora con los 
   meses del año, debemos hacerlo con la estructura switch y luego con
   la funcion en la opción mejorada
*/

let meses = 7;
switch (meses) {
  case 1:
    console.log("Este mes es Enero");
    break;
  case 2:
    console.log("Este mes es Febrero");
    break;
  case 3:
    console.log("Este mes es Marzo");
    break;
  case 4:
    console.log("Este mes es Abril");
    break;
  case 5:
    console.log("Este mes es Mayo");
    break;
  case 6:
    console.log("Este mes es Junio");
    break;
  case 7:
    console.log("Este mes es Julio");
    break;
  case 8:
    console.log("Este mes es Agosto");
    break;
  case 9:
    console.log("Este mes es Septiembre");
    break;
  case 10:
    console.log("Este mes es Octubre");
    break;
  case 11:
    console.log("Este mes es Noviembre");
    break;
  case 12:
    console.log("Este mes es Diciembre");
    break;
  default:
    console.log("No representa un mes del año");
    break;
}

let meses2 = [
  "Enero",
  "Febrero",
  "Marzo",
  "Abril",
  "Mayo",
  "Junio",
  "Julio",
  "Septiembre",
  "Octubre",
  "Noviembre",
  "Diciembre",
];

function getMeses2(i) {
  if (i < 1 || i > 12) {
    throw new Error("Fuera de rango");
  }
  return meses2[i - 1];
}
console.log(getMeses2(0));