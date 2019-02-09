package create.controller;
//

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

//import java.io.*;
//import java.util.UUID;
//
//@Controller
//public class FileUploadController {
//
//  @Value("${upload.path}")
//   private String uploadPath;
////
////
////    @RequestMapping(value="/upload", method= RequestMethod.GET)
////    public  String provideUploadInfo() {
////        return "file";
////    }
////    @RequestMapping(value="/file", method=RequestMethod.POST)
////    public String add(@RequestParam("file") MultipartFile file,Maps maps) throws IOException {
////        if(file != null){
////           File uploadDir = new File(uploadPath);
////           if (!uploadDir.exists()) {
////               uploadDir.mkdir();
////           }
////               String uidFile = UUID.randomUUID().toString();// зосдаем уникальное имя файла
////               String resultFilename = uidFile + "." + file.getOriginalFilename();
////               file.transferTo(new File(uploadPath + "/" + resultFilename));
////            maps.setFilename(resultFilename);
////        }
////        return "file";
////    }
//
//       @RequestMapping(value="/upload", method= RequestMethod.GET)
//   public  String provideUploadInfo() {
//       return "index";
//   }
//
//    @RequestMapping(value="/upload", method=RequestMethod.POST)
//    public  String handleFileUpload(@RequestParam("name") String name, @RequestParam("file") MultipartFile file){
//        if (!file.isEmpty()) {
//            File uploadDir = new File(uploadPath);
//            if (!uploadDir.exists()) {
//                 uploadDir.mkdir();
//            }
//            try {
//                byte[] bytes = file.getBytes();
//                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(
//                        new File( uploadPath +"/" + name + ".jpg")));
//                stream.write(bytes);
//                stream.close();
//
//                //return  "Вы удачно загрузили " + name + " в " + name + "-uploaded !";
//            } catch (Exception e) {
//                return "Вам не удалось загрузить " + name + " => " + e.getMessage();
//            }
//        } else {
//            return "Вам не удалось загрузить " + name + " потому что файл пустой.";
//        }
//        return "impg";
//    }
//
//
//}
//@Controller
//public class FileUploadController{
//    @Value("${upload.path}")
//   private String uploadPath;
//
//    @RequestMapping(value="/upload", method= RequestMethod.GET)
//   public  String provideUploadInfo() {
//       return "index";
//  }
//    @RequestMapping(value="/upload", method=RequestMethod.POST)
//    public  String handleMapUpload(@RequestParam("name") String name, @RequestParam("file") MultipartFile file){
//        if (!file.isEmpty()) {
//            File uploadDir = new File(uploadPath);
//
//            try {
//                byte[] bytes = file.getBytes();
//                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(
//                        new File( uploadPath +"/" + name + ".jpg")));
//                stream.write(bytes);
//                stream.close();
//
//                //return  "Вы удачно загрузили " + name + " в " + name + "-uploaded !";
//            } catch (Exception e) {
//                return "Вам не удалось загрузить " + name + " => " + e.getMessage();
//            }
//        } else {
//            return "Вам не удалось загрузить " + name + " потому что файл пустой.";
//        }
//        return "impg";
//    }
//}
