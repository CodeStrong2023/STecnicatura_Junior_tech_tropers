//Ejercicio1: Calcular estación del año:
let mes = 10;
let estacion;
if (mes == 1 || mes == 2 || mes == 12) {
    estacion = "Verano";
}
else if (mes == 3 || mes == 4 || mes == 5) {
    estacion = "Otoño";
}
else if (mes == 6 || mes == 7 || mes == 8) {
    estacion = "Invierno";
}
else if (mes == 9 || mes == 10 || mes == 11) {
    estacion = "Primavera";
}
else {
    estacion = "Valor incorrecto";
}

console.log("El valor corresponde a la estación de : " + estacion)

//Ejercicio2: Hora del día
let horaDelDia = 6;
let mensaje;
if (horaDelDia >= 6 && horaDelDia <= 11) {
    mensaje = "Es hora de levantarse y desayunar";
}
else if (horaDelDia >= 12 && horaDelDia <= 16) {
    mensaje = "Es hora de almorzar";
}
else if (horaDelDia >= 17 && horaDelDia < 19) {
    mensaje = "Es hora de merendar";
}
else if (horaDelDia >= 20 && horaDelDia <= 23) {
    mensaje = "Es hora de cenar e irse a dormir";
}
else {
    mensaje = "Fuera de horario";
}
console.log(mensaje);

switch (mes) { //No solo se pueden evaluar valores numéricos, también cadenas de texto
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
        estacion = "Estación incorrecta";
}
console.log("La estación es: " + estacion)
