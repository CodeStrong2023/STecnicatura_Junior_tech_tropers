"""
Ejercicio 9: Mostrar una frase sin espacion y contar su longitud
Hacer un programa donde el usuario ingrese una frase, se le
devolvera la misma frase pero sin espacion en blanco, y ademas un
contador de cuantos caracteres tiene la frase
(sin contar los espacion en blanco)
ejemplo:
frase = vivir por siempre en paz
frase final = vivirporsiempreenpaz
Nº de caracteres = 20
"""
frase = input("Ingrese una frase: ")
fraseNueva = ""
contador = 0
for letra in frase:

    if letra != " ":
        fraseNueva += letra
        contador += 1
print(f"frase = {frase}")
print(f"frase final = {fraseNueva}")
print(f"Nº de caracteres = {contador}")


