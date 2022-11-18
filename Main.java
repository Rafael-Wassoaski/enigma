import model.Reflector;
import model.Rotor;

class Main {
  public static void main(String[] args) {
    char encryptedAlphabet[] = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k',
        'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm' };
    
    Rotor rotor = new Rotor(3, encryptedAlphabet);

    System.out.println(Reflector.reflect(rotor.encrypt('r')));
    System.out.println(Reflector.reflect(rotor.encrypt('a')));
    System.out.println(Reflector.reflect(rotor.encrypt('f')));
    System.out.println(Reflector.reflect(rotor.encrypt('a')));
    System.out.println(Reflector.reflect(rotor.encrypt('e')));
    System.out.println(Reflector.reflect(rotor.encrypt('l')));

  }
}