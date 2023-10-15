class Persona: #Creamos la clase

# Atributos en metodos y creacion de un objeto
# Le ingresamos los valores por codigo duro
    def __init__(self): # Se lo llama metodo Init Dunder
        self.nombre = 'Juan'
        self.apellido = 'Zalazar'
        self.edad = 22
persona1 = Persona()
print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)
