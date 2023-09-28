var nombre = 'José';
var apellido = ' Montes'
var nombreCompleto = nombre+' '+apellido; //primera concatenación
console.log(nombreCompleto);
var nombreCompleto2 = 'Marianela' + ' ' + 'Purretta';//segunda concatenación
console.log(nombreCompleto2);
var juntos = nombre + 219; //lee de izq a der y lee el num como str
console.log(juntos);
juntos = nombre + 78 + 17; //Se puede diferenciar a través de los paréntesis
console.log(juntos); //sigue concatenado dentro de la misma variable
juntos = 78 + 17 + nombre;
console.log(juntos); // sumó y luego concatenó de Tipo str. "CONTEXTO STR O CADENA"

nombre += apellido; //tercera forma de concatenar
console.log(nombre);


