package grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    static HashMap<String, Student> students = new HashMap<>();
    static Input input = new Input();
     static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        Student entoi = new Student("Ekoh");
        entoi.addGrade(100);
        entoi.addGrade(100);

       Student  mclato = new Student("Mbabo");
        mclato.addGrade(100);
        mclato.addGrade(80);

        Student mwanneh= new Student("Mbave");
        mwanneh.addGrade(100);
        mwanneh.addGrade(70);

        Student entoh= new Student("Ekombo");
        entoh.addGrade(100);
        entoh.addGrade(90);

        students.put("entoi", entoi);
        students.put("mclato", mclato);
        students.put("mwanneh", mwanneh);
        students.put("entoh", entoh);

        System.out.println("Welcome!\n");
        showStudents();

        boolean cont = true;

        do {
            System.out.print("Which student will you like to see details information on?\n");
            String key = sc.nextLine();
            if(students.containsKey(key)){
                System.out.println("Name: "+ students.get(key).getName() +"- GitHub Username: " + key + " ");
                System.out.println("Current Average: " + students.get(key).getGradeAverage());

            } else {
                System.out.println("Sorry, no student found with the GitHub username of " + key);
            }
            cont = input.yesNo("Will you like see another student? yes or no");

        } while (cont);
        System.out.println("Thanks, Have a Nice day\n");

    }
     public static void showStudents(){
         System.out.println("Here are the GitHub usernames of our students:\n");
         for(String username : students.keySet()){
             System.out.println("|" + username + "|");
         }
         System.out.println();
     }

}






