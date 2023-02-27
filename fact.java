import java.util.stream.*;
import java.util.ArrayList;

class Fact{
  public static void main(String[] args) {
    ArrayList<Integer> st=new ArrayList<>();
    System.out.println("Factorial");
    st.add(5);
    st.add(2);
    st.add(6);

    System.out.println(st.stream().map(elm->fact(elm)).collect(Collectors.toList()) );
  }

  static int fact(int val){
    if(val>1)
    return val*fact(val-1);
    if(val==1||val==0)
    return 1;
    return val;
  }
}