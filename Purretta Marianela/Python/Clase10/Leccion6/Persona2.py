class Persona2:
    def __init__(self, nombre, apellido, edad):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalles(self):
        print(f'Los datos a mostrar son lod siguientes: {self._nombre} {self._apellido} {self._edad}')
    @property #decorador para crear un getter
    def nombre(self): #creamos el método getter
        print('Estamos usando método get')
        return self._nombre

    @nombre.setter #Metodo setter
    def nombre(self, nombre):
        print('Estamos usando método set')
        self._nombre = nombre
#TAREA:
    @property  # decorador para crear un getter
    def apellido(self):  # creamos el método getter
        return self._apellido

    @apellido.setter  # Metodo setter
    def apellido(self, apellido):
        self._apellido = apellido

    @property  # decorador para crear un getter
    def edad(self):  # creamos el método getter
        return self._edad

    @edad.setter  # Metodo setter
    def edad(self, edad):
        self._edad = edad

persona1 = Persona2('Marianela', 'Purretta', 37)
print(persona1.nombre) #Llamamos al método getter
print(persona1.apellido)
print(persona1.edad)
persona1.nombre = 'Sebastian' # otra manera de obtener método set
print(persona1.nombre)# llamamos al método getter
print(persona1.mostrar_detalles()) # llamamos al método mostrar_detalles
#Atributo read-only, la edad no tiene método set
print(persona1.edad)

#TAREA: CREAR TRES OBJETOS MÁS USANDO LOS MÉTODOS getter & setter PARA MODIFICAR Y MOSTRAR LOS CAMBIOS

persona2 = Persona2('Adriel Emir', 'Siri', 13)
print(persona2.mostrar_detalles())
persona2.nombre = 'Sahir'
persona2.apellido = 'Siria'
persona2.edad = 1
print(persona2.nombre)
print(persona2.apellido)
print(persona2.edad)
print(persona2.mostrar_detalles())

persona3 = Persona2('Nassira', 'Siri', 6)
print(persona3.mostrar_detalles())
persona3.nombre = 'Abby'
persona3.apellido = 'Abdul'
persona3.edad = 35
print(persona3.nombre)
print(persona3.apellido)
print(persona3.edad)
print(persona3.mostrar_detalles())

persona4 = Persona2('Abigail', 'Yusuf', 24)
print(persona4.mostrar_detalles())
persona4.nombre = 'Cristian'
persona4.apellido = 'Yunes'
persona4.edad = 48
print(persona4.nombre)
print(persona4.apellido)
print(persona4.edad)
print(persona4.mostrar_detalles())