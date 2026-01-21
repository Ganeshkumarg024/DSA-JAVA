package String;

import javax.swing.event.ListDataEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnagrams {
    public static void main(String[] args) {
       String[] strs ={"eat","tea","tan","ate","nat","bat"};
       bruteforce(strs);
       primefactors(strs);
    }
    static void bruteforce(String [] s){
//        HashMap <String, List<String>>hm=new HashMap<>();
//
//        for(String sa:s){
//            char[] chararr=sa.toCharArray();
//            Arrays.sort(chararr);
//            String key=new String(chararr);
//            hm.putIfAbsent(key,new ArrayList<>());
//            hm.get(key).add(sa);
//        }
//        System.out.println(new ArrayList<>(hm.values()));

        boolean [] used=new boolean[s.length];
        List<List<String>>list=new ArrayList<>();

        for(int i=0;i<s.length;i++){

            if(used[i]) continue;
            List<String>group=new ArrayList<>();
            group.add(s[i]);
            used[i]=true;

            for(int j=i+1;j<s.length;j++){
                if(!used[j]&&isAnagram(s[i],s[j])){
                    group.add(s[j]);
                    used[j]=true;
                }
            }
            list.add(group);

        }
        System.out.println(Arrays.toString(list.toArray()));
    }
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        char[] ca = a.toCharArray();
        char[] cb = b.toCharArray();
        Arrays.sort(ca);
        Arrays.sort(cb);
        return Arrays.equals(ca, cb);
    }
    static void primefactors(String [] s){
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41,
                43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        HashMap<Integer,List<String>>hm=new HashMap<>();
        for(String sa:s){
            int prime=1;
            for(char a:sa.toCharArray()){
                prime*=primes[a-'a'];
            }
//            hm.putIfAbsent(prime,new ArrayList<>());
//            hm.get(prime).add(sa);
            hm.computeIfAbsent(prime,K->new ArrayList<>()).add(sa);

        }
        System.out.println(new ArrayList<>(hm.values()));
    }
}
