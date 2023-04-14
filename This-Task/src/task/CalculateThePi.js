let pi = 0;
let sign = 1;

for (let i = 1; i <= 200000; i += 2) {
    pi += sign * (4 / i);
    sign *= -1;


    if (i % 10000 === 1) {
        console.log("Value of pi after " + i + " terms: " + pi);
    }

    let piString = pi.toFixed(5);
    if (piString === "3.14159") {
        console.log("Value of pi starts with 3.14159 after " + i + " terms.");
        break;
    }
}
