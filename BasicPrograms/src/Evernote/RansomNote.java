package Evernote;

//Write a function In Python to search a ransom note using a string pattern.

/*
 * def ransom_note(magazine, rasom):
    d = {}
    for word in magazine:
        d.setdefault(word, 0)
        d[word] += 1
    
    for word in ransom:
        if word in d:
            d[word] -= 1
        else:
            return False
    
    return all([x >= 0 for x in d.values()])
 */

public class RansomNote {
		
		public void checkMagazine(magazine, note) {
			
			l1 = len(note);
			l2 = len(magazine);
			magazine.sort();
			note.sort();
			i = 0;
			j = 0;
			count = 0;
			while (i < l1 && j < l2) {
				
				if (note[i] == magazine[j]) {
					
					count += 1;
					i += 1;
					j += 1;
					if (count == l1) {
						print("Yes");
					} else {
						print ("No");
					}
				}

			}
	
}

