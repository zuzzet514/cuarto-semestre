// obtener beca, requisitos: tener entre 18 y 25 años, ser de México y tener un promeddio mayor a 8
const estudiante = {
    edad: 25,
    pais: "México",
    promedio: 8.7
}

function mandarCorreo() {
    console.log()
}

if (estudiante.edad >= 18  && estudiante.edad <= 25 && estudiante.pais === "México" && (estudiante.promedio>= 8.0 && estudiante.promedio <= 10.0)) {
    console.log("¡Obtuviste la beca! :D")
} else {
    console.log("No obtuviste la beca :(")
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
    console.log("Eres acreedor de la beca")
} else {
    console.log("No eres acreedor")
}