package testing_classes;
public class reverseString{
    public String reverse(String s){
        int n = s.length();
        char[] str = s.toCharArray();
        for(int i = 0 ; i < n/2; i++){
            swap(str,i,(n-1-i));
        }
        return new String(str);
    }
    public void swap(char[] str, int left, int right){
        char temp = str[left];
        str[left] = str[right];
        str[right] = temp;
    }
}
