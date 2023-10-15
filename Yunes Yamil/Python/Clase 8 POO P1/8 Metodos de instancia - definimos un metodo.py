class Persona:

    def __init__(self, nombre, apellido, edad):
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad

    def mostrar_detalle(self): # Metodo de instancia
        print(f'Persona: {self.nombre} {self.apellido} {self.edad}')
        # la variable self se encuentra solo dentro de los metodos

persona1 = Persona('Yamil Jesus', 'Yunes', 29)
persona2 = Persona('Ariel', 'Betancud', 40)

persona1.mostrar_detalle()
persona2.mostrar_detalle()


