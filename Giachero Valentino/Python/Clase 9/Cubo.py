class Cubo:
    """
    Crear la clase cubo con los atributos: ancho, alto y profundidad.
    Mediante un método calcular_volumen que tendrá la formula:
    volumen = ancho * altura * profundidad
    El usuario deberá ingresar los valores.
    """
    def __init__(self, ancho, alto, profundidad):
        self.ancho = ancho
        self.alto = alto
        self.profundidad = profundidad
    #Definimos el método para calcular volumen
    def calcular_volumen(self):
        return self.ancho * self.profundidad * self.alto

#Pedimos los datos al usuario
ancho = int(input("Digite el ancho: "))
profundidad = int(input("Digite la profundidad: "))
alto= int(input("Digite el alto: "))

#Creamos una instancia de la clase cubo
cubo = Cubo(ancho, profundidad, alto)
#Mostramos por pantalla el resultado
print(f"El volumen del cubo es: {cubo.calcular_volumen()}")