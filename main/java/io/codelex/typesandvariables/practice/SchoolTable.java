package io.codelex.typesandvariables.practice;

public class SchoolTable {
    public static void main(String[] args) {

        String count = "Nr";
        String courseName = "Course";
        String course1 = "Latvian";
        String course2 = "English";
        String course3 = "Visual arts";
        String course4 = "Java programming";
        String course5 = "Biology";
        String course6 = "Physics";
        String course7 = "Music";
        String course8 = "Informatics and technology";

        String teacherName = "Teacher";
        String teacher1 = "Ms. Konoshonok";
        String teacher2 = "Ms. Bareika";
        String teacher3 = "Mrs. Vigulis";
        String teacher4 = "Mrs. Tumpelis";
        String teacher5 = "Ms. Krilova";
        String teacher6 = "Ms. Vasiljeva";
        String teacher7 = "Ms. Orole";
        String teacher8 = "Mrs. Orols";

        for (int i = 0; i < 56; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("%1s%30s%2s%20s%2s\n", count, courseName, "|", teacherName, "|");
        System.out.printf("%1s%30s%2s%20s%2s\n", "1.", course1, "|", teacher1, "|");
        System.out.printf("%1s%30s%2s%20s%2s\n", "2.", course2, "|", teacher2, "|");
        System.out.printf("%1s%30s%2s%20s%2s\n", "3.", course3, "|", teacher3, "|");
        System.out.printf("%1s%30s%2s%20s%2s\n", "4.", course4, "|", teacher4, "|");
        System.out.printf("%1s%30s%2s%20s%2s\n", "5.", course5, "|", teacher5, "|");
        System.out.printf("%1s%30s%2s%20s%2s\n", "6.", course6, "|", teacher6, "|");
        System.out.printf("%1s%30s%2s%20s%2s\n", "7.", course7, "|", teacher7, "|");
        System.out.printf("%1s%30s%2s%20s%2s\n", "8.", course8, "|", teacher8, "|");
        for (int i = 0; i < 56; i++) {
            System.out.print("-");
        }
    }
}
