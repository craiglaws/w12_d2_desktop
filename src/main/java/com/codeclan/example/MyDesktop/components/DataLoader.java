package com.codeclan.example.MyDesktop.components;

import com.codeclan.example.MyDesktop.models.File;
import com.codeclan.example.MyDesktop.models.Folder;
import com.codeclan.example.MyDesktop.models.User;
import com.codeclan.example.MyDesktop.repositories.FileRepository;
import com.codeclan.example.MyDesktop.repositories.FolderRepository;
import com.codeclan.example.MyDesktop.repositories.UserRepository;
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

    public DataLoader(){}

    public void run(ApplicationArguments args){

        User user1 = new User("Craig");
        userRepository.save(user1);

        User user2 = new User("Emily");
        userRepository.save(user2);


        Folder pics = new Folder("Pictures", user1);
        folderRepository.save(pics);

        Folder work = new Folder("Work", user1);
        folderRepository.save(work);

        Folder notes = new Folder("Notes", user2);
        folderRepository.save(notes);

        Folder code = new Folder("Code Stuff", user2);
        folderRepository.save(code);



        File pic1 = new File("Loch Ness", "jpeg", 256, pics);
        fileRepository.save(pic1);

        File pic2 = new File("Highland Coo", "img", 624, pics);
        fileRepository.save(pic2);

        File cv = new File("My CV", "pdf", 128, work);
        fileRepository.save(cv);

        File shopping = new File("Shoppping List", "txt", 245, notes);
        fileRepository.save(shopping);

        File revision = new File("Revision for test", "word", 467, notes);
        fileRepository.save(revision);

        File project1 = new File("My Java Project", "java", 10001, code);
        fileRepository.save(project1);

        File project2 = new File("My Ruby Project", "Ruby", 989, code);
        fileRepository.save(project2);


        pics.addFile(pic1);
        pics.addFile(pic2);
        folderRepository.save(pics);

        work.addFile(cv);
        folderRepository.save(work);

        notes.addFile(shopping);
        notes.addFile(revision);
        folderRepository.save(notes);

        code.addFile(project1);
        code.addFile(project2);
        folderRepository.save(code);

        user1.addFolder(pics);
        user1.addFolder(work);
        userRepository.save(user1);

        user2.addFolder(notes);
        user2.addFolder(code);
        userRepository.save(user2);


    }
}
