package com.academy.telesens.Lesson11.HomeTask;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DemoForHomeTask {
    public static void main(String[] args) {

        String maleNames = "C:\\Users\\denys.sennikov\\Downloads\\dataForAQA\\мужские имена.txt";
        String maleSurnames = "C:\\Users\\denys.sennikov\\Downloads\\dataForAQA\\мужские фамилии.txt";

        String femaleNames = "C:\\Users\\denys.sennikov\\Downloads\\dataForAQA\\женские имена.txt";
        String femaleSurnames = "C:\\Users\\denys.sennikov\\Downloads\\dataForAQA\\женские фамилии.txt";

        List<String> maleNamesList = new ArrayList<>();
        List<String> maleSurnameList = new ArrayList<>();

        try {
            BufferedReader readMaleName = new BufferedReader(new FileReader(maleNames));
            BufferedReader readMaleSurname = new BufferedReader(new FileReader(maleSurnames));
            String line;
            String line1;
            while ((line = readMaleName.readLine()) != null){
                maleNamesList.add(line);
            }
            while ((line1 = readMaleSurname.readLine()) != null){
                maleSurnameList.add(line1);
            }
            readMaleName.close();
            readMaleSurname.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(maleNamesList);
        System.out.println("-----------");
        System.out.println(maleSurnameList);


    }
}
