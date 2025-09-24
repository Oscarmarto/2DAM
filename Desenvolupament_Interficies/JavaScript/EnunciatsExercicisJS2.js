//A partir d'un array de numeros, mostra la suma de tots ells
let array1 = [1, 2, 3, 4, 5, 6, 7, 8, 9];

const total1 = array1.reduce((cont, num) => cont + num, 0);
console.log(total1);

//45

//A partir d'un array d'strings i numeros, mostra un string que els continga tots
let array2 = ['a', 1, 'b', 2, 'c', 3];

const frase2 = array2.reduce((fra, cha) => fra + cha, "");
console.log(frase2);
// a1b2c3

// A partir d'un array de dies, em torne un OBJECTE amb tants atributs com dies i la posició de cada dia
// És a dir per a l'array ['dilluns', 'dimarts', 'dimecres'] 
// torne un objecte {dilluns:0, dimarts:1, dimecres:2}
let dies = ['dilluns', 'dimarts', 'dimecres'];

objresult3 = dies.reduce((nouObj, unDia, pos) => {
    nouObj[unDia] = pos;
    return nouObj;
}, {})

console.log(objresult3);
//A partir d'un array amb objectes Musics (nom i instrument que toca)
//Que torne un array amb els noms de tots els components
// [ 'Joan', 'Pep', 'Vicent Lloret', 'Ariadna', 'Guillem' ]
let musics = [
    { 'nom': 'Joan', 'instrument': 'vocal' },
    { 'nom': 'Pep', 'instrument': 'guitarra' },
    { 'nom': 'Vicent Lloret', 'instrument': 'guitarra' },
    { 'nom': 'Ariadna', 'instrument': 'bateria' },
    { 'nom': 'Guillem', 'instrument': 'baix' }
]

let arrayNomsMusics = [];

musics.forEach((unMusic) => {
    arrayNomsMusics.push(unMusic.nom)
});

console.log(arrayNomsMusics);

//Ara feu-ho utilitzant map()

console.log(musics.map((unMusic) => unMusic.nom))

//Ara que torne un array només amb els noms del musics que toquen la guitarra
//['Pep', 'Vicent Lloret']

const guitarriestes = musics.filter((arrayM) => arrayM.instrument === 'guitarra');

console.log(guitarriestes)
const nomGuit = guitarriestes.map((guitarriestes) => guitarriestes.nom)

console.log(nomGuit)
//Amb reduce

const guitarriestes2 = musics.reduce((arraymus, music) => {
    if (music.instrument === 'guitarra') {
        arraymus.push(music.nom);
    }
    return arraymus;
}, []);

console.log(guitarriestes2);



//['Pep', 'Vicent Lloret']
//----------------------------------------------------------------------------------

const users = [
    {
        id: 1,
        name: "Jonathon Haley",
        username: "Monte.Weber2",
        email: "Daphne43@yahoo.com",
        phone: "1-563-675-1857 x11708",
        website: "carmela.net",
        password: "hashed_password"
    },
    {
        id: 2,
        name: "Dean John",
        username: "dd.1",
        email: "deno@google.com",
        phone: "1-123-543-1857 123212",
        website: "dd.net",
        password: "Dean_hashed_password"
    }]

//Que torne un array d'objectes amb l'email, el tel i la web

const contactInfo = users.map(({email, website, phone}) => ({email, website, phone}));

console.log(contactInfo)
// [
//     {
//         email: 'Daphne43@yahoo.com',
//         website: 'carmela.net',
//         phone: '1-563-675-1857 x11708'
//     },
//     {
//         email: 'deno@google.com',
//         website: 'dd.net',
//         phone: '1-123-543-1857 123212'
//     }
// ]


//-----------------------------------------------------
//A partir d'un array de comandes com el proporcionat
let comandes = [
    {
        client: {
            nom: "Manel Viel"
        },
        productes: [
            {
                id: 1,
                nom: "Taronges"
            }, {
                id: 2,
                nom: "Pomes"
            }
        ]
    }, {
        client: {
            nom: "Joan Mi"
        },
        productes: [
            {
                id: 3,
                nom: "Peres"
            }, {
                id: 2,
                nom: "Pomes"
            }
        ]
    }, {
        client: {
            nom: "Tomas Marin"
        },
        productes: [
            {
                id: 4,
                nom: "Freses"
            }, {
                id: 2,
                nom: "Peres"
            }, {
                id: 1,
                nom: "Platans"
            }
        ]
    }
]

// Recorremos el array de comandes (pedidos)
const llistaArrays = comandes.map(elem => {
  // Para cada pedido, recorremos su array de productes (productos)
  return elem.productes.map(producte => {
    // Creamos un objeto con el nombre del cliente y el nombre del producto
    return {
      client: elem.client.nom,    // Nombre del cliente del pedido actual
      producte: producte.nom      // Nombre del producto actual
    };
  });
});


console.log(llistaArrays)
// tornar un array anomenat llistat de comandes, on cada element siga un array d'objectes on
// aparega només el client i el producte de la seua comanda.
// Exemple:

//llistatDeComandes => [
//    [
//        { client: 'Manel Viel', productes: 'Taronges' },
//        { client: 'Manel Viel', productes: 'Pomes' }
//    ],
//    [
//        { client: 'Joan Mi', productes: 'Peres' },
//         { client: 'Joan Mi', productes: 'Pomes' }
//     ],
//     [
//         { client: 'Tomas Marin', productes: 'Freses' },
//         { client: 'Tomas Marin', productes: 'Peres' },
//         { client: 'Tomas Marin', productes: 'Platans' }
//     ]
// ]



