package com.codeclan.filesfoldersusersproject.components;


import com.codeclan.filesfoldersusersproject.models.File;
import com.codeclan.filesfoldersusersproject.models.Folder;
import com.codeclan.filesfoldersusersproject.models.User;
import com.codeclan.filesfoldersusersproject.repositories.FileRepository;
import com.codeclan.filesfoldersusersproject.repositories.FolderRepository;
import com.codeclan.filesfoldersusersproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {}

    public void run(ApplicationArguments args) {

        User shaz = new User("Shaz");
        userRepository.save(shaz);

        User pavel = new User("Pavel");
        userRepository.save(pavel);

        User selena = new User("Selena");
        userRepository.save(selena);

        Folder workInfo = new Folder("Work_Info", selena);
        folderRepository.save(workInfo);
        Folder personalInfo = new Folder("Personal_Info", selena);
        folderRepository.save(personalInfo);


        Folder workInfo1 = new Folder("Work_Info", shaz);
        folderRepository.save(workInfo1);

        Folder birthday = new Folder("Birthday_pics", pavel);
        folderRepository.save(birthday);


        // selena folder
        File workTimetable = new File("Timetable", ".docx", 3, workInfo);
        fileRepository.save(workTimetable);

        File workExpenses = new File("Expenses", ".xcel", 5, workInfo);
        fileRepository.save(workExpenses);

        File passportDetails = new File("Passport_details", ".pdf", 2, personalInfo);
        fileRepository.save(passportDetails);

        // shaz folder
        File workTimetable1 = new File("Timetable", ".docx", 3, workInfo1);
        fileRepository.save(workTimetable1);


        // pavel folder
        File birthdayPics = new File("Birthday_pics", ".jpg", 10, birthday);
        fileRepository.save(birthdayPics);
    }

}
