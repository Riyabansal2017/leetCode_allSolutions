//8. String to Integer (atoi)

class Solution {
    public int myAtoi(String s)
    {
      String str1 = "";
      boolean vBol = false;
      if(s.length()==0)
      {
        return 0;
      }
      int i=0;
      while(s.charAt(i)==' ')
      {
          i++;
            if(i==s.length())
            {
              return 0;
            }
      }
      int x = s.charAt(i);
      if(x>=48 && x<=57 || x==45 || x==43)
      {
        if(x==43 && i!=s.length()-1) {
        i++;
        x = s.charAt(i);
      }
      else if(x==45 && i!=s.length()-1)
      {
          vBol = true;
          i++;
          x = s.charAt(i);
      }
        while(x>=48 && x<=57)
        {
          str1 = str1 + s.charAt(i);
          i++;
          if(i==s.length()) break;
          x = s.charAt(i);
        }
      }
      if(str1=="") {
        return 0;
      }
      else 
      {
        try {
          int ref = Integer.parseInt(str1);
          ref = vBol ? ref*-1 : ref;
          return ref;
        }
        catch(Exception e) {
          if(vBol) {
            return Integer.MIN_VALUE;
            }
          else {
            return Integer.MAX_VALUE;
            }
        }
      }
    }
}
