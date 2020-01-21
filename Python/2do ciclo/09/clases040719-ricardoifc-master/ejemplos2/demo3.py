def obtenerSuma(a,b = 2):
    suma = a+b
    return suma

def obtenerTabla(numero, limite):
    contador = 1
    cadena = ""
    while contador <= limite:
        mult = numero * contador
        cadena = "%s%d * %d = %d\n" % (cadena, numero, contador, mult)
        contador = contador + 1
    return cadena
