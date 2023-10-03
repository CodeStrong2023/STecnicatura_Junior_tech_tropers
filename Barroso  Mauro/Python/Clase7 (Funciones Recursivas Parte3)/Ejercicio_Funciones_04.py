#Ejercicio 4: Calculadora de Impuestos. Crear una funcion para calcular el total de un pago incluyendo un impuesto aplicado. (iva)
#Formula_ pago_total = pago_sin_impuesto * (impuesto/100). Proporcione el pago sin impuesto: 1000
#Proporcione el monto del impuesto 21%. Pago con impuesto xxxx

def calcular_total_pago(pago_sin_impuesto, impuesto):
    pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto/100)
    return pago_total

pago_sin_impuesto = float(input("Ingrese el pago sin impuestos: "))
impuesto = float(input("Ingrese el monto del impuesto a aplicar: "))
pago_con_impuesto = calcular_total_pago(pago_sin_impuesto, impuesto)
print(f"El pago con impuesto es: {pago_con_impuesto}")
