package leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class p648 {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] strs = sentence.split(" ");
        Set<String> roots = new HashSet<>();
        for(String str:dictionary) roots.add(str);
        for(int j = 0; j < strs.length; j++){
            char[] chs = strs[j].toCharArray();
            for(int i = 0; i<chs.length;i++){
                String process = new String(chs,0,i+1);
                if(roots.contains(process)){
                    strs[j] = process;
                    break;
                }
            }
        }
        StringBuilder sb =new StringBuilder();
        for(String str:strs){
            sb.append(str).append(" ");
        }
        return sb.toString().trim();
    }
}
