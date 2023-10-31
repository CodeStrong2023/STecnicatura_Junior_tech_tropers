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