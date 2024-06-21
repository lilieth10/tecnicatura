#4.5 Operadores Lógicos
a = True
b = True
resultado = a and b
print(resultado)

#Operador or

resultado = a or b 
print(resultado)


#Operandor Not
resultado = not a  
print(resultado)

# 4.6 Valor dentro de un rango

valor = int(input ("Digite un numero entre 0 y 5: "))
valorMin = 0
valorMax = 5
dentroRango = (valor >= valorMin and valor <= valorMax)
if dentroRango:
    print(f"el valor {valor} esta dentro del rango")
else: 
    print(f"el valor {valor} No esta dentro del rango")


    #4.7 Operadores or y not

    vacaciones = True
    diaDescanso = True
    if not (vacaciones or diaDescanso):
        print("Tiene trabajo que hacer")
    else:
        print("Puede asistir al juego")


#4.8 Ejercicio: Rango entre 20 y 30 años
#Sintaxis simplificada del operador And


edad = int(input ("Digite su edad: "))


if (edad >= 20 and edad < 30) or (edad >= 30 and edad < 40):
    print("Estas dentro del rango de los 20 a los 30 años")
else: 
    print("No estas dentro del rango de los 20 a los 30 años")


# Ejercicio1: El mayor de 2 numeros
numero1 = int(input(" Digite el valor para el numero1: "))
numero2 = int(input(" Digite el valor para el numero2: "))
if numero1 > numero2: 
    print("El numero 1 es mayor")
else: 
    print("El numero2 es mayor")

    #Libros
    
    # Ejercicio: Tienda de libros
print('Digite los siguientes datos del libro')
nombre = input('Digite el nombre del libro: ')
id = int(input('Digite el ID del libro: '))
precio = float(input('Digite el precio del libro: '))
envioGratuito = input('Indicar si el libro es gratuito (True/False): ')

if envioGratuito == 'True':
    envioGratuito = True
elif envioGratuito == 'False':
    envioGratuito = False
else:
    envioGratuito = 'El valor es incorrecto, debe escribir True/False'

print(f'Nombre del libro: {nombre}')
print(f'ID del libro: {id}')
print(f'Precio del libro: {precio}')
print(f'Envío gratuito: {envioGratuito}')