package RWA;

import java.util.HashSet;
import java.util.Set;

public class UNI {

    public int solution (String S){
       //读题一定要读清楚 是subarray 还是 sub set
        //sub array
        if(S == null || S.length() == 0) return 0;
        int ans = 0;
        for(int i = 0 ; i < S.length() ; i ++){
            Set<Character> set = new HashSet<Character>();
            int repet =0;
            for(int j = i; j < S.length(); j ++){
               if(set.add(S.charAt(j))){
                   ans += set.size() - repet;
               } else {
                   repet ++;
                   ans += set.size() - repet;
               }
            }
        }
        return  ans;
    }


    public static void main(String[] args) {
        UNI S = new UNI();
        System.out.println(  S.solution("CODILITY"));

    }
}
