// obtener beca, requisitos: tener entre 18 y 25 años, ser de México y tener un promeddio mayor a 8.5
const estudiante = {
    edad: 25,
    pais: "México",
    promedio: 8.7
}

let monto;

function mandarCorreo() {
    console.log()
}

if (estudiante.edad >= 18  && estudiante.edad <= 25 && estudiante.pais === "México" && (estudiante.promedio>= 8.5 && estudiante.promedio <= 10.0)) {
    monto = 10000.00
} else {
    monto = 0;
}

function tieneEdadRequerida(edad) {
    return edad >= 18 && edad <= 25;
}

function esMexicano(pais) {
    return pais === "México";
}

function tienePromedioRequerido(promedio) {
    return promedio >= 8.0 && promedio <= 10.0;
}

function esAcreedor(estudiante) {
    return  tieneEdadRequerida(estudiante.edad) && esMexicano(estudiante.pais) && tienePromedioRequerido(estudiante.promedio)
}

if (esAcreedor(estudiante)) {
    monto = 10000.00
} else {
    monto = 0;
}
