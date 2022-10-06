
package com.valtech.training.assignment;

import java.util.Comparator;

public class PasswordStrengthChecker {
    int cnt = 0;

   public boolean checklower(String str) {
        int flag = 0;
        if (str.length() < 8)
            return false;
        for (char ch = 0; ch < str.length(); ch++) {
            if (Character.isLowerCase(ch)) {
                if (flag == 0) {
                    cnt += 5;
                    flag = 1;
                    return true;
                } else {
                    break;
                }
            }
        }
        return true;
    }
   
   
   public boolean checkupper(String str) {
       int flag = 0;
       if (str.length() < 8)
           return false;
       for (char ch = 0; ch < str.length(); ch++) {
           if (!Character.isLowerCase(ch)) {
               if (flag == 0) {
                   cnt += 5;
                   flag = 1;
                   return true;
               } else {
                   break;
               }
          }
      }
       return true;
   }

   
   
   
   public boolean checkdigit(String str) {
       int flag = 0;

      for (char ch = 0; ch < str.length(); ch++) {
           if (Character.isDigit(ch)) {
               if (flag == 0) {
                   cnt += 5;
                   flag = 1;
                   return true;
               } else {
                   cnt += 1;
               }
           } else {
               return false;
           }

      }
       return true;
   }

   

   public int checkspecialchar(String str) {
       int flag=0;
//       String spc[]= {!@#$%&*()’+,-./:;<=>?[]^_`{|}};
       String specialChars = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
       for (int i = 0; i < str.length(); i++) {
           String strChar = Character.toString(str.charAt(i));
           // Check whether String contains special character or not
           if (specialChars.contains(strChar)) {
               if(flag==0) {
               cnt+=5;
               flag=1;
//               return true;
           }
               else {
                   cnt+=1;
               }
           }
//           else {
//               return false;
//           }
           }
       return cnt;
       }
}



