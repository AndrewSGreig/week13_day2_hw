package com.example.codeclan.AnnotatingOnetoManyAndManytoOneRelationships.components;

import com.example.codeclan.AnnotatingOnetoManyAndManytoOneRelationships.models.File;
import com.example.codeclan.AnnotatingOnetoManyAndManytoOneRelationships.models.Folder;
import com.example.codeclan.AnnotatingOnetoManyAndManytoOneRelationships.models.User;
import com.example.codeclan.AnnotatingOnetoManyAndManytoOneRelationships.repositories.FileRepository;
import com.example.codeclan.AnnotatingOnetoManyAndManytoOneRelationships.repositories.FolderRepository;
import com.example.codeclan.AnnotatingOnetoManyAndManytoOneRelationships.repositories.UserRepository;
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

    public DataLoader(){
    }

    public void run(ApplicationArguments args) {
        User joeUser = null;
        Folder desktop = null;
//        File file1 = new File("abc_file", ".xyw", 14, desktop);
        File file1 = new File("abc_file",".xyz",14);
        fileRepository.save(file1);
        desktop = new Folder("/Desktop", file1, joeUser );
        folderRepository.save(desktop);
//        folderRepository.save(desktop);
        Folder downloads  =new Folder("/Downloads", file1,joeUser);
        folderRepository.save(downloads);
//        folders = new List<folderRepository>
        File abcFile = new File("abc_file", ".xyw", 14);
        fileRepository.save(abcFile);
        joeUser = new User("joe",folderRepository.findAll() );
        userRepository.save(joeUser);
        desktop = new Folder("/Desktop", abcFile, joeUser);
        folderRepository.save(desktop);

    }

}

