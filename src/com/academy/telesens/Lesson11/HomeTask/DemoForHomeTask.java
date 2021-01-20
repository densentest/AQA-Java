package com.academy.telesens.Lesson11.HomeTask;

import java.io.*;
import java.util.*;

public class DemoForHomeTask {
    public static void main(String[] args) {

        String maleNames = "C:\\Users\\denys.sennikov\\Downloads\\dataForAQA\\мужские имена.txt";
        String maleSurnames = "C:\\Users\\denys.sennikov\\Downloads\\dataForAQA\\мужские фамилии.txt";

        String femaleNames = "C:\\Users\\denys.sennikov\\Downloads\\dataForAQA\\женские имена.txt";
        String femaleSurnames = "C:\\Users\\denys.sennikov\\Downloads\\dataForAQA\\женские фамилии.txt";

        String subscribers = "C:\\Users\\denys.sennikov\\Downloads\\dataForAQA\\subscribers.txt";


        List<String> maleNamesList = new ArrayList<>();
        List<String> maleSurnameList = new ArrayList<>();
        Map<String, String> maleAndSurnameList = new HashMap<>();
        String[] gender = {"Male", "Female"};
        String[] phoneNumbers = {"38063*******", "38093*******", "38073*******"};

        Random random = new Random();

        try {
            BufferedReader readMaleName = new BufferedReader(new FileReader(maleNames));
            BufferedReader readMaleSurname = new BufferedReader(new FileReader(maleSurnames));
            String line;
            String line1;
            while ((line = readMaleName.readLine()) != null) {
                maleNamesList.add(line);
            }
            while ((line1 = readMaleSurname.readLine()) != null) {
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
        System.out.println("-----------");

//        for (int i=0; i<maleNamesList.size(); i++){
//            maleAndSurnameList.put(maleNamesList.get(random.nextInt(maleNamesList.size())), maleSurnameList.get(random.nextInt(maleSurnameList.size())));
//
//        }
//        System.out.println(maleAndSurnameList);


        try {
        BufferedReader brMaleNames = new BufferedReader(new FileReader(maleNames));
        BufferedReader brMaleSurnames = new BufferedReader(new FileReader(maleSurnames));
        PrintWriter printWriter = new PrintWriter(new FileWriter(subscribers));

        String name;
            for (int k = 1; k < 201; k++) {
                printWriter.println(k + ", " +(maleNamesList.get(random.nextInt(maleNamesList.size()))) + " "
                        + (maleSurnameList.get(random.nextInt(maleSurnameList.size()))) + ", "
                        + (RandomAge()));

            }

        brMaleNames.close();
        brMaleSurnames.close();
        printWriter.close();

        } catch (IOException e){
            e.printStackTrace();
        }


    }

    public static int RandomAge (){
        Random random = new Random();
        int randomInt = random.nextInt(85) + 5;

        return randomInt;
    }
}
