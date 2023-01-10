package com.gapsi.examen.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gapsi.examen.vo.Info;
import com.google.gson.Gson;

import org.apache.tomcat.util.json.JSONParser;
import org.apache.tomcat.util.json.ParseException;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@Service
public class Services {


    Gson gson = new Gson();
    List<Info> infoo = new ArrayList<>();
    ObjectMapper mapper = new ObjectMapper();





}
