# Ejercicio 4: Calculadora de Impuestos
# Crear una función para calcular el total de un pago incluyendo
# un impuesto aplicado. (IVA)
# Formula: pago_total = pago_sin_impuestos + pago_sin_impuestos * (impuesto/100)
# Proporcione el pago sin impuesto: 1000
# Proporcione el monto del impuesto: 21 %
# pago con impuesto: xxxxx

def pago_total(pago_sin_impuesto, impuesto):
    resultado = pago_sin_impuesto + pago_sin_impuesto * (impuesto / 100)
    return resultado


pago_sin_impuesto = float(input("Ingrese el precio del producto: "))
impuesto = float(input("Ingrese el % de impuesto del producto: "))
print(pago_total(pago_sin_impuesto, impuesto))


