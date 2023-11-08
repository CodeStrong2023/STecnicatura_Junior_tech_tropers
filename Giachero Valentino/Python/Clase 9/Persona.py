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
persona1 = Persona("Marcelo", "Torres" , 63, 12332145) #Se requieren argumentos
print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)

persona2  = Persona("Leonel", "Garcia", 52)
print(f"El objeto2 de la clase persona: {persona2.nombre} {persona2.apellido} {persona2.edad}")

#Tarea => print de persona1
print(f"El objeto1 de la clase persona: {persona1.nombre} {persona1.apellido} {persona1.edad}")

persona1.nombre = "Saddam"
persona1.apellido = "Hussein"
persona1.edad = 69
print(f"El objeto1 modificado de la clase persona: {persona1.nombre} {persona1.apellido} {persona1.edad}")

#Los atributos son las caracteristicas
#Los métodos son: el comportamiento que van a tener los objetos (acciones)
persona1.mostrar_detalle() #La referencia en este caso se pasa de manera automática
persona2.mostrar_detalle()

#Persona.mostrar_detalle() #Debemos pasarle una referencia para el self o dará error
persona1.telefono = '45665412'
print(persona1.telefono)

persona3 = Persona("Pablo", "Lopez ", 26, "Teléfono: ", "89898976", "Calle Corrientes", 128, "Manzana: ", 52, "Casa", 22, Altura=1.70, Peso= 91, CFavorito= "Azul", Auto="Peugeot", Modelo= 2017 )
persona3.mostrar_detalle()

persona4 = Persona("Mariano", "Perez ", 55, "Teléfono: ", "5285287", "Calle Libertad", 762, "Manzana: ", 5, "Casa", 43, Altura=1.84, Peso= 96, CFavorito= "Rojo", Auto="Citroen", Modelo= 2013 )
persona4.mostrar_detalle()