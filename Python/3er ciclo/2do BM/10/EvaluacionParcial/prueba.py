"""
    @ricardoifc
    - Prueba Parcial
"""
# importo las librearias
import csv
import pandas as pd
from functools import reduce
from itertools import *
data = pd.read_csv("Listado-Instituciones-Educativas-dos.csv",sep='|')
data_record = data.to_dict("records")
# print(data_record)
# print(data_record[1]['Número de estudiantes'])
# obtengo una lista con diccionarios por cada provincia
provinciaDic =  list(map(lambda x: [x[0], list(x[1])], groupby(data_record,\
 lambda x: x['Provincia'])))

# print(provinciaDic)
# - El NumeroEstudiantes por Provincia
estPorProv = list(map(lambda x:[x[0], sum(list(map(lambda x: list(x.items())\
	[5][1], x[1])))] ,provinciaDic))
print("Estudiante por Provincia: ", estPorProv)

# - El NumeroDocentes por Provincia
docPorProv = list(map(lambda x:[x[0], sum(list(map(lambda x: list(x.items())\
	[6][1], x[1])))] ,provinciaDic))
print("Docente por Provincia: ", docPorProv)

# # obtengo una lista con diccionarios por cada Cantón
cantonDic = list(map(lambda x: [x[0], list(x[1])], groupby(data_record,\
 lambda x: x['Cantón'])))

# - El NumeroEstudiantes por Cantón
estPorCan = list(map(lambda x:[x[0], sum(list(map(lambda x: list(x.items())\
	[5][1], x[1])))] ,cantonDic))
print("Estudiante por Canton: ", estPorCan)

# - El NumeroDocentes por Cantónn
docPorCan = list(map(lambda x:[x[0], sum(list(map(lambda x: list(x.items())\
	[6][1], x[1])))] ,cantonDic))
print("Docente por Canton: ", docPorCan)

# - Cantones de provincia de Zamora Chinchipe ordenados por número de docentes
# print(provinciaDic[2][1])
#print(provinciaDic[2][1][10]['Número de docentes'])
# print(provinciaDic[2][1])
ordenZamDocCanton = list(sorted(provinciaDic[2][1], key = lambda x: x['Número de docentes']))
# print(ordenZamDocCanton)

# - Cantones de provincia de Loja ordenados por número de estudiantes
# print(provinciaDic[1][1])
ordenLojEstCanton = list(sorted(provinciaDic[1][1], key = lambda x: x['Número de estudiantes']))
print(ordenLojEstCanton)

# - Cantones de provinncia de El Oro, ordenados por número de estudiantes
# print(provinciaDic[0][1])
ordenElOEstCanton = list(sorted(provinciaDic[0][1], key = lambda x: x['Número de estudiantes']))
# print(ordenElOEstCanton)