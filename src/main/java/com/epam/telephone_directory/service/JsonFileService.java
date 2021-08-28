package com.epam.telephone_directory.service;

import com.epam.telephone_directory.entity.UserProfile;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Component
public class JsonFileService {
    public void convertJsonToJava(String path) throws IOException {
        String fileContent = new String(Files.readAllBytes(Paths.get(path)));

        ObjectMapper mapper = new ObjectMapper();

        UserProfile userProfile = mapper.readValue(fileContent,UserProfile.class);

        System.out.println("user profile" + userProfile);
    }
}

