/**
 * author : Amrutha R
 * Desc: Finding the appropriate medal for a student based on it's marks which is used to give scholarship to students.
 */
import java.util.HashMap;
import java.util.Set;
public class StudentMedal
{
       public HashMap<String,String> getStudent(HashMap<String,Integer> stu)
       {
              HashMap<String,String> medal = new HashMap<>();
              Set<String> set = stu.keySet();
              for(String s:set)
              {
                     Integer marks = stu.get(s);
                     if(marks>=90)
                     {
                           medal.put(s,"Gold");
                     }
                     else if(marks >=80)
                     {
                           medal.put(s,"Silver");
                     }
                     else if(marks>=70)
                     {
                           medal.put(s,"Bronze");
                     }
              }
              return medal;
       }
       public static void main(String[] ar)
       {
              HashMap<String,Integer> student = new HashMap<>();
              StudentMedal p = new StudentMedal();
              /* I am using hardcoded values at this point
               * Scanner class can be used if values need
               * to be entered  dynamically */
              student.put("R13",65);
              student.put("R14",76);
              student.put("R15",89);
              student.put("R16",90);
              student.put("R17",93);
              System.out.println(p.getStudent(student));
       }
}