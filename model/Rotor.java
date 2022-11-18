package model;

public class Rotor {

  private char[] alphabet;
  private char[] encryptationAlphabet;
  private int rotorFactor;

  public Rotor(int rotorFactor, char[] encryptationAlphabet) {
    this.alphabet = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
        'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
    this.rotorFactor = rotorFactor;
    this.encryptationAlphabet = encryptationAlphabet;
  }

  public char encrypt(char target) {
    int alphabetIndex = 0;

    for (int index = 0; index < 26; index++) {
      if (target == this.alphabet[index]) {
        alphabetIndex = index;
        break;
      }
    }

        this.encryptationAlphabet = this.routateRotor();


    return this.encryptationAlphabet[alphabetIndex];

  }

  private char [] routateRotor() {
    char temp[] = new char[13];
    char newencryptationAlphabet[] = new char[26];

    for (int encryptationAlphabetIndex = 13,
        index = 0; encryptationAlphabetIndex < 26; index++, encryptationAlphabetIndex++) {
      temp[index] = encryptationAlphabet[encryptationAlphabetIndex];
    }

    for(int index = rotorFactor, encryptationAlphabetIndex = 0; index < 26 - rotorFactor; index++, encryptationAlphabetIndex++){
      newencryptationAlphabet[index]  = encryptationAlphabet[encryptationAlphabetIndex];
    }

    for(int index = 0; index < rotorFactor; index++){
      newencryptationAlphabet[index]  = temp[index];
    }

    return newencryptationAlphabet;
  }

}