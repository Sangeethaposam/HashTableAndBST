package com.bridzelabz.hashTable;
import java.util.*;

public class HashTableMain {

	public static void main(String[] args) {
		System.out.println(" Hash table problem");
		String sentence = "To be or not to be"; 
        String paragraph = "paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situation";
        HashTableUcs m = new  HashTableUcs();
        m.frequencySentenceCalculation(sentence);
        m.frequencyParagraphCalculation(paragraph);
        m.removeAvoidableWord(paragraph);
	}

}
