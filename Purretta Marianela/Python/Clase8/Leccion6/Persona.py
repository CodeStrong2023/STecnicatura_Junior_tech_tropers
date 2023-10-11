class Persona:  #creamos la clase
    # Usamos el método "init" para agreagar atributos o métodos
    # Similar al constructor, pero en PY está oculto, se lo llama a través del lenguaje de PY
    #Método especial "init"
    def __init__(self, nombre, apellido, edad): #self es la referencia al objeto
        self.nombre = nombre
        self.apellido = apellido #apellido1 son atributos de método y = apellido2 son las variables
        self.edad = edad

    # Definimos otro método de la clase:
    def mostrar_detalle(self):
        print(f'Persona: {self.nombre}{self.apellido}{self.edad}')#para acceder a los atributos de otro método usamos (self)
# Creamos un objeto "persona1" con el constructor Persona() creado por default
persona1 = Persona('Marianela', 'Purretta', 37) # Necesitamos ahora poner los argumentos
print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)
#creamos otro objeto:
persona2 = Persona('Sebastián', 'Siri', 34)
print(f"El objeto2 de la clase persona: {persona2.nombre} {persona2.apellido} y su edad es: {persona2.edad}")
print(f"El objeto1 de la clase persona: {persona1.nombre} {persona1.apellido} y su edad es: {persona1.edad}")

#Modificar atributos de un objeto:
persona1.nombre = 'Emir'
persona1.apellido = 'Siri'
persona1.edad = 13
print(f"El objeto1 modificado de la clase persona: {persona1.nombre} {persona1.apellido} y su edad es: {persona1.edad}")

#Los atributos son características para los objetos
#Los métodos como se van a comportar
#Otra forma de mostrar
persona1.mostrar_detalle()
persona2.mostrar_detalle()
