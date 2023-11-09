class Persona:

    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad
    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    @property
    def edad(self):
        return self._edad

    @edad.setter
    def edad(self, edad):
        self._edad = edad

    def __str__(self):
        return f'Persona: [el nombre de la persona es: {self._nombre}, su edad es: {self._edad}]'

class Empleado(Persona):
    def __init__(self,nombre, edad, sueldo):
        super().__init__(nombre,edad)
        self.sueldo = sueldo

    @property
    def sueldo(self):
        return self._sueldo

    @sueldo.setter
    def sueldo(self, sueldo):
        self._sueldo = sueldo

    def __str__(self):
        return f'Empleado: [Sueldo: {self._sueldo}] {super().__str__()}'

empleado1 = Empleado(7500,"Mauro",24)
print(empleado1.nombre)
print(empleado1.sueldo)
print(empleado1.edad)

#Tarea: encapsular los atributos y agregar los método getters y setters, crear otro objeto, pasar los datos para nombre, edad y sueldo, mostrar estos datos, luego modifcar y mostrar nuevamente

empleado2 = Empleado("Luciana", 20, 8000)
print(empleado2.nombre)
print(empleado2.sueldo)
print(empleado2.edad)
empleado2.nombre = "Leandra"
empleado2.edad = 49
empleado2.saldo = 8000000
print(empleado2.nombre)
print(empleado2.sueldo)
print(empleado2.edad)
