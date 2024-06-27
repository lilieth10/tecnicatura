n = int(input("Ingrese la cantidad de numeros enteros: "))

#iniciar contadores y sumas
suma_pares = 0
cantidad_pares = 0
suma_impares = 0
cantidad_impares = 0

#iniciar bucle
for _ in range(n):
    #obtener numero
    numero = int(input("Ingrese un numero entero: "))
    #verificar si es par o impar
    if numero % 2 == 0:
        #sumar y contar pares
        suma_pares += numero
        cantidad_pares += 1
    else:
#sumar y contar impares
        suma_impares += numero
        cantidad_impares += 1

if cantidad_impares > 0:
    #calcular promedio de impares
    promedio_impares = suma_impares / cantidad_impares
else:
    promedio_impares = 0

print(f"Suma de los numeros pares: {suma_pares}")
print(f"cantidad de numeros pares: : {cantidad_pares}")
print(f"promedio de los numeros impares: {promedio_impares}")

