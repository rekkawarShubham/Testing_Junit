public class Message {
    private String msg;
    public Message(String a){
        this.msg = a;
    }

    public String print(){
        System.out.println(msg);
        return msg;
    }

    public String printwithPrefix(){
        msg = "hii" + msg;
        return msg;
    }

    public void printInfinite(){
        msg ="hello";
        while(true);
    }

}
