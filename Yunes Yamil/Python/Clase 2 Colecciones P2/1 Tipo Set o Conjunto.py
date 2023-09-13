# Tipo SET

planetas = {"Marte", "Jupiter", "Venus"} #Tambien se lo conoce como conjunto
print(planetas)
# Observamos que el orden se altera, no mantiene un índice.

# Agregamos la funcion len para consultar la cantidad de elementos del conjunto
print("El conjunto tiene elementos: ")
print(len(planetas)) #len = length = largo

# Revisamos la existencia de un elemento dentro del set
print("Existe el elemento Martes?")
print("Martes" in planetas)

print("Existe el elemento marte?")
print("martes" in planetas) #Se debe respetar mayúsculas y minúsculas

print("Existe el elemento Marte?")
print("Marte" in planetas)

# Agregar un elemento
print("Agregamos el elemento Tierra")
planetas.add("Tierra") # Add es una funcion
print(planetas)

# Si volvemos a agregar el mismo elemento, no se repite
# No se pueden duplicar los datos ingresados
print("Agregamos el elemento Tierra de nuevo")
planetas.add("Tierra") # Add es una funcion
print(planetas)
# Observamos que no se agrega

# Eliminar elementos
print("Eliminando Jupiter")
planetas.remove("Jupiter") # Arroja error si el elemento no existe o se ingresa mal
print(planetas)
#  Puede arrojar error si el elemento no existe.

planetas.discard("tierra") # No arroja error si se escribe o ingresa mal
print(planetas)

# Limpiar set
print("Limpiamos nuestro set")
planetas.clear()
print(planetas)

# Eliminar set
print("Eliminar set")
del planetas
print(planetas) #Arrojará error porque el set ya no existe