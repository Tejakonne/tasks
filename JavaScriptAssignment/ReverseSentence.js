const sentence = prompt("Enter a sentence:");
const reversedSentence = reverseWordsInSentence(sentence);

console.log("Reversed sentence: " + reversedSentence);

function reverseWordsInSentence(sentence) {
    const words = sentence.split(" ");
    const reversedWords = [];

    for (const word of words) {
        reversedWords.push(reverseWord(word));
    }

    return reversedWords.join(" ");
}

function reverseWord(word) {
    return word.split("").reverse().join("");
}
