//Ejercicio para encontrar numeros pares

let numero = 10;
if (numero % 2 == 0) {
    console.log("Es un numero PAR");
}
else {
    console.log("Es un numero IMPAR");
}

//Ejercicio: es mayor de edad
let edad = 20;
if (edad > 18){
    console.log("Es mayor de edad ");
}
else{
    console.log("Es menor de edad");
}

// Ejercicio: dentro de un rango
let dentroRango = 5; //Aqui vamos a ir cambiando el valor
let valMin = 0, valMax = 10;
if(dentroRango >= valMin && dentroRango <= valMax){
    console.log("Esta adentro del rango establecido");
} else {
    console.log("Esta fuera del rango establecido");
}

//Ejercicio: si el padre puede asisitir al juego de su hijo
let vacacuines = false, diaDescanso = false;
if(vacaciones || diaDescanso){
    console.log("El padre puede asistir al juego de su hijo")
}
else{
    console.log("El padre no puede asistir al juego de su hijo")
}

//Operador ternario
let resultado2 = 3 > 2 ? "Verdadero" : "False"
console.log(resultado2);
let numero1 = 12;
resultado2 = numero2 % 2 == 0 ? "Es un numero PAR" : "Es un numero IMPAR"
console.log(resultado2);


//Convertir String a numero
let miNumero = "10";
console.log(typeof miNumero);
let edad2 = Number(miNumero);
console.log(typeof edad2);
if(isNaN(edad2)){ //No es un numero = is not a number
    console.log("Esta variable no contiene solo numeros")
}
else {
    if(edad2 >= 18){
        console.log("Ouede votar");
    } 
    else {
        console.log("Muy joven para votar");
    }
}

let resultado3 = edad2 >= 18 ? "Puede votar" : "Muy joven para votar";
console.log(resultado3);

//Funcion isNaN

