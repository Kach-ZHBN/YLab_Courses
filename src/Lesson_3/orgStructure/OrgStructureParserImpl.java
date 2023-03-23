package Lesson_3.orgStructure;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class OrgStructureParserImpl implements OrgStructureParser{
    private Map<Long, Employee> orgStructure = new HashMap<>();
    private Employee director;
    @Override
    public Employee parseStructure(File csvFile) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(csvFile);
        Scanner scanner = new Scanner(fileInputStream)) {
            //Создание сотрудников с "базовой" информацией, которая доступна из внешнего файла
            while(scanner.hasNextLine()){
                String[] CSVField = scanner.nextLine().split(";");
                Employee employee = new Employee();
                employee.setId(Long.parseLong(CSVField[0]));
                if(!CSVField[1].isEmpty())
                    employee.setBossId(Long.parseLong(CSVField[1]));
                employee.setName(CSVField[2]);
                employee.setPosition(CSVField[3]);
                orgStructure.put(employee.getId(), employee);
            }

            //Обновление ссылок сотрудников
            for (Map.Entry<Long, Employee> entry : orgStructure.entrySet()) {
                Employee employee = entry.getValue();
                if(employee.getBossId() != null){
                    //Добавление ссылки на начальника текущего сотрудника
                    employee.setBoss(orgStructure.get(employee.getBossId()));
                    //Внедрение ссылки на текущего сотрудника в поле непосредственного начальника этого же сотрудника
                    employee.getBoss().getSubordinate().add(employee);
                } else {
                    director = employee;
                }
            }
        }
        return director;
    }
}
