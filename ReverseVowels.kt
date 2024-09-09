/*
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

Example 1:

Input: s = "hello"
Output: "holle"
Example 2:

Input: s = "leetcode"
Output: "leotcede"
 
Constraints:

1 <= s.length <= 3 * 105
s consist of printable ASCII characters.
*/

class Solution {
    fun reverseVowels(s: String): String {
        val vowels = mutableListOf<Char>()

        s.forEach { char ->
            val lowerChar = char.toLowerCase()
            if (lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' || lowerChar == 'o' || lowerChar == 'u')
                vowels += char
        }

        var newStr = ""
        var index = vowels.size - 1
        s.forEach() { char ->
            val lowerChar = char.toLowerCase()
            newStr += if (lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' || lowerChar == 'o' || lowerChar == 'u')
                vowels[index--]
            else char
        }

        return newStr
    }
}
