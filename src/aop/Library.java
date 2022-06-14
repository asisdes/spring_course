package aop;

import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {

    public void getBook() {

        System.out.println("Book is vzata");

    }

}
