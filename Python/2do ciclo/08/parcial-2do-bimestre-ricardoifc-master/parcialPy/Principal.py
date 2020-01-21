from excepciones.excepciones import añoFError, PaisError, CostoError
band = True
c = 0
cad = "Listado Matriculados Diarios\n"
valorT = 0.0
while(band == True): # adentro de el ciclo tendremos el proceso
	try:
	    añoF = input("Año de Fabricación: \n") # año de fabricacion
	    añoF = int (añoF) # convertir el año en int
	    pOrigen = input("País de Origen: \n") # pedir el origen del vehiculo
	    pOrigen = pOrigen.lower()
	    costo = input("Valor de Matrícula : \n") # valor de matricula
	    costo = float(costo) # convertir el costo a float
	    dueño = input("Nombre de dueño: \n")
	    
	    if (añoF >= 1980) and (añoF < 1990):
	    	# verificamos el año de fabricacion
	        raise añoFError("Este auto no puede ingresar")
	        # un raise para el error de la marca
	        marca = input("Marca: \n") # pedimos nuevamente la marca
	    if (pOrigen == "chile") or (pOrigen == "colombia"):
                # verificamos si el pais es de eeuu o china
                raise PaisError("Error al ingresar el pais")
                # un raise para el error de el pais
                pOrigen = input("Pais Origen: \n") 
                #pedimos el pais
	    if (costo > 1000.2):
	    	# verificamos si el valor es menor de 1000.2
	        raise costoError("El valor supera los 1000.2, no puede ingresar")
	    c += 1 # el contador incrementa
	    cad = ("%s\nAuto 0%d:\nAño de Fabricación: %d\nValor de Matrícula: " \
	    	"%.2f\nPaís de Origen: %s\nDueño: %s\n\n" %
	    	(cad, c, añoF, costo, pOrigen, dueño)) # ponemos en la cadena
	    b = input("Ingrese si (s) desea mas datos o (n) para continuar\n")
	    # pedimos si quiere seguir o no
	    if(b == "s"): # comrpobamos la eleccion
	    	band = True
	    else:
	    	band = False
	    valorT = costo + valorT
	# creamos excepciones para el programa
	except TypeError as ex:
		print("Algo pasó en el programa (TypeError)\n")
		print(ex)
		print(type(ex))
	except añoFError as ex:
		print("El año de fabricación es incorrecto (AñosFabricacionError)\n")
		print(ex)
		print(type(ex))
	except PaisError as ex:
		print("El pais de origen es incorrecto (PaisError)\n")
		print(ex)
		print(type(ex))
	except costo as ex:
		print("el valor de matricula excede los 1000.2 (ValorMatriculaError)\n")
		print(ex)
		print(type(ex))
	except Exception as ex:
		print("Algo paso en el programa (Exeption)\n")
		print(ex)
		print(type(ex))
# imrpimimos el total de celulares totales
print("%s\n Total de autos matriculados: %d\nTotal de valores de  matriculas \
del día: %.2f" %(cad, c, valorT))
