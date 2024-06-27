// //let days =['Lunes','Martes','Miercoles' ,'Jueves', 'Vienres', 'Sabado', 'Domingo'];

// let days = 1;
// switch(days){
//     case 1:
//         console.log("Hoy es lunes" );
//         break;
//     case 2:
//         console.log("Hoy es martes" );
//         break;
//     case 3:
//         console.log("Hoy es miercoles" );
//         break;
//     case 4:
//         console.log("Hoy es jueves" );
//         break;
//     case 5:
//         console.log("Hoy es viernes" );
//         break;
//     case 6:
//         console.log("Hoy es sabado");
//         break;
//     case 7:
//         console.log("Hoy es domingo" );
//         break;
//     default:
//         break;
// }



// // esta es la opcion mejorada
// let days2 =['Lunes','Martes','Miercoles' ,'Jueves', 'Vienres', 'Sabado', 'Domingo'];
// function getday(n){
//     if(n<1 || n >7){
//         throw new error ('out of range');
//     }
//     return days2[n-1];
// }

// console.log(getday(5));


// // hacer un ejercicio similar al que esta hecho, pero ahora con los
// //meses del año , debes hacerlo con la estructura switch y luego
// //con la funcion en la opcion mejorada

// let month = 11;
// switch(month){
//     case 1:
//         console.log("Es enero");
//         break;
//     case 2:
//         console.log("Es febrero");
//         break;
//     case 3:
//         console.log("Es marzo");
//         break;
//     case 4 :
//         console.log("Es abril");
//         break;
//     case 5:
//         console.log("Es mayo");
//         break;
//     case 6:
//         console.log("Es junio");
//         break;
//     case 7:
//         console.log("Es julio");
//         break;
//     case 8:
//         console.log("Es agosto");
//         break;
//     case 9:
//         console.log("Es septiembre");
//         break;
//     case 10:
//         console.log("Es octubre");
//         break;
//     case 11:
//         console.log("Es noviembre");
//         break;
//     case 12:
//         console.log("Es diciembre");
//         break;
//     default:
//         console.log ("Error en el ingreso del mes del año");
//         break;
// }

// esta es la opcion mejorada

let Month2 = ['Enero','Febrero','Marzo' ,'Abril', 'Mayo', 'Junio', 'Julio' , 'Agosto','Septiembre','Octubre', 'Noviembre','Diciembre'];
function getMonth(n){
    if(n < 1 || n > 12){
        throw new error("out of range");
    }
    return Month2[n-1];
}

console.log(getMonth(3));