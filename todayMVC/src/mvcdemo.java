/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sajja
 */
public class mvcdemo {
   public static void main(String[] args) {
      //fetch student record based on his roll no from the database
      NewClass model  = retriveStudentFromDatabase();
      //Create a view : to write student details on console
      view view1 = new view();
      controller controller1 = new controller(model, view1);
      controller1.updateView();
      //update model data
      controller1.setStudentName("John");
      controller1.updateView(); }
   private static NewClass retriveStudentFromDatabase(){
      NewClass student = new NewClass();
      student.setName("Robert");
      student.setRollNo("10");
      return student; } }
