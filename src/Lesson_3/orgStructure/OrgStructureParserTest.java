package Lesson_3.orgStructure;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class OrgStructureParserTest {
    public static void main(String[] args) throws IOException {
        File file = new File("src/Lesson_3/orgStructure/OrgStructureCSV.txt");
        OrgStructureParser structureParser = new OrgStructureParserImpl();
        Employee director = structureParser.parseStructure(file);
        System.out.println(director.getName() + " " + director.getBossId());
    }
}
