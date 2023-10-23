class Persona:  # Creamos una clase

    def __init__(self, nombre, apellido, edad):  # Metodo, se lo llama metodo Init Dunder
        self.nombre = nombre
        self.apellido = apellido  # Son atributos de metodos y no de clases
        self.edad = edad
        # Son atributos dentro de un metodo, no se usa asi
    def mostrar_detalle(self):
        print(f"Persona: {self.nombre} {self.apellido} {self.edad}")

persona1 = Persona('Nelson', 'Lassa', 29)  # Necesitamos enviar Argumentos
# print(persona1.nombre)
# print(persona1.apellido)
# print(persona1.edad)
print(f'El objeto1 Persona de la clase persona: {persona1.nombre} {persona1.apellido} Su edad es: {persona1.edad}')  # Interpolación

persona2 = Persona("Raul", "Fernandez", 55)
print(f'El objeto2 Persona de la clase persona: {persona2.nombre} {persona2.apellido} Su edad es: {persona2.edad}')  # Interpolación

persona1.nombre = "Adara"
persona1.apellido = "Gonzalez"
persona1.edad = 1
print(f'El objeto1 modificado Persona de la clase persona: {persona1.nombre} {persona1.apellido} Su edad es: {persona1.edad}')  # Interpolación

# Los atributos son: caracteristicas
# Los métodos son: el comportamiento que van a tener los objetos (acciones)
# Metodo esta asociado a una clase
persona1.mostrar_detalle()
persona2.mostrar_detalle()