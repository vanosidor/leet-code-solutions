package croaking_1419;

class Solution {
    public int minNumberOfFrogs(String croakOfFrogs) {

        int[] memory = new int[5]; // храним появление каждого символа
        int frogs = 0; // лягушек в работе
        int maxFrogs = 0; // макс число

        for (var i = 0; i < croakOfFrogs.length(); i++) {
            var ch = croakOfFrogs.charAt(i);

            var n = "croaks".indexOf(ch);

            memory[n]++; // увеличиваем частоту символа

            if (n == 0) { //если 'с' - увеличиваем число лягушек в работе
                maxFrogs = Math.max(maxFrogs, ++frogs);

            } else if (--memory[n - 1] < 0) return -1;
            else if (n == 4) { //если дошли до последнего символа, уменьшаем число в работе
                frogs--;
            }


        }
        return (frogs == 0) ? maxFrogs : -1;
    }
}