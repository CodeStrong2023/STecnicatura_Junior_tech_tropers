class Aritmetica:
    """
    El nombre de este tipo de comentario es: DocString
    esto es documentación de la clase en python
    Vamos a hacer en esta clase algunas operaciones de: suma, resta multiplicación y más
    """

    def __init__(self, operandoA, operandoB):
        self.operandoA = operandoA
        self.operandoB = operandoB

    # Metodo para sumar
    def sumar(self):
        return self.operandoA + self.operandoB

    # Metodo para restar
    def resta(self):
        return self.operandoA - self.operandoB

    # Metodo para multiplicar
    def multiplicar(self):
        return self.operandoA * self.operandoB

    # Metodo para dividir
    def dividir(self):
        return self.operandoA / self.operandoB


aritmetica1 = Aritmetica(2, 5)  # Le pasamos los argumentos para los operandos
print(aritmetica1.sumar())
print(f'La suma de los número es: {aritmetica1.sumar()}')
print(f'La resta de los número es: {aritmetica1.resta()}')
print(f'La multiplicación de los número es: {aritmetica1.multiplicar()}')
print(f'La división de los número es: {aritmetica1.dividir():.2f}') # .2f quiere decir que solo muestre 2 numeros despues de la coma