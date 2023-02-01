package com.gila.backendgila;

import com.gila.backendgila.model.Categories;
import com.gila.backendgila.model.Notification;
import com.gila.backendgila.model.Submission;
import com.gila.backendgila.model.UserData;
import com.gila.backendgila.repository.CategoriesRepository;
import com.gila.backendgila.repository.NotificationRepository;
import com.gila.backendgila.repository.SubmissionRepository;
import com.gila.backendgila.repository.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class BackEndGilaApplication implements CommandLineRunner {


    @Autowired
    UserDataRepository userDataRepository;

    @Autowired
    CategoriesRepository categoriesRepository;

    @Autowired
    NotificationRepository notificationRepository;

    @Autowired
    SubmissionRepository submissionRepository;

    public static void main(String[] args) {
        SpringApplication.run(BackEndGilaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        try{
//
//            Categories categoriesSport = new Categories();
//            categoriesSport.setId_categories(1L);
//            categoriesSport.setDescription("Sport");
//            categoriesRepository.save(categoriesSport);
//
//
//
//            Categories categoriesFinance = new Categories();
//            categoriesFinance.setId_categories(2L);
//            categoriesFinance.setDescription("Finance");
//            categoriesRepository.save(categoriesFinance);
//
//            Categories categoriesMovies = new Categories();
//            categoriesMovies.setId_categories(3L);
//            categoriesMovies.setDescription("Movies");
//            categoriesRepository.save(categoriesMovies);
//
//
//
//            Notification notificationSMS = new Notification();
//            notificationSMS.setId_notification(1L);
//            notificationSMS.setDescription("SMS");
//            notificationRepository.save(notificationSMS);
//
//            Notification notificationEMail = new Notification();
//            notificationEMail.setId_notification(2L);
//            notificationEMail.setDescription("EMail");
//            notificationRepository.save(notificationEMail);
//
//            Notification notificationPush = new Notification();
//            notificationPush.setId_notification(3L);
//            notificationPush.setDescription("Push_Notification");
//            notificationRepository.save(notificationPush);
//
//
//
//            //Primer Usuario
//            // Agregar al usuario los categories por medio de un hash
//            Set<Categories> categoryUserJuan = new HashSet<>();
//            categoryUserJuan.add(categoriesSport);
//            categoryUserJuan.add(categoriesMovies);
////            // Agregar al usuario las notificaciones por medio de un hash
//            Set<Notification> notificationUserJuan = new HashSet<>();
//            notificationUserJuan.add(notificationEMail);
//            notificationUserJuan.add(notificationPush);
//            UserData userData = new UserData();
//            userData.setId(1L);
//            userData.setName("Juan Miguel");
//            userData.setEmail("juan@gmail.com");
//            userData.setPhoneNumber("789456");
//
//
//
//
//
//
//
//            //Segundo Usuario
//            // Agregar al usuario los categories por medio de un hash
//            Set<Categories> categoryUserPedro = new HashSet<>();
//            categoryUserPedro.add(categoriesSport);
//            categoryUserPedro.add(categoriesMovies);
//            categoryUserPedro.add(categoriesFinance);
//            // Agregar al usuario las notificaciones por medio de un hash
//            Set<Notification> notificationUserPedro = new HashSet<>();
//            notificationUserPedro.add(notificationSMS);
//            UserData userData1 = new UserData();
//            userData1.setId(2L);
//            userData1.setName("Pedro Josue");
//            userData1.setEmail("Pedro@gmail.com");
//            userData1.setPhoneNumber("654789");
//
//
//
//            //Tercer Usuario
//            // Agregar al usuario los categories por medio de un hash
//            Set<Categories> categoryUserManuel = new HashSet<>();
//            categoryUserManuel.add(categoriesSport);
//            categoryUserManuel.add(categoriesFinance);
//            // Agregar al usuario las notificaciones por medio de un hash
//            Set<Notification> notificationUserManuel = new HashSet<>();
//            notificationUserManuel.add(notificationPush);
//            notificationUserManuel.add(notificationEMail);
//            notificationUserManuel.add(notificationSMS);
//            UserData userData2 = new UserData();
//            userData2.setId(3L);
//            userData2.setName("Manuel Alberto");
//            userData2.setEmail("Manuel@gmail.com");
//            userData2.setPhoneNumber("9632145");
//
//
//
//            UserData userSaved = userDataRepository.save(userData);
//            System.out.println(userSaved.getName());
//
//            UserData userSaved1 = userDataRepository.save(userData1);
//            System.out.println(userSaved1.getName());
//
//            UserData userSaved2 = userDataRepository.save(userData2);
//            System.out.println(userSaved2.getName());
//
//           Submission submission = new Submission();
//           submission.setCategories(categoriesFinance);
//           submission.setNotification(notificationPush);
//           submission.setPublishedDate(new Date());
//           submission.setUserData(userData);
//           submission.setMessage("Este es el mensaje2");
//           submissionRepository.save(submission);
//
//            System.out.println(submission.getSubmissionID());
//
//
//
//        }catch (Exception exception){
//            exception.printStackTrace();
//        }
    }

}
