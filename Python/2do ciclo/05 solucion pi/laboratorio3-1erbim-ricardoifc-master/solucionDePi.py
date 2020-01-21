"""
Author: @ricardoifc
file: solucionDePi.py
Realizar la serie que permite encontrar el valor de PI.
El numero de interaciones es de 10
Al final se debe presentar el siguente reporte:

pi	=	 4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 + 4/13 - 4/15 + 4/17 - 4/19
                
pi = ?
"""
# Primero declaro variables
numerador = 4
denominador = 1
pi = 0
contador = 1
limite = 10
aux = 0
# convierto estas variables a float
pi = float(pi)
aux = float(aux)
# declaro una cadena con la que acumulare
cadena = "\npi =\t4"
# un bucle para la operacion
while contador <= limite:
    # si es par va - y si es impar va +
    if contador % 2 == 0:
        aux = numerador / denominador # calculamos numerador con denominador
        denominador = denominador + 2 # sumamos 2 al denominador
        # formamos la cadena 
        cadena = "%s + %d/%d" % (cadena, numerador, denominador)
        pi = pi - aux # operamos pi
    else:
        aux = numerador / denominador
        denominador = denominador + 2
        cadena = "%s - %d/%d" % (cadena, numerador, denominador)
        pi = pi + aux # operamos pi
    contador = contador + 1 # incrementamos en contador
print("%s\n\npi = %f" % (cadena,pi)) # impimimos 
