package com.pgr.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pgr.json.model.Menu;
import com.pgr.json.model.MenuItem;
import com.pgr.json.model.Popup;
import com.pgr.json.model.Root;

public class JaksonJsonDemo2 {

	public static void main(String[] args) throws JsonProcessingException {
		
		/*
		 * Map<String, String> map = new HashMap<String, String>(); map.put("value",
		 * "New"); map.put("onClick", "CreateDoc()");
		 */
		MenuItem menuItem = new MenuItem();
		//menuItem.setMap(map);
		
		menuItem.setOnclick("CreateDoc()"); 
		menuItem.setValue("New");
		 
		MenuItem menuItem1 = new MenuItem();
		menuItem1.setOnclick("OpenDoc()"); 
		menuItem1.setValue("Open");
		List<MenuItem> menuItems = new ArrayList<MenuItem>();
		menuItems.add(menuItem);
		menuItems.add(menuItem1);
		
		Popup popup = new Popup();
		popup.setMenuItems(menuItems);
		
		Menu menu = new Menu();
		menu.setId("file");
		menu.setValue("file");
		menu.setPopup(popup);
		
		Root root = new Root();
		root.setMenu(menu);
		
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonData = objectMapper.writeValueAsString(root);
		System.out.println(jsonData);
	}
}
