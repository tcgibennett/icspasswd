package com.metaopsis;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

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
        	try
        	{
        	    if (args[0].equals("-nv"))
				System.out.println(Encryptor.encrypt(args[1]));
			else
        	    		System.out.println("Encrypted Password: " + Encryptor.encrypt(args[0]));
        	} catch (InvalidKeyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchPaddingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvalidAlgorithmParameterException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalBlockSizeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (BadPaddingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    }

    private static void help()
    {
        System.out.println("usage: icspasswd [-nv] <password>");
        System.out.println("\t -nv: Suppress verbiage (i.e. Encrypted Password: )");
    }
}
