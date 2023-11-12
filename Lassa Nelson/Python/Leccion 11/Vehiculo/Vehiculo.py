"""
Deinir una clase padre llaada Vehiculo y dos clases hijas llamadas
Auto y Bicicleta, las cuales heredan de la cclase padre Vehiculo. La clase
padre debe tener los siguientes atributos y metodos:
Vehiculo (clase, ruedas)
- Atributos (color y ruedas)
- Métodos (__init__(color, ruedas) y __str__())

Auto(clase hija de Vehiclo)
-Atributos (velocidad (km/hs) )
- Métodos (__init__(color, ruedas,velocidad) y __str__())

Bicicleta(clase hija de vehiculo)
- Atributos (tipo(urbana/montaña/etc.))
- Métodos (__init__(color, ruedas,tipo) y __str__())

Crear un objeto de cada clase
  """


class Vehiculo:
    def __init__(self, color, ruedas):
        self._color = color
        self._ruedas = ruedas

    @property
    def color(self):
        return self._color

    @color.setter
    def color(self, color):
        self._color = color

    @property
    def ruedas(self):
        return self._ruedas

    @ruedas.setter
    def ruedas(self, ruedas):
        self._ruedas = ruedas

    def __str__(self):
        return f'Vehiclulo: [Color: {self._color}, Ruedas: {self._ruedas}]'


class Auto(Vehiculo):
    def __init__(self, color, ruedas, velocidad):
        super().__init__(color, ruedas)
        self._velidad = velocidad

    @property
    def velocidad(self):
        return self._velidad

    @velocidad.setter
    def velocidad(self, velocidad):
        self._velidad = velocidad

    def __str__(self):
        return f'Auto: [Velocidad: {self._velidad} km/hs ] {super().__str__()}'


class Bicicleta(Vehiculo):
    def __init__(self, color, ruedas, tipo):
        super().__init__(color, ruedas)
        self._tipo = tipo

    @property
    def tipo(self):
        return self._tipo

    @tipo.setter
    def tipo(self, tipo):
        self._tipo = tipo

    def __str__(self):
        return f'Bicicleta: [Tipo: {self._tipo} ] {super().__str__()}'


bicicleta1 = Bicicleta("Rojo", 2, "Todo Terreno")
print(bicicleta1)
auto1 = Auto("Rojo", 4, 140)
print(auto1)