package exercise1;

import exercise2.Word;

public class Sentence {
    private String value;

    public String getValue() {
        return value;
    }

    public Sentence(String s){
        value = s;
    }

     public int nextSpaceIndex(int start){
        int n = 0;//your code here
        return n;
    }


    public String toString(){
        return value;
    }
    public boolean equals(Object obj){
        if(obj == null) return false;
        if(!(obj instanceof Sentence)) return false;
        Sentence m = (Sentence) obj;
        return this.value.equals(m.getValue());
     }
     

  
    public Word extractWord(int i, int j){
        String s = "";//your code here
        
        return null;
    }

    public Word extractWord(int i){
    	//your code here
        return null;
    }


     //exercise 4
    public  Sentence encode(int base) {
    	String result = "";
        //your code here
        return new Sentence(result);
    }
    
    //exercise 4
    public  Sentence decode(int base) {
    	String result = "";
        //your code here
        return new Sentence(result);
    }
    
 
}
