console.log("EXERCICI 2");
/* Enunciat:
Filtra els usuaris majors d’edat (>=18) i mostra’ls per consola.

//Dades a utilitzar:
const dades2 = {
   usuaris: [
     { nom: "Anna", edat: 19 },
     { nom: "Joan", edat: 16 },
     { nom: "Marta", edat: 22 }
   ]
}
Resultat Esperat: [ { nom: 'Anna', edat: 19 }, { nom: 'Marta', edat: 22 } ]
*/
const dades2 = {
  usuaris: [
    { nom: "Anna", edat: 19 },
    { nom: "Joan", edat: 16 },
    { nom: "Marta", edat: 22 }
  ]
}

const majorsEdat = () => {
  return dades2.usuaris.filter(elem => elem.edat >= 18)
}

console.log(majorsEdat())
console.log("---------------");
console.log("EXERCICI 3");
/* Enunciat:
Mostra per consola el nom de cada usuari utilitzant .forEach().
// Dades a utilitzar:

  dades3 = {
   usuaris: [
    { dni: "12345678Z", nom: "Anna" },
    { dni: "11111111A", nom: "Joan" },
    { dni: "22222222B", nom: "Marta" }
    ]
   };
Resultat esperat: 
Usuari: Anna
Usuari: Joan
Usuari: Marta
*/
dades3 = {
  usuaris: [
    { dni: "12345678Z", nom: "Anna" },
    { dni: "11111111A", nom: "Joan" },
    { dni: "22222222B", nom: "Marta" }
  ]
};

const nomUsuaris = () => {
  return dades3.usuaris.forEach(elem =>
    console.log(elem.nom)
  );
}

console.log(nomUsuaris())
console.log("---------------");
console.log("EXERCICI 5");
/* Enunciat:
Obté els noms dels usuaris amb saldo positiu (>0) utilitzant .filter() i .map().

// Dades a utilitzar:
const dades5 = {
//   usuaris: [
//     { nom: "Anna", saldo: 120 },
//     { nom: "Joan", saldo: -50 },
//     { nom: "Marta", saldo: 300 }
//   ]
// };
Resultat esperat: 
[ 'Anna', 'Marta' ]
*/
// Dades a utilitzar:
const dades5 = {
  usuaris: [
    { nom: "Anna", saldo: 120 },
    { nom: "Joan", saldo: -50 },
    { nom: "Marta", saldo: 300 }
  ]
};

const saldoPositiu = () => {
  return dades5.usuaris.filter(elem => elem.saldo >0).map(elem => elem.nom)
}

console.log(saldoPositiu())
console.log("---------------");
console.log("EXERCICI 6");
/* Enunciat:
  Calcula el total de vendes (quantitat * preu) amb .reduce().
// Dades a utilitzar:
const dades6 = {
  vendes: [
    { producte: "A", quantitat: 2, preu: 10 },
    { producte: "B", quantitat: 1, preu: 25 },
    { producte: "C", quantitat: 3, preu: 5 }
  ]
}
Resultat Esperat: 
Total vendes: 60 €
*/
const dades6 = {
  vendes: [
    { producte: "A", quantitat: 2, preu: 10 },
    { producte: "B", quantitat: 1, preu: 25 },
    { producte: "C", quantitat: 3, preu: 5 }
  ]
}
const totalVendes = () => {
  return dades6.vendes.reduce((acum, elem) => acum += (elem.preu * elem.quantitat), 0)
}

console.log("Total vendes: " + totalVendes() + " €")
console.log("---------------");
console.log("EXERCICI 7");
/* Enunciat:
  Comptar quants usuaris hi ha per rol (admin, usuari, etc.) utilitzant .reduce().

// Dades a utilitzar:
const dades7 = {
  usuaris: [
    { nom: "Anna", rol: "admin" },
    { nom: "Joan", rol: "usuari" },
    { nom: "Marta", rol: "usuari" },
    { nom: "Pau", rol: "admin" },
    { nom: "Ximo", rol: "admin" }
  ]
}
Resultat Esperat:
{ admin: 3, usuari: 2 }
*/
const dades7 = {
  usuaris: [
    { nom: "Anna", rol: "admin" },
    { nom: "Joan", rol: "usuari" },
    { nom: "Marta", rol: "usuari" },
    { nom: "Pau", rol: "admin" },
    { nom: "Ximo", rol: "admin" }
  ]
}
const usuariRol = () => {
  let result = dades7.usuaris.reduce((acum,elem) => {
    let arraycont = []
    if(!arraycont[elem.rol]){
      arraycont[elem.rol] = 1;
    }else{
      acum = arraycont[elem.rol] + 1
    }
    return acum;
  }, {})
//   let admin =  dades7.usuaris.reduce((acum, elem) => {
//       if(elem.rol === "admin"){
//         acum ++;}
//         return acum
//   }, 0)
//   let usuari = dades7.usuaris.reduce((acum, elem) => {
//       if(elem.rol === "usuari"){
//         acum ++;}
//         return acum
//   }, 0)
  // return dades7.usuaris.map(elem => elem.rol);
  return result 
}
console.log(usuariRol())
console.log("---------------");
console.log("EXERCICI 9");
/* Enunciat:
Troba el producte més barat utilitzant .reduce().

// Dades a utilitzar:
const dades9 = {
  productes: [
    { nom: "Tv", preu: 300 },
    { nom: "Pen", preu: 20 },
    { nom: "Teclat", preu: 100 }
  ]
}
Resultat Esperat:
  Producte més barat: Pen (20 €)
*/
const dades9 = {
  productes: [
    { nom: "Tv", preu: 300 },
    { nom: "Pen", preu: 20 },
    { nom: "Teclat", preu: 100 }
  ]
}
const preuBarat = () => {
  return dades9.productes.reduce((acum, elem) => {
    if(acum > elem.preu){
      acum = elem.preu
    }
    return acum
  }, 1000)
}

console.log("Producte més barat : "+ preuBarat() + "€ ")
console.log("---------------");
console.log("EXERCICI 11");
/* Enunciat:
Calcula el total gastat per cada client a partir d’un JSON de comandes amb productes. Usa .map() i .reduce().

Dades a utilitzar:
const dades11 = {
  clients: [
    {
      nom: "Anna",
      comandes: [
        { producte: "Portàtil", preu: 1000, quantitat: 1 },
        { producte: "Ratolí", preu: 25, quantitat: 2 }
      ]
    },
    {
      nom: "Joan",
      comandes: [
        { producte: "Pantalla", preu: 200, quantitat: 1 },
        { producte: "Teclat", preu: 50, quantitat: 1 }
      ]
    }
  ]
}
Resultat Esperat:
[
  { nom: 'Anna', totalGastat: 1050 },
  { nom: 'Joan', totalGastat: 250 }
]
*/
const dades11 = {
  clients: [
    {
      nom: "Anna",
      comandes: [
        { producte: "Portàtil", preu: 1000, quantitat: 1 },
        { producte: "Ratolí", preu: 25, quantitat: 2 }
      ]
    },
    {
      nom: "Joan",
      comandes: [
        { producte: "Pantalla", preu: 200, quantitat: 1 },
        { producte: "Teclat", preu: 50, quantitat: 1 }
      ]
    }
  ]
}

const totalGastat = () => {
  return dades11.clients.map(elem => ({
    nom : elem.nom,
    totalGastat : elem.comandes.reduce((acum, elemento ) => acum += elemento.preu * elemento.quantitat , 0)
  }))
}

console.log(totalGastat())
console.log("---------------");