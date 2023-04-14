const word = "Mississippi";
let countS = 0;
let countI = 0;

for (let i = 0; i < word.length; i++) {
    if (word[i] === 's') {
        countS++;
    } else if (word[i] === 'i') {
        countI++;
    }
}

console.log("Number of occurrences of 's':", countS);
console.log("Number of occurrences of 'i':", countI);
