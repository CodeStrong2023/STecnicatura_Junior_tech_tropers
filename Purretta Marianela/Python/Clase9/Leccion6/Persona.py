class Persona:  #creamos la clase
    # Usamos el método "init" para agreagar atributos o métodos
    # Similar al constructor, pero en PY está oculto, se lo llama a través del lenguaje de PY
    #Método especial "init" PARA INICIALIZACION DE ATRIBUTOS
    def __init__(self, nombre, apellido, edad, dni, *args, **kwargs): #self es la referencia al objeto
        # *args y **kwargs son argumentos variables para tuplas y para diccionarios
        self.nombre = nombre
        #Para el encapsulamiento agregamos _
        self.apellido = apellido #apellido1 son atributos de método y = apellido2 son las variables
        self.edad = edad
        self._dni = dni #Este atributo esta encapsulado de una manera sugerida
        self.args = args
        self.kwargs = kwargs

    # Definimos otro método de la clase:
    def mostrar_detalle(self): # Su uso es idéntico a .this en java, y se le puede cambiar el nombre
        print(f'La clase Persona tiene los siguientes datos: {self.nombre} {self.apellido} {self.edad} {self._dni}, la dirección es: {self.args}, y los datos importantes son: {self.kwargs}')#para acceder a los atributos de otro método usamos (self)
# Creamos un objeto "persona1" con el constructor Persona() creado por default
persona1 = Persona('Marianela', 'Purretta', 37, 32133498) # Necesitamos ahora poner los argumentos
print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)
#creamos otro objeto:
persona2 = Persona('Sebastián', 'Siri', 34, 32708112)
print(f"El objeto2 de la clase persona: {persona2.nombre} {persona2.apellido} y su edad es: {persona2.edad}")
print(f"El objeto1 de la clase persona: {persona1.nombre} {persona1.apellido} y su edad es: {persona1.edad}")

#Modificar atributos de un objeto:
persona1.nombre = 'Emir'
persona1.apellido = 'Siri'
persona1.edad = 13
persona1.args = 'Quiroga 1234'
persona1.kwargs = 'Es estudiante y rockero'
print(f"El objeto1 modificado de la clase persona: {persona1.nombre} {persona1.apellido} y su edad es: {persona1.edad}")

#Los atributos son características para los objetos
#Los métodos como se van a comportar
#Otra forma de mostrar
persona1.mostrar_detalle()# La referencia se pasa de manera automática
persona2.mostrar_detalle()

#Persona.mostrar_detalle(persona1) #Debemos pasarle una referencia para el self o dará error. NO ES EFICAZ
persona1.telefono = '2324443444'
#Creamos un atributo de un objeto:
print(f'El número de teléfono de {persona1.nombre} es: {persona1.telefono}')

#print(persona2.telefono) el objeto persona2 no tiene este atributo, da error
#Creamos dos objetos más:
persona3 = Persona('Sahir', 'Siri', 1, 3215879, 'Teléfono', '234567890', 'Calle Quiroga', 1234, Altura = 0.70, Peso = 12, Gustos = 'Vaca Lola')
persona3.mostrar_detalle()
persona4 = Persona('Perla', 'Siri', 5, 32154789, 'Teléfono', '278999890', 'Calle Quiroga', 1234, Altura = 1.70, Peso = 42, Gustos = 'Música')
persona4.mostrar_detalle()
print(persona3._dni) #Python no muestra _dni porque está encapsulado, pero podemos completarlo manualmente
#No se debe usar así en python
#el __ es para evitar que sea modificado. No muestra el atributo, está totalmente encapsulado
