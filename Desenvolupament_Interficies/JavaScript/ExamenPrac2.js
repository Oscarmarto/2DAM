// 🔹 1. Aumentar precios
// Dado el array, usa .map() para subir un 10% el precio de cada producto.
console.log("------------------------ Ej 1 -----------------------");
const productos = [
  { nom: "Camiseta", preu: 20 },
  { nom: "Pantalons", preu: 35 },
  { nom: "Sabates", preu: 50 }
];

const subidaPrecio = () => {
    const nuevoPrecio = productos.map(elem => elem.preu * 1.10);
    return nuevoPrecio;
}

console.log(subidaPrecio());
// 🔹 2. Filtrar aprobados
// Usa .filter() para quedarte solo con los alumnos que tengan nota >= 5.
console.log("------------------------ Ej 2 -----------------------");
const alumnes2 = [
  { nom: "Joan", nota: 8 },
  { nom: "Pau", nota: 4 },
  { nom: "Laura", nota: 6 }
];

const aprobats = () => {
    const apro = alumnes2.filter(elem => elem.nota > 5)
    return apro;
}

console.log(aprobats())
// 🔹 3. Promedio de precios
// Calcula la media de precios de los productos usando .reduce().
console.log("------------------------ Ej 3 -----------------------");
const preus = [10, 20, 30, 40, 50];

const promedio = () => {
    const preciosmedia = preus.reduce((acum, elem) => acum = acum + elem, 0)
    return preciosmedia/preus.length;
}

console.log(promedio())

// 🔹 4. Nombre completo
// Usa .map() para crear un array de strings con "nom + cognom".
console.log("------------------------ Ej 4 -----------------------");
const persones = [
  { nom: "Maria", cognom: "López" },
  { nom: "Pere", cognom: "García" },
  { nom: "Anna", cognom: "Martí" }
];

const nomCognom = () => {
    const nomComplet = persones.map(elem => elem.nom + " " + elem.cognom);
    return nomComplet;
}

console.log(nomCognom());
// 🔹 5. Números mayores que la media
// Calcula la media con .reduce() y luego usa .filter() para quedarte con los números que estén por encima.
console.log("------------------------ Ej 5 -----------------------");
const nums = [3, 5, 7, 10, 15, 20];

const mayorMedia = () => {
    const totales = nums.reduce((acum, num) => acum + num, 0);
    const media = totales/nums.length;

    const mayor = nums.filter(num => num > media)
    return mayor
}

console.log(mayorMedia())

// 🔹 6. Lista de películas largas
// Filtra las películas con duración > 120 min y devuelve solo los títulos usando .filter() y .map().
console.log("------------------------ Ej 6 -----------------------");
const pelicules = [
  { titol: "Inception", duracio: 148 },
  { titol: "Toy Story", duracio: 95 },
  { titol: "Interstellar", duracio: 169 }
];

const tituloMas120 = () => {
    const titulos = pelicules.filter(elem => elem.duracio > 120).map(elem => elem.titol)
    return titulos
}

console.log(tituloMas120())

// 🔹 7. Agrupar edades
// Usa .reduce() para devolver un objeto con cuántas personas hay por rango de edad:
// { joves: X, adults: Y, majors: Z }
console.log("------------------------ Ej 7 -----------------------");
const gent = [
  { nom: "Pau", edat: 17 },
  { nom: "Marta", edat: 25 },
  { nom: "Josep", edat: 42 },
  { nom: "Clara", edat: 15 },
  { nom: "Anna", edat: 61 }
];


const agruparEdats = () => {
  return gent.reduce((acum, persona) => {
    if (persona.edat < 18) {
      acum.joves += 1;
    } else if (persona.edat < 60) {
      acum.adults += 1;
    } else {
      acum.majors += 1;
    }
    return acum;
  }, { joves: 0, adults: 0, majors: 0 }); // valor inicial
}

console.log(agruparEdats())
// 🔹 8. Palabras más largas de 5 letras
// Usa .filter() para quedarte con las palabras largas y .map() para pasarlas a mayúsculas.
console.log("------------------------ Ej 8 -----------------------");
const paraules = ["hola", "ordinador", "gat", "univers", "taula"];

const masLargas = () => {
  const larga = paraules.filter(elem => elem.length > 5).map(elem => elem.toUpperCase())
  return larga
}

console.log(masLargas())
// 🔹 9. Total de ventas
// Usa .reduce() para sumar el total (preu * unitats) de todos los productos.
console.log("------------------------ Ej 9 -----------------------");
const vendes = [
  { producte: "Cafè", preu: 2, unitats: 10 },
  { producte: "Te", preu: 1.5, unitats: 5 },
  { producte: "Cacau", preu: 3, unitats: 8 }
];

const totalPreu = () => {
  const total = vendes.reduce((acum, elem) => acum = (elem.preu * elem.unitats) + acum, 0)
  return total
}


console.log(totalPreu())
// 🔹 10. Fusionar listas de nombres
// Dado un array con arrays de nombres, usa .reduce() para obtener un único array plano.
console.log("------------------------ Ej 10 -----------------------");
const nomsArrays = [
  ["Anna", "Pau"],
  ["Marc"],
  ["Joan", "Clara"]
];

const llistaNoms = () => {
  const noms = nomsArrays.reduce((acum, elem) => acum.concat(elem) , [])
  return noms
}

console.log(llistaNoms())