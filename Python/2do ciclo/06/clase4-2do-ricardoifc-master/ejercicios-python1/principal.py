"""
    @reroes
    Ejemplo de manejo de paquetes
"""

from paquete1.informacion import valores
from paquete1.informacion2 import hacer_potencia

for l in valores:
    r = hacer_potencia(l,2)
    print("Valor %d elevado a la potencia %d" \
          "es igual a %.0f" % (l, 2, r))
