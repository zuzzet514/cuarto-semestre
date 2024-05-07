// descuento
const transeunte = {condicion: "embarazada", escolaridad: "superior"};
let monto = 34;

function porcentajeDescuentoo() {
    if (transeunte.condicion === "embarazada") {
        return 0.3
    }
    if (transeunte.condicion === "tercera edad") {
        return 0.3
    }

    if (transeunte.condicion === "niño") {
        return 0.3
    }

    if (transeunte.condicion === "discapacidad") {
        return 0.3
    }

    if (transeunte.escolaridad === "superior") {
        return 0.2
    }
}

porcentajeDescuentoo();

// una sola expresion
function aplicaDescuentoCondicion(condicion) {
    let opciones = ["embarazada", 'niño', 'discapacidad'];
    if (opciones.includes(condicion)) {
        return true;
    }
}

function porcentajeDescuento() {
    if (aplicaDescuentoCondicion()) {
        return 0.2
    }

    if (transeunte.escolaridad === "superior") {
        return 0.3
    }
}
function funcionDeRelleno() {}

// ej 3
let monto = 500;
let mandarCorreo =  function () {}

if (aplicaDescuentoCondicion()) {
    monto = monto - (monto * porcentajeDescuento())
    mandarCorreo(monto);
} else {
    mandarCorreo(monto)
    funcionDeRelleno()
}

if (aplicaDescuentoCondicion()) {
    monto = monto - (monto * porcentajeDescuento())
} else {
    funcionDeRelleno()
}
mandarCorreo(monto)
