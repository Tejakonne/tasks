const input = prompt("Enter a list of numbers separated by commas:");

const inputArray = input.split(',').map(Number);
inputArray.sort(function(a, b) {
    return b - a;
});

console.log("Sorted array in descending order:", inputArray);