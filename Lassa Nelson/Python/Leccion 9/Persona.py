class Persona:  # Creamos una clase

    def __init__(self, nombre, apellido, dni, edad, *args, **kwargs):  # Metodo, se lo llama metodo Init Dunder
        self.nombre = nombre
        self.apellido = apellido  # Son atributos de metodos y no de clases
        self._dni = dni  # Este atributo esta encapsulado de una manera sugerida
        self.edad = edad
        # Son atributos dentro de un metodo, no se usa asi
        self.args = args
        self.kwargs = kwargs

    def mostrar_detalle(self):
        print(
            f"La clase Persona tiene los siguientes datos: {self.nombre} {self.apellido} {self._dni} {self.edad} , la direccio es:{self.args}, los datos importantes son: {self.kwargs}")


persona1 = Persona('Nelson', 'Lassa', 33552145, 29)  # Necesitamos enviar Argumentos
# print(persona1.nombre)
# print(persona1.apellido)
# print(persona1.edad)
print(
    f'El objeto1 Persona de la clase persona: {persona1.nombre} {persona1.apellido} Su edad es: {persona1.edad}')  # Interpolación

persona2 = Persona("Raul", "Fernandez", 45045555, 55)
print(
    f'El objeto2 Persona de la clase persona: {persona2.nombre} {persona2.apellido} Su edad es: {persona2.edad}')  # Interpolación

persona1.nombre = "Adara"
persona1.apellido = "Gonzalez"
persona1.edad = 1
print(
    f'El objeto1 modificado Persona de la clase persona: {persona1.nombre} {persona1.apellido} Su edad es: {persona1.edad}')  # Interpolación

# Los atributos son: caracteristicas
# Los métodos son: el comportamiento que van a tener los objetos (acciones)
# Metodo esta asociado a una clase
persona1.mostrar_detalle()  # La referencia en este caso se pasa de manera automatica
persona2.mostrar_detalle()

# Persona.mostrar_detalle(persona1) # Debemos pasarle una refencia para el self o dará error

persona1.telefono = "24485454874"  # Atributo "superficial" solo puede ser llamado por el objeto persona1
print(f"Este es el telefono de: {persona1.nombre} {persona1.telefono}")  # Hemos creado un atributo de un objeto

# print(persona2.telefono) # el objeto persona2 no tiene este atributo, da error

persona3 = Persona("Rogelio", "Romero", 4504523, 22, "Telefono", "2614445557", "Calle Lopez", 823, "Manzana", 77,
                   "Casa", 18, Altura=1.83, Peso=105, CFavorito="Azul", Auto="Citroen", Modelo=2021)
persona3.mostrar_detalle()
persona4 = Persona("Gustavo", "Gonzalez", 39245789, 42, "Telefono", "2604995500", "Calle 9 de Julio", 357, "Manzana",
                   12, "Casa", 5, Altura=1.63, Peso=75, CFavorito="Gris", Auto="Fiat", Modelo=2012)
persona4.mostrar_detalle()
# print(persona4._dni) # Encapsulado y no se puede usar, esto dice que lo desconocemos en python
# persona4.__nombre # Esta totalmente encapsulado