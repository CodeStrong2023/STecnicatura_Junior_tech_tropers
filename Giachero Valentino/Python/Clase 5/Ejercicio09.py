#Ejercicio9: Mostrar una frase sin espacios y contar su longitud
#Hacer un programa donde el usuario ingrese una frase, se le devolverá
#la misma pero sin espacios y contará cuántos carácteres tiene la frase sin espacios:

frase1 = input("Ingrese una frase: ")
frase2 = " "
for i in frase1:
    if i != " ":
        frase2 += i
frase1 = frase2
print(f'\nFrase modificada: {frase1}')
print(f'Cantidad de caracteres: {len(frase1)}')