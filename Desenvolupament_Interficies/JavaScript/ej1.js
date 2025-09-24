const arrayNum = [10,9,7];

let resultat = [];

//amb bucle for
for(let i = 0; i <arrayNum.length; i++){
    resultat.push(arrayNum[i]*2);
}
console.log(resultat);

//amb funció map
const resultatMap = arrayNum.map((unElementArray) => unElementArray*2);
console.log(resultatMap);


// //Ej1
const arraymap1 = [5,10,15];

const resultArrMap1 = arraymap1.map((res1) => res1/5);
console.log(resultArrMap1);


//Ej2
const arraymap2 = ["Anna","Joan","Maria"];

const resultArrMap2 = arraymap2.map((res2) => res2+"!");
console.log(resultArrMap2);

//Ej3

const arraymap3 = [2,4,6,8];

const resultArrMap3 = arraymap3.map((res3) => res3 * res3);
console.log(resultArrMap3);

//Ej1 .filter()
const numeros = [2, 7, 4, 10];
const majors = numeros.filter(num => num > 5);
console.log(majors); // [7, 10]

//Ej2
const numeros2 = [2, 7, 4, 10];
const parells = numeros2.filter((num2, index) => index % 2 !== 0);
console.log(parells); 

//ForEeach()
const fruits = ["poma", "pera", "plàtan"];
fruits.forEach((fruit, index) => {
 console.log(index, fruit);
});

//Ej1
const numf = [2,4,6];
numf.forEach((numf1) => {
    console.log(numf1 * 3)
});

//Ej .reduce() / .filter()
//1

const arNum = [1,2,3,4,5,6];

const numpar = arNum.filter((arNum) => arNum % 2 == 0);
console.log(numpar);

//2

const natu  = ["sol","plutja","mar"];

const llarga = natu.filter((natu) => natu.length > 3);
console.log(llarga);

//3

const mult = [2,3,4];

const total = mult.reduce((tot, mult) => tot * mult, 0.5);

console.log(total);

//

const men = ["Hola", "mon"];

console.log(men.reduce((frase, men)=> frase+" "+men, ""));