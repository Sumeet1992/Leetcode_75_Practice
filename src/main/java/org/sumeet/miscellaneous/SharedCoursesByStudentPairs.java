package org.sumeet.miscellaneous;

/*
 You are a developer for a university. Your current project is to develop a system for students to find courses they share with
  friends. The university has a system for querying courses students are enrolled in, returned as a list of (ID, course) pairs.

Write a function that takes in a collection of (student ID number, course name) pairs and returns, for every pair of students,
 a collection of all courses they share.

Sample Input:

enrollments1 = [
  ["58", "Linear Algebra"],
  ["94", "Art History"],
  ["94", "Operating Systems"],
  ["17", "Software Design"],
  ["58", "Mechanics"],
  ["58", "Economics"],
  ["17", "Linear Algebra"],
  ["17", "Political Science"],
  ["94", "Economics"],
  ["25", "Economics"],
  ["58", "Software Design"],
]

Sample Output (pseudocode, in any order):

find_pairs(enrollments1) =>
{
  "58,17": ["Software Design", "Linear Algebra"]
  "58,94": ["Economics"]
  "58,25": ["Economics"]
  "94,25": ["Economics"]
  "17,94": []
  "17,25": []
}

Additional test cases:

Sample Input:

enrollments2 = [
  ["0", "Advanced Mechanics"],
  ["0", "Art History"],
  ["1", "Course 1"],
  ["1", "Course 2"],
  ["2", "Computer Architecture"],
  ["3", "Course 1"],
  ["3", "Course 2"],
  ["4", "Algorithms"]
]

Sample output:

find_pairs(enrollments2) =>
{
  "1,0":[]
  "2,0":[]
  "2,1":[]
  "3,0":[]
  "3,1":["Course 1", "Course 2"]
  "3,2":[]
  "4,0":[]
  "4,1":[]
  "4,2":[]
  "4,3":[]
}

Sample Input:
enrollments3 = [
  ["23", "Software Design"],
  ["3", "Advanced Mechanics"],
  ["2", "Art History"],
  ["33", "Another"],
]

Sample output:

find_pairs(enrollments3) =>
{
  "23,3": []
  "23,2": []
  "23,33":[]
  "3,2":  []
  "3,33": []
  "2,33": []
}

All Test Cases:
find_pairs(enrollments1)
find_pairs(enrollments2)
find_pairs(enrollments3)

Complexity analysis variables:

n: number of student,course pairs in the input
s: number of students
c: total number of courses being offered (note: The number of courses any student can take is bounded by a small constant)
*/
import java.util.*;

public class SharedCoursesByStudentPairs {
    public static void main(String[] argv) {
        String[][] enrollments1 = {
                {"58", "Linear Algebra"},
                {"94", "Art History"},
                {"94", "Operating Systems"},
                {"17", "Software Design"},
                {"58", "Mechanics"},
                {"58", "Economics"},
                {"17", "Linear Algebra"},
                {"17", "Political Science"},
                {"94", "Economics"},
                {"25", "Economics"},
                {"58", "Software Design"}
        };

        String[][] enrollments2 = {
                {"0", "Advanced Mechanics"},
                {"0", "Art History"},
                {"1", "Course 1"},
                {"1", "Course 2"},
                {"2", "Computer Architecture"},
                {"3", "Course 1"},
                {"3", "Course 2"},
                {"4", "Algorithms"}
        };

        String[][] enrollments3 = {
                {"23", "Software Design"},
                {"3",  "Advanced Mechanics"},
                {"2",  "Art History"},
                {"33", "Another"},
        };

        Map<String, List> enrollment1Result = printPairs(enrollments1);
        System.out.println(enrollment1Result);;
        Map<String, List> enrollment2Result = printPairs(enrollments2);
        System.out.println(enrollment2Result);;
        Map<String, List> enrollment3Result = printPairs(enrollments3);
        System.out.println(enrollment3Result);;

    }

    public static Map<String, List> printPairs(String[][] enrollment){

        int length = enrollment.length;

        Map<String, List> pairs = new HashMap<>();
        Set<String> keys = new HashSet<>();
        List<String> keyPairs = new ArrayList<>();
        for(int i = 0; i<length; i++){
            keys.add(enrollment[i][0]);;
        }
        List<String> keysList = new ArrayList<>(keys);

        for(int i = 0; i < keysList.size(); i++){
            for(int j = i + 1; j< keysList.size(); j++){
                keyPairs.add(keysList.get(i) + ","+ keysList.get(j));;
            }
        }


        for(String keyPair : keyPairs){

            String key1 = keyPair.split(",")[0];
            String key2 = keyPair.split(",")[1];
            List<String> key1Subjects = new ArrayList<>();
            List<String> key2Subjects = new ArrayList<>();
            for(int i = 0; i< length; i++){
                if(enrollment[i][0].equals(key1)){
                    key1Subjects.add(enrollment[i][1]);
                }
                if(enrollment[i][0].equals(key2)){
                    key2Subjects.add(enrollment[i][1]);
                }
            }

            List<String> matchedSubjects = new ArrayList<>();
            for(String key1Subject : key1Subjects){
                for(String key2Subject : key2Subjects){
                    if(key1Subject.equals(key2Subject)){
                        matchedSubjects.add(key1Subject);
                    }
                }

            }

            pairs.put(keyPair, matchedSubjects);

        }



        return pairs;

    }

}
