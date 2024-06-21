function obtenerEstacion(fecha) {
    const mes = fecha.getMonth() + 1; // getMonth() devuelve 0 para enero, por eso sumamos 1
    const dia = fecha.getDate();

    if ((mes === 12 && dia >= 21) || mes <= 3 || (mes === 3 && dia < 21)) {
        return "Verano";
    } else if ((mes === 3 && dia >= 21) || mes <= 6 || (mes === 6 && dia < 21)) {
        return "Otoño";
    } else if ((mes === 6 && dia >= 21) || mes <= 9 || (mes === 9 && dia < 23)) {
        return "Invierno";
    } else if ((mes === 9 && dia >= 23) || mes <= 12 || (mes === 12 && dia < 21)) {
        return "Primavera";
    }
}

// Puedes ingresar la fecha manualmente si lo deseas, de lo contrario se usará la fecha actual
const inputFecha = prompt("Ingresa la fecha en formato YYYY-MM-DD (por ejemplo, 2024-06-10):");
const fecha = inputFecha ? new Date(inputFecha) : new Date();
const estacion = obtenerEstacion(fecha);

console.log(`La estación actual es: ${estacion}`);


//ejercicio2 calcule la hora del dia
function obtenerHoraActual(fecha) {
    return fecha.toLocaleTimeString([], {hour: '2-digit', minute:'2-digit'});
}

function obtenerMomentoDelDia(fecha) {
    const hora = fecha.getHours();

    if (hora >= 11 && hora < 14) {
        return "Es hora de la siesta";
    } else if (hora >= 14 && hora < 18) {
        return "Es hora del almuerzo";
    } else if (hora >= 18 && hora < 22) {
        return "Es hora de la cena";
    } else {
        return "Es otro momento del día";
    }
}

const fechaActual = new Date();
const horaActual = obtenerHoraActual(fechaActual);
const momentoDelDia = obtenerMomentoDelDia(fechaActual);

console.log(`${momentoDelDia} - La hora actual es: ${horaActual}`);