
public class Letters {
	
  public static void main(String[] args) {
		// TODO Auto-generated method stub
	  String x = "Ac@";
      char ch[]=x.toCharArray();
      int upper=0,lower=0,vowel=0,consonant=0,space=0,special=0,digit=0;
       for (int i = 0; i < ch.length; i++) {
         

          if (Character.isUpperCase(ch[i]) && upper == 0) {
              System.out.println("upper letter: +ch[i]");
              upper++;
          } else if (Character.isLowerCase(ch[i]) && lower == 0) {
              System.out.println("small letter:" +ch[i]);
              lower++;
          } else if (ch[i]==' ' && space==0){
              System.out.println("space:" +ch[i]);
              space++;
          }
          else if(Character.isDigit(ch[i])) {
        	  digit++;
          }
          else if(ch[i]!=' '&& special==0) {
        	  System.out.println("special:" +ch[i]);
        	  special++;
          }}}}
           
          
