class Aritmetica:
    """
    El nombre de este tipo de comentario es: DocString
    esto es documentación de la clase en python
    Vamos a hacer en esta clase algunas operaciones de: suma, resta, multiplicación y más
    """
    #Creamos el método init para inicializar los atributos

    def __init__(self, operandoA, operandoB):
        self.operandoA = operandoA
        self.operandoB = operandoB
    #Método para sumar:
    def sumar(self):
        return self.operandoA + self.operandoB

        # Método para restar:
    def resta(self):
        return self.operandoA - self.operandoB

        #Método para multiplicar
    def multiplicacion(self):
        return self.operandoA * self.operandoB

        #Método para dividir:
    def dividir(self):
        return self.operandoA / self.operandoB


aritmmetica1 = Aritmetica(7, 9)#Le pasamos los argumentos para los operandos
print(f'La suma de los números es: {aritmmetica1.sumar()}')
print(f'La resta de los números es: {aritmmetica1.resta()}')
print(f'La multiplicación de los números es: {aritmmetica1.multiplicacion()}')
print(f'La división de los números es: {aritmmetica1.dividir():.2f}')


