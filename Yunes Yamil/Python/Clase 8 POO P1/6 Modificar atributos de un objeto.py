# Creamos una clase
class Persona:
# Creacion de objetos con argumentos
    def __init__(self, nombre, apellido, edad):
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad

persona1 = Persona('Yamil','Yunes',29) # Necesitamos enviar argumentos
print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)

print(f'El objeto1 de la clase Persona {persona1.nombre} {persona1.apellido}, {persona1.edad}')

persona2 = Persona('Ariel','Betancud',40)
print(f'El objeto2 de la clase persona: {persona2.nombre} {persona2.apellido}, {persona2.edad}')

persona3 = Persona('Osvaldo','Giordanini',45)
print(f'El objeto3 de la clase Persona: {persona3.nombre} {persona3.apellido}, {persona3.edad}')

# Modificamos los objetos de la persona1
persona1.nombre = 'Liliana'
persona1.apellido = 'Buccella'
persona1.edad = 40

print(f'El objeto1 modificado de la clase Persona {persona1.nombre} {persona1.apellido}, {persona1.edad}')

# Estos objetos se pueden modificar sin inconvenientes