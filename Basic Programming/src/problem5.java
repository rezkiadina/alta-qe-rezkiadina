class problem5 {
    private static boolean palindrome (String value){
        String kalimat = "";
        boolean tamp;
        for(int i = value.length(); i>0;i--){
            String value1 = value.substring(i-1, i);
            kalimat += value1;
        }
        if (value.equals(kalimat)){
            tamp = true;
        }else{
            tamp = false;
        }
        return tamp;
    }
    public static void main (String[] args){
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("kupu-kupu"));
        System.out.println(palindrome("lion"));
    }
}
