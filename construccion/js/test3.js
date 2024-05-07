let bandera = true
let numero = 0;

function hacerAlgoBien() {
    while (true) {
        if (numero === 8) {
            console.log(numero + ", ya casi")
        } else if(numero  === 10) {
            console.log(numero + " ¡terminamos!")
            return
        } else {
            console.log(numero)
        }
        numero++
    }
}

function hacerAlgo() {
    while (bandera) {
        if (numero === 8) {
            console.log(numero + ", ya casi")
        } else if(numero  === 10) {
            console.log(numero + " ¡terminamos!")
            bandera = false
        } else {
            console.log(numero)
        }
        numero++
    }
}

hacerAlgoBien()
hacerAlgo()
