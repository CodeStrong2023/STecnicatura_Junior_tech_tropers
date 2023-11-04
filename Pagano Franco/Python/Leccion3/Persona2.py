class Persona2:
    def __init__(self, nombre, apellido, edad): # Esta encapsulado
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalles(self):
        print(f"Los datos a mostrar son los siguientes: {self.nombre} {self.apellido} {self.edad}")
    @property # decorador
    def nombre(self): # Metodo getter
        print("Estamos utilizando el metodo get")
        return self._nombre
    @nombre.setter
    def nombre(self, nombre): # Metodo setter
        print("Estamos utilizando el metodo set")
        self._nombre = nombre

    @property  # decorador
    def apellido(self):  # Metodo getter
        # print("Estamos utilizando el metodo get")
        return self._apellido

    @apellido.setter
    def apellido(self, apellido):  # Metodo setter
        #print("Estamos utilizando el metodo set")
        self._apellido = apellido

    @property  # decorador
    def edad(self):  # Metodo getter
        # print("Estamos utilizando el metodo get")
        return self._edad


    @edad.setter
    def edad(self, edad):  # Metodo setter
        # print("Estamos utilizando el metodo set")
        self._edad = edad

    def __del__(self):
        print(f"Persona2: {self._nombre} {self._apellido} {self._edad}")

if __name__ == '__main__':
    persona1 = Persona2("Franco", "Pagano", 26)
    print(persona1.nombre)  # de esta forma llamamos al metodo getter
    persona1.nombre = "Juan Pablo"
    print(persona1.nombre)
    print(persona1.mostrar_detalles())
    # persona1._edad = 40 ESTO NO SE HACE
    # Atributos read-only seria la edad porque no tiene el metodo set
    print(persona1.edad)
    # Tarea crear tres objetos mas, utilizando los metodos getter and setter
    # para modificar, y mostrar los cambios con el metodo mostrar detalles

    # Objeto numero uno de la tarea
    persona2 = Persona2("Rolando", "Ando", 13)
    persona2.nombre = "Franco"
    persona2.apellido = "Pagano"
    persona2.edad = 26
    print(persona2.nombre)
    print(persona2.apellido)
    print(persona2.edad)
    print(persona2.mostrar_detalles())

    # Objeto numero dos de la tarea
    persona3 = Persona2("Rolando", "Ando", 13)
    persona3.nombre = "Julieta"
    persona3.apellido = "Quiroga"
    persona3.edad = 27
    print(persona3.nombre)
    print(persona3.apellido)
    print(persona3.edad)
    print(persona3.mostrar_detalles())

    # Objeto numero tres de la tarea
    persona4 = Persona2("Rolando", "Ando", 13)
    persona4.nombre = "Juan Pablo"
    persona4.apellido = "Dell Pozzi"
    persona4.edad = 27
    print(persona4.nombre)
    print(persona4.apellido)
    print(persona4.edad)
    print(persona4.mostrar_detalles())

    print(__name__)
