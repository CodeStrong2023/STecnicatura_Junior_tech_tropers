class Persona: #Creamos una clase
    def __init__(self, nombre , apellido , edad, dni, *args, **kwargs): #Se lo llama método Init Dunder
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad
        self.args = args
        self.kwargs = kwargs
        self._dni = dni

    #Definimos un método
    def mostrar_detalle(self):
        print(f"La clase Persona tiene los siguientes datos: {self.nombre} {self.apellido} {self.edad} {self._dni}, la dirección es: {self.args}, los datos importantes son: {self.kwargs}")

#Constructor
persona1 = Persona("Harry", "Potter" , 85, 43434334) #Se requieren argumentos
print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)

persona2  = Persona("Osvaldo", "Giordanini", 45)
print(f"El objeto2 de la clase persona: {persona2.nombre} {persona2.apellido} {persona2.edad}")

#Tarea => print de persona1
print(f"El objeto1 de la clase persona: {persona1.nombre} {persona1.apellido} {persona1.edad}")

persona1.nombre = "Liliana"
persona1.apellido = "Buccella"
persona1.edad = 40
print(f"El objeto1 modificado de la clase persona: {persona1.nombre} {persona1.apellido} {persona1.edad}")

#Los atributos son las caracteristicas
#Los métodos son: el comportamiento que van a tener los objetos (acciones)
persona1.mostrar_detalle() #La referencia en este caso se pasa de manera automática
persona2.mostrar_detalle()

#Persona.mostrar_detalle() #Debemos pasarle una referencia para el self o dará error
persona1.telefono = '3243242'
print(persona1.telefono)

persona3 = Persona("Rogelio", "Romero ", 22, "Teléfono: ", "56768787", "Calle Lopez", 859, "Manzana: ", 77, "Casa", 18, Altura=1.83, Peso= 85, CFavorito= "Violeta", Auto="Citroen", Modelo= 2023 )
persona3.mostrar_detalle()

persona4 = Persona("Rodrigo", "Zeta ", 34, "Teléfono: ", "*****", "Calle Tele", 545, "Manzana: ", 7, "Casa", 76, Altura=1.90, Peso= 80, CFavorito= "Marrón", Auto="Fiat", Modelo= 2018 )
persona4.mostrar_detalle()