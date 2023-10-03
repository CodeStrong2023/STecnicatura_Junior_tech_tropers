"""
Ejercicio 4: Calcaladora de impuestos
Crear una funcion para calcular el total de un pago incluyendo
un impuesto aplicado. (IVA)
Formula: pago_total = pago_sin_impuestos + pago_sin_impuestos * (impuestos/100)
propocione el pago sin impuesto: 1000
Poporcione el monto del impuesto: 21%
Pago con impuesto: XXXXXX
"""

 # Calculadora de impuestos
def calculadoraImpuestos(pago_sin_impuestos, impuestos):
    pago_total = pago_sin_impuestos + (pago_sin_impuestos * (impuesto/100))
    return pago_total

 # Llamamos a la funcion
pago_sin_impuestos = float(input("Ingrese el pago sin impuestos: "))
impuesto = float(input("Ingrese el monto de impuesto aplicado: "))
pago_con_impuestos = calculadoraImpuestos(pago_sin_impuestos, impuesto)
print(f"El pago con impuesto es: {pago_con_impuestos}")