// 1️⃣ A partir d'un array d'objectes amb nom i edat, torna un array només amb els noms de les persones menors de 18 anys
console.log("------------------------ Ej 1 -----------------------");
let personesEdat = [
  { nom: "Marc", edat: 15 },
  { nom: "Clara", edat: 22 },
  { nom: "Joan", edat: 17 },
  { nom: "Anna", edat: 20 }
];

const majorsEdat = () => {
    return personesEdat.filter(elem => elem.edat > 18).map(elem => elem.nom)
}

console.log(majorsEdat())
// Resultat esperat: ["Marc", "Joan"]

// 2️⃣ A partir d'un array d'objectes amb producte i quantitat, calcula el total de productes amb .reduce()
console.log("------------------------ Ej 2 -----------------------");
let estoc = [
  { producte: "Llibre", quantitat: 3 },
  { producte: "Llapis", quantitat: 10 },
  { producte: "Goma", quantitat: 5 }
];

const totalObjectes = () => {
    return estoc.reduce((acum, elem) => acum + elem.quantitat, 0)
}

console.log(totalObjectes())
// Resultat esperat: 18

// 3️⃣ A partir d'un array d'objectes amb nom i puntuació, mostra en consola "Nom té PUNTS punts" per a cadascun
console.log("------------------------ Ej 3 -----------------------");
let jugadors = [
  { nom: "Leo", punts: 12 },
  { nom: "Marta", punts: 20 },
  { nom: "Nil", punts: 15 }
];

const puntsNom = () => {
    return jugadors.map(elem => elem.nom + " te " + elem.punts + " punts");
}

console.log(puntsNom())
// Resultat esperat:
// Leo té 12 punts
// Marta té 20 punts
// Nil té 15 punts

// 4️⃣ A partir d'un array d'objectes amb nom i salari, crea un array amb el doble del salari
console.log("------------------------ Ej 4 -----------------------");
let empleats = [
  { nom: "Sara", salari: 1000 },
  { nom: "Joan", salari: 2000 },
  { nom: "Pere", salari: 1500 }
];

const dobleSalario = () => {
    return empleats.map(elem => elem.salari*2)
}

console.log(dobleSalario())

// Resultat esperat: [2000, 4000, 3000]

// 5️⃣ A partir d'un array d'objectes amb ciutat i habitants, filtra només les ciutats amb més de 100.000 habitants
console.log("------------------------ Ej 5 -----------------------");
let ciutats = [
  { ciutat: "Barcelona", habitants: 1600000 },
  { ciutat: "Girona", habitants: 100000 },
  { ciutat: "Figueres", habitants: 45000 }
];

const majorHabitants = () => {
    return ciutats.filter(elem => elem.habitants >= 100000)
}

console.log(majorHabitants())
// Resultat esperat: [{ciutat: "Barcelona", ...}, {ciutat: "Girona", ...}]

// 6️⃣ A partir d'un array d'objectes amb nom i tecnologia, torna un array amb només els noms de les persones que saben "JavaScript"
console.log("------------------------ Ej 6 -----------------------");
let programadors = [
  { nom: "Anna", tecnologia: "Python" },
  { nom: "Marc", tecnologia: "JavaScript" },
  { nom: "Lidia", tecnologia: "JavaScript" }
];

const javaScript = () => {
    return programadors.filter(elem => elem.tecnologia === "JavaScript" ).map(elem => elem.nom)
}

console.log(javaScript())
// Resultat esperat: ["Marc", "Lidia"]

// 7️⃣ A partir d'un array d'objectes amb id i títol, crea un objecte on cada id siga clau i el títol el valor
console.log("------------------------ Ej 7 -----------------------");
let llibres = [
  { id: 1, titol: "El Quijote" },
  { id: 2, titol: "1984" },
  { id: 3, titol: "La Sombra del Viento" }
];

const cambioObjeto = () => {
    return llibres.reduce((acum, elem ) => {acum[elem.id] = elem.titol; return acum ;}, {})
}

console.log(cambioObjeto())
// Resultat esperat: {1: "El Quijote", 2: "1984", 3: "La Sombra del Viento"}

// 8️⃣ A partir d'un array d'objectes amb producte i preu, torna un array amb només els productes més barats de 20 €
console.log("------------------------ Ej 8 -----------------------");
let ofertes = [
  { producte: "Bolígraf", preu: 2 },
  { producte: "Auriculars", preu: 45 },
  { producte: "Llibre", preu: 15 }
];
// Resultat esperat: ["Bolígraf", "Llibre"]

// 9️⃣ A partir d'un array d'objectes amb usuari i correu, torna un array amb els usuaris que tenen correu electrònic que acaba amb ".com"
console.log("------------------------ Ej 9 -----------------------");
let clients = [
  { usuari: "Pau", correu: "pau@gmail.com" },
  { usuari: "Carla", correu: "carla@yahoo.es" },
  { usuari: "Oriol", correu: "oriol@outlook.com" }
];
// Resultat esperat: [{usuari: "Pau", ...}, {usuari: "Oriol", ...}]

// 🔟 A partir d'un array d'objectes amb frase i autor, torna un sol string amb totes les frases concatenades separades per punt i espai
console.log("------------------------ Ej 10 -----------------------");
let citacions = [
  { frase: "El saber és poder", autor: "Francis Bacon" },
  { frase: "La vida és curta", autor: "Proverbi" },
  { frase: "Carpe diem", autor: "Horaci" }
];
// Resultat esperat: "El saber és poder. La vida és curta. Carpe diem"