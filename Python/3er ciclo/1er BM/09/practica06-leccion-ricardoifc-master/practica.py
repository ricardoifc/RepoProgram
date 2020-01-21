"""
	@ricardoifc
	Practica
"""
# importo libreria csv
import csv
# con el csv.reader delimito la "," para separarlos en cada linea
def lineas(archivo):
	return csv.reader(archivo, delimiter=",")

with open("TechCrunchcontinentalUSA.csv") as midata:

	print("Filtrar los registros que pertenecen a la compañia Youtube")
	# abrimos el archivo csv, los pongo en mi variable lista1
	# para aplicar un filtro 
	# en la posicion 1 todo los que sean nombre "YouTube"
	lista1 = list(lineas(midata))
	print(list(filter(lambda x: x[1] == "YouTube", lista1)))\

	print("Presentar un listado mapeado")
	# primero debo obtener la web , uso un map donde uno mi cadena
	# y la pongo en una lista, filtrando la primera que es permalink
	web = list(map(lambda x: "www.%s.com" % (x),list(map(lambda x: x[0], \
		list(filter(lambda x: x[0] != "permalink", lista1))))))
	# print(web)
	# eje1 = list(map(lambda x: x[3],list(filter(lambda x: x[3] != "category", lista1))))
	# eje2 = list(map(lambda x: x[8],list(filter(lambda x: x[8] != "raisedCurrency", lista1))))

	# en un map uno en una sola cadena 2 variables obtenidas por un lambda donde filtro 
	# la palabra category y raisedCurrency 
	usd = list(map(lambda x,y: "%s-%s" % (x,y),list(map(lambda x: x[3], \
		list(filter(lambda x: x[3] != "category", lista1)))), \
		list(map(lambda x: x[8],list(filter(lambda x: x[8] != "raisedCurrency", \
		lista1))))))
	# en una lista uso un zip para web y usd 
	resultado = list(zip(web,usd))
	print(resultado)
