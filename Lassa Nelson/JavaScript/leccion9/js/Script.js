// Ejercicio 1: Calcular estacion del año
let mes = 4;
let estacionAnio;

if(mes == 1 || mes == 2 || mes == 12){
  estacionAnio="Verano";
}
else if(mes == 4|| mes == 5 || mes == 6){
  estacionAnio="Otoño";
}
else if(mes == 6 || mes == 7 || mes == 8){
  estacionAnio="Invierno";
}
else if(mes == 9 || mes == 10 || mes == 11){
  estacionAnio="Primavera";
}
else{
  estacionAnio ="No existe ese mes";
}
console.log("La estacion del año es: "+estacionAnio)

// Ejercicio 2: Hora del dia
let horaDia = 10;
let accionDia ;

if (horaDia>=0 && horaDia<=8){
  accionDia = "Durmiendo para poder reponer energia";
}
else if (horaDia>8 && horaDia<=9){
  accionDia = "Perpararse para ir a trabajar";
}
else if (horaDia>9 && horaDia<=13){
  accionDia = "Trabajando";
}
else if (horaDia>13 && horaDia<=14){
  accionDia = "Almuerzo";
}
else if (horaDia>14 && horaDia<=17){
  accionDia = "Continuar trabajando";
}
else if (horaDia>17 && horaDia<=18){
  accionDia = "Llegar a casa y perparar la merienda";
}
else if (horaDia>18 && horaDia<=21){
  accionDia = "Leer y comenzar con el cursado";
}
else if (horaDia>22 && horaDia<=24){
  accionDia = "Leer y comenzar con el cursado";
}
else{
  accionDia = "Esa no es una hora correcta" ;
}
console.log("Que estoy haciendo ?"+accionDia);

// Estructura switch(la sintaxis es igual a java)
switch(mes){
  case 1: case 2: case 12:
    estacionAnio="verano";
    break
  case 3: case 4: case 5:
    estacionAnio="otoño";
    break
  case 6: case 7: case 8:
    estacionAnio="Invierno";
    break
  case 9: case 10: case 11:
    estacionAnio="Verano";
    break
  default: 
    estacionAnio = "Valor incorrecto"
}
console.log("Bienvenido a la estación de: "+estacionAnio);