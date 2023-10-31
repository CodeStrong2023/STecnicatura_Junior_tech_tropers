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

    #MÉTODO DESTRUCTOR:
    def __del__(self):
        print(f'Persona2: {self._nombre} {self._apellido} {self._edad}')

if __name__ =='__main__':
    persona1 = Persona2('Mauro', 'Barroso', 24)
    print(persona1.nombre) #Llamamos al método getter
    print(persona1.apellido)
    print(persona1.edad)
    persona1.nombre = 'Luciana' # otra manera de obtener método set
    print(persona1.nombre)# llamamos al método getter
    print(persona1.mostrar_detalles()) # llamamos al método mostrar_detalles
    #Atributo read-only, la edad no tiene método set
    print(persona1.edad)

    #TAREA: CREAR TRES OBJETOS MÁS USANDO LOS MÉTODOS getter & setter PARA MODIFICAR Y MOSTRAR LOS CAMBIOS

    persona2 = Persona2('Luci Ponce', 'Leandra', 19)
    print(persona2.mostrar_detalles())
    persona2.nombre = 'Anibal'
    persona2.apellido = 'Muñoz'
    persona2.edad = 50
    print(persona2.nombre)
    print(persona2.apellido)
    print(persona2.edad)
    print(persona2.mostrar_detalles())

    persona3 = Persona2('Nahuel', 'Barroso', 27)
    print(persona3.mostrar_detalles())
    persona3.nombre = 'Ana'
    persona3.apellido = 'Lopez'
    persona3.edad = 25
    print(persona3.nombre)
    print(persona3.apellido)
    print(persona3.edad)
    print(persona3.mostrar_detalles())

    persona4 = Persona2('Fran', 'Diaz', 26)
    print(persona4.mostrar_detalles())
    persona4.nombre = 'Enzo'
    persona4.apellido = 'Lomoro'
    persona4.edad = 25
    print(persona4.nombre)
    print(persona4.apellido)
    print(persona4.edad)
    print(persona4.mostrar_detalles())

    print(__name__)