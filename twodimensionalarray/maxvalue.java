package twodimensionalarray;

public class maxvalue {
    public static void main(String[] args) {
        String[] arr={"4324","145","1234","2342"};
        String maxs=arr[0];
        for(int i=1;i<arr.length;i++){
            maxs=max(maxs,arr[i]);
        }
        System.out.println(maxs);
    }
    public static String max(String a,String b){
String s=purify(a),t=purify(b);
if(s.length()>t.length()) return a;
if(s.length()<t.length()) return b;
for(int i=0;i<s.length();i++){
    if(s.charAt(i)!=t.charAt(i)){
        if(s.charAt(i)>t.charAt(i)) return a;
        else return b;
    }
}
if(a.length()>=b.length()) return a;
else return b;
    }
    public static String purify(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0') return s.substring(i);
        }
        return s;
    }

}
