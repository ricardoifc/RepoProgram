""" Deseamos obtener el costo de una carrera universitaria. 
El valor promedio de cada ciclo es de 1200$
El valor promedio del seguro educativo es de 100$ si la edad
 del estudiante es menor o igual a 20 caso contrario sera de 150$
si el estudiante tiene una modalidad a distancia el numero de 
ciclos a seguir es a 10 caso contrario debera seguir 8 ciclos
obtener la proyeccion del costo de la carrera de un estudiante
13000
"""
# declaro variables
tarifa = 1200
total = 0
seguro = 150
ciclos = 8
# pido los datos
edad = input("¿Cuantos años tiene?\n")
modalidad = input ("¿Que modalidad es?\n")
# se declara las variables en int y float
total = float(total)
edad = int(edad)
seguro = int(seguro)
ciclos = int(ciclos)
# uso 2 condicionales
if edad <= 20:
	seguro = 100
if modalidad == "Distancia":
	ciclos = 10
# calculo el valor total
total = ciclos * (1200 +seguro)
# total = (ciclos * 1200) + (seguro * ciclos)
print("El valor total de la carrera universitaria es: $%d" % (total))





