/*
con var puedes reasignar en cualquier momento
esta forma parte del ambito global
Un error es que se sobrescriba
*/

var nombre = "Franco ";
nombre = "Oscar"; 
console.log(nombre);

function saludar(){
    var nombre = "Julieta";
    console.log(nombre)
}

console.log(nombre); //Aqui no lee el dato en la funcion


if (true){
    var edad = 27;
    console.log(edad);
}
console.log(edad) //En la funcion funciono correctamente, en la estructura if fallo

/*
let = esta puede ser reasignada en cualquier momento
la diferencia es que su ambito es de bloqueo, 
solo disponible dentro de un bloque de llaves
o dentro de una funcion
*/

function saludar2(){
    let nombre2 = "Franco";
    console.log(nombre2);
}
//console.log(nombre2);

if(true){
    let edad2 = 26;
    console.log(edad2);
}
//console.log(edad2);

/*
const se utiliza para valore que no pueden ser reasignadas 
*/

const fechaNacimiento = 1997;
console.log(fechaNacimiento);
fechaNacimiento = 1996;
console.log(fechaNacimiento); //Solo se ejecuta la consola anterior

// Clase 10 
//Ejercicio 1: Calcular estacion del año
let mes = 4;
let estacion; 
if (mes == 1 || mes == 2 || mes == 3){
    estacion = "Verano";
} else if (mes == 3 || mes == 4 || mes == 5){
    estacion == "Otoño";
} else if(mes == 6 || mes == 7 || mes == 8){
    estacion = "Invierno";
} else if (mes == 9 || mes == 10 || mes == 11){
    estacion  == "Primavera"
} else {
    estacion = "Valor incorrecto"
}
console.log(estacion);

switch(mes){
    case 1: case 2: case 12:
        estacion = "VERANO";
        break;
    case 3: case 4: case 5:
        estacion = "OTOÑO";
        break;
    case 6: case 7: case 8:
        estacion = "INVIERNO";
        break;
    case 9: case 10: case 11:
        estacion = "PRIMAVERA";
        break;
    default:
        estacion = "Valor incorrecto";
    }

    console.log(estacion);

//Ejercicio 2: Hora del dia 
let hora = 8;
let mensaje; 
if(hora >= 6 && hora <= 11){
    mensaje == "MAÑANA";
} else if (hora >= 12 && hora <= 18){
    mensaje == "TARDE";
} else if (hora >= 18 && hora <= 21){
    mensaje ="NOCHE";
} else if (hora >= 21 && hora <= 23){
    mensaje = "DORMIR"
} else {
    mensaje = "Valor incorrecto"
}

console.log(mensaje);
