var fruits = ["Banana", "Orange", "Apple", "Mango"];
document.getElementById("demo").innerHTML = fruits;

function myFunction() {
    fruits.sort();
    document.getElementById("demo").innerHTML = fruits;
}