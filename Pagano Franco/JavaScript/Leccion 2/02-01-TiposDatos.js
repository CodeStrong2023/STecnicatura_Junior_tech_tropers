var nombre = "Franco";
var apellido = "Pagano";
var nombreCompleto = nombre +" "+ apellido; //Primera concatenacion
console.log(nombreCompleto);
var nombreCompleto2 = "Franco"+" "+"Pagano"; //Segunda concatenacion
console.log(nombreCompleto2);
var juntos = nombre + 2018; //Lee de izq. a der. seguiendo la cadena lee el numero como str
console.log(juntos);
juntos = nombre + 78 + 17;
console.log(juntos);
juntos = nombre + (78 + 17); //Los parentesis presentan prioridad por lo que resuelve la suma y concatena
console.log(juntos);
 juntos = 78 + 17 + nombre; // Primero realiza la suma y despues concatena como str. 
console.log(juntos);

nombre += apellido; //Tercer concatenacion usando el operador simplificado
console.log(nombre); 
nombre = "Franco " //Podemos agregar un espacio en el nonbre a la hora de concatenar
nombre += apellido; 
console.log(nombre);
