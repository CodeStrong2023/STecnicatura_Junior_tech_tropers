//Dry don´t repeat your self
let days = ["Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"];
let day = "Lunes";
switch (day) {
    case "Lunes":
        console.log("Hoy es " + day);
        break;
    case "Martes":  
        console.log("Hoy es " + day);
        break;
    case "Miercoles":
        console.log("Hoy es " + day);
        break;
    case "Jueves":
        console.log("Hoy es " + day);
        break;
    case "Viernes":
        console.log("Hoy es " + day);
        break;
    case "Sabado":
        console.log("Hoy es " + day);
        break;
    case "Domingo":
        console.log("Hoy es " + day);
        break;
    default:
        console.log("No es un dia valido");
}


function getDay(n){
    if(n <1 || n > 7){
        throw new Error("El numero de dia no es valido");
    }
    return days[n-1];
}
console.log(getDay(6));

//Hacer un ejercicios similar al hecho, pero ahora con
//los meses del año, debes hacerlo con la estructura switch y luego
//con la función en la opción mejorada

let months = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"];
let month = "Julio";

function printMonth(month) {
    console.log("Este mes es " + month);
}

switch (month) {
    case "Enero":
    case "Febrero":
    case "Marzo":
    case "Abril":
    case "Mayo":
    case "Junio":
    case "Julio":
    case "Agosto":
    case "Septiembre":
    case "Octubre":
    case "Noviembre":
    case "Diciembre":
        printMonth(month);
        break;
    default:
        console.log("No es un mes válido");
}

function getMonth(n) {
    if (n < 1 || n > 12) {
        throw new Error("El número de mes no es válido");
    }
    return months[n - 1];
}

console.log(getMonth(9));
