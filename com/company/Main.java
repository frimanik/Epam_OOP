package com.company;

import com.company.services.ServiceLibraryImpl;
import com.company.services.ServiceDemoImpl;

public class Main {

    public static void main(String[] args) {
        ServiceLibraryImpl books = new ServiceLibraryImpl(5);
        ServiceDemoImpl test = new ServiceDemoImpl(books);
        test.Test();
    }
}

