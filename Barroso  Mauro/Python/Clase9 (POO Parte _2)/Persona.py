class Persona: #Creamos la clase

    def __init__(self, nombre, apellido, dni, edad, *args, **kwargs): #Metodo Init Dunder
        self.nombre = nombre
        self.apellido = apellido
        self._dni = dni #atributo encapsulado de manera sugerida
        self.edad = edad
        self.args = args
        self.wkargs = kwargs

    def mostrar_detalle(self): #self es igual a this
        print(f" La clase Persona tiene los siguientes datos: {self.nombre} {self.apellido} {self.edad}, la direccion es: {self.args}, los datos importantes son: {self.wkargs}")


persona1 = Persona("Mauro", "Barroso", 323232, 24) #Se necesita arguymentos

#print(persona1.nombre)
#print(persona1.apellido)
#print(persona1.edad)

print(f"El objeto1 de la clase persona: {persona1.nombre} {persona1.apellido} Su edad es: {persona1.edad}")
persona2= Persona("Danilo", "Muñoz",323232, 25)
print(f"El objeto2 de la clase persona: {persona2.nombre} {persona2.apellido} Su edad es: {persona2.edad}")


persona1.nombre = "Luciana"
persona1.apellido = "Ponce"
persona1.edad = 19
print(f"El objeto1 modificado de la clase persona: {persona1.nombre} {persona1.apellido} Su edad es: {persona1.edad}")

#Los atributos son : Caracteristicas
#Los metodos son: el comportamientos que van a tener los objetos (acciones)

persona1.mostrar_detalle() #La referencia se pasa de manera automatica
persona2.mostrar_detalle()

#Persona.mostrar_detalle() #Debemos pasarle una referencia para e self o dara error
persona1.telefono = "2604051325"
print(f'Este es el telefono: {persona1.telefono}{persona1.nombre}') #Creamos atributos de un ojeto

#print(persona2.telefono)el objeto persona2 no tiene este atributo, da error
persona3 = Persona("Mauro", "Barroso",323232, 24, "Telefono", "2604051325", "Calle Illescas", 1710, "Manzana", 1,"Casa", 3, Altura=1.80, Peso=60, cFavorito="Rojo", Auto="Renault", Modelo=1987)
persona3.mostrar_detalle()
# print(persona3._dni) #No se debe utilizar en python (esta encapsulado)
# persona3.__nombre #Esta totalmente encapsulado

