class Aritmetica:
    """
    El nombre de este tipo de comenatrio es: DocString
    se usa en python

    Vamos a sumar, restar, multiplicar y mas.

    """

    def __init__(self), operandoA, operandoB):
    self.operandoA = operandoA
    self.operandoB = operandoB

    #Metodo sumar
    def sumar(self):
        return self.operandoA + self.operandoB

    def resta(self):
        return self.operandoA - self.operandoB

    def multiplicar(self):
        return self.operandoA * self.operandoB

    def dividir(self):
        return self.operandoA / self.operandoB


aritmetica1 = Aritmetica(7,9) # Le pasamos los argumentos para los operandos
print(aritmetica1.sumar())

print(f'la resta de los numeros es: {aritmetica1.resta()}')
print(f'la multiplicacion de los numeros es: {aritmetica1.multiplicar()}')
print(f'la division de los numeros es: {aritmetica1.dividir():.2f}')

