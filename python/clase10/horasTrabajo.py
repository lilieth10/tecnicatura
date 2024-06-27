# dadas las horas trabajadas de 5 personas 
# calcular el salario y sumatoria de todos los salarios

horas_trabajadas = [ 40, 25, 30, 35, 20]
tarifa_pago = 10
salarios = []

for horas in horas_trabajadas:
    salario = horas * tarifa_pago
    salarios.append(salario)

suma_salarios = sum(salarios)

print("salario de cada persona: ", salarios)
print("suma de los salarios: ", suma_salarios)