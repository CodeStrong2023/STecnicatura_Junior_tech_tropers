#Desempaquetado de listas o list Unpacking
def show(name,lastName):
    print(name+' '+lastName)
persona = ["Joaquín", "Viñolo"]
show(persona[0],persona[1]) #Pasamos uno por uno los datos de la lista a la función
show(*persona) #Esto es lo mismo que lo anteriro pero le pasamos todo junto

persona2 = ("Roberta","Carlota") #Desempaquetamos a través de una tupla
show(*persona2)
persona3 = {"lastName":"Halo", "name":"3"}
show(**persona3)

#Repaso forelse

numbers = [1,2,3,4,5]
for n in numbers:
    print(n)
else:
    print("Esto se terminó")

#list comprehension, lista de comprensión
names = ["Paolo", "Rodrigo", "Lupe","Pepe"]
alongP = [p for p in names if p[0] == "P"] #Esto regresa una nueva lista
print(alongP)

bottleC = [{"name": "Quilmes", "country": "Arg"},
           {"name": "Corona", "country": "Mx"},
           {"name": "Stella Artois", "country": "Belgium"}
           ]
Arg = [b for b in bottleC if b["country"] == "Arg"]
print(Arg)
print(bottleC)

#Paso de Argumentos (funciones)

#Definimos la función mi_funcion con dos parámetros
def mi_funcion2(name, lastName):
    print("Saludos a todos")
    print(f"Nombre: {name}, Apellido: {lastName}")
#Llamamos a la función
mi_funcion2("Roberto","Viñolo")

#Palabra return
def sumar(a,b):
    return a + b
resultado = sumar(100, 200)
print(f"El resultadoe es: {resultado}")

def sumar2(a = 20, b =70):
    return a + b
resultado = sumar2()

#Argumentos, variables en funciones
def listarNombres(*nombres): #Normalmente se utiliza: *args
    for nombre in nombres: #Se convierte en tupla
        print(nombre)

listarNombres('Lucas','José','Claudia','Rosa','María')
