
const numArray = [1, 2, 3];

// use build in array method 'map' to double numbers:
// map does operation to each element in array
const dblNumArray = numArray.map((element) => {
    return element*2; //double array element
});

console.log(dblNumArray); // print array with doubled elements