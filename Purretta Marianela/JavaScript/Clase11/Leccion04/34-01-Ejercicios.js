//Ejercicio1: calcular estación del año:

let mes = 8;
let estacion;
if(mes == 1 || mes ==2 || mes==12){
    estacion = "Verano";
}
else if(mes == 3 || mes == 4 || mes ==5){
    estacion = "Otoño";
}
else if(mes == 6 || mes == 7 || mes ==8){
    estacion = "Invierno";
}
else if(mes == 9 || mes == 10 || mes== 11){
    estacion = "Primavera";
}
else{
    estacion = "Valor incorrecto";
}

console.log("El valor ingresado corresponde a la estación: "+estacion)

//Ejercicio2: hora del día

let horaDelDia = 22;
let mensaje;
if(horaDelDia >= 6 && horaDelDia <= 11){
    mensaje = "Buenos días!";
}
else if(horaDelDia >= 12 && horaDelDia <= 16){
    mensaje = "Buenas tardes!";
}
else if(horaDelDia >= 17 && horaDelDia < 19){
    mensaje = "Buenas noches!";
}
else if(horaDelDia >= 20 && horaDelDia <= 23){
    mensaje = "Hora de dormir!";
}
else{
    mensaje = "Horario incorrecto";
}
console.log(mensaje);

//ESTRUCTURA switch (Sintáxis = Java)
switch(mes){
    case 1: case 2: case 12:
        estacion = "Verano";
        break;
    case 3: case 4: case 5:
        estacion = "Otoño";
        break;
    case 6: case 7: case 8:
        estacion = "Invierno";
        break;
    case 9: case 10: case 11:
        estacion = "Primavera";
        break;
    default:
        estacion = "Valor incorrecto";
}
console.log("Usted está en: "+estacion)

/*
cost se utiliza para valores constantes que no pueden ser reasignados
*/

const fechaNacimirnto = 2006;
console.log(fechaNacimiento);

//fechaNacimiento = 2022;
//console.log(fechaNacimiento); //solo se ejecuta el console anterior

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