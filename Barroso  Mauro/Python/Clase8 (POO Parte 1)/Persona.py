class Persona: #Creamos la clase

    def __init__(self, nombre, apellido, edad): #Metodo Init Dunder
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad
    def mostrar_detalle(self):
        print(f"Persona: {self.nombre} {self.apellido} {self.edad}")

persona1 = Persona("Mauro", "Barroso", 24) #Se necesita arguymentos

#print(persona1.nombre)
#print(persona1.apellido)
#print(persona1.edad)

print(f"El objeto1 de la clase persona: {persona1.nombre} {persona1.apellido} Su edad es: {persona1.edad}")
persona2= Persona("Danilo", "Muñoz", 25)
print(f"El objeto2 de la clase persona: {persona2.nombre} {persona2.apellido} Su edad es: {persona2.edad}")


persona1.nombre = "Luciana"
persona1.apellido = "Ponce"
persona1.edad = 19
print(f"El objeto1 modificado de la clase persona: {persona1.nombre} {persona1.apellido} Su edad es: {persona1.edad}")

#Los atributos son : Caracteristicas
#Los metodos son: el comportamientos que van a tener los objetos (acciones)

persona1.mostrar_detalle()
persona2.mostrar_detalle()
