// 1️⃣ A partir d'un array d'objectes amb alumnes i les seves notes, torna un array amb els noms dels alumnes que tenen una mitjana ≥ 7
console.log("------------------------ Ej 1 -----------------------");
let alumnes = [
  { nom: "Anna", notes: [8, 6, 7] },
  { nom: "Pere", notes: [5, 6, 6] },
  { nom: "Laura", notes: [9, 8, 10] }
];

const mitjaSuperior7 = () => {
  return alumnes
    .filter(alumne => {
      // Calculamos la media de las notas
      const mitja =
        alumne.notes.reduce((acum, nota) => acum + nota, 0) /
        alumne.notes.length;
      return mitja >= 7;
    })
    .map(alumne => alumne.nom); // devolvemos solo los nombres
};

console.log(mitjaSuperior7())

// Resultat esperat: ["Anna", "Laura"]

// 2️⃣ A partir d'un array d'objectes amb empleats i projectes amb hores treballades, calcula les hores totals de tots els empleats
console.log("------------------------ Ej 2 -----------------------");
let empleatsProjectes = [
  { nom: "Marc", projectes: [{ nom: "A", hores: 5 }, { nom: "B", hores: 10 }] },
  { nom: "Sara", projectes: [{ nom: "A", hores: 8 }, { nom: "C", hores: 7 }] }
];

const totalHoras = () => {
    const hores = empleatsProjectes.reduce((acum, horesTotal) => acum + horesTotal.projectes.reduce((acum, hora) => acum += hora.hores, 0), 0 )
    return hores;
}

console.log(totalHoras())

// Resultat esperat: 30

// 3️⃣ A partir d'un array d'objectes amb clients i compres, torna un array amb els noms dels clients que han gastat més de 50 €
console.log("------------------------ Ej 3 -----------------------");
let clientsCompres = [
  { nom: "Joan", compres: [{ producte: "Llibre", preu: 20 }, { producte: "Llapis", preu: 5 }] },
  { nom: "Clara", compres: [{ producte: "Auriculars", preu: 60 }] },
  { nom: "Nil", compres: [{ producte: "Motxilla", preu: 55 }] }
];
// Resultat esperat: ["Clara", "Nil"]

// 4️⃣ A partir d'un array d'objectes amb alumnes i assignatures, crea un array amb els noms de totes les assignatures (sense duplicats)
console.log("------------------------ Ej 4 -----------------------");
let estudiants = [
  { nom: "Pau", assignatures: ["Matemàtiques", "Física"] },
  { nom: "Marta", assignatures: ["Física", "Química"] },
  { nom: "Leo", assignatures: ["Matemàtiques", "Biologia"] }
];
// Resultat esperat: ["Matemàtiques", "Física", "Química", "Biologia"]

// 5️⃣ A partir d'un array d'objectes amb equips i jugadors, filtra els equips amb més de 3 jugadors
console.log("------------------------ Ej 5 -----------------------");
let equips = [
  { equip: "Barça", jugadors: ["Leo", "Xavi", "Piqué", "Busquets"] },
  { equip: "Madrid", jugadors: ["Benzema", "Modric"] }
];
// Resultat esperat: [{equip: "Barça", jugadors: [...] }]

// 6️⃣ A partir d'un array d'objectes amb llibre i ressenyes, calcula la puntuació mitjana de cada llibre
console.log("------------------------ Ej 6 -----------------------");
let llibresRessenya = [
  { titol: "1984", ressenyes: [5, 4, 5] },
  { titol: "El Quijote", ressenyes: [4, 4, 4] }
];
// Resultat esperat: [{titol: "1984", mitjana: 4.67}, {titol: "El Quijote", mitjana: 4}]

// 7️⃣ A partir d'un array d'objectes amb restaurants i menús, torna un array amb els noms dels restaurants que tenen algun plat més car de 30 €
console.log("------------------------ Ej 7 -----------------------");
let restaurants = [
  { nom: "La Bella", menu: [{ plat: "Pizza", preu: 25 }, { plat: "Risotto", preu: 35 }] },
  { nom: "El Gourmet", menu: [{ plat: "Pasta", preu: 20 }] }
];
// Resultat esperat: ["La Bella"]

// 8️⃣ A partir d'un array d'objectes amb estudiants i els seus cursos amb nota final, torna un array amb els estudiants que han aprovat tots els cursos
console.log("------------------------ Ej 8 -----------------------");
let estudiantsCursos = [
  { nom: "Marc", cursos: [{ curs: "Matemàtiques", nota: 7 }, { curs: "Física", nota: 6 }] },
  { nom: "Clara", cursos: [{ curs: "Matemàtiques", nota: 5 }, { curs: "Física", nota: 4 }] }
];
// Resultat esperat: ["Marc"]

// 9️⃣ A partir d'un array d'objectes amb clients i les seves compres, calcula el total de diners gastats per cada client
console.log("------------------------ Ej 9 -----------------------");
let compresClients = [
  { nom: "Pau", compres: [{ producte: "Llibre", preu: 15 }, { producte: "Llapis", preu: 5 }] },
  { nom: "Laura", compres: [{ producte: "Auriculars", preu: 60 }] }
];
// Resultat esperat: [{nom: "Pau", total: 20}, {nom: "Laura", total: 60}]

// 🔟 A partir d'un array d'objectes amb projectes i tasques amb temps estimat, calcula el temps total de tots els projectes
console.log("------------------------ Ej 10 -----------------------");
let projectes = [
  { nom: "Projecte A", tasques: [{ nom: "Tasca 1", hores: 2 }, { nom: "Tasca 2", hores: 3 }] },
  { nom: "Projecte B", tasques: [{ nom: "Tasca 1", hores: 5 }] }
];
// Resultat esperat: 10