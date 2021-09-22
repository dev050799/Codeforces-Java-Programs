class Operation{
    int data=50;

    void change(int data){
        this.data=data+100;//changes will be in the local variable only
    }

    public static void main(String args[]){
        Operation op=new Operation();

      String s="new";
      String s1= "new";
        System.out.println(s==s1);

    }
}