class Persona:  # Creamos una clase
    def __init__(self, nombre, apellido, edad):  # Se lo llama metodo INIT DUNDER
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad

    def mostrar_detalles(self):
        print(f"Persona: {self.nombre} {self.apellido} {self.edad}")


persona1 = Persona("Franco", "Pagano", 26)  # Necesitamos enviar argumentos
"""
print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)   
"""
# Tarea hacer un print con interpolacion:
print(f"El objeto de la clase persona1: {persona1.nombre} {persona1.apellido} su edad es {persona1.edad}")

persona2 = Persona("Julieta", "Quiroga", 27)
print(f"El objeto de la clase persona2: {persona2.nombre} {persona2.apellido} su edad es {persona2.edad}")

persona1.nombre = "Viviana"
persona1.apellido = "Pantaley"
persona1.edad = 62
print(f"El objeto de la clase persona1: {persona1.nombre} {persona1.apellido} su edad es {persona1.edad}")

# Los atributos son: CARACTERISTICAS
# Los metodos son: el comportameitno que van a tener los objetos (acciones)
persona1.mostrar_detalles()
persona2.mostrar_detalles()