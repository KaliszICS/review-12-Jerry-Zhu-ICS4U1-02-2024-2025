public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static boolean isPalindrome(String phrase){
		String word = phrase.replaceAll(" ", "").toLowerCase();
		for (int i = 0; i < word.length(); i++){
			if (word.charAt(i) != word.charAt(word.length()-1-i)){
				return false;
			}
		}
return true;
	}

public static int getAge(String[] nameList, int[] ages, String name){
for (int i = 0; i < nameList.length; i++){
	if(nameList[i].equals(name)){
		return ages[i];
	}
}
return -1;
}

public static int countWords(String phrase, char c){
	int counter  = 0;
	String[] stringArr = phrase.split(" ");
	for (int i = 0; i < stringArr.length; i++){
		if(stringArr[i].contains("" + c)){
			counter ++;
		}
	}
	return counter;
}
}
