#Ejercicio 9: Mostrar una frase sin espacios y contar su longitud
#Hacer un programa donde el usuario ingrese una frase, se le
#devolverá la misma frase pero sin espacios en blanco, y además
#un contador de cuántos caracteres tiene la frase
#(sin contar los espacios)

#Pedimos al usuario que digite una frase
frase1 = input("Digite una frase: ")
frase2 = " "

#Recorremos con un ciclo for la frase1
for i in frase1:
    if i != " ":
        frase2 += i


frase1 = frase2
#Mostramos por consola los resultados
print(f"La frase final es: {frase1}")
print(f"La frase tiene {len(frase1)}")

