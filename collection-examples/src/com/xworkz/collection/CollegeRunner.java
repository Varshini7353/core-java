package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollegeRunner {

    public static void main(String[] args) {


        Collection collection = new ArrayList();

        collection.add("Bachelor of Engineering in Computer Science and Engineering[CSE]\n");
        collection.add("Bachelor of Engineering in Artificial Intelligence and Data Science[AIDS]\n");
        collection.add("Bachelor of Engineering in Information Science and Engineering[ISE]\n");
        collection.add("Bachelor of Engineering in Electronics and Communication Engineering[ECE]\n");
        collection.add("Bachelor of Engineering in Electrical and Electronics Engineering[EEE]\n");
        collection.add("Bachelor of Engineering in Mechanical Engineering[ME]\n");
        collection.add("Bachelor of Engineering in Civil Engineering[CV]\n");
        collection.add("Master of Technology in Computer Science and Engineering[CSE]\n");
        collection.add("Master of Technology in Electronics\n");
        collection.add("Master of Technology in Software Engineering\n");
        collection.add("Master of Technology in Structural Engineering\n");
        collection.add("Master of Business Administration\n");
        collection.add("Doctor of Philosophy in Computer Science and Engineering\n");
        collection.add("Doctor of Philosophy in Electronics and Communication Engineering\n");
        collection.add("Doctor of Philosophy in Electrical and Electronics Engineering\n");
        collection.add("Doctor of Philosophy in Mechanical Engineering\n");
        collection.add("Doctor of Philosophy in Chemistry\n");
        collection.add("Doctor of Philosophy in Mathematics\n");
        collection.add("Diploma in Civil Engineering\n");
        collection.add("Diploma in Mechanical Engineering\n");

        System.out.println("List of branches available in Channabasveshwara Institute of Technology");

        System.out.println(collection);

    }
}
