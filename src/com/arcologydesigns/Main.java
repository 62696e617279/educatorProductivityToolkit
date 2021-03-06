package com.arcologydesigns;

import com.arcologydesigns.GoogleIntegration.SpreadsheetIntegration;
import com.arcologydesigns.Views.AuthenticationForm;

import javax.mail.MessagingException;
import java.io.IOException;

/**
 * com.arcologydesigns.Main created by Borislav S. on 7/3/2015 @ 1:29 PM.
 *
 * DO NOT CHECK IN MODIFICATIONS FOR THIS FILE!
 * MODIFY ONLY FOR LOCAL TESTING
 *
 */
public class Main {

   public static void main(String args[]) throws MessagingException, IOException {

//      /**
//       * UIManager Provides ability to change the look and feel (LaF) of Java Swing
//       * */
//      try {
//         UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
//      } catch (ClassNotFoundException | InstantiationException | UnsupportedLookAndFeelException | IllegalAccessException e) {
//         e.printStackTrace();
//      }

      //Code to initialize proxy using browser settings
      System.setProperty("java.net.useSystemProxies", "true");
      System.out.println("detecting proxies");
      ExtendedProxyManager.init();

/*
URL url = new URL("http://www.google.com/");
URLConnection con = url.openConnection();
BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

// Read it ...
String inputLine;
while ((inputLine = in.readLine()) != null)
System.out.println(inputLine);

in.close();
*/

      AuthenticationForm.main();  // initialize by prompting user for credentials

      // Get user data on initial load
      SpreadsheetIntegration mySheet = new SpreadsheetIntegration();

      //EducatorMainForm e = new EducatorMainForm('S');

      /*
      *  DO NOT CHECK IN MODIFICATIONS FOR THIS FILE!
      * MODIFY ONLY FOR LOCAL TESTING
      * */



   }  //end main
}  //end class com.arcologydesigns.Main
