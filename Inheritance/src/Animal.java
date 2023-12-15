import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Animal {
    Animal animal[] = new Animal[6];
    animal[0] = new Mammal(name: "Little Buck", age: 2, weight: 2, order: "Bat");
    animal[1] = new Dog(name: "Butkus", age: 5, weight: 15, breed: "Mastiff");
    animal[2] = new Bird(name: "Platypus", age: 2, weight: 1, featherColor: "White");
    animal[3] = new Pigeon(name: "Pablo", age: 10, weight: 1, featherColor: "Grey", species: "spain");
    animal[4] = new Fish(name: "Nemo", age: 1, weight: 3, scaleColor: "Mixed");
    animal[5] = new Blowfish(name: "Blowfish", age: 5, weight: 2, scaleColor: "Grey", diameter: "10");
}
