package model;

public abstract class Reflector {

  private static final char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
      'p', 'q',
      'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

  private static final char[] reflectedAlphabet = { 'g', 'k', 'a', 'c', 'u', 'q', 'n', 'p', 'x', 'z', 'b', 'm', 't',
      'e', 'w', 'r', 'i',
      'd', 'v', 'y', 'o', 'f', 'h', 'j', 'l', 's' };

  public static char reflect(char target) {
    int alphabetIndex = 0;

    for (int index = 0; index < 26; index++) {
      if (target == Reflector.alphabet[index]) {
        alphabetIndex = index;
        break;
      }
    }
    return Reflector.reflectedAlphabet[alphabetIndex];
  }

}