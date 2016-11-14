package com.metaopsis;

import com.metaopsis.crypto.Encryptor;

/**
 * Created by tbennett on 11/14/16.
 */
public class icspasswd {
    public static void main(String[] args)
    {
        if (args.length == 0)
        {
            help();
        } else {
            System.out.println("Encrypted Password: " + Encryptor.encrypt(args[0]));
        }
    }

    private static void help()
    {
        System.out.println("usage: icspasswd <password>");
    }
}
