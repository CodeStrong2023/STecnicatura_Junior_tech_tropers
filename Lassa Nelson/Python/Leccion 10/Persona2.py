class Persona2:
    def __init__(self, nombre, apellido, edad):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalles(self):
        print(f'Los datos a mostrar son los siguientes: {self.nombre} {self.apellido} {self.edad}')

    @property  # decorador
    def nombre(self):  # Metodo Getter
        print("Estamos usando getter")
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):  # Metodo Setter
        print("Estamos usando Setter")
        self._nombre = nombre

    @property
    def apellido(self):
        print("Estamos usando getter")
        return self._apellido

    @apellido.setter
    def apellido(self, apellido):
        print("Estamos usando Setter")
        self._apellido = apellido

    @property
    def edad(self):
        print("Estamos viendo el Getter")
        return self._edad

    @edad.setter
    def edad(self, edad):
        print("Estamos usando Setter")
        self._edad = edad

    # Metodo destructor
    def __del__(self):
        print(f'Person2: {self._nombre} {self._apellido} {self._edad}')

if __name__ == "__main__":
    persona1 = Persona2("Nelson", "Lassa", 29)
    print(persona1.mostrar_detalles())  # Llamamos al método getter
    persona1.nombre = "Juan Pedro"  # Llamamos al método setter
    print(persona1.nombre)
    print(persona1.mostrar_detalles())  # Llamamos al método mostrar detalle
    persona1.edad = 40
    # Atributo read_only seria la edad porque no tiene el método set
    print(persona1.edad)

    # Tarea crear tres objetos más, utilizando los métodos getter and setter
    # para modificar, y mostrar los cambios con el método mostrar_detalles

    persona3 = Persona2("Pablo", "Battochhia", 25)
    persona3.nombre = "Emanuel"
    print(persona3.nombre)
    persona3.apellido= "Gonzalez"
    print(persona3.apellido)
    persona3.edad = 28
    print(persona3.edad)
    persona3.mostrar_detalles()


    persona4 = Persona2("Valentin", "Lassa", 14)
    persona4.nombre = "Emanuel"
    print(persona4.nombre)
    persona4.apellido= "Sanchez"
    print(persona4.apellido)
    persona4.edad = 23
    print(persona4.edad)
    persona4.mostrar_detalles()

    persona5 = Persona2("Jose", "Lassa", 41)
    persona5.nombre = "Ruben"
    persona5.apellido= "Sanchez"
    persona5.edad = 53
    print(persona5.nombre)
    print(persona5.apellido)
    print(persona5.edad)
    persona5.mostrar_detalles()


    print(__name__)