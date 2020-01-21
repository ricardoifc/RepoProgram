"""Lenguaje de programación: Python

Se desea generar una aplicación de venta de celulares.
Por cada celular si ingresa lo siguiente:
Marca:
Modelo:
Costo:
Pais de origen:

Se ingresan tantos celulares como quiere el usuario.

Se debe imprimir el siguiente reporte al final del proceso de ingreso de datos:

Listado de Celulares Vendidos:

Celular 1:
Marca:
Modelo:
Costo:
País de origen


Celular n:
Marca:
Modelo:
Costo:
País de origen

Total de celulares vendidos: $


Tomar en consideración las siguientes observaciones:
- Los celulares de marca huawei no pueden ser ingresados. (Debe genear un excepción personalizada que maneje el evento)
- Los celulares de paises como (EEUU, China) no pueden ser ingresados. (Debe genear un excepción personalizada que maneje el evento)
- Si al momento de ingresar el costo, se ingresa un valor NO numérico debe capturar la exepción. (Debe usar una excepción propia del lenguaje de programación)
"""
from excepciones.excepciones import MarcaError, PaisError, CostoError
band = True
c = 0
cad = "Listado de celulares vendidos"
while(band == True): # adentro de el ciclo tendremos el proceso
	try:
	    marca = input("Marca: \n") # pedir la marca de celular
	    marca = marca.lower()
	    costo = input("Costo : \n") # pedir el costo del celular
	    modelo = input("Modelo: \n") # pedir el modelo del celular
	    modelo = modelo.lower()
	    costo = float(costo) # convertir el costo a float
	    pOrigen = input("Pais de origen: \n") # pedir el origen del celular
	    pOrigen = pOrigen.lower()
	    
	    if (marca == "huawei"):
	    	# verificamos si el modelo es huawei
	        raise MarcaError("Error al ingresar la marca")
	        # un raise para el error de la marca
	        marca = input("Marca: \n") # pedimos nuevamente la marca
	    if (pOrigen == "eeuu") or (pOrigen == "china"):
	    	# verificamos si el pais es de eeuu o china
	        raise PaisError("Error al ingresar el pais")
	        # un raise para el error de el pais
	        pOrigen = input("Pais Origen: \n")
	        #pedimos el pais
	    c += 1 # el contador incrementa
	    cad = ("%s\ncelular %d\nMarca: %s\nModelo: %s\nCosto: %.2f\n\nPais de \
	    	origen: %s\n"%
	    	(cad, c, marca, modelo, costo, pOrigen)) # ponemos en la cadena
	    b = input("Ingrese si (s) desea mas datos o (n) para continuar")
	    # pedimos si quiere seguir o no
	    if(b == "s"): # comrpobamos la eleccion
	    	band = True
	    else:
	    	band = False

	except MarcaError as ex: # primer error de la marca
		print("Algo paso en el programa (MarcaError)\n")
		print(ex)
		print(type(ex))

	except PaisError as ex: # segundo error de la pais
		print("Algo paso en el programa (PaisError)\n")
		print(ex)
		print(type(ex))

	except CostoError as ex: # tercer errir de costo
		print("Algo paso en el programa (CostoError)\n")
		print(ex)
		print(type(ex))
		##imrpimimos el total de celulares totales
print("%s\n Total de celulares vendidos: %d" %(cad, c))