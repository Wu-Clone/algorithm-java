package od;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Map<Character,Character> map  = new HashMap<>();
        map.put('1','2');
        map.put('2','1');
        map.put('3','4');
        map.put('4','3');
        map.put('5', '6');
        map.put('6','5');
        // 左 前 上
        char[] face = new char[]{'1','3','5'};
        Scanner in = new Scanner(System.in);
        char[] chs = in.next().toCharArray();
        for(int i = 0;i<chs.length;i++){
            rotateDice(face,chs[i],map);
            for (int j = 0; j < 3; j++) {
                System.out.print(face[j]);
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(face[i]);
        }
    }

    private static void rotateDice(char[] face, char ch, Map<Character, Character> map) {
        if(ch=='R'){
            char top = face[2];
            face[2] = face[0];
            face[0] = map.get(top);
        }
        else if(ch=='L'){
            char top = face[2];
            face[2] = map.get(face[0]);
            face[0] = top;
        }else if(ch == 'A'){
            char front = face[1];
            face[1] = face[0];
            face[0] =map.get(front);
        }
    }
}
