public class Srings {
    public static void main(String s[]){
        String anu = "Anurag";
        anu += " Nayak";
        System.out.println(anu);

        //StringBuffer can also be used here
        StringBuilder renu = new StringBuilder(" Renuka"); // 16 by default then the char are added after wards
        System.out.println(renu.capacity()); 
        anu += renu.toString();
        System.out.println(anu);
        for(int i = 0 ; i < anu.length(); i++){
            System.out.print(anu.charAt(i) + " ");
        } System.out.println();
        for(char ch : anu.toCharArray()){
            System.out.print(ch + " ");
        }
    }
}
