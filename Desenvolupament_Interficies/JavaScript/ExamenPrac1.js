// 🔹 1. Calcular cuadrados
// Dado este array, crea un nuevo array con el cuadrado de cada número usando .map()
console.log("------------------------ Ej 1 -----------------------");
const nums1 = [2, 4, 6, 8];

const calculCuadrado = () => {
  return nums1.map(elem => elem * elem)
}

console.log(calculCuadrado());

// 🔹 2. Números pares
// Dado este array, crea un nuevo array con solo los números pares usando .filter()
console.log("------------------------ Ej 2 -----------------------");
const nums2 = [1, 2, 3, 4, 5, 6, 7];

const soloPares = () => {
  return nums2.filter(elem => elem % 2 === 0)
}

console.log("Numero pares " + soloPares());

// 🔹 3. Suma de múltiplos de 3
// Dado este array, calcula la suma de todos los múltiplos de 3 usando .reduce()
console.log("------------------------ Ej 3 -----------------------");
const nums3 = [3, 5, 6, 9, 11, 12];

const sumaMulTres = () => {
    const pares = nums3.reduce((suma, num) => {
      if(num % 3 === 0){
        suma += num
      }
      return suma;
    }, 0)
    return pares;
}

console.log(sumaMulTres())
// 🔹 4. Treure només noms
// Dado este array de alumnos, crea un array solo con los nombres usando .map()
console.log("------------------------ Ej 4 -----------------------");
const alumnes = [
  { nom: "Marta", edat: 21 },
  { nom: "Pau", edat: 19 },
  { nom: "Sofia", edat: 25 }
];

const solsNom = () => {
  return alumnes.map(elem => elem.nom)
}

console.log(solsNom());

// 🔹 5. Alumnos mayores de 20
// Dado el array anterior, filtra los alumnos que tengan más de 20 años usando .filter()
console.log("------------------------ Ej 5 -----------------------");
const majors20 = () => {
  return alumnes.filter(elem => elem.edat > 20)
}

console.log(majors20());

// 🔹 6. Media de edades
// Calcula la media de edades de los alumnos usando .reduce()
console.log("------------------------ Ej 6 -----------------------");
const mitjaEdad = () => {
  const media = alumnes.reduce((acum, edat) => {
    return acum + edat.edat;
  }, 0 )

  const mitja = media/alumnes.length; 
  return mitja.toFixed(2);
}

console.log(mitjaEdad())

// 🔹 7. Transformar libros
// Dado este array de libros, crea un array con strings del tipo:
// "El senyor dels anells - Tolkien (1200 pàgines)" usando .map()
console.log("------------------------ Ej 7 -----------------------");
const llibres = [
  { titol: "El senyor dels anells", autor: "Tolkien", pagines: 1200 },
  { titol: "1984", autor: "Orwell", pagines: 300 },
  { titol: "El petit príncep", autor: "Exupéry", pagines: 100 }
];

const transformar = () => {
  return llibres.map(elem => `${elem.titol} - ${elem.autor} (${elem.pagines} pàgines)`)
}

console.log(transformar())
// 🔹 8. Autores con libros de más de 200 páginas
// Filtra los libros con más de 200 páginas y devuelve un array con los nombres de los autores usando .filter() y .map()
console.log("------------------------ Ej 8 -----------------------");

const librosMas200 = () => {
  const infoLibros = llibres.filter(elem => elem.pagines > 200).map(elem => elem.autor)
  return infoLibros
}

console.log(librosMas200())

// 🔹 9. Total de páginas
// Calcula el total de páginas de todos los libros usando .reduce()
console.log("------------------------ Ej 9 -----------------------");

const totalPagina = () => {
  const cantidad = llibres.reduce((acum, elem) => 
    acum = elem.pagines + acum
  , 0)
  console.log(`Total de pagines  ${cantidad}`)
}

totalPagina();

// 🔹 10. Lista de productos comprados
// Dado este array de comandes, crea un único array con todos los productos de todas las comandes usando .map() y .reduce()
console.log("------------------------ Ej 10 -----------------------");
const comandes = [
  { client: "Anna", productes: ["Poma", "Plàtan"] },
  { client: "Joan", productes: ["Taronja"] },
  { client: "Marta", productes: ["Raïm", "Pera"] }
];

const comandas = () => {
  const compra = comandes.map(elem => elem.productes).reduce((acum, fruta) => acum.concat(fruta), [])
  return compra;
}

console.log(comandas())

// 8️⃣ A partir de un array de pedidos, devuelve un array de objetos con cliente y nombre del producto.
// Usa map() y un map() anidado.
console.log("-------------------------------------");
let pedidos = [
    { cliente: "Juan", productos: [{ nombre: "Pan" }, { nombre: "Leche" }] },
    { cliente: "Lucía", productos: [{ nombre: "Huevos" }, { nombre: "Queso" }] }
];

const seteadora = () => {
  return pedidos.map(elem => ({
    cliente : elem.cliente,
    productos : elem.productos.map(elem => elem.nombre)
  })
)}

console.log(seteadora())