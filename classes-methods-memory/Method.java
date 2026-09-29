class Computer{
    public void playMusic(){
        System.out.println("Music Playing...");
    }

    public String getMeAPen(int cost){
        if (cost>10){
            return "1 Pen";
        }
        return "Nothing" ;
    }
}

class Method{
    public static void main(String a[]){
        Computer cmp = new Computer();
        cmp.playMusic();

        System.out.println(cmp.getMeAPen(2));
    }
}