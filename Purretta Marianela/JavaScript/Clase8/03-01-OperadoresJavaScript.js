/*Ejercicio para encontrar números pares e impares: */
let parImpar = 19;
if(parImpar % 2 == 0){
    console.log("Es un número par")
}
else{
    console.log("Es un número impar")
}

/*Ejercicio: es mayor de edad:*/

let edad = 25, mayor = 18;
if(edad  >= mayor){
    console.log("Es mayor de edad!")
}

 else{
    console.log("Es menor de edad")
}
//Ejercicio: Dentro de un rango
let dentroRango = 5; //Aquí vamos a ir cambiando el valor
let valMin = 0, valMax = 10;
if(dentroRango >= valMin && dentroRango <= valMax){
    console.log('Esta fuera de rango establecido')
}
else{
    console.log('Esta fuera del rango establecido')
}