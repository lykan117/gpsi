package com.gapsi.examen.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gapsi.examen.services.Services;
import com.gapsi.examen.vo.Info;
import com.gapsi.examen.vo.ResultadoGenerico;
import com.google.gson.*;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Map;

@org.springframework.stereotype.Controller
public class Controller {
    JsonParser parser = new JsonParser();

    @Autowired
    Services services;
    @RequestMapping("/Index")
    public String hola(Model modelo) {


        modelo.addAttribute("mensaje","Esto es una prueba");
        return "gap/Index";
    }
    @RequestMapping("/welcome")
    public String welcome(Model modelo) {


      //  modelo.addAttribute("mensaje","Esto es una prueba");
        return "welcome/welcome";
    }
    ObjectMapper mapper = new ObjectMapper();
//    @RequestMapping(value = "/info", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<ResultadoGenerico> validaDB () {
//        ResultadoGenerico resultGeneric = new ResultadoGenerico();
//
//        Info info = new Info();
//        Gson gson = new Gson();
//        try {
//            Reader reader = new FileReader("db.json");
//
//                // Convert JSON File to Java Object
//                String staff = gson.fromJson(reader);
//            JSONObject json = new JSONObject(reader);
//
//                // print staff
//                //System.out.println(staff);
//                FileReader input = new FileReader("db.json");
//
//                String a = gson.toJson(input);
//               // resultGeneric.setReslt(staff);
//                resultGeneric.setSuccess(true);
//                resultGeneric.setMessage(json.toString());
//
//
//              //  return new ResponseEntity<>(resultGeneric, HttpStatus.OK);
//            } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        return new ResponseEntity<>(resultGeneric, HttpStatus.OK);
//
//
//    }
}
