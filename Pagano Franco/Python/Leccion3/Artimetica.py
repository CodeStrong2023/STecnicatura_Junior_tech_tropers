class Aritmetica:
    """
    El nombre este comestario es: DocString
    este es una documentacion de la clase de pyhton
    vamos a hacer en esta clase algunas operaciones de: suma, resta, multiplicacion y division
    """

    def __init__(self, operandoA, operandoB):
        self.operandoA = operandoA
        self.operandoB = operandoB

    # Metodo para sumar
    def sumar(self):
        return self.operandoA + self.operandoB

    def restar(self):
        return self.operandoA - self.operandoB

    def multiplicar(self):
        return self.operandoA * self.operandoB

    def dividir(self):
        return self.operandoA / self.operandoB

aritmetica1 = Aritmetica(7, 9)  # Le pasamos los argumentos para los operadores
print(aritmetica1.sumar())

print(f"La resta de los numeros es: {aritmetica1.restar()}")
print(f"La multiplicacion de los numeros es: {aritmetica1.multiplicar()}")
print(f"la division de los numeros es: {aritmetica1.dividir():.2f}")