# Ciclo while (Mientras o durante)
contador = 0
while contador < 3:
  print('Ejecutamos nuestro ciclo while ', contador)
  contador += 1
else:
  print('Fin del ciclo while')


# Imprimir números del 0 al 5 con el ciclo while
maximo = 5
contador = 0
while contador <= maximo:
  print(contador)
  contador += 1


  #Ciclo for
cadena = 'Hello'
for letra in cadena:
    print(letra)
else:
    print('Fin del ciclo for')


#For, palabra break y continue

for letra in "Alemania":
    if letra == "a":
        print(f"letra encontrada: {letra} ") 
        break
else:
        print("Fin del ciclo")




 # Palabra reservada continue
for i in range(6):
    if i % 2 == 0:
        print(f'Valor: {i}')
for i in range(6):
    if i % 2 != 0:
        continue
    print(f'Valor: {i}')